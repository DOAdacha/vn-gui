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
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	private JPanel textPanel = new JPanel();
	
	
	public vnGUI(){
		super("vnGUI");	
		
		this.setLayout(new BorderLayout());
		
		
		JPanel holder = new JPanel();
		
		holder.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		textPanel.setLayout(new OverlayLayout(textPanel));
		textPanel.add(holder);
		
		
		//creating general buttons
		skip = new JButton("Skip");
		auto = new JButton("Auto");
		save = new JButton("Save");
		config = new JButton("Options");
		load = new JButton("Load");
		qSave = new JButton("Q Save");
		qLoad = new JButton("Q Load");
		
		//add buttons to array
		buttons.add(skip);
		buttons.add(auto);
		buttons.add(save);
		buttons.add(config);
		buttons.add(load);
		buttons.add(qSave);
		buttons.add(qLoad);
		
		//change colors of buttons
		for(JButton x: buttons){
			buttonSetup(x);
		}
		
		
		//setup of prefSize and fonts
		buttonFontDimSetup(config, 70, 30, 10);
		buttonFontDimSetup(skip, 65, 30, 12);
		buttonFontDimSetup(auto, 60, 30, 12);
		buttonFontDimSetup(save, 63, 30, 12);
		buttonFontDimSetup(load, 62, 30, 12);
		buttonFontDimSetup(qSave, 70, 30, 9);
		buttonFontDimSetup(qLoad, 70, 30, 10);
		
		//adds left to right pushing father left as it goes
		
		holder.add(auto);
		holder.add(skip);
		holder.add(save);
		holder.add(load);
		holder.add(config);
		holder.add(qSave);
		holder.add(qLoad);
		
		this.add(textPanel,BorderLayout.SOUTH);
		
		
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//only used for the general buttons at the bottom of screen
	//only sets up colors and flat borders
	public void buttonSetup(JButton x){
		//setting up colors
		x.setForeground(new Color(0,51,102));
		x.setBackground(new Color(224,224,224));
		
		//creating borders for buttons
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5,15,5,15);
		Border compound = new CompoundBorder(line, margin);
		
		x.setBorder(compound);
		
		
		Border line2 = new LineBorder(Color.BLACK);
		Border margin2 = new EmptyBorder(300,500,300,500);
		Border compound2 = new CompoundBorder(line2,margin2);
		
		//textPanel.setBorder(compound2);
	}
	
	public void buttonFontDimSetup(JButton button, int xDim, int yDim, int fSize){
		button.setPreferredSize(new Dimension(xDim,yDim));
		button.setFont(new Font("",Font.BOLD,fSize));
	}
	
	
	
	
	
	
	
	/***********************NEED TO WORK ON A REPAINT FUNC*****************************/

	public static void main(String[] args) {new vnGUI();}

	public void actionPerformed(ActionEvent arg0) {
		
	}

}
