/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern.state;

import statepattern.object.GumballMachine;

/**
 *
 * @author DUY THINH
 */
public class WinnerState implements State{
        // Trạng thái chiến thắng được nhận 2 kẹo, khi quay tay quay có 10% trở thành winner

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Không thể thêm xu");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Không thể trả xu");
    }

    @Override
    public void turnCrank() {
        System.out.println("Không thể quay tay ");
    }

    @Override
    public void dispense() {
        System.out.println("Bạn là người chiến thắng");
        System.out.println("Bạn được nhận 2 kẹo");
        gumballMachine.countDownTwice();
    }
}
