/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack;
import java.util.EmptyStackException;

/**
 *
 * @author Nadhif Nizar
 */
public class ArrayStack {
     private Employee[] stack;
    private int top;

    public ArrayStack (int capacity){
        stack = new Employee[capacity];
    }
    public void push (Employee employee){
        if(top == stack.length){
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }
    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public int size(){
        return top;
    }
    public void printStack(){
        for(int i = top-1; i>= 0; i--){
            System.out.println(stack[i]);
        }
    }
}
