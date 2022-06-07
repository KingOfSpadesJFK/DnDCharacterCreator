package race;

import main.GameCharacter.Language;
import main.GameCharacter.Size;

public class Elf extends Race
{
    public final static String RACE_NAME = "Elf";

    private final static Language[] languages =
            {
                    Languages.COMMON,
                    Languages.ELVISH
            };

    private static final String[] traits = {
            "Tance",
            "Keen Senses",
            "Fey Ancestry"
    };

    public Elf()
    {
        super(RACE_NAME, 0, 2, 0, 0 , 0, 0);
        setTraits(traits);
        setLanguages(languages);
        setSize(Size.MEDIUM);
        seSpeed(30);
    }

    private Elf(String[] traits, String race, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
    {
        super(race, strength, dexterity, constitution, intelligence, wisdom, charisma);
        setTraits(traits);
        setLanguages(languages);
        setSize(Size.MEDIUM);
        setSpeed(30);
    }
}

public class High_Elf extends Elf
{
    public static final String RACE_NAME = "High_Elf";
    private static final Language[] languages =
            {
                    Languages.COMMON,
                    Languages.ELVISH,
                    Languages.SELECT,
                    Languages.EXTRA_SELECT
            };

    private static final String[] traits = {
            "Tance",
            "Keen Senses",
            "Fey Ancestry",
            "Elf Weapon Training",
            "Cantrip",
            "Ability Score Increase"
    };

    public High_Elf()
    {
        super(traits, RACE_NAME, 0, 2, 0, 1, 0 , 0);
    }

}

class Drow extends Elf
{
    public final static String RACE_NAME = "Drow";
    public Drow()
    {
        super(traits, RACE_NAME, 0, 2, 0, 0, 0, 1);
    }
    private final static Language[] languages =
            {
                    Languages.COMMON,
                    Languages.ELVISH,
                    Languages.SELECT
            };

    private static final String[] traits = {
            "Tance",
            "Keen Senses",
            "Fey Ancestry",
            "Drow Weapon Training",
            "Drow Magic",
            "Sunlight Sensitivity",
            "Superior Darkvision",
            "Ability Score Increase"

    };
}

class Wood_Elf extends Elf
{
    public final static String RACE_NAME = "Wood_Elf";
    public Wood_Elf()
    {
        super(traits, RACE_NAME, 0, 2, 0, 0, 1, 0);
    }
    private final static Language[] languages =
            {
                    Languages.COMMON,
                    Languages.ELVISH,
                    Languages.SELECT
            };

    private static final String[] traits = {
            "Tance",
            "Keen Senses",
            "Fey Ancestry",
            "Elf Weapon Training",
            "Fleet of Foot",
            "Mask of the Wild",
            "Ability Score Increase"
    };

}