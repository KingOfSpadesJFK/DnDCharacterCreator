package characterclass;
import java.util.ArrayList;
import java.util.List;

import main.GameCharacter.Ability;
public class Paladin extends CharacterClass{
    int constitutionModifier;
    int proficiencyBonus;
    int hitPoints = (constitutionModifier + 10);
    int hitDie = 1;
    int hitDice = 10;

    public enum Skills {
        ATHLETICS,
        INSIGHT,
        INTIMIDATION,
        MEDICINE,
        PERSUASION,
        RELIGION
    };

    public enum Features {
        DIVINE_SENSE,
        LAY_ON_HANDS
    };

    public enum Equipment{
        PREISTS_PACK,
        EXPLORERS_PACK,
        HOLY_SYMBOL
    };

    public (int[] hitDie, Ability[] primaryAbility, Ability[] savingThrows, ArmorType[] armorProficiencies, WeaponType[] weaponProficiencies) {
        super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies);
    }

    {
        List<WeaponType> weaponProficiencies = new ArrayList<WeaponType>();
            weaponProficiences.add(WeaponType.SIMPLE);
            weaponProficiences.add(WeaponType.MARTIAL);

        List<Ability> savingThrows = new ArrayList<Ability>();
            savingThrows.add(Ability.WISDOM);
            savingThrows.add(Ability.CHARISMA);

        List<ArmorType> armors = new ArrayList<Armortype>();
            armors.add(ArmorType.LIGHT);
            armors.add(ArmorType.MEDIUM);
            armors.add(ArmorType.HEAVY);
            armors.add(ArmorType.SHIELDS);

        List<Skills> skillset = new ArrayList<Skills>();
            skillset.add(Skills.ATHLETICS);
            skillset.add(Skills.INSIGHT);
            skillset.add(Skills.INTIMIDATION);
            skillset.add(Skills.MEDICINE);
            skillset.add(Skills.PERSUASION);
            skillset.add(Skills.RELIGION);

        List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
        List<Equipment> equipment = new ArrayList<Equipment>();
            if (equipmentChoice.equals(WeaponType.TWO_MARTIAL)){
               equipmentChoice.add(WeaponType.MARTIAL);
                equipmentChoice.add(WeaponType.MARTIAL);
            } else {
                equipmentChoice.add(WeaponType.SHIELD);
                equipmentChoice.add(WeaponType.MARTIAL);
            }
            if (equipmentChoice.equals(WeaponType.JAVELINS)){
                equipmentChoice.add(WeaponType.FIVE_JAVELINS);
            } else {
                equipmentChoice.add(WeaponType.SIMPLE_MELEE);
            }
            if (equipmentChoice.equals(WeaponType.PRIESTS_PACK)){
                equipmentChoice.add(WeaponType.PRIESTS_PACK);
            } else {
                equipmentChoice.add(WeaponType.EXPLORERS_PACK);
            }
            equipmentChoice.add(WeaponType.CHAIN_MAIL);
            equipmentChoice.add(WeaponType.HOLY_SYMBOL);
    }
}