package race;
import java.util.Random;

public class HalfElf extends Race {
    
    public static String CLASS_NAME = "Half-Elf";

    public HalfElf(String name, int[] stats) {
        super(name, CLASS_NAME, stats);
    }

    public int[] statAdjust(int[] stats) 
    {
        stats[5] += 2;
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6);
        int rand_int2 = rand.nextInt(6);

        stats[rand_int1] += 1;
        stats[rand_int2] += 1;

        return stats;
    }
}