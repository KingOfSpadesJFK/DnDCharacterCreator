package characterclass;
import java.util.ArrayList;
import java.util.List;

import main.GameCharacter.Ability;

public class Barbarian extends CharacterClass
{
    int ConMod;
    int ProfB;
    int hitPoints = (ConMod + 12);

    private static final int[][] hitDie = {{12}, {1}};
    private static final Ability[] primaryAbility = {Ability.STRENGTH, Ability.CONSTITUTION};
    private static final Ability[] savingThrows = {Ability.STRENGTH, Ability.CONSTITUTION};
    private static final ArmorType[] armorProficiencies =
            {
                    ArmorType.LIGHT,
                    ArmorType.MEDIUM,
                    ArmorType.SHIELDS
            };
    private static final WeaponType[] weaponProficiencies =
            {
                    WeaponType.SIMPLE,
                    WeaponType.MARTIAL
            };
    private static final Skill[] skillset =
            {
                    Skill.ANIMAL_HANDLING,
                    Skill.ATHLETICS,
                    Skill.INTIMIDATION,
                    Skill.NATURE,
                    Skill.PERCEPTION,
                    Skill.SURVIVAL
            };
    public enum Features
    {
        RAGE,
        UNARMORED_DEFENSE
    };
    public Barbarian()
    {
        super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies, skillset, null);
        List<WeapontType> equipmentChoice = new ArrayList<WeaponType>();
        List<Equipment> equipment = new ArrayList<Equipment>();
        if (equipmentChoice.contains(WeaponType.GREATAXE)){

        } else {
            equipment.add(Equipment.MARTIAL);
        }
        if (equipmentChoice.contains(WeaponType.HANDAXE)){
            equipment.add(WeaponType.HANDAXE);
        } else {
            equipment.add(WeaponType.SIMPLE);
        }
        equipment.add(WeaponType.JAVELIN);
        equipment.add(Equipment.EXPLORERS_PACK);

        this.setEquipment((Equipment[])equipment.toArray());
    }

    public int getHitPoints()
    {
        int hitPoints = 10;
        return hitPoints;
    }

}