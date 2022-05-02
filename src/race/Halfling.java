package race;

import main.GameCharacter.Language;
import main.GameCharacter.Size;

public class Halfling extends Race 
{
    public static final String RACE_NAME = "Halfling";
    private static final String[] traits = {
		"Halfling Nimbleness"
    };
    private static final Language[] languages = {
        Language.COMMON,
        Language.HALFLING
    };

    public Halfling() {
        super(RACE_NAME, 0, 2, 0, 0, 0, 0);
        setTraits(traits);
        setLanguages(languages);
        setSize(Size.SMALL);
        setSpeed(25);
    }

    private Halfling(String[] traits, String race, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(race, strength, dexterity, constitution, intelligence, wisdom, charisma);
        setTraits(traits);
        setLanguages(languages);
        setSize(Size.SMALL);
        setSpeed(25);
    }
    
    /*
    *   Subtraces
    */
    public class LightfootHalfling extends Halfling
    {
        public static final String RACE_NAME = "Lightfoot Halfling";
        private static final String[] traits = {
            "Halfling Nimbleness",
            "Naturally Stealthy"
        };

        public LightfootHalfling() {
            super(traits, RACE_NAME, 0, 2, 0, 0, 0, 1);
        }
    }

    public class StoutHalfling extends Halfling
    {
        public static final String RACE_NAME = "Lightfoot Halfling";
        private static final String[] traits = {
            "Halfling Nimbleness",
            "Stout Resilience"
        };

        public StoutHalfling() {
            super(traits, RACE_NAME, 0, 2, 1, 0, 0, 0);
        }
    }
}
