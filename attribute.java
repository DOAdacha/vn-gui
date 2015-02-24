import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;

public class attribute {
	private String type;
	//stores the attributes that the attribute is weak/strong against
	private Set<attribute> weak, strong;
	//the factor in which the damage is increased/decreased
	private double weakDmg, strongDmg;
	
	public attribute(String ty, Set<attribute> wk, Set<attribute> strg){
		type = ty;
		weak = wk;
		strong = strg;
		//lowered damage and stronger damage are set at fixed amounts for each attribute
		weakDmg = .70;
		strongDmg = 1.20;
	}
	
	//accessors
	public String getType(){return type;}
	public Set<attribute> getWeakness(){return weak;}
	public Set<attribute> getStrongAgainst(){return strong;}
	public double getWeakFactor(){return weakDmg;}
	public double getStrengthFactor(){return strongDmg;}
	
	//mutators(for possible dev usage)
	public void setType(String ty){type = ty;}
	public void setWeakness(Set<attribute> wkns){weak = wkns;}
	public void setStrength(Set<attribute> strongvs){strong = strongvs;}
	public void setWeakFactor(double factor){weakDmg = factor;}
	public void setStrongFactor(double factor){strongDmg = factor;}
	
	//for damage checks
	public boolean weakAgainst(attribute weakAg){
		if(weak.isEmpty())
			return false;
		
		for(attribute x: weak)
			if(weakAg.equals(x))
				return true;
		return false;
	}
	
	public boolean strongAgainst(attribute strongAg){
		if(strong.isEmpty())
			return false;
		
		for(attribute x: strong)
			if(strongAg.equals(x))
				return true;
		return false;
	}
	
}
