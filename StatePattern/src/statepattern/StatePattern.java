/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statepattern;

import statepattern.object.GumballMachine;

/**
 *
 * @author Administrator
 */
public class StatePattern {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GumballMachine machine = new GumballMachine(10);
        machine.insertQuater(); // test các trạng thái 
        machine.turnCrank();
        machine.insertQuater();
        machine.insertQuater();
        machine.turnCrank();
        machine.turnCrank();
    }
    
}
