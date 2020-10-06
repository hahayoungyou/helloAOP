package kr.ac.hansung.cse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/ac/hansung/cse/conf/animal.xml"); // spring container

		PetOwner person = (PetOwner) context.getBean("id_PetOwner"); //cat을 집어넣음
		person.play();
		
		context.close();
	}

}
