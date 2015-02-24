import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;

public class skills implements Comparable{
	private String name, description;
	private int manaCost, skillDmg, noOfTargets;
	private int origSkillDmg;
	private double critFactor, critChance, hitChance;
	private double origCritFac, origCritChan, origHitChan;
	//stores current buffs so it can see how many turns are left on buff and what it does
	//will have to be moved to a different class
	//maybe moved to character/respective mob classes?
	//feels strange to store all current buffs inside of the skills class
	private buffs currBuff;
	//attribute needs to be implemented using the subclass constructor
	attribute myAttribute;
	
	//implement stuff for the animation later
	
	public skills(){
		name = "tempName";
		manaCost =0;
		skillDmg = 0;
		critFactor = 0;
		critChance = 0;
		noOfTargets = 1;
		hitChance = 0;
		myAttribute = null;
		
		//instantiates the original values, prob will have no need
		origSkillDmg = 0;
		origCritFac = 0;
		origCritChan = 0;
		origHitChan =0;
		
		//stores the current buffs on the person
		currBuff = null;
	}
	
	public skills(String nm, attribute attb, int manaC, int dmg, int tar, double critFac,
			double critChan, double hitChan, String desc){
		name = nm;
		myAttribute = attb;
		description = desc;
		manaCost = manaC;
		skillDmg = dmg;
		noOfTargets = tar;
		critFactor = critFac;
		critChance = critChan;
		hitChance = hitChan;
		
		//stores original values for each buff/debuffable value
		origSkillDmg = dmg;
		origCritFac = critFac;
		origCritChan = critChan;
		origHitChan = hitChan;
		
		//stores the current buffs on said person
		currBuff = null;
	}
	
	
	//accessors
	public String getDesc(){return description;}
	
	public attribute getAttribute(){return myAttribute;}
	
	public int getManaCost(){return manaCost;}
	
	public int getDamage(){return skillDmg;}
	
	public int getNumberOfTargets(){return noOfTargets;}
	
	public double getCritFactor(){return critFactor;}
	
	public double getCritChance(){return critChance;}
	
	public String getName(){return name;}
	
	public int getOrigDamage(){	return origSkillDmg;}
	
	public double getOrigCritChance(){return origCritChan;}
	
	public double getOrigCritFactor(){return origCritFac;}
	
	public double getHitChance(){return hitChance;}
	
	public double getOrigHitChance(){return origHitChan;}
	
	public void buffSkill(buffs x){
		if(x.getBuffType().equals("Crit Factor"))
			critFactor = critFactor * x.getBuffFactor();
		
		if(x.getBuffType().equals("Crit Chance"))
			critChance = critChance * x.getBuffFactor();
		
		if(x.getBuffType().equals("Skill Damage"))
			skillDmg  = (int)(skillDmg * x.getBuffFactor());
		
		if(x.getBuffType().equals("Hit Chance"))
			hitChance = hitChance * x.getBuffFactor();
	}
	
	public boolean currentlyBuffed(){
		if(currBuff==null)
			return false;
		return true;
	}
	
	public void buffCheck(){
		if(currentlyBuffed() && currBuff.turnsLeft()==0){
			currBuff = null;
			critFactor = origCritFac;
			critChance = origCritChan;
			hitChance = origHitChan;
			skillDmg = origSkillDmg;
		}
	}
	
	//work on this damage calculation once all the code is cleaned up and the buffs moved elsewhere
	/***public int damageCalculation(){
		if(currentBuffed()){
			
		}
	}*****/
	
	public String toString(){
		return manaCost + " " + name;
	}

	@Override
	//arg0 has to be another skill
	public int compareTo(Object arg0) {
		skills x = (skills)(arg0);
		if(x.getManaCost() == getManaCost())
			return 0;
		else
			if(getManaCost()>x.getManaCost())
				return 1;
			else
				return -1;
	}
	
}
