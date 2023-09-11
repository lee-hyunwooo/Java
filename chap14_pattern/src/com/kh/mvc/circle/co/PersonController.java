package com.kh.mvc.circle.co;

import com.kh.mvc.person.mo.personModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonController {

	private personModel personmodel;
	private PersonView personview;
	
	public PersonController(personModel personmodel, PersonView personview) {
		this.personmodel = personmodel;
		this.personview = personview;
	}
	
	public void setPersonName(String name) {
		personmodel.setName(name);
	}
	
	
	public void setpersonAge(int Age) {
		personmodel.setAge(Age);
	}
	public String getPersontName() {
		return personmodel.getName();
	}
	public int getPersonAge() {
		return personmodel.getAge();
	}
	public void updateView() {
		
		personview.displayInfo(personmodel.getName(), personmodel.getAge());
	}
}
