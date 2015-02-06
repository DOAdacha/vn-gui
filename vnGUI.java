import java.util.*;
import java.awt.*;
import java.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.*;

import java.awt.event.*;
import java.io.*;
import java.util.HashMap;

public class vnGUI extends JFrame implements ActionListener{
	private JButton skip, auto, save, config, load, qSave, qLoad;
	
	
	public vnGUI(){
		super("vnGUI");	
		
		this.setLayout(new BorderLayout());
		
		
		JPanel holder = new JPanel();
		
		holder.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		
		
		//creating general buttons
		skip = new JButton("Skip");
		auto = new JButton("Auto");
		save = new JButton("Save");
		config = new JButton("Options");
		load = new JButton("Load");
		qSave = new JButton("Q Save");
		qLoad = new JButton("Q Load");
		
		skip.setForeground(new Color(0,51,102));
		skip.setBackground(new Color(224,224,224));
		
		//creating borders for buttons
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5,15,5,15);
		Border compound = new CompoundBorder(line, margin);
		skip.setBorder(compound);
		//config.setBorder(compound);
		config.setPreferredSize(new Dimension(60,25));
		skip.setPreferredSize(new Dimension(60,25));
		auto.setPreferredSize(new Dimension(60,25));
		save.setPreferredSize(new Dimension(60,25));
		load.setPreferredSize(new Dimension(60,25));
		qSave.setPreferredSize(new Dimension(60,25));
		qLoad.setPreferredSize(new Dimension(60,25));
		config.setFont(new Font("Calibri", Font.BOLD,8));
		
		
		
		//adds left to right pushing father left as it goes
		
		holder.add(auto);
		holder.add(skip);
		holder.add(save);
		holder.add(load);
		holder.add(config);
		holder.add(qSave);
		holder.add(qLoad);
		
		this.add(holder,BorderLayout.SOUTH);
		
		
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {new vnGUI();}

	public void actionPerformed(ActionEvent arg0) {
		
	}

}
