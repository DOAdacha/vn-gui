import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;
public class armor {
	//description will tell background story about the item and tell ammount of dmg reduction
	private String name, description;
	
	//dmg reduced by armor will be reduced by 1dmg per dmgReduction
	private int dmgReduction;
	
	public armor(String nm, String desc, int dmgR){
		name = nm;
		description = desc;
		dmgReduction = dmgR;
	}
	
	//accessors
	public String getName(){return name;}
	public String getDescription(){return description;}
	public int getDmgReduction(){return dmgReduction;}
	
	//mutators
	//may be used as an evolve system (most likely to be scrapped)
	public void setName(String nm){name = nm;}
	public void setDescription(String desc){description = desc;}
	public void setDmgReduction(int dmgR){dmgReduction = dmgR;}

}
