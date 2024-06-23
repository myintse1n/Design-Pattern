package com.mm.ms.factorydesignpattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputForOperation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("\n1. Addition(+)\n2. Substraction(-)\n3. Multiplication(*)"
					+ "\n4. Division(/)\n5. Remainder(%)");
			//Input for choice
			int choice = scan.nextInt();
			
			//Get two numbers for Operation
			System.out.println("Enter first Operand: ");
			double number1 = scan.nextDouble();
			System.out.println("Enter second Operand: ");
			double number2 = scan.nextDouble();
			
			OperationFactory operationFactory = new OperationFactoryImpl();
			Operation operation= operationFactory.getInstance(choice);
			
			System.out.println("\nThis result is " + operation.calculate(number1, number2));
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid Operation Input!");
		} catch (InvalidOperationException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
}
