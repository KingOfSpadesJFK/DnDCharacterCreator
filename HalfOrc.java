import java.util.Arrays;

public class HalfOrc {
    
    String className = "Half-Orc";
    String charName;
    int[] stats = new int[6];

    public HalfOrc(String name, int[] stats) {
        
        this.charName = name;
        this.stats = statAdjust(stats);
    
    }

    public int[] statAdjust(int[] stats) {
        
        stats[0] += 2;
        stats[2] += 1;

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