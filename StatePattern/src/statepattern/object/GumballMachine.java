/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern.object;

import statepattern.state.HasQuaterState;
import statepattern.state.NoQuaterState;
import statepattern.state.SoldOutState;
import statepattern.state.SoldState;
import statepattern.state.State;

/**
 *
 * @author Administrator
 */
public class GumballMachine {

    State soldState;
    State soldOutState;
    State noQuaterState;
    State hasQuaterState;

    State state = soldOutState; // Mặc định khi lấy máy ra sẽ không có 
    // kẹo, cho kẹo bằng cách gọi máy và gán số kẹo vào

    private int count = 0; // Đếm số kẹo còn lại

    public GumballMachine(int count) {
        this.count = count;
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuaterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        if (count > 0) {
            state = noQuaterState;
        }
    }

    /* Khi tách các State riêng thành các class độc lập, khi chuyển đổi trạng thái 
   thay vì phụ thuộc vào nhau thì chỉ cần ủy thác cho state hiện tại quyết định */
    public void insertQuater() { // method cho thêm xu
        state.insertQuater();
    }

    public void ejectQuater() { // method trả lại xu
        state.ejectQuater();
    }

    public void turnCrank() { // method quay tay quay
        state.turnCrank();
        state.dispense();
    }

    public void countDown() { // hàm trừ đi kẹo đã lấy
        count = count - 1;
        if (count == 0) {
            state = soldOutState;
        } else {
            state = noQuaterState;
        }
    }

    // các method get set các state 
    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public void setNoQuaterState(State noQuaterState) {
        this.noQuaterState = noQuaterState;
    }

    public State getHasQuaterState() {
        return hasQuaterState;
    }

    public void setHasQuaterState(State hasQuaterState) {
        this.hasQuaterState = hasQuaterState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
