package com.mm.ms.factorydesignpattern;

abstract class OperationFactory {
	abstract Operation getInstance(int choice) throws InvalidOperationException;
}
