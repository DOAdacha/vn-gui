import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;

public class skills {
	private String name, attribute;
	private int manaCost, damage, noOfTargets;
	private int origDmg;
	private double critFactor, critChance, hitChance;
	private double origCritFac, origCritChan, origHitChan;
	
	//implement stuff for the animation later
	
	public skills(){
		name = "tempName";
		attribute = "None";
		manaCost =0;
		damage = 0;
		critFactor = 0;
		critChance = 0;
		noOfTargets = 1;
		hitChance = 0;
		
		//instantiates the original values, prob will have no need
		origDmg = 0;
		origCritFac = 0;
		origCritChan = 0;
		origHitChan =0;
	}
	
	public skills(String nm, String attb, int manaC, int dmg, int tar, double critFac,
			double critChan, double hitChan){
		name = nm;
		attribute = attb;
		manaCost = manaC;
		damage = dmg;
		noOfTargets = tar;
		critFactor = critFac;
		critChance = critChan;
		hitChance = hitChan;
		
		//stores original values for each buff/debuffable value
		origDmg = dmg;
		origCritFac = critFac;
		origCritChan = critChan;
		origHitChan = hitChan;
	}
	
	public String getAttribute(){return attribute;}
	
	public int getManaCost(){return manaCost;}
	
	public int getDamage(){return damage;}
	
	public int getNumberOfTargets(){return noOfTargets;}
	
	public double getCritFactor(){return critFactor;}
	
	public double getCritChance(){return critChance;}
	
	public String getName(){return name;}
	
	public int getOrigDamage(){	return origDmg;}
	
	public double getOrigCritChance(){return origCritChan;}
	
	public double getOrigCritFactor(){return origCritFac;}
	
	public double getHitChance(){return hitChance;}
	
	public double getOrigHitChance(){return origHitChan;}
	
}
