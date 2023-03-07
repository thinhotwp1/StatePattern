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
public class SoldOutState implements State {
    // Trạng thái hết kẹo 

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() { // Sau khi cho thêm kẹo thì trở lại trạng thái k có xu
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuaterState());
            gumballMachine.insertQuater();
        } else {
            System.out.println("Hết kẹo rồi không thể cho thêm xu !");
        }
    }

    @Override
    public void ejectQuater() {
        System.out.println("Hết kẹo rồi không thể cho thêm xu và trả lại xu !");
    }

    @Override
    public void turnCrank() {
        System.out.println("Hết kẹo rồi không thể quay tay quay !");
    }

    @Override
    public void dispense() {
        System.out.println("Hết kẹo rồi không thể cho ra kẹo !");
    }

}
