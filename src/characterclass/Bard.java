package characterclass;
import java.util.ArrayList;
import java.util.List;
import main.GameCharacter.Ability;

public class Bard extends CharacterClass{
	int constitutionModifier;
	int proficiencyBonus;
	int hitPoints = (constitutionModifier + 8);
	int hitDie = 1;
	int hitDice = 8;

	public enum Skills{
		//
	};

	public enum Features{
		//
	};

	public Bard(int[] hitDie, Ability[] primaryAbility, Ability[] savingThrows, 
				ArmorType[] armorProficiencies, WeaponType[] weaponProficiencies) {
		super(hitDie, primaryAbility, savingThrows, armorProficiencies, weaponProficiencies);
	}
	
}
