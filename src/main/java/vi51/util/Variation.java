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
	  if(this.music<0)this.music=0;
	  if(this.music>ConstantContainer.MAX_DESIRE)this.music=ConstantContainer.MAX_DESIRE;
	}
	
	public void addHungry(int i) {
		  this.hungry+=i;
		  if(this.hungry<0)this.hungry=0;
		  if(this.hungry>ConstantContainer.MAX_DESIRE)this.hungry=ConstantContainer.MAX_DESIRE;
		}
	
	public void addThirsty(int i) {
		  this.thirsty+=i;
		  if(this.thirsty<0)this.thirsty=0;
		  if(this.thirsty>ConstantContainer.MAX_DESIRE)this.thirsty=ConstantContainer.MAX_DESIRE;
		}
	
	public void addPee(int i) {
		  this.pee+=i;
		  if(this.pee<0)this.pee=0;
		  if(this.pee>ConstantContainer.MAX_DESIRE)this.pee=ConstantContainer.MAX_DESIRE;
		}

	public boolean musicIsPriority() {
	  return (this.music-ConstantContainer.MUSIC_PRIORITY_DIFFERENCE>this.hungry && this.music-ConstantContainer.MUSIC_PRIORITY_DIFFERENCE>this.thirsty && this.music-ConstantContainer.MUSIC_PRIORITY_DIFFERENCE>this.pee);
	}
	
	public boolean drinkIsPriority() {
		  return (this.thirsty-ConstantContainer.THIRSTY_PRIORITY_DIFFERENCE>this.hungry && this.thirsty-ConstantContainer.THIRSTY_PRIORITY_DIFFERENCE>this.thirsty && this.thirsty-ConstantContainer.THIRSTY_PRIORITY_DIFFERENCE>this.pee);
	}
	
	public boolean eatIsPriority() {
		  return (this.hungry-ConstantContainer.HUNGRY_PRIORITY_DIFFERENCE>this.hungry && this.hungry-ConstantContainer.HUNGRY_PRIORITY_DIFFERENCE>this.thirsty && this.hungry-ConstantContainer.HUNGRY_PRIORITY_DIFFERENCE>this.pee);
	}
	
	public boolean peeIsPriority() {
		  return (this.pee-ConstantContainer.PEE_PRIORITY_DIFFERENCE>this.hungry && this.pee-ConstantContainer.PEE_PRIORITY_DIFFERENCE>this.thirsty && this.pee-ConstantContainer.PEE_PRIORITY_DIFFERENCE>this.pee);
	}
}
