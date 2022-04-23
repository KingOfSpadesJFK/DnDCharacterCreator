package race;

public class Human extends Race {
    
    public static String CLASS_NAME = "Human";

    public Human(String name, int[] stats) {
        super(name, CLASS_NAME, stats);
    }

    public int[] statAdjust(int[] stats)
    {
        int i = 0;
        while (i < 6) {
            stats[i] += 1;
            i++;
        }
        return stats;
    }
}