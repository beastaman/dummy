package com.sapient;

public class Executive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Multiplication();
		System.out.println(obj.calculate(10, 20));

		FigureToWord object = new FigureToWord();
		System.out.println(object.figToWord(102));

		FigureToWords2 object2 = new FigureToWords2();
		System.out.println(object2.getFigures(102l));
	}

}
