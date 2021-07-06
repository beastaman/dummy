package com.sapient.week1.day5;

public class demo4 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i + " ---- ");
			try {
				if(i%5 == 0)
					continue;
				
				try {
					if(i%3 ==0)
						continue;
					
					try {
						System.out.println(i);
						
					} catch (Exception e) {
						
					} 
					finally {
						System.out.println("I am in inner inner");
					}
					
					
				} catch (Exception e) {
					
				} 
				finally {
					System.out.println("I am in inner");
				}
				
			} catch (Exception e) {
				
			} 
			finally {
				System.out.println("I am in outer");
			}
		}
	}
}
