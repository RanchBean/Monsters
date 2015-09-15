package marshmellow.controller;

import marshmellow.model.MarshmellowMonster;
import marshmellow.view.MonsterDisplay;
import java.util.Scanner;
public class MonsterController
{
	private MarshmellowMonster ethanMonster;
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
		askQuestions();
		myDisplay.displayInfo("updated monster info:"+ethanMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one please!");
		String newMonsterName = monsterScanner.next();
		ethanMonster.setMonsterName(newMonsterName); //don't have setters yet work on after instructions!!!
	}
}
