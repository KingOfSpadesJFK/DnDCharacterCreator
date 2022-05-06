package main;

import java.util.ArrayList;
import race.Race;

public class GameCharacter 
{
    public enum Ability {
        STRENGTH,
        DEXTERITY,
        CONSTITUTION,
        INTELLIGENCE,
        WISDOM,
        CHARISMA
    };

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
    	DWARVISH,
    	ELVISH,
    	GIANT,
    	GNOMISH,
    	GOBLIN,
		HALFLING,
    	ORC,
    	ABYSSAL,
    	CELESTIAL,
    	DEEPSPEECH,
    	DRACONIC,
    	INFERNAL,
    	PRIMORDIAL,
    	SYLVAN,
    	UNDERCOMMON
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
