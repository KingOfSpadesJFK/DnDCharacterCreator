package race;

public class Dwarf extends Race 
{
	public final static String RACE_NAME = "Dwarf";
	
	public Dwarf() {
		super(RACE_NAME, 0, 0, 1, 0, 0, 0);
	}

	private Dwarf(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(RACE_NAME, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}

	public class HillDwarf extends Dwarf
	{
		public final static String RACE_NAME = "Hill Dwarf";
		public HillDwarf() {
			super(0, 0, 3, 0, 0, 0);
		}
	}

	public class MountainDwarf extends Dwarf 
	{
		public final static String RACE_NAME = "Mountain Dwarf";
		public MountainDwarf() {
			super(2, 0, 1, 0, 0, 0);
		}
	}
}
