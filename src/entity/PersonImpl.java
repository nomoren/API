package entity;

import proxy.Person;

public class PersonImpl implements Person{

	@Override
	public void run(String name) {
		System.out.println(name+"run");
		
	}

}
