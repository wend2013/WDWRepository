package com.wendongwei.repository.extendstest;

public class ExtendTest {

	public static void main(String[] args) {
		Vehicle vehicle  = new Jeep();
		vehicle.run();
		
		vehicle=new Car();
		vehicle.run();
	}

}
