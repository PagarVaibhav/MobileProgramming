package Prepcall;

import java.util.stream.IntStream;
//Remove a from string
public class Prep22 {

	public static void main(String[] args) {
		
		String s1="Jeevan";
		
		IntStream chars = s1.chars();
		chars.filter(n -> n!='a').forEach(n-> System.out.print((char)n));
	}
}
