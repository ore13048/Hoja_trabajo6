/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja.de.trabajo.pkg6;

/**
 *
 * @author Samuel Urias
 */
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;

public class Principal {
    //Que tipo de arreglo se quiere utilizar
    public int opcion1;
    
    //Conjunto de los diferentes tipos de desarrolladores
    public Set setDesarrolladoresJava, setDesarrolladoresWeb,
            setDesarrolladoresMoviles;
    
    
    public Principal()
    {
        //Se crea un factory para utilziar el patron de diseño factory
        FactorySet factory = new FactorySet();
        boolean bandera = false; //Hace posible los ciclos infinitos
        ArrayList<Desarrollador> interseccion = new ArrayList<>();
        
        opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1.HashSet  2.TreeSet  3.LinkedHashSet"));
        switch (opcion1) {
            case 1:
            case 2:
            case 3:
            {
                setDesarrolladoresJava = factory.getSet(opcion1);
                setDesarrolladoresWeb = factory.getSet(opcion1);
                setDesarrolladoresMoviles = factory.getSet(opcion1);
            }
            default:
            {
                //En caso de que el usuario haya ingresado algo incorectamente
                //ERROR
            }
            
            while(bandera == false)
            {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre "
                        + "del desarollador Java:/nPara dejar de ingresar "
                        + "desarrolladores ingrese 0");
                
                int clase = Integer.parseInt(JOptionPane.showInputDialog(
                        "1.Desarrollador Java  2.Desarrollador web"
                                + "  3.Desarrollador movil"));
                
                
                if (nombre.equals("0"))
                {
                    bandera = true;
                }
                else 
                {
                    switch (clase)
                    {
                        case 1:
                        {
                            setDesarrolladoresJava.add(new Desarrollador(nombre,clase));
                        }
                        case 2:
                        {
                            setDesarrolladoresWeb.add(new Desarrollador(nombre,clase));
                        }
                        case 3: 
                        {
                            setDesarrolladoresMoviles.add(new Desarrollador(nombre,clase));
                        }
                    }
            }
           
        }
    }
      
      
      
      }
    
    private boolean comparar(Desarrollador desarrollador1, Desarrollador desarrollador2)
    {
        boolean respuesta =  false;
        String nombre1 = desarrollador1.getNombre();
        String nombre2 = desarrollador2.getNombre();
        
        int clase1 = desarrollador1.getClase();
        int clase2 = desarrollador2.getClase();
        
        
        
        return respuesta;
    }
}
    

