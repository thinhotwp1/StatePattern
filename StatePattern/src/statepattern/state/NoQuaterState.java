/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern.state;

import statepattern.object.GumballMachine;

/**
 *
 * @author Administrator
 */
public class NoQuaterState implements State{
    
    GumballMachine gumballMachine;
    

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Bạn đã cho xu vào !");
        gumballMachine.setState(gumballMachine.getHasQuaterState());
    }

    @Override
    public void ejectQuater() {
        System.out.println("Chưa cho xu vào !");
    }

    @Override
    public void turnCrank() {
        System.out.println("Phải cho xu vào trước khi quay tay quay !");
    }

    @Override
    public void dispense() {
        System.out.println("Phải cho xu và quay tay quay trước !");
    }
    
}