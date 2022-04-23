package race;

public class HalfOrc extends Race {
    
    public static String CLASS_NAME = "Half-Orc";

    public HalfOrc(String name, int[] stats) {
        super(name, CLASS_NAME, stats);
    }

    public int[] statAdjust(int[] stats) 
    {    
        stats[0] += 2;
        stats[2] += 1;
        return stats;
    }
}