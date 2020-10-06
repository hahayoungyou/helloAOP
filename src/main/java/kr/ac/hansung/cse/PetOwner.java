package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class PetOwner {
	@Autowired//wiring by type
	@Qualifier(value="qf_dog")//annotation 사용
	private AnimalType animal; //animal type bean 2개 //DI

	public void play() {
		animal.sound();
	}
}
