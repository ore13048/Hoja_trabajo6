/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja.de.trabajo.pkg6;

/**
 *
 * @author Henry
 */
public class Singlenton {
    
    public class Singlenton {
    
    private static Singlenton instance = null;
       protected Singlenton() {
          // Exists only to defeat instantiation.
       }
       public static Singlenton getInstance() {
          if(instance == null) {
             instance = new Singlenton();
          }
          return instance;
       }    
}
    
}
