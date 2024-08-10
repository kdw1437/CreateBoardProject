import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import linux.LinuxGuiFac;

public class Main {
	public static void main(String[] args) {
		GuiFac fac = new LinuxGuiFac();
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		button.click();
		System.out.println(area.getText());
}
}
