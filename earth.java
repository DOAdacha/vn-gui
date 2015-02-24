import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;
public class earth extends attribute{
	private Set<attribute> weakness = new TreeSet<attribute>();
	private Set<attribute> strength = new TreeSet<attribute>();
	public earth(){
		super("Earth", null, null);
		
		//creates attributes that its weak and strong against
				wind weakWi = new wind();
				water strongWa = new water();
				
				//adds the elements to the sets
				weakness.add(weakWi);
				strength.add(strongWa);
				
				//makes use of mutators for strengths and weaknesses
				setWeakness(weakness);
				setStrength(strength);
	}
}
