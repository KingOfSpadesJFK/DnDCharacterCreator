package characterclass;
import java.util.ArrayList;
import java.util.List;

import main.GameCharacter.Ability;

public class Fighter extends CharacterClass
{
    int ConMod;
    int ProfB;
    int hitPoints = (ConMod + 10);

    private static final int[][] hitDie = {{10}, {1}};
    private static final Ability[] primaryAbility = {Ability.STRENGTH, Ability.CONSTITUTION};
    private static final Ability[] savingThrows = {Ability.STRENGTH, Ability.CONSTITUTION};
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
                    Skill.ACROBATICS,
                    Skill.ANIMAL_HANDLING,
                    Skill.ATHLETICS,
                    Skill.HISTORY,
                    Skill.INSIGHT,
                    Skill.INTIMIDATION,
                    Skill.PERCEPTION,
                    Skill.SURVIVAL
            };
    public enum Features
    {
        FIGHTING_STYLE,
        SECOND_WIND
    };
    public Fighter()
    {
        super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies, skillset, equipment);
        List<WeapontType> equipmentChoice = new ArrayList<WeaponType>();
        List<Equipment> equipment = new ArrayList<Equipment>();
        if (equipmentChoice.contains(WeaponType.TWO_MARTIAL)){
            equipment.add(Equipment.MARTIAL);
            equipment.add(Equipment.MARTIAL);
        } else {
            equipment.add(Equipment.SHIELD);
            equipment.add(Equipment.MARTIAL);
        }
        if (equipmentChoice.contains(WeaponType.LIGHT_CROSSBOW)){
            equipment.add(Equipment.TWENTY_BOLTS);
        } else {
            equipment.add(WeaponType.HANDAXE);
            equipment.add(WeaponType.HANDAXE);
        }
        if (equipmentChoice.contains(WeaponType.DUNGEONEERS_PACK)){
            equipment.add(Equipment.DUNGEONEERS_PACK);
        } else {
            equipment.add(Equipment.EXPLORERS_PACK);
        }
        if (equipmentChoice.contains(Equipment.CHAIN_MAIL)){
            equipment.add(WeaponType.LONGBOW);
        } else {
            equipment.add(Equipment.LEATHER_ARMOR);
            equipment.add(WeaponType.LONGBOW);
        }

        this.setEquipment((Equipment[])equipment.toArray());
    }

    public int getHitPoints()
    {
        int hitPoints = 10;
        return hitPoints;
    }

}