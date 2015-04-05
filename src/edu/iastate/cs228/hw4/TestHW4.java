package edu.iastate.cs228.hw4;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class TestHW4 {

	public static void main(String[] args) throws InputMismatchException,
			FileNotFoundException {
		ConvexHull hull = new ConvexHull(
				"C:/Users/Mitch/Desktop/hw4testfile.txt");
		hull.quickSort();
		System.out.println(hull.toString());
	}

}
