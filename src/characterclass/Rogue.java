package characterclass;

import main.GameCharacter.Ability;
import java.util.ArrayList;
import java.util.List;
 
@SuppressWarnings("unlikely-arg-type")
public class Rogue extends CharacterClass {
	
	int constitutionModifier;
	int profeciencyBonus = 2;
	int hitPoints = constitutionModifier + 8;
	int hitDie = 1; //quantity
	int hitDice = 8;//quality
	
	public enum Skills {
		ACROBATICS,
		ATHLETICS,
		DECEPTION,
		INSIGHT,
		INTIMIDATION,
		INVESTIGATION,
		PERCEPTION,
		PERFORMANCE,
		PERSUASION,
		SLEIGHT_OF_HAND,
		STEALTH
		
	};
	public enum Features{
		EXPERTISE,
		SNEAK_ATTACK,
		THIEVES_CANT,
		CUNNING_ACTION,
		ROGUISH_ARCHETYPE,
		ABILITY_SCORE_IMPROVEMENT,
		UNCANNY_DODGE,
		EXPERTISE_TWO,
		EVASION,
		ABILITY_SCORE_IMPROVEMENT_TWO,
		ROGUISH_ARCHETYPE_FEATURE,
		ABILITY_SCORE_IMPROVEMENT_THREE,
		RELIABLE_TALENT,
		ABILITY_SCORE_IMPROVEMENT_FOUR,
		ROGUISH_ARCHETYPE_FEATURE_TWO,
		BLINDSENSE,
		SLIPPER_MIND,
		ABILITY_SCORE_IMPROVEMENT_FIVE,
		ROGUISH_ARCHETYPE_FEATURE_THREE,
		ELUSIVE,
		ABILITY_SCORE_IMPROVEMENT_SIX,
		STROKE_OF_LUCK
		
		
	};
	
	// Potential equipment
	public enum Equipment{
		BURGLARS_PACK,
		DUNGEONEERS_PACK,
		EXPLORERS_PACK,
		LEATHER_ARMOR,
		THIEVES_TOOLS
	};
	

	 public Rogue(int[] hitDie, Ability[] primaryAbility, Ability[] savingThrows, ArmorType[] armorProficiencies,
			WeaponType[] weaponProficiencies) {
		super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies);
	}
	 
	{
		//proficiency
		List<WeaponType> weaponProficiencies = new ArrayList<WeaponType>();
		weaponProficiencies.add(WeaponType.SIMPLE);
		weaponProficiencies.add(WeaponType.HAND_CROSSBOW);
		weaponProficiencies.add(WeaponType.LONGSWORD);
		weaponProficiencies.add(WeaponType.RAPIER);
		weaponProficiencies.add(WeaponType.SHORTSWORD);
		
		List<ArmorType> armorProficiencies = new ArrayList<ArmorType>();
		armorProficiencies.add(ArmorType.LIGHT);
		
		List<Ability> savingThrows = new ArrayList<Ability>();
		savingThrows.add(Ability.DEXTERITY);
		savingThrows.add(Ability.INTELLIGENCE);
		
		List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
		List<Equipment> equipment = new ArrayList<Equipment>();
		
		
		
		//Class based weapons choices
		if(equipmentChoice.equals(WeaponType.RAPIER)) {
			equipmentChoice.add(WeaponType.RAPIER);
		} else {
			equipmentChoice.add(WeaponType.SHORTSWORD);
		}
		
		if(equipmentChoice.equals(WeaponType.SHORTBOW)) {
			equipmentChoice.add(WeaponType.SHORTBOW);
			int arrows = 20;
		} else {
			equipmentChoice.add(WeaponType.SHORTSWORD);
		}
		
		if(equipmentChoice.equals(Equipment.BURGLARS_PACK)) {
			equipment.add(Equipment.BURGLARS_PACK);
		}else if(equipmentChoice.equals(Equipment.DUNGEONEERS_PACK)) {
			equipment.add(Equipment.DUNGEONEERS_PACK);
		}else {
			equipment.add(Equipment.EXPLORERS_PACK);
		}
		
		
		equipment.add(Equipment.LEATHER_ARMOR);
		equipmentChoice.add(WeaponType.DAGGER);

		List<Equipment> tools = new ArrayList<Equipment>();
		tools.add(Equipment.THIEVES_TOOLS);
		
		
	}



}
