import java.util.Random;
import java.util.Arrays;

public class HalfElf {
    
    String className = "Half-Elf";
    String charName;
    int[] stats = new int[6];

    public HalfElf(String name, int[] stats) {
        
        this.charName = name;
        this.stats = statAdjust(stats);
    
    }

    public int[] statAdjust(int[] stats) {
        
        stats[5] += 2;
        Random rand = new Random();

        int rand_int1 = rand.nextInt(6);
        int rand_int2 = rand.nextInt(6);

        stats[rand_int1] += 1;
        stats[rand_int2] += 1;

        return stats;
    }

    public String getClass() {
        return className;
    }

    public String getChar() {
        return charName;
    }

    public int[] getStats() {
        return stats;
    }

    public String setName(String name) {
        this.charName = name;
    }

    public int[] setStats(int[] stats) {
        this.stats = statAdjust(stats);
    }
}