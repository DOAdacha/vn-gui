import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;
public class weapon {
	private String name, description, attribute;
	private int damage;
	//need a image holder here
	
	public weapon(String nm, String desc, int dmg, String att){
		name = nm;
		description = desc;
		damage = dmg;
		attribute = att;
	}
	
	//accessors
	public String getName(){return name;}
	
	public String getDesc(){return description;}
	
	public int getDamage(){return damage;}
	
	public String getAttribute(){return attribute;}
	
	//mutators (most likely never to be used outside of dev purposes)
	//(may be editted/deleted later)
	//maybe changed into an evolution system???
	public void setName(String nm){name = nm;}
	
	public void setDesc(String desc){description = desc;}
	
	public void setDamage(int dmg){damage = dmg;}
	
	public void setAttribute(String att){attribute = att;}
	
	
}
