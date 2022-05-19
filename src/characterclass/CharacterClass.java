package characterclass;
import main.GameCharacter.Ability;

public abstract class CharacterClass
{
    public enum ArmorType {
        LIGHT,
        MEDIUM,
        SHIELDS, HEAVY
    };

    public enum WeaponType {
        SIMPLE,
        MARTIAL,
        HAND_CROSSBOW,
        LONGSWORD,
        RAPIER,
        SHORTSWORD,
        CLUB,
        DAGGER,
        DARTS,
        JAVELIN,
        MACE,
        QUARTERSTAFF,
        SCIMITARS,
        SICKLE,
        SLING,
        SPEAR,
        LIGHT_CROSSBOW,
        SHORTBOW,
        LONGBOW, TWO_MARTIAL, PRIESTS_PACK, DUNGEONEERS_PACK
    };

    public enum Skill {
        ATHLETICS,
        INSIGHT,
        INTIMIDATION,
        MEDICINE,
        PERSUASION,
        RELIGION, ACROBATICS, HISTORY, STEALTH
    };

    public enum Feature {
        DIVINE_SENSE,
        LAY_ON_HANDS
    };

    public enum Equipment{ 
        PREISTS_PACK,
        EXPLORERS_PACK,
        HOLY_SYMBOL, MARTIAL, SHIELD, FIVE_JAVELINS, PRIESTS_PACK, CHAIN_MAIL, TEN_DARTS, DUNGEONEERS_PACK
    };

    private int[][] hitDie;
    private Ability[] primaryAbility;
    private Ability[] savingThrows;
    private ArmorType[] armorProficiencies;
    private WeaponType[] weaponProficiencies;
    private Skill[] skillset;
    private Equipment[] equipment;

    public CharacterClass(int[][] hitDie, Ability[] primaryAbility, Ability[] savingThrows, ArmorType[] armorProficiencies, WeaponType[] weaponProficiencies, Skill[] skillset, Equipment[] equipment) {
        this.hitDie = hitDie;
        this.primaryAbility = primaryAbility;
        this.savingThrows = savingThrows;
        this.armorProficiencies = armorProficiencies;
        this.weaponProficiencies = weaponProficiencies;
        this.skillset = skillset;
        this.equipment = equipment;
    }

    public CharacterClass() {
        this.hitDie = null;
        this.primaryAbility = null;
        this.savingThrows = null;
        this.armorProficiencies = null;
        this.weaponProficiencies = null;
    }

    public int[][] getHitDie() { return hitDie; }
    public void setHitDie(int[][] i) { 
        if (i.length != 2) {
            throw new ArrayIndexOutOfBoundsException("hitDie must come with two arrays");
        }
        hitDie = i; 
    }

    public Ability[] getPrimaryAbilities() { return primaryAbility; }
    public void setPrimaryAbilities(Ability[] a) { primaryAbility = a; }

    public Ability[] getSavingThrows() { return savingThrows; }
    public void setSavingThrows(Ability[] a) { savingThrows = a; }

    public ArmorType[] getArmorProficiencies() { return armorProficiencies; }
    public void setArmorProficiencies(ArmorType[] a) { armorProficiencies = a; }

    public WeaponType[] getWeaponProficiencies() { return weaponProficiencies; }
    public void setWeaponProficiencies(WeaponType[] w) { weaponProficiencies = w; }

    public Skill[] getSkillSet() { return skillset; }
    public void setSkillSet(Skill[] s) { skillset = s; }

    public Equipment[] getEquipment() { return equipment; }
    public void setEquipment(Equipment[] e) { equipment = e; }

    public abstract int getHitPoints();
}
