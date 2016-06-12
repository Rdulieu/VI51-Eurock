package vi51.util;

import java.util.HashMap;

/**
 * 
 * @author Dudul
 *	Variation of desire of a visitor agent
 */

public class Variation{
	private int music;
	private int thirsty;
	private int hungry;
	private int pee;
	
	public Variation(int music,int thirsty,int hungry,int pee){
		this.music=music;
		this.thirsty=thirsty;
		this.hungry=hungry;
		this.pee=pee;
	}
	
	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getThirsty() {
		return thirsty;
	}

	public void setThirsty(int thirsty) {
		this.thirsty = thirsty;
	}

	public int getHungry() {
		return hungry;
	}

	public void setHungry(int hungry) {
		this.hungry = hungry;
	}

	public int getPee() {
		return pee;
	}

	public void setPee(int pee) {
		this.pee = pee;
	}

	public void addMusic(int i) {
	  this.music+=i;
	}
	
	public void addHungry(int i) {
		  this.hungry+=i;
		}
	
	public void addThirsty(int i) {
		  this.thirsty+=i;
		}
	
	public void addPee(int i) {
		  this.pee+=i;
		}
}
