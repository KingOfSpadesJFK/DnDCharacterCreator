package race;

public class Tiefling extends Race {
    
    public static String CLASS_NAME = "Tiefling";

    public Tiefling(String name, int[] stats) {
        super(name, CLASS_NAME, stats);
    }

    public int[] statAdjust(int[] stats) 
    {
        stats[3] += 1;
        stats[5] += 2;
        return stats;
    }
}