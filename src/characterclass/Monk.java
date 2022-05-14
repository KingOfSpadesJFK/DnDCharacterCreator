package characterclass;
import java.util.ArrayList;
import java.util.List;

import main.GameCharacter.Ability;
public class Monk extends CharacterClass{
            int constitutionModifier;
            int proficiencyBonus;
            int hitPoints = (constitutionModifier + 8);
            int hitDie = 1;
            int hitDice = 8;

        public enum Skills {
            ACROBATICS, 
            ATHLETICS, 
            HISTORY,
            lNSIGHT, 
            RELIGION, 
            STEALTH
        };

        public enum Features {
            UNARMORED_DEFENSE, 
            MARTIAL_ARTS
        };

        public enum Equipment{
            DUNGEONEERS_PACK,
            EXPLORERS_PACK,
            TEN_DARTS
        };

        public (int[] hitDie, Ability[] primaryAbility, Ability[] savingThrows, ArmorType[] armorProficiencies, WeaponType[] weaponProficiencies) {
			super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies);
		}

        {
            List<WeaponType> weaponProficiencies = new ArrayList<WeaponType>();
                weaponProficiences.add(WeaponType.SIMPLE);
                weaponProficiences.add(WeaponType.SHORTSWORD);

            List<Ability> savingThrows = new ArrayList<Ability>();
                savingThrows.add(Ability.STRENGTH);
                savingThrows.add(Ability.DEXTERITY);

            List<Skills> skillset = new ArrayList<Skills>();
                skillset.add(Skills.ACROBATICS);
                skillset.add(Skills.ATHLETICS);
                skillset.add(Skills.HISTORY);
                skillset.add(Skills.INSIGHT);
                skillset.add(Skills.RELIGION);
                skillset.add(Skills.STEALTH);

            List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
            List<Equipment> equipment = new ArrayList<Equipment>();
                if (equipmentChoice.equals(WeaponType.SHORTSWORD)){
                    equipmentChoice.add(WeaponType.SHORTSWORD);
                    equipmentChoice.add(WeaponType.SHORTSWORD);
                } else if (equipmentChoice.equals(WeaponType.SIMPLE)){
                    equipmentChoice.add(WeaponType.SIMPLE);
                    equipmentChoice.add(WeaponType.SIMPLE);
                }

                if(equipmentChoice.equals(Equipment.DUNGEONEERS_PACK)){
                    equipment.add(Equipment.DUNGEONEERS_PACK);
                } else {
                    equipment.add(Equipment.EXPLORERS_PACK);
                }

                equipment.add(Equipment.TEN_DARTS);
        }
}