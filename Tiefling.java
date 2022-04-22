import java.util.Arrays;

public class Tiefling {
    
    String className = "Tiefling";
    String charName;
    int[] stats = new int[6];

    public Tiefling(String name, int[] stats) {
        
        this.charName = name;
        this.stats = statAdjust(stats);
    
    }

    public int[] statAdjust(int[] stats) {
        
        stats[3] += 1;
        stats[5] += 2;

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