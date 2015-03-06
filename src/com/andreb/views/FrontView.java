/**
 * 
 */
package com.andreb.views;

import java.awt.BorderLayout;
import javax.swing.border.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * @author AndreBonner
 *
 */
public class FrontView {
	private JFrame frame;
	private JMenuBar menubar;
	private JMenu mnuFile;
	private JMenu mnuEdit;
	private JMenu mnuView;
	private JMenu mnuHelp;
	private JMenuItem mnuFExit;
	private JCheckBoxMenuItem mnuVStatusbar;
	private JMenuItem mnuHAbout;
	private JLabel statusbar;
	
	@SuppressWarnings("static-access")
	public FrontView(String title){
		
		frame = new JFrame(title + " Front");
		frame.setSize(800,350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		initGUI();
	}
	
	private void initGUI(){
		menubar = new JMenuBar();
		mnuFile = new JMenu("File");
		mnuFile.setMnemonic(KeyEvent.VK_F);
		mnuEdit = new JMenu("Edit");
		mnuEdit.setMnemonic(KeyEvent.VK_E);
		mnuView = new JMenu("View");
		mnuView.setMnemonic(KeyEvent.VK_V);
		mnuHelp = new JMenu("Help");
		mnuHelp.setMnemonic(KeyEvent.VK_H);
		
		mnuFExit = new JMenuItem("Exit");
		mnuFExit.setMnemonic(KeyEvent.VK_X);
		mnuFExit.setToolTipText("Exit Application");
		mnuVStatusbar = new JCheckBoxMenuItem("Show StatusBar");
		mnuVStatusbar.setMnemonic(KeyEvent.VK_S);
		mnuVStatusbar.setToolTipText("View Statusbar");
		mnuHAbout = new JMenuItem("About");
		mnuHAbout.setMnemonic(KeyEvent.VK_A);
		mnuHAbout.setToolTipText("About Application");
		
		statusbar = new JLabel(" Statusbar");
		statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        frame.add(statusbar, BorderLayout.SOUTH);
		
		mnuHelp.add(mnuHAbout);
		mnuView.add(mnuVStatusbar);
		mnuFile.add(mnuFExit);
		menubar.add(mnuFile);
		menubar.add(mnuEdit);
		menubar.add(mnuView);
		menubar.add(mnuHelp);
		frame.setJMenuBar(menubar);
		
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	public JMenuItem getExitMenu(){
		return mnuFExit;
	}
	
	public JMenuItem getAboutMenu(){
		return mnuHAbout;
	}
}
