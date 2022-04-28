package main;

import java.util.HashMap;
import java.util.Map;

public class AbilityScoresModifiers {
	Map<Integer,Integer> scoreModifer = new HashMap<Integer,Integer>();
	
	public AbilityScoresModifiers(){
		scoreModifer.put(1, -5);
		scoreModifer.put(2, -4);
		scoreModifer.put(3, -4);
		scoreModifer.put(4, -3);
		scoreModifer.put(5, -3);
		scoreModifer.put(6, -2);
		scoreModifer.put(7, -2);
		scoreModifer.put(8, -1);
		scoreModifer.put(9, -1);
		scoreModifer.put(10, 0);
		scoreModifer.put(11, 0);
		scoreModifer.put(12, 1);
		scoreModifer.put(13, 1);
		scoreModifer.put(14, 2);
		scoreModifer.put(15, 2);
		scoreModifer.put(16, 3);
		scoreModifer.put(17, 3);
		scoreModifer.put(18, 4);
		scoreModifer.put(19, 4);
		scoreModifer.put(20, 5);
		scoreModifer.put(21, 5);
		scoreModifer.put(22, 6);
		scoreModifer.put(23, 6);
		scoreModifer.put(24, 7);
		scoreModifer.put(25, 7);
		scoreModifer.put(26, 8);
		scoreModifer.put(27, 8);
		scoreModifer.put(28, 9);
		scoreModifer.put(29, 9);
		scoreModifer.put(30, 10);
	}
	
	public int getModifer(int score) {
		return scoreModifer.get(score);
	}
}
