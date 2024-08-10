package linux;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class LinuxGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}
