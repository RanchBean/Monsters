package marshmellow.controller;

import marshmellow.model.MarshmellowMonster;
import marshmellow.view.MonsterDisplay;

public class MonsterController
{
	private MarshmellowMonster ethanMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "Fung";
		int eyes = 5;
		int noses = 2;
		double legs = 5.0;
		double hair = 100.0;
		boolean hasBellyButton = false;
		
		myDisplay = new MonsterDisplay();
		ethanMonster = new MarshmellowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	public void start()
	{
		myDisplay.displayInfo(ethanMonster.toString());
	}
}
