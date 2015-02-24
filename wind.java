import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;
public class wind extends attribute{
	private Set<attribute> weakness = new TreeSet<attribute>();
	private Set<attribute> strength = new TreeSet<attribute>();
	public wind(){
		super("Wind", null, null);
		
		//creates attributes that its weak and strong against
				fire weakF = new fire();
				earth strongE = new earth();
				
				//adds the elements to the sets
				weakness.add(weakF);
				strength.add(strongE);
				
				//makes use of mutators for strengths and weaknesses
				setWeakness(weakness);
				setStrength(strength);
	}
}
