package demo;

import java.util.Scanner;

public class qnumber5 {
	static void checkMark(int marks)
	{
		if(marks>0)
		{
			System.out.println("VALID MARKS ENTERED"); 
		}
		else
		{
			throw new ArithmeticException("Mark entered is INVALID");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("Enter the marks");
			Scanner sc = new Scanner(System.in);
			int marks = sc.nextInt();
			checkMark(marks);
		}
	}

}
