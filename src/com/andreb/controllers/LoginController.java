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
public class LoginController {

	private LoginModel loginmodel;
	private LoginView loginview;
	private ActionListener actionlistener;
	
	public LoginController(LoginModel lm, LoginView lv){
		this.loginmodel = lm;
		this.loginview = lv;
	}
	
	public void control(){
		actionlistener = new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent){
				// login
				//System.out.println("Action performed by LoginView...");
				//JOptionPane.showMessageDialog(null, "action performed by login view...");
				doLogin();
			}
		};
		loginview.getLogin().addActionListener(actionlistener);
	}
	
	public void doLogin(){
		loginmodel.setUsername(loginview.getUsernameBox().getText());
		loginview.getPasswordBox().selectAll();
		loginmodel.setPassword(loginview.getPasswordBox().getSelectedText());
		
		
		String pwd = loginmodel.getPassword();
		
		if(pwd.equals("admin")){
			JOptionPane.showMessageDialog(null, "Login was successful " + loginmodel.getUsername());
		}else{
			JOptionPane.showMessageDialog(null, "Try again...");
			loginview.frameReset();
		}
		//System.out.println("username: " + loginmodel.getUsername());
		//System.out.println("password: " + loginmodel.getPassword());
	}
}
