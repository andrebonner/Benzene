/**
 * 
 */
package com.andreb.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.andreb.models.*;
import com.andreb.views.*;
/**
 * @author AndreBonner
 *
 */
public class FrontController {

	private FrontModel fmodel;
	private FrontView fview;
	private ActionListener actionlistener;
	private ActionListener actionlistener2;
	
	public FrontController(FrontModel fm, FrontView fv){
		this.fmodel = fm;
		this.fview = fv;
	}
	
	public void control(){
		this.fmodel = new FrontModel(2);
		
		actionlistener = new ActionListener(){
			public void actionPerformed(ActionEvent actionevent){
				doExit();
			}
		};
		fview.getExitMenu().addActionListener(actionlistener);
		
		actionlistener2 = new ActionListener(){
			public void actionPerformed(ActionEvent actionevent){
				doAbout();
			}
		};
		fview.getAboutMenu().addActionListener(actionlistener2);
	}

	public void doExit(){
		System.out.println("Exit with control value = " + fmodel.getFrontValue());
		System.exit(0);
	}
	
	public void doAbout(){
		System.out.println("Show about Dialog");
		JOptionPane.showMessageDialog(fview.getFrame(), "Benzene is an application under licsening from\n the TechZenth International","About Benzene", JOptionPane.INFORMATION_MESSAGE);
	}
}
