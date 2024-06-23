package com.mm.ms.factorydesignpattern;

public class OperationFactoryImpl extends OperationFactory {
	@Override
	Operation getInstance(int choice) throws InvalidOperationException {
		if(choice ==1)
			return new AddOperation();
		else if(choice ==2)
			return new SubtractOperation();
		else if(choice ==3)
			return new MultiplicationOperation();
		else if(choice ==4)
			return new DivisionOperation();
		else if(choice ==5)
			return new RemainderOperation();
		else
			throw new InvalidOperationException("Invalid Ooperation selected!");
	}
}
