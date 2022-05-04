package race;

class Elf extends Race
{

    public final static String RACE_NAME = "Elf";

    public Elf(int[] stats)
    {
        super(RACE_NAME, 0, 2, 0, 0, 0, 0);
    }

}
class High_Elf extends Race
{
    public final static String RACE_NAME = "High_Elf";

    public High_Elf(int[] stats)
    {
        super(RACE_NAME, 1, 2, 0, 0, 0, 0);
    }
}

class Drow extends Race
{
    public final static String RACE_NAME = "Drow";

    public Drow(int[] stats)
    {
        super(RACE_NAME, 0, 2, 0, 0, 0, 1);
    }
}

class Wood_Elf extends Race
{
    public final static String RACE_NAME = "Wood_Elf";

    public Wood_Elf(int[] stats)
    {
        super(RACE_NAME, 0, 2, 0, 0, 1, 0);
    }
}