import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;
public class fire extends attribute{
	private Set<attribute> weakness = new TreeSet<attribute>();
	private Set<attribute> strength = new TreeSet<attribute>();
	public fire(){
		super("Fire", null, null);
		
		//creates attributes that its weak and strong against
				water weakWa = new water();
				wind strongWi = new wind();
				
				//adds the elements to the sets
				weakness.add(weakWa);
				strength.add(strongWi);
				
				//makes use of mutators for strengths and weaknesses
				setWeakness(weakness);
				setStrength(strength);
	}
}
