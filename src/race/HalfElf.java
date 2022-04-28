package race;
import java.util.Random;

public class HalfElf extends Race {
    
    public final static String CLASS_NAME = "Half-Elf";

    // Half-elves also get to choose which of the stats they want increased by one.
    public HalfElf(int[] stats) {
        super(CLASS_NAME, 0, 0, 0, 0, 0, 2);

        Random rand = new Random();
        for (int i = 0; i < 2; i++) {
            int j = rand.nextInt(6);
            switch (j)
            {
                case 0: setStrength(getStrength() + 1);
                case 1: setDexterity(getDexterity() + 1);
                case 2: setConstitution(getConstitution() + 1);
                case 3: setIntelligence(getIntelligence() + 1);
                case 4: setWisdom(getWisdom() + 1);
                case 5: setCharisma(getCharisma() + 1);
            }
        }
        
    }
}