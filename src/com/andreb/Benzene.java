/**
 * 
 */
package com.andreb;


import javax.swing.SwingUtilities;

import com.andreb.models.*;
import com.andreb.views.*;
import com.andreb.controllers.*;

/**
 * @author AndreBonner
 *
 */
public class Benzene {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Benzene is an application under licsening from the TechZenth International");
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				FrontModel model = new FrontModel();
				FrontView view = new FrontView("Benzene");
				FrontController controller = new FrontController(model,view);
				controller.control();
			}
		});
	}

}
