package vi51.util;

import java.util.HashMap;

/**
 * 
 * @author Dudul
 *	Variation of desire of a visitor agent
 */

public class Variation{
	int music;
	int thirsty;
	int hungry;
	int pee;
	
	HashMap<String,Variation> actionMapping;
	
	public Variation(int music,int thirsty,int hungry,int pee){
		this.music=music;
		this.thirsty=thirsty;
		this.hungry=hungry;
		this.pee=pee;
		
		actionMapping = new HashMap<String,Variation>();
		actionMapping.put("Drink",new Variation(10,-40,20,30));
		actionMapping.put("ListenMusic",new Variation(-1,1,1,1));
		actionMapping.put("Eat",new Variation(10,20,-40,10));
		actionMapping.put("Pee",new Variation(10,1,1,-50));
		actionMapping.put("Move",new Variation(1,0,0,1));
	}
	
	public String chooseBestBasedOnAverageValue(){
		
		String action = "Move";
		int bestAverage = getAverage();
		int newAverage = this.addVariation(actionMapping.get("Drink")).getAverage();
		if(newAverage<bestAverage){
			action = "Drink";
			bestAverage = newAverage;
		}
		newAverage = this.addVariation(actionMapping.get("Eat")).getAverage();
		if(newAverage<bestAverage){
			action = "Eat";
			bestAverage = newAverage;
		}
		newAverage = this.addVariation(actionMapping.get("Pee")).getAverage();
		if(newAverage<bestAverage){
			action = "Pee";
			bestAverage = newAverage;
		}
		
		return action;
		
	}
	
	/**
	 * return a new variation that is the sum of all values
	 * @param var
	 * @return
	 */
	public Variation addVariation(Variation var){
		
		Variation returnVar = new Variation(this.music+var.music,this.thirsty+var.thirsty,this.hungry=var.hungry,this.pee=var.pee);
		
		return returnVar;
	}
	
	public int getAverage(){
		return (this.music+this.thirsty+this.hungry+this.pee)/4;
	}
}
