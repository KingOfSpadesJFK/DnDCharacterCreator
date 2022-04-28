package main;

import race.Race;

public abstract class GameCharacter 
{
    public enum Size {
		TINY,
		SMALL,
		MEDIUM,
		LARGE,
		HUGE,
		GARGANTUAN
    };

	public enum Language {
		COMMON,
		GNOMISH,
		HALFLING
	};

	private String charName;                 //Character name
	private Race race;
	private String className;                //Class type i.e.: Fighter etc. 
	private Size size;
	private Language language;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
}
