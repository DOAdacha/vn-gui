import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;

public class character {
	//name of character
	String name;
	
	//Set containing all of the skills of the character, should be a TreeSet
	Set<skills> skills;
	
	//weapon that is currently equipped on the character, starts off with a basic weapon
	//if changed then this value will be changed, no need for an original holder
	weapon equippedWeapon;
	armor equippedArmor;
	
	//crit rates, crit factors, and hit rates for normal AA's
	double critRate, critFactor, hitRate;
	
	//original values for above values to reset after battles, etc.
	double origCritRate, origCritFact, origHitRate;
	
	//values for maxHP and currentHP
	int currentHP, maxHP;
	
	//value for current damage buffed/debuffs included, will be reset to weapon dmg
	//once all buffs/debuffs time out or get cured(?)
	//doing the same with armor damage reduction values
	int damage, damageReduction;
	
	buffs currentBuff;
	
	//for a new character that is MAX HP FROM THE START
	public character(String nm, Set<skills> skillList, weapon eqWeap, armor eqArm, double critR,
			double critF, double hitR, int HP){
		name = nm;
		skills = skillList;
		equippedWeapon = eqWeap;
		equippedArmor = eqArm;
		critRate = critR;
		critFactor = critF;
		hitRate = hitR;
		
		//setting up original values for reversion
		origCritRate = critR;
		origCritFact = critF;
		origHitRate  = hitR;
		
		//setting up maxHP along with current HP being the SAME
		currentHP = HP;
		maxHP = HP;
		
		//holder for buffs
		currentBuff = null;
		
		//damage is equal to the amount of dmg that the weapon deals from the start
		damage = equippedWeapon.getDamage();
		
		//damageReduction is equal to the amount of dmgReduc that armor gives
		damageReduction = equippedArmor.getDmgReduction();
	}
	
	//setting up a character that is not maxHP from the beginning
	//also gives the option for the dmg to be different from the weapons dmg, buffed from start
	//can be used to make it so that dmg is x2 normal or something
	//same thing applied with dmgReduction
	public character(String nm, Set<skills> skillList, weapon eqWeap, armor eqArm, double critR,
			double critF, double hitR, int cHP, int mHP, int dmg, int dmgR){
		name = nm;
		skills = skillList;
		equippedWeapon = eqWeap;
		equippedArmor = eqArm;
		critRate = critR;
		critFactor = critF;
		hitRate = hitR;
		
		//setting up original values for reversion
		origCritRate = critR;
		origCritFact = critF;
		origHitRate  = hitR;
		
		//currBuffs WILL NOT HOLD BUFFS FOR BUFFED MONSTERS THAT GOT BUFFED THIS WAY
		//THE DMG CAN GET DEBUFFED AND BUFFED NORMALLY AS WELL
		currentBuff = null;
		
		//setting up maxHP along with current HP being the SAME
		currentHP = cHP;
		maxHP = mHP;
		
		//in case damage is changed from the original weapon's dmg value from start
		damage = dmg;
		
		//in case dmgReduction is changed from the original armor's value
		damageReduction = dmgR;
	}
	
	//accessors
	public String getName(){return name;}
	public Set<skills> getSkillList(){return skills;}
	public weapon getEquippedWeapon(){return equippedWeapon;}
	public double getCritRate(){return critRate;}
	public double getCritFactor(){return critFactor;}
	public double getHitRate(){return hitRate;}
	public int getCurrentHP(){return currentHP;}
	public int getMaxHP(){return maxHP;}
	public int getDamage(){return damage;}
	
	
	//mutators
	public void setName(String nm){name = nm;}
	public void addSkill(skills newSkill){skills.add(newSkill);}
	public void equipWeapon(weapon newWeapon){equippedWeapon = newWeapon;}
	
	//buff types list : INTELEGENCE(INT), AGILITY(AGI), STRENGTH(STR), DEFENSE(DEF)
	//buff types list : Crit Factor(CFAC), Crit Rate(CRAT)
	public void buffDamage(buffs x){
		if(currentlyBuffed())
			return;
		
		if(x.getBuffType().equals("CFAC"))
			critFactor = critFactor * x.getBuffFactor();
		
		if(x.getBuffType().equals("CRAT"))
			critRate = critRate * x.getBuffFactor();
		
		if(x.getBuffType().equals("STR"))
			damage  = (int)(damage * x.getBuffFactor());
		
		if(x.getBuffType().equals("AGI"))
			hitRate = hitRate * x.getBuffFactor();
		
		if(x.getBuffType().equals("DEF"))
			damageReduction = (int)(damageReduction * x.getBuffFactor());
			
	}
	
	public boolean currentlyBuffed(){
		if(currentBuff==null)
			return false;
		return true;
	}
	
	public void buffCheck(){
		if(currentlyBuffed() && currentBuff.turnsLeft()==0){
			currentBuff = null;
			critFactor = origCritFact;
			critRate = origCritRate;
			hitRate = origHitRate;
			damage = equippedWeapon.getDamage();
			damageReduction = equippedArmor.getDmgReduction();
		}
	}
}
