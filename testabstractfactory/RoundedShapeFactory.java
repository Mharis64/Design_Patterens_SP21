/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testabstractfactory;

/**
 *
 * @author sp21-bse-019
 */
public class RoundedShapeFactory extends AbstractFactory{
    
     @Override
    public Shape getShape(String shapeType){
        
       
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
         return new RoundedRectangle();   
        }
         else   if(shapeType.equalsIgnoreCase("Square"))
            {
                return new RoundedSquare();
            }
        else   if(shapeType.equalsIgnoreCase("Triangle"))
            {
                return new RoundedTriangle();
            }
       
        
        
        return null;
    }
}
