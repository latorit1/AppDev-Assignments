package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ch12_13 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);

		int characters = 0;	
		int words = 0;			
		int lines = 0;	

		try (
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				lines++;
				String line = input.nextLine();
				characters += line.length();
			}
		}

		try (
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String line = input.next();
				words++;
			}
		}

		System.out.println("File " + file.getName() + " has");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}

}


