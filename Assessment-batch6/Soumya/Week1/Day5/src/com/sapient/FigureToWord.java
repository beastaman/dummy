package com.sapient;

public class FigureToWord {

	private String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
			"Twenty" };
	private String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	private String[] place = { "", "Thousand", "Million", "Billion" };

	public String figToWord(int num) {

		if (num == 0) {
			return "Zero only";
		}

		StringBuilder sb = new StringBuilder();

		int index = 0;

		while (num > 0) {

			if (num % 1000 != 0) {
				StringBuilder temp = new StringBuilder();
				helper(num % 1000, temp);
				sb.insert(0, temp.append(place[index]).append(" "));

			}

			index++;
			num /= 1000;
		}

		return sb.toString().trim() + " only";
	}

	private void helper(int num, StringBuilder sb) {

		if (num == 0) {
			return;
		} else if (num <= 20) {
			sb.append(ones[num]).append(" ");
		} else if (num < 100) {
			sb.append(tens[num / 10]).append(" ");
			helper(num % 10, sb);
		} else {
			sb.append(ones[num / 100]).append(" Hundred ");
			helper(num % 100, sb);
		}

	}
}
