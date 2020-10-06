package kr.ac.hansung.cse;

import lombok.Setter;

@Setter
public class Cat implements AnimalType {

	private String myName;

	@Override
	public void sound() {

// TODO Auto-generated method stub
		System.out.println("Cat name=" + myName + ":" + "Meow");
	}

}
//ctrl+shift+o 자동임포트, ctrl+space 자동완성, ctrl+shift+f: format