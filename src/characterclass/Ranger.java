package characterclass;
import java.util.ArrayList;
import java.util.List;



import main.GameCharacter.Ability;
@SuppressWarnings("unlikely-arg-type")
public class Ranger extends CharacterClass {
		int constitutionModifier;
		int proficiencyBonus;
		int hitPoints = (constitutionModifier + 8);
		int hitDie = 1;
		int hitDice = 8;
		
	   //Unique ranger skills.
	   public enum Skills {
	      ANIMAL_HANDLING,
	      ATHLETICS,
	      INSIGHT,
	      INVESTIGATION,
	      NATURE,
	      PERCEPTION,
	      STEALTH,
	      SURVIVAL
	      };
	      
	      //level one features
	      public enum Features {
	    	  FAVORED_ENEMY,
	    	  NATURAL_EXPLORER
	      };
	      
	    //Equipment choices  
	    public enum Equipment{
	      BURGLARS_PACK,
	      EXPLORERS_PACK,
	      SCALE_MAIL,
	      LEATHER_ARMOR
	      
	    };
	      
		public Ranger(int[] hitDie, Ability[] primaryAbility, Ability[] savingThrows, ArmorType[] armorProficiencies,
				WeaponType[] weaponProficiencies) {
			super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies);
		}
		{
			List<WeaponType> weaponProficiencies = new ArrayList<WeaponType>();
	      //adding proficiencies
			weaponProficiencies.add(WeaponType.SIMPLE);
			weaponProficiencies.add(WeaponType.MARTIAL);

			List<Ability> savingThrows = new ArrayList<Ability>();
	      //Level one saving throws
	      savingThrows.add(Ability.STRENGTH);
	      savingThrows.add(Ability.DEXTERITY);
			
			List<ArmorType> armors = new ArrayList<ArmorType>();
	      //light, medium, and shield proficiency.
			armors.add(ArmorType.LIGHT);
	      armors.add(ArmorType.MEDIUM);
	      armors.add(ArmorType.SHIELDS);
	      
	      //Adding unique ranger skills
			List<Skills> skillset = new ArrayList<Skills>();
	      skillset.add(Skills.ANIMAL_HANDLING);
	      skillset.add(Skills.ATHLETICS);
	      skillset.add(Skills.INSIGHT);
	      skillset.add(Skills.INVESTIGATION);
	      skillset.add(Skills.NATURE);
	      skillset.add(Skills.PERCEPTION);
	      skillset.add(Skills.STEALTH);
	      skillset.add(Skills.SURVIVAL);
	      skillset.add(Skills.ANIMAL_HANDLING);
	      
	      //Choosing starting equipment
			List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
			List<Equipment> equipment = new ArrayList<Equipment>();
	      if(equipmentChoice.equals(Equipment.SCALE_MAIL)){
	         equipment.add(Equipment.SCALE_MAIL);
	      } else {
	         equipment.add(Equipment.LEATHER_ARMOR);
	      }
			if(equipmentChoice.equals(WeaponType.SHORTSWORD)){
	         equipmentChoice.add(WeaponType.SHORTSWORD);
	         equipmentChoice.add(WeaponType.SHORTSWORD);
	      }else if(equipmentChoice.equals(WeaponType.SIMPLE)){
	         equipmentChoice.add(WeaponType.SIMPLE);
	         equipmentChoice.add(WeaponType.SIMPLE);
	      }
	      if(equipmentChoice.equals(Equipment.BURGLARS_PACK)){
	         equipment.add(Equipment.BURGLARS_PACK);
	      }else{
	         equipment.add(Equipment.EXPLORERS_PACK);
	      }
			equipmentChoice.add(WeaponType.LONGBOW);
				int arrows = 20;

		}

}
