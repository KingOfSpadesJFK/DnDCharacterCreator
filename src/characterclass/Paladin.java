package characterclass;
import java.util.ArrayList;
import java.util.List;

import main.GameCharacter.Ability;

public class Paladin extends CharacterClass
{
    int constitutionModifier;
    int proficiencyBonus;
    int hitPoints = (constitutionModifier + 10);

    private static final int[][] hitDie = { {10}, {1} };
    private static final Ability[] primaryAbility = { Ability.STRENGTH, Ability.CHARISMA };
    private static final Ability[] savingThrows = { Ability.WISDOM, Ability.CHARISMA };
    private static final ArmorType[] armorProficiencies =
    {
        ArmorType.LIGHT,
        ArmorType.MEDIUM,
        ArmorType.HEAVY,
        ArmorType.SHIELDS
    };
    private static final WeaponType[] weaponProficiencies =
    {
        WeaponType.SIMPLE,
        WeaponType.MARTIAL
    };
    private static final Skill[] skillset = 
    {
        Skill.ATHLETICS,
        Skill.INSIGHT,
        Skill.INTIMIDATION,
        Skill.MEDICINE,
        Skill.PERSUASION,
        Skill.RELIGION
    };

    public Paladin() 
    {
        super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies, skillset, null);

        List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
        List<Equipment> equipment = new ArrayList<Equipment>();
        if (equipmentChoice.contains(WeaponType.TWO_MARTIAL)){
            equipment.add(Equipment.MARTIAL);
            equipment.add(Equipment.MARTIAL);
        } else {
            equipment.add(Equipment.SHIELD);
            equipment.add(Equipment.MARTIAL);
        }
        if (equipmentChoice.contains(WeaponType.JAVELIN)){
            equipment.add(Equipment.FIVE_JAVELINS);
        } else {
            equipmentChoice.add(WeaponType.SIMPLE);
        }
        if (equipmentChoice.contains(WeaponType.PRIESTS_PACK)){
            equipment.add(Equipment.PRIESTS_PACK);
        } else {
            equipment.add(Equipment.EXPLORERS_PACK);
        }
        equipment.add(Equipment.CHAIN_MAIL);
        equipment.add(Equipment.HOLY_SYMBOL);

        this.setEquipment((Equipment[])equipment.toArray());
    }

    public int getHitPoints() {
        // TODO Auto-generated method stub
        return hitPoints;
    }
}