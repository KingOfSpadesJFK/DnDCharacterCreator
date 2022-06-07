package characterclass;

import main.GameCharacter.Ability;

public class Cleric extends CharacterClass 
{
    private static final int[][] hitDie =
    {
        {1},
        {8}
    };
    private static final Ability[] primaryAbilities = { Ability.WISDOM };
    private static final Ability[] savingThrows = { Ability.WISDOM, Ability.CHARISMA };
    private static final ArmorType[] armorProficiencies = {
        ArmorType.LIGHT,
        ArmorType.MEDIUM,
        ArmorType.SHIELDS
    };
    private static final WeaponType[] weaponProficiencies = {
        WeaponType.SIMPLE
    };
    private static final Skill[] skillset = {
        Skill.HISTORY,
        Skill.INSIGHT,
        Skill.MEDICINE,
        Skill.PERSUASION,
        Skill.RELIGION
    };

    public Cleric()
    {
        super(
            hitDie, 
            primaryAbilities, 
            savingThrows, 
            armorProficiencies, 
            weaponProficiencies, 
            skillset, 
            null
        );
    }

    public int getHitPoints() {
        return 0;
    }
    
}
