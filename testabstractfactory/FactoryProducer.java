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
//public class FactoryProducer {
//    public static RoundedShapeFactory getAbstractFactory(boolean rounded){
//        
//        if(rounded){
//            return new RoundedShapeFactory();
//        }
//        else{
//            return new ShapeFactory();
//        }
//        
//       
//    }
//            
//}
public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundedShapeFactory();         
      }else{
         return new ShapeFactory();
      }
   }
}