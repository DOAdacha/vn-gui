import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;
public class water extends attribute{
	private Set<attribute> weakness = new TreeSet<attribute>();
	private Set<attribute> strength = new TreeSet<attribute>();
	public water(){
		//only workaround for now, optimally uses weakness and strength
		super("Water", null, null);
		
		//creates attributes that its weak and strong against
		earth weakE = new earth();
		fire strongF = new fire();
		
		//adds the elements to the sets
		weakness.add(weakE);
		strength.add(strongF);
		
		//makes use of mutators for strengths and weaknesses
		setWeakness(weakness);
		setStrength(strength);
	}
}
