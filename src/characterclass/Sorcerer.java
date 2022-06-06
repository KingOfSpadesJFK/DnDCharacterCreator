package characterclass;
import java.util.ArrayList;
import java.util.List;
import main.GameCharacter.Ability;

public class Sorcerer extends CharacterClass {
    int constitutionModifier;
    int proficiencyBonus;
    int hitPoints = (constitutionModifier + 6);
    
    private static final int[][] hitDie = 
            {
                {6},
                {1}
            };

    private static final Ability[] primaryAbility = 
            {
                Ability.CHARISMA,
                Ability.CONSTITUTION
            };

    private static final Ability[] savingThrows =
            {
                Ability.CONSTITUTION,
                Ability.CHARISMA
            };

    private static final WeaponType[] weaponProficiencies =
            {
                WeaponType.DAGGER,
                WeaponType.DARTS,
                WeaponType.SLING,
                WeaponType.QUARTERSTAFF,
                WeaponType.LIGHT_CROSSBOW
            };

    private static final Skill[] skillset = 
            {
                Skill.ARCANA,
                Skill.DECEPTION,
                Skill.INSIGHT,
                Skill.INTIMIDATION,
                Skill.PERSUASION,
                Skill.RELIGION
            };

    public enum Features {
                SPELLCASTING, 
                SORCEROUS_ORIGIN
            };

    public Sorcerer()
    {
        super(hitDie, primaryAbility, savingThrows, null, weaponProficiencies, skillset, null) 

        List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
        List<Equipment> equipment = new ArrayList<Equipment>();

            if (equipmentChoice.contains(WeaponType.LIGHT_CROSSBOW)){
                equipmentChoice.add(WeaponType.LIGHT_CROSSBOW);
            } else if (equipmentChoice.contains(WeaponType.SIMPLE)){
                equipmentChoice.add(WeaponType.SIMPLE);
            }

            if(equipmentChoice.contains(WeaponType.COMPONENT_POUCH)){
                equipment.add(Equipment.COMPONENT_POUCH);
            } else {
                equipment.add(Equipment.ARCANE_FOCUS);
            }

            if(equipmentChoice.contains(WeaponType.DUNGEONEERS_PACK)){
                equipment.add(Equipment.DUNGEONEERS_PACK);
            } else {
                equipment.add(Equipment.EXPLORERS_PACK);
            }

            equipment.add(Equipment.DAGGER);
            equipment.add(Equipment.DAGGER);
    }
}
