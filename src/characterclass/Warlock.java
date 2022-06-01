package characterclass;
import java.util.ArrayList;
import java.util.List;
import main.GameCharacter.Ability;

public class Warlock extends CharacterClass{
	int constitutionModifire;
	int proficiencyBonus;
	int hitPoints = (constitutionModifire + 8);
	private static final int[][] hitDie = {{8},{1}};
	private static final Ability[] primaryAbility = {
		Ability.CHAISMA,
		Ability.CONSTITUTION
	};
	private static final Ability[] savingThrows = {
		Ability.WISDOM,
		Ability.CHAISMA
	};
	private static final WeaponType[] weaponProficiencies = {
		WeaponType.SIMPLE,
		WeaponType.LIGHT_CROSSBOW
	};
	private static final ArmorType[] armorProficiencies = {
		ArmorType.LIGHT
	};
	private static final Skill[] skillset = {
		//
		Skill.ARCANA,
		Skill.DECEPTION,
		Skill.HISTORY,
		Skill.INTIMIDATION,
		Skill.INVESTIGATION,
		Skill.NATURE,
		Skill.RELIGION
	};

	public Warlock(){
		super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies, skillset, null);

		List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
		List<Equipment> equipment = new ArrayList<Equipment>();

		if(equipmentChoice.contains(WeaponType.LIGHT_CROSSBOW)){
			equipmentChoice.add(WeaponType.LIGHT_CROSSBOW);
		}else{
			equipmentChoice.add(WeaponType.SIMPLE);
		}

		if(equipmentChoice.contains(Equipment.ARCANE_FOCUS)){
			equipmentChoice.add(Equipment.ARCANE_FOCUS);
		}else{
			equipmentChoice.add(Equipment.COMPONENT_POUCH);
		}

		if(equipmentChoice.contains(Equipment.DUNGEONEERS_PACK)){
			equipment.add(Equipment.DUNGEONEERS_PACK);
		}else{
			equipment.add(Equipment.SCHOLARS_PACK);
		}

		equipment.add(Equipment.LEATHER_ARMOR);
		equipment.add(WeaponType.SIMPLE);
		equipment.add(WeaponType.DAGGER);

		this.setEquipment((Equipment[])equipment.toArray());

	}

	public int getHitPoints(){
		return hitPoints;
	}

}
