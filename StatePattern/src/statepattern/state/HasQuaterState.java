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
public class HasQuaterState implements State {
    // Trạng thái có xu

    GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Đã có xu rồi đừng cho thêm xu nữa !");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Đã trả lại xu !");
    }

    @Override
    public void turnCrank() {
        System.out.println("Đang quay tay quay... ");
        int randomNumber = (int) (Math.random() * 10) + 1;
        if (randomNumber == 10 && gumballMachine.getCount()>=2) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Kẹo của bạn đây !");
    }

}
