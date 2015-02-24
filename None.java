import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;

import java.io.*;
import java.util.HashMap;
public class None extends attribute{
	private Set<attribute> weakness = new TreeSet<attribute>();
	private Set<attribute> strength = new TreeSet<attribute>();
	public None(){
		//workaround making weakness and strength static elements
		super("None", null, null);
		
		//both weakness and strength are instantiated but have no elements inside
		//this triggers the isEmpty statement telling that there are no need for the dmg Factors
		setWeakness(weakness);
		setStrength(strength);
	}
}
