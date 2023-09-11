package com.kh.mvc.circle.cl;

import com.kh.mvc.circle.co.PersonController;
import com.kh.mvc.person.mo.personModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonMain {

	public static void main(String[] args) {
		
		personModel model = new personModel("������",27);
		
		PersonView view = new PersonView();
	
		PersonController controller = new PersonController(model, view);

		controller.updateView();
		
		controller.setPersonName("������");
		controller.setpersonAge(28);
		
		controller.updateView();
		
		}
}
	