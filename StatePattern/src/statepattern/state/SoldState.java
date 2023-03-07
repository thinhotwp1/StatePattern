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
public class SoldState implements State{
        // Trạng thái cho ra kẹo

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Đã cho xu rồi !");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Đang chuẩn bị kẹo không thể trả lại xu !");
    }

    @Override
    public void turnCrank() {
        System.out.println("Quay tay đã quay rồi !");
    }

    @Override
    public void dispense() {
        System.out.println("Kẹo của bạn đây !");
        gumballMachine.countDown();
    }
    
}
