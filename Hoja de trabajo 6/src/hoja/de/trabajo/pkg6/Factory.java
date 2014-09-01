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
public class Factory<E> {
    
    public InterfaceStack<E> getStack(String entry){
        if(entry.equals("HS"))
            return new Hash<E>();
        if(entry.equals(TR))
            return new Tree<E>();
        if(entry.equals("HLi"))
            return new HashLi<E>();
        else{
            return ("Porfavor ingrese de nuevo");
        }
    }
}
