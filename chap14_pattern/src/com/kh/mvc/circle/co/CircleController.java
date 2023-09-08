package com.kh.mvc.circle.co;

import com.kh.mvc.circle.mo.CircleModel;
import com.kh.mvc.circle.vo.CircleView;

public class CircleController {
	private CircleModel model;
	private CircleView view;

public CircleController(CircleModel model, CircleView view) {
	this.model = model;
	this.view = view;
	
}


public void run() {
	double circleinput = view.getCircleInput();
	model.setNumber(circleinput);
	//System.out.println("resultaa : "+resultaa);
	
	double result = model.circleradius();
	view.displayResult(result);
	double result1 = model.incrementRadius();
	view.displayResult2(result1);
	double result2 = model.getAreaOfCircle();
	view.displayResult3(result2);
}
}