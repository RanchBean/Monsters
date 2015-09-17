package marshmellow.controller;

import marshmellow.model.MarshmellowMonster;
import marshmellow.view.MonsterDisplay;
import java.util.Scanner;
public class MonsterController
{
	private MarshmellowMonster ethanMonster;
	private MarshmellowMonster userMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "Fung";
		int eyes = 5;
		int noses = 2;
		double legs = 5.0;
		double hair = 100.0;
		boolean hasBellyButton = false;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		ethanMonster = new MarshmellowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(ethanMonster.toString());
		createUserMonster();
		myDisplay.displayInfo("updated monster info:"+userMonster.toString());
		System.out.println("I want a new name for a monster, type one please!");
		String newMonsterName = monsterScanner.next();
		ethanMonster.setMonsterName(newMonsterName); //don't have setters yet work on after instructions!!!
	}
	
	private void askQuestions()
	{
		
	}
	/**
	 * Creates a MarshmellowMonster instance from user input.
	 */
	private void createUserMonster()
	{
		//step one: Gather User Information
		System.out.println("Whats is oyur monsters name?");
		String userName;
		userName = monsterScanner.nextLine();
		System.out.println("How manny legs will it have?");
		double userLegs = monsterScanner.nextDouble();
		System.out.println("How much hair?");
		double userHair; 
		userHair = monsterScanner.nextDouble();
		System.out.println("Does it have a Bellybutton - ture or false");
		boolean userBellyButton = monsterScanner.nextBoolean();
		System.out.println("how many eyes?");
		int userEyes = monsterScanner.nextInt();
		System.out.print("how many noses?");
		int userNoses = monsterScanner.nextInt();
		
		//Step two: build the monster using the constructor.
		userMonster = new MarshmellowMonster(userName,userEyes, userNoses, userBellyButton, userLegs, userHair);
		
	}
}
