package marshmellow.model;

public class MarshmellowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	
	private MarshmellowMonster()
	{
		
		
	}
	
	public MarshmellowMonster(String monsterName, int monsterEyes, int monsterNoses, boolean monsterBellyButton, double monsterLegs, double monsterhair)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
	}
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterEyes + " eyes and their name is " + monsterName;
		
		return monsterInfo;
		
	}
}
