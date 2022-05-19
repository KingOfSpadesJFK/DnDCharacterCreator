package characterclass;
import java.util.ArrayList;
import java.util.List;

import main.GameCharacter.Ability;
public class Monk extends CharacterClass
{
            int constitutionModifier;
            int proficiencyBonus;
            int hitPoints = (constitutionModifier + 8);
            
            private static final int[][] hitDie = 
            {
                {8},
                {1}
            };
            private static final Ability[] primaryAbility = 
            {
                Ability.STRENGTH,
                Ability.DEXTERITY
            };
            private static final Ability[] savingThrows =
            {
                Ability.DEXTERITY,
                Ability.WISDOM
            };
            private static final WeaponType[] weaponProficiencies =
            {
                WeaponType.SIMPLE,
                WeaponType.SHORTSWORD
            };
            private static final Skill[] skillset = 
            {
                Skill.ACROBATICS,
                Skill.ATHLETICS,
                Skill.HISTORY,
                Skill.INSIGHT,
                Skill.RELIGION,
                Skill.STEALTH
            };

        public enum Features {
            UNARMORED_DEFENSE, 
            MARTIAL_ARTS
        };

        public Monk()
        {
			super(hitDie, primaryAbility, savingThrows, null, weaponProficiencies, skillset, null);

            List<Skill> skillset = new ArrayList<Skill>();
                skillset.add(Skill.ACROBATICS);
                skillset.add(Skill.ATHLETICS);
                skillset.add(Skill.HISTORY);
                skillset.add(Skill.INSIGHT);
                skillset.add(Skill.RELIGION);
                skillset.add(Skill.STEALTH);

            List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
            List<Equipment> equipment = new ArrayList<Equipment>();
                if (equipmentChoice.contains(WeaponType.SHORTSWORD)){
                    equipmentChoice.add(WeaponType.SHORTSWORD);
                    equipmentChoice.add(WeaponType.SHORTSWORD);
                } else if (equipmentChoice.contains(WeaponType.SIMPLE)){
                    equipmentChoice.add(WeaponType.SIMPLE);
                    equipmentChoice.add(WeaponType.SIMPLE);
                }

                if(equipmentChoice.contains(WeaponType.DUNGEONEERS_PACK)){
                    equipment.add(Equipment.DUNGEONEERS_PACK);
                } else {
                    equipment.add(Equipment.EXPLORERS_PACK);
                }

                equipment.add(Equipment.TEN_DARTS);
        }

        public int getHitPoints() {
            // TODO Auto-generated method stub
            return 0;
        }
}