/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author sp21-bse-019
 */
public class Connection {
  
	private static Connection instance;
	public Connection(){
		
	}
	public static Connection getInstance(){
		if(instance == null){
			instance = new Connection();
		}
		return instance;
	}
	public void getData(){
	//	System.out.println("This is the data retrieved from the DB");
	}

}

