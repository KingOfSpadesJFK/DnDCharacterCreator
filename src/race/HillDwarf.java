package race;

public class HillDwarf extends Dwarf{
	int Age;
	int Alignment;

	public HillDwarf(String name, int[] stats) {
		abilityScoreIncrease = new AbilityScoreIncrease("Constitution", 2);
	}
}
