//warlock spells
public void setSpellWarlock(){
	string spell;
	switch(spell){
	//lvl0
	case "Blade Ward": 
		spellNameText.setText("Blade War");
		castingTimeText.setText("1 action");
		rangeText.setText("Self");
		componensText.setText("V, S");
		durationText.setText("1 round");
		concentrationText.setText("false");
		break;
	case "Chill Touch": 
		spellNameText.setText("Chill Touch");
		castingTimeText.setText("1 action");
		rangeText.setText("120");
		componensText.setText("V, S");
		durationText.setText("1 round");
		concentrationText.setText("false");
		break;
	case "Eldritch Blast": 
		spellNameText.setText("Eldritch Blast");
		castingTimeText.setText("1 action");
		rangeText.setText("120");
		componensText.setText("V, S");
		durationText.setText("Instantaneous");
		concentrationText.setText("false");
		break;
	case "Friends": 
		spellNameText.setText("1 action");
		castingTimeText.setText("1 action");
		rangeText.setText("Self");
		componensText.setText("S, M");
		durationText.setText("1 min");
		concentrationText.setText("true");
		break;
	case "Mage Hand": 
		spellNameText.setText("Mage Hand");
		castingTimeText.setText("1 action");
		rangeText.setText("30");
		componensText.setText("V, S");
		durationText.setText("1 min");
		concentrationText.setText("false");
		break;
	case "Minor Illusion": 
		spellNameText.setText("Minor Illusion");
		castingTimeText.setText("1 action");
		rangeText.setText("30");
		componensText.setText("S, M");
		durationText.setText("1 min");
		concentrationText.setText("false");
		break;
	case "Poison Spray": 
		spellNameText.setText("Poison Spray");
		castingTimeText.setText("1 action");
		rangeText.setText("10");
		componensText.setText("V, S");
		durationText.setText("1 hour");
		concentrationText.setText("false");
		break;
	case "Prestidigitation": 
		spellNameText.setText("Prestidigitation");
		castingTimeText.setText("1 action");
		rangeText.setText("10");
		componensText.setText("V, S");
		durationText.setText("1 hour");
		concentrationText.setText("false");
		break;
	case "True Strike": 
		spellNameText.setText("True Strike");
		castingTimeText.setText("1 action");
		rangeText.setText("30");
		componensText.setText("S");
		durationText.setText("1 round");
		concentrationText.setText("true");
		break;
	//lvl1
	case "Armor of Agathys": 
		spellNameText.setText("Armor of Agathys");
		castingTimeText.setText("1 action");
		rangeText.setText("Self");
		componensText.setText("V, S, M");
		durationText.setText("1 hour");
		concentrationText.setText("false");
		break;
	case "Arms of Hadar": 
		spellNameText.setText("Arms of Hadar");
		castingTimeText.setText("1 action");
		rangeText.setText("Self");
		componensText.setText("V, S");
		durationText.setText("Instantaneous");
		concentrationText.setText("false");
		break;
	case "Charm Person": 
		spellNameText.setText("Charm Person");
		castingTimeText.setText("1 action");
		rangeText.setText("30");
		componensText.setText("V, S");
		durationText.setText("1 hour");
		concentrationText.setText("false");
		break;
	case "Comprehend Languages": 
		spellNameText.setText("Comprehend Languages");
		castingTimeText.setText("1 action");
		rangeText.setText("Self");
		componensText.setText("V, S, M");
		durationText.setText("1 hour");
		concentrationText.setText("false");
		break;
	case "Expeditious Retreat": 
		spellNameText.setText("Expeditious Retreat");
		castingTimeText.setText("1 bonus action");
		rangeText.setText("Self");
		componensText.setText("V, S");
		durationText.setText("10 min");
		concentrationText.setText("true");
		break;
	case "Hellish Rebuke": 
		spellNameText.setText("Hellish Rebuke");
		castingTimeText.setText("1 reaction");
		rangeText.setText("60");
		componensText.setText("V, S");
		durationText.setText("Instantaneous");
		concentrationText.setText("false");
		break;
	case "Hex": 
		spellNameText.setText("Hex");
		castingTimeText.setText("1 bonus action");
		rangeText.setText("90");
		componensText.setText("V, S, M");
		durationText.setText("1 hour");
		concentrationText.setText("true");
		break;
	case "Fog Cloud": 
	case "Illusory Script": 
		spellNameText.setText("Illusory Script");
		castingTimeText.setText("1 min");
		rangeText.setText("Touch");
		componensText.setText("S, M");
		durationText.setText("10 days");
		concentrationText.setText("false");
		break;
	case "Protection from Evil and Good": 
		spellNameText.setText("Protection from Evil and Good");
		castingTimeText.setText("1 action");
		rangeText.setText("Touch");
		componensText.setText("V, S, M");
		durationText.setText("10 min");
		concentrationText.setText("true");
		break;
	case "Unseen Servant": 
		spellNameText.setText("Unseen Servant");
		castingTimeText.setText("1 action");
		rangeText.setText("60");
		componensText.setText("V, S, M");
		durationText.setText("1 hour");
		concentrationText.setText("false");
		break;
	case "Witch Bolt": 
		spellNameText.setText("Witch Bolt");
		castingTimeText.setText("1 action");
		rangeText.setText("30");
		componensText.setText("V, S, M");
		durationText.setText("1 min");
		concentrationText.setText("ture");
		break;
	}	
}