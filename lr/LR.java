import java.util.HashMap;

public class LR {
	
	static HashMap<String, Integer> bigramPos;
	static HashMap<String, Integer> bigramNeg;	
	static HashMap<String, Integer> bigramNeu;
	
	public static STO calc(STO sto) {
		
		sto.setPos(getProb(bigramPos, sto.getInput()));
		sto.setNeg(getProb(bigramNeg, sto.getInput()));
		sto.setNeu(getProb(bigramNeu, sto.getInput()));
		
		sto.setClassifier(getClass(sto));
		
		return sto;
	}
	
	private static String getClass(STO sto) {
		
		if(sto.getPos() > sto.getNeu() && sto.getPos() > sto.getNeg()) {
			return "Positive";
		} else if(sto.getNeg() > sto.getPos() && sto.getNeg() > sto.getNeu()) {
			return "Negative";
		} else {
			return "Neutral";
		}
	}

	private static double getProb(HashMap<String, Integer> hm, String input) {
		
		return 0.0;
	}
}