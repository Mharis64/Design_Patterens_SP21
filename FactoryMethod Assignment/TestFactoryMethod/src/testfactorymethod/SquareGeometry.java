/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testfactorymethod;

/**
 *
 * @author MUHAMMAD
 */
public class SquareGeometry extends Geometery{

	@Override
	public Shape createShape() {
		return new Square();
	}

}