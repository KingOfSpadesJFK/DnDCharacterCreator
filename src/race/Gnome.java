package race;

import main.GameCharacter.Language;
import main.GameCharacter.Size;

public class Gnome extends Race
{
    public static final String RACE_NAME = "Gnome";
    private static final String[] traits = {
		"Darkvision",
        "Gnome Cunning"
    };
    private static final Language[] languages = {
        Language.COMMON,
        Language.GNOMISH
    };

    public Gnome() {
        super(RACE_NAME, 0, 0, 0, 2, 0, 0);
        setTraits(traits);
        setLanguages(languages);
        setSize(Size.SMALL);
        setSpeed(25);
    }

    private Gnome(String[] traits, String race, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(race, strength, dexterity, constitution, intelligence, wisdom, charisma);
        setTraits(traits);
        setLanguages(languages);
        setSize(Size.SMALL);
        setSpeed(25);
    }
    
    public class ForestGnome extends Gnome
    {
        public static final String RACE_NAME = "Forest Gnome";
        private static final String[] traits = {
            "Darkvision",
            "Gnome Cunning",
            "Natural Illusionist",
            "Speak with Small Beasts"
        };

        public ForestGnome() {
            super(traits, RACE_NAME, 0, 1, 0,  2, 0, 0);
        }
    }
    
    public class RockGnome extends Gnome
    {
        public static final String RACE_NAME = "Rock Gnome";
        private static final String[] traits = {
            "Darkvision",
            "Gnome Cunning",
            "Articicer's Lore",
            "Tinker"
        };

        public RockGnome() {
            super(traits, RACE_NAME, 0, 0, 1,  2, 0, 0);
        }
    }
}
