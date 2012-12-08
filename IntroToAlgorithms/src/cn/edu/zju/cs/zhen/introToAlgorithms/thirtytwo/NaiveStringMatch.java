package cn.edu.zju.cs.zhen.introToAlgorithms.thirtytwo;

import java.util.ArrayList;

public class NaiveStringMatch {
	 
	public static ArrayList<Integer> allMatchPosistion(String text, int startPosistion, String pattern){
		ArrayList<Integer> matchPosistions = new ArrayList<Integer>();
		for(int i=0; i<=(text.length()-pattern.length()); i++){			 
			boolean match = true;
			for(int j=0; j<pattern.length(); j++){
				if(pattern.charAt(j)!=text.charAt(i+j))
				{
					match = false;
					break;
				}
			}
			if(match == true)
				matchPosistions.add(i);
		}
		return matchPosistions;
	}
	public static void main(String[] args){
		ArrayList<Integer> matchPositions = NaiveStringMatch.allMatchPosistion("0000100010001", 0, "0001");
		for(Integer position: matchPositions){
			System.out.println(position);
		}
	}
}
