package main.java.problem1;

import java.util.*;

public class FactoryClass {

	public static List<Arithmetic> arithmetics = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(),
			new Division());

	public static Arithmetic getFactoryObject(int choice) {

		return arithmetics.get(choice - 1);
	}

}
