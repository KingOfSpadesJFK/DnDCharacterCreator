package race;

public abstract class Race {
    
    private String raceName;
    private String charName;
    private int[] stats = new int[6];

    public Race(String name, String race, int[] stats) {
        this.charName = name;
        this.raceName = race;
        this.stats = statAdjust(stats);
    }

    public abstract int[] statAdjust(int[] stats);

    public String getRaceName() {
        return raceName;
    }

    public String getChar() {
        return charName;
    }

    public int[] getStats() {
        return stats;
    }

    public void setName(String name) {
        this.charName = name;
    }

    public void setStats(int[] stats) {
        this.stats = statAdjust(stats);
    }
}
