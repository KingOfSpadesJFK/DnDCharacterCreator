public class Dwarf  {

	class AbilityScoreIncrease {
		public AbilityScoreIncrease(String ability, int scoreIncrease) {
			this.ability = ability;
			this.scoreIncrease = scoreIncrease;
		}

		String ability;
		int scoreIncrease;
	}

	AbilityScoreIncrease abilityScoreIncrease;
	String Size;
	int Speed;
	String[] Language;
	
	public Dwarf() {
		abilityScoreIncrease = new AbilityScoreIncrease("Constitution", 2);
	}

}
