import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;

public class mob {
	private Set<skills> skillList = new TreeSet();
	private int damage, currHP, maxHP;
	private String mobName;
	private double critChance, critFactor, hitChance;
	private double origCritChan, origCritFac, origHitChan;
	private attribute mobAttribute;
	
	public mob(Set<skills> skills, int dmg, int HP, String nm, attribute att, double critChan, 
			double critFac, double hitChan){
		skillList = skills;
		damage = dmg;
		currHP = HP;
		maxHP = HP;
		mobName = nm;
		mobAttribute = att;
		critChance = critChan;
		critFactor = critFac;
		hitChance = hitChan;
		origCritChan = critChan;
		origCritFac = critFac;
		origHitChan = hitChan;
	}
	
	
	//prints out all the skills the mob has avail
	//most likely will only be used for dev testing purposes
	public void showSkills(){
		for(skills x: skillList)
			System.out.println(x);
	}
	
	//accessors
	
	public Set<skills> getSkillList(){return skillList;}
	
	public String getName(){return mobName;}
	
	public attribute getAttribute(){return mobAttribute;}
	
	public int getDamage(){return damage;}
	
	public int getCurrHP(){return currHP;}
	
	public int getMaxHP(){return maxHP;}
	
	public double getCritFactor(){return critFactor;}
	
	public double getCritChance(){return critChance;}
	
	public double getHitChance(){return hitChance;}
	
	//mutators
	
	public void setName(String nm){mobName = nm;}
	
	public void setAttribute(attribute att){mobAttribute = att;}
	
}
