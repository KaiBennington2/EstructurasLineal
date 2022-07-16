/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasEnlazadas;

/**
 *
 * @author Stevan Atehortúa
 */
public class CustomNodo<T> {

    private T data;
    private CustomNodo<T> next;

    public CustomNodo(T data) {
        this.data = data;
        this.next = null;
    }
    
    public void setNext(CustomNodo next){
        this.next = next;
    }
    
    public CustomNodo<T> getNext(){
        return this.next;
    }
    
    public T getData(){
        return this.data;
    }
    
}
