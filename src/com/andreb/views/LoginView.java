/**
 * 
 */
package com.andreb.views;

import javax.swing.*;

/**
 * @author AndreBonner
 *
 */
public class LoginView {

	private JFrame frame;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameTextBox;
	private JPasswordField passwordTextBox;
	private JButton loginButton;
	private JPanel loginPanel;
	
	
	@SuppressWarnings("static-access")
	public LoginView(String title){
		
		frame = new JFrame(title + " Login");
		frame.setSize(300,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		initGUI();
	}
	
	private void initGUI(){
		loginPanel = new JPanel();
		frame.getContentPane().add(loginPanel);
		
		loginPanel.setLayout(null);
		
		usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(10, 10, 80, 30);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 40, 80, 30);
		
		usernameTextBox = new JTextField();
		usernameTextBox.setBounds(90, 10, 180, 30);
		
		passwordTextBox = new JPasswordField();
		passwordTextBox.setBounds(90, 40, 180, 30);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 260, 30);
		
		
		loginPanel.add(usernameLabel);
		loginPanel.add(usernameTextBox);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordTextBox);
		loginPanel.add(loginButton);
	}
	
	public JButton getLogin(){
		return loginButton;
	}
	
	public JTextField getUsernameBox(){
		return usernameTextBox;
	}
	
	public JPasswordField getPasswordBox(){
		return passwordTextBox;
	}
	
	public void frameReset(){
		usernameTextBox.setText("");
		passwordTextBox.setText("");
	}
	
}
