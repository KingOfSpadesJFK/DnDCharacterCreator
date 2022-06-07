package characterclass;
import java.util.ArrayList;
import java.util.List;
import main.GameCharacter.Ability;

public class Wizard extends CharacterClass {
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
                    Ability.INTELLIGENCE,
                    Ability.CONSTITUTION
            };

    private static final Ability[] savingThrows =
            {
                    Ability.INTELLIGENCE,
                    Ability.WISDOM
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
                    Skill.HISTORY,
                    Skill.INSIGHT,
                    Skill.INVESTIGATION,
                    Skill.MEDICINE,
                    Skill.RELIGION
            };

    public enum Features {
        SPELLCASTING,
        ARCANE_RECOVERY
    };

    public Wizard()
    {
        super(hitDie, primaryAbility, savingThrows, null, weaponProficiencies, skillset, null)

        List<WeaponType> equipmentChoice = new ArrayList<WeaponType>();
        List<Equipment> equipment = new ArrayList<Equipment>();

        if (equipmentChoice.contains(WeaponType.QUARTERSTAFF) = false){
            equipmentChoice.add(WeaponType.DAGGER);
        } else {}

        if(equipmentChoice.contains(WeaponType.COMPONENT_POUCH) = false){
            equipment.add(Equipment.COMPONENT_POUCH);
        } else {
            equipment.add(Equipment.ARCANE_FOCUS);
        }

        if(equipmentChoice.contains(WeaponType.SCHOLARS_PACK) = false ){
            equipment.add(Equipment.SCHOLARS_PACK);
        } else {
            equipment.add(Equipment.EXPLORERS_PACK);
        }

        equipment.add(Equipment.SPELLBOOK);
        this.setEquipment((Equipment[])equipment.toArray());
    }

    public int getHitPoints()
    {
        int hitpoints = 10;
        return hitPoints;
    }
}