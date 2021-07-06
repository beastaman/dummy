package com.day5;

public class DemoException3 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; ++i) {
			try {
				System.out.println(i);
				if (i % 5 == 0)
					continue;

				try {
					System.out.println(i);
					if (i % 3 == 0)
						continue;
					try {
						System.out.println(i);
					} catch (Exception e) {

					} finally {
						System.out.println("Inner Innner finally");
					}
				} catch (Exception e) {

				} finally {
					System.out.println("Innner finally");
				}

			} catch (Exception e) {

			} finally {
				System.out.println("Outer finally");
			}

		}
	}

}
