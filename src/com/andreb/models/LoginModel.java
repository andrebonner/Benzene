/**
 * 
 */
package com.andreb.models;

/**
 * @author AndreBonner
 *
 */
public class LoginModel {
	private String username;
	private String password;
	
	public LoginModel(){
		this.username = "";
		this.password = "";
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setUsername(String u){
		username = u;
	}
	
	public void setPassword(String p){
		password = p;
	}
}
