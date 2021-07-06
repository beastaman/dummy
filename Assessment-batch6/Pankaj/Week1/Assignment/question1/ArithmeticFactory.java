package com.question1;

import java.util.Arrays;
import java.util.List;

public class ArithmeticFactory {

	public static List<Arithmetic> arithmetics = Arrays.asList(new Add(), new Sub(), new Mul(), new Div());

	public static Arithmetic getFactoryObject(int choice) {

		return arithmetics.get(choice - 1);
	}
}
