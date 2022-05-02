package main;

import java.util.ArrayList;
import race.Race;

public class GameCharacter 
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

	private String charName;                // Character name
	private Race race;						// Race (Human, dwarf, elf, etc.)
	private Object classType;				// Class type i.e.: Fighter etc. 	TODO: Create the class type
	private Size size;
	private ArrayList<Language> languages;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
}
