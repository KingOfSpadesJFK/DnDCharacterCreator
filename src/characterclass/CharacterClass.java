package characterclass;
import main.GameCharacter.Ability;

public class CharacterClass
{
    public enum ArmorType {
        LIGHT,
        MEDIUM,
        SHIELDS
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
        SHORTBOW
    };

    private int[] hitDie;
    private Ability[] primaryAbility;
    private Ability[] savingThrows;
    private ArmorType[] armorProficiencies;
    private WeaponType[] weaponProficiencies;

    public CharacterClass(int[] hitDie, Ability[] primaryAbility, Ability[] savingThrows, ArmorType[] armorProficiencies, WeaponType[] weaponProficiencies) {
        this.hitDie = hitDie;
        this.primaryAbility = primaryAbility;
        this.savingThrows = savingThrows;
        this.armorProficiencies = armorProficiencies;
        this.weaponProficiencies = weaponProficiencies;
    }

    public int[] getHitDie() {
        return hitDie;
    }

    public Ability[] getPrimaryAbilities() {
        return primaryAbility;
    }

    public Ability[] getSavingThrows() {
        return savingThrows;
    }

    public ArmorType[] armorProficiencies() {
        return armorProficiencies;
    }

    public WeaponType[] weaponProficiencies() {
        return weaponProficiencies;
    }
}
