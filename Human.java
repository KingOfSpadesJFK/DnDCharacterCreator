import java.util.Arrays;

public class Human {
    
    String className = "Human";
    String charName;
    int[] stats = new int[6];

    public Human(String name, int[] stats) {
        
        this.charName = name;
        this.stats = statAdjust(stats);
    
    }

    public int[] statAdjust(int[] stats) {
        
        int i = 0;

        while (i < 6) {
            stats[i] += 1;
            i++;
        }

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