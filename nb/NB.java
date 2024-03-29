//===============================================================
// PROGRAM: NB.java
// ASSIGNMENT: Problem Set 4
// CLASS: Natural Language Processing
// DATE: Nov 1 2018
// AUTHOR: Renae Fisher, Anthony Todaro
// ABSTRACT: This class performs calculations to classify a space
//  delimited sentence.
//===============================================================

package nb;

import java.util.HashMap;

public class NB {
	
	static HashMap<String, Integer> unigramPos;
	static HashMap<String, Integer> unigramNeg;
	static HashMap<String, Integer> unigramNeu;
	
	static int allV;
	static int allSent;
	
	static int[] uniN;
	static int[] sent;
	
	public NB(String access) {
	
		String head = "";
		
		if(access.equals("cl"))
			head = "..";
		else if(access.equals("web"))
			head = ".";
	
        Load l = new Load(head);
        
        unigramPos = l.getPosUMap();
        unigramNeu = l.getNeuUMap();
        unigramNeg = l.getNegUMap();
        
        allV = l.getAllV();
        allSent = l.getAllSent();
        
        uniN = new int[3];
        
        uniN[0] = l.getPosUniN();
        uniN[1] = l.getNeuUniN();
        uniN[2] = l.getNegUniN();
        
        sent = new int[3];
        
        sent[0] = l.getPosSent();
        sent[1] = l.getNeuSent();
        sent[2] = l.getNegSent();
        
	}
	
	public static STO calc(STO sto)
	{
		sto.setPos(getProb(unigramPos, sto.getInput(), 0));
		sto.setNeu(getProb(unigramNeu, sto.getInput(), 1));
		sto.setNeg(getProb(unigramNeg, sto.getInput(), 2));
		
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

	private static double getProb(HashMap<String, Integer> hm, String input, int s) {

		String[] words = input.split(" ");
		String tmp;
    
		double prob = 0.0;
		double prior = Math.log10(((double) sent[s]) / allSent);
        
        //System.out.println(s);
        //System.out.println(prior);
        
        int freq = 0;
            
		for(int i = 0; i < words.length; i++) {
        
			tmp = words[i].toLowerCase();

			if(hm.get(tmp) != null) {
                freq = hm.get(tmp);
			}
			
			prob += Math.log10( ((double)( freq + 1 )) / ( uniN[s] + allV) );
			
			//System.out.println(Math.log10( ((double)( freq + 1 )) / (uniN[s] + allV) ));

		}
    
		return prob + prior;
	}
	
	// Used for debugging / testing via command line.
	
	public static void getAllProb(String input) {
    
		double a = getProb(unigramPos,input,0);
		double b = getProb(unigramNeu,input,1);
		double c = getProb(unigramNeg,input,2);
    
		System.out.println("  Pos: "+a);
		System.out.println("  Neu: "+b);
		System.out.println("  Neg: "+c);
		
		System.out.print("  Sentiment is ");
    
		if(a > b && a > c) {
			System.out.println("Positive");
		} else if(b > a && b > c) {
			System.out.println("Neutral");
		} else {
			System.out.println("Negative");
		}
    
	}
	
	public static int testCalc(String input) {
    
		double a = getProb(unigramPos,input,0);
		double b = getProb(unigramNeu,input,1);
		double c = getProb(unigramNeg,input,2);

		if(a > b && a > c) {
			return 0;
		} else if(b > a && b > c) {
			return 1;
		} else {
			return 2;
		}
    
	}
}
