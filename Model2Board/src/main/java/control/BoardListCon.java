package control;
import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.BoardBean;
import model.BoardDAO;

@WebServlet("/BoardListCon.do")
public class BoardListCon extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reqPro(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reqPro(request, response);
    }
    
    protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 화면에 보여질 게시글의 개수를 지정
        int pageSize = 10;
        // 현재 보여지고 있는 페이지의 넘버값을 읽어드림
        String pageNum = request.getParameter("pageNum");
        // null처리
        if (pageNum == null) {
            pageNum = "1";
        }
        
        // 현재 보여지고 있는 페이지 문자를 숫자로 형변환
        int currentPage = Integer.parseInt(pageNum);
        
        // 전체 게시글의 갯수를 가져와야 하기에 데이터베이스 객체 생성
        BoardDAO bdao = new BoardDAO();
        int count = bdao.getAllCount();
        
        // 전체 페이지 수 계산
        int totalPages = (count + pageSize - 1) / pageSize;
        
        // 현재 보여질 페이지 시작 번호를 설정
        int startRow = (currentPage - 1) * pageSize + 1;
        int endRow = currentPage * pageSize;
        
        // 최신글 10개를 기준으로 게시글을 리턴 받아주는 메소드 호출
        Vector<BoardBean> v = bdao.getAllBoard(startRow, endRow);
        
        // jsp페이지 내에서 보여질 넘버링 숫자값을 저장하는 변수 선언
        int number = count - (currentPage - 1) * pageSize;
        
        // 페이징 처리를 위한 변수 설정
        int pageBlock = 10;
        int startPage = ((currentPage - 1) / pageBlock) * pageBlock + 1;
        int endPage = Math.min(startPage + pageBlock - 1, totalPages);
        
        // BoardList.jsp 쪽으로 request 객체에 담아서 넘겨줌
        request.setAttribute("v", v);
        request.setAttribute("number", number);
        request.setAttribute("pageSize", pageSize);
        request.setAttribute("count", count);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("startPage", startPage);
        request.setAttribute("endPage", endPage);
        request.setAttribute("totalPages", totalPages);
        request.setAttribute("pageBlock", pageBlock);
        
        RequestDispatcher dis = request.getRequestDispatcher("BoardList.jsp");
        dis.forward(request, response);
    }
}