import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;

public class buffs {
	private String name;
	private int lastsNoTurns;//number of turns it lasts
	private double buffFactor; // needs to be 0<buffFactor<1 or buffFactor>1
	private String buffWhat;//tells what stat type it buffs ex)critRate, dmg, etc;
	
	public buffs(String nm, int lasts, double buffFac, String buffType){
		name = nm;
		lastsNoTurns = lasts;
		buffFactor = buffFac;
		buffWhat = buffType;
	}
	
	public String getName(){return name;}
	
	public int turnsLeft(){return lastsNoTurns;}
	
	public double getBuffFactor(){return buffFactor;}
	
	//gives what kind of stat it buffs ex) critRate, critFactor, spellDamage, AADmg, etc
	public String getBuffType(){return buffWhat;}
}
