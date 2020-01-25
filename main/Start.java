package main;

import creator.CreatorController;
import utils.Common;

public class Start {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("||--------------------------------------||");
		System.out.println("||---- Welcome to the numbers game ! ---||");
		System.out.println("||--------------------------------------||");
		System.out.println("||-- Please choose an option: ----------||");
		System.out.println("||---- A) Creator ----------------------||");
		System.out.println("||---- B) Solver -----------------------||");
		System.out.println("||---- B) Info -------------------------||");
		System.out.println("||--------------------------------------||");


		System.out.println("What would you like to do?");
		
		
		CreatorController c = new CreatorController();
		
		c.creatorMain();
	}

}
