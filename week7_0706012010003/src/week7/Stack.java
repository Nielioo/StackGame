/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.ArrayList;

/**
 *
 * @author Daniel Aprillio
 */
public class Stack {

    private int top = -1;
    private ArrayList<Integer> data = new ArrayList<>();

    public void push(int item) {
        data.add(item);
        top++;
    }

    public int pop() {
        int temp = data.remove(top);
        top--;
        return temp;
    }

    public int peek() {
        return data.get(top);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean isFull() {
        return data.size() == 4;
    }

    public int getSize() {
        return data.size();
    }

}
