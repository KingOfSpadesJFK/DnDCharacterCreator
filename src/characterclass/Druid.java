package characterclass;
import java.util.ArrayList;
import java.util.List;

import characterclass.Ranger.Equipment;
import main.GameCharacter.Ability;

public class Druid extends CharacterClass {
	int constitutionModifier;
	int proficiencyBonus;
	int hitPoints = (constitutionModifier + 8);
	
	private static final int[][] hitDie = {{8},{1}};
	
	private static final Ability[] primaryAbility = {
		Ability.WISDOM
	};
	
	private static final Ability[] savingThrows = {
			
		Ability.WISDOM,
		Ability.INTELLIGENCE
	};
	private static final WeaponType[] weaponProficiencies = {
			
		WeaponType.CLUB,
		WeaponType.DAGGER,
		WeaponType.DARTS,
		WeaponType.JAVELIN,
		WeaponType.MACE,
		WeaponType.QUARTERSTAFF,
		WeaponType.SCIMITARS,
		WeaponType.SICKLE,
		WeaponType.SLING,
		WeaponType.SPEAR
	};
	
	private static final ArmorType[] armorProficiencies = {
		ArmorType.LIGHT,
		ArmorType.MEDIUM,
		ArmorType.SHIELDS	// non-metal
	};
	private static final Skill[] skillset = {
		
		Skill.ARCANA,
		Skill.ANIMAL,
		Skill.HANDLING,
		Skill.INSIGHT,
		Skill.PERCEPTION,
		Skill.MEDICINE,
		Skill.NATURE,
		Skill.RELIGION,
		Skill.SURVIVAL
		
	};
	

	public Druid(int[] hitDie, Ability[] primaryAbility, Ability[] savingThrows, ArmorType[] armorProficiencies,
			WeaponType[] weaponProficiencies) {
		super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies);
	}{
		List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
		List<Equipment> equipment = new ArrayList<Equipment>();
		List<ArmorType> armor = new ArrayList<ArmorType>();

		//Choosing starting equipment
		List<WeaponType> equipmentChoice1 = new ArrayList<WeaponType>();
		List<Equipment> equipment1 = new ArrayList<Equipment>();
      if(equipmentChoice1.equals(Equipment.SCALE_MAIL)){
         equipment1.add(Equipment.SCALE_MAIL);
      } else {
         equipment1.add(Equipment.LEATHER_ARMOR);
      }
		if(equipmentChoice1.equals(WeaponType.SHORTSWORD)){
         equipmentChoice1.add(WeaponType.SHORTSWORD);
         equipmentChoice1.add(WeaponType.SHORTSWORD);
      }else if(equipmentChoice1.equals(WeaponType.SIMPLE)){
         equipmentChoice1.add(WeaponType.SIMPLE);
         equipmentChoice1.add(WeaponType.SIMPLE);
      }
      if(equipmentChoice1.equals(Equipment.BURGLARS_PACK)){
         equipment1.add(Equipment.BURGLARS_PACK);
      }else{
         equipment1.add(Equipment.EXPLORERS_PACK);
      }
		equipmentChoice1.add(WeaponType.LONGBOW);
			int arrows = 20;

}}
