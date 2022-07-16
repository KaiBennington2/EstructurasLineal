/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasEnlazadas;

/**
 *
 * @author Stevan Atehortúa
 */
public class CustomLinkedList<T> {
    
    private CustomNodo<T> first;
    private Integer size;

    public CustomLinkedList() {
        this.first = null;
        this.size = 0;
    }
    
    public Boolean isEmpty(){
        return first == null;
    }

    public int size() {
        return size;
    }

    public void addItem(T data) {
        CustomNodo<T> newNode = new CustomNodo<>(data);
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    public void printAll() {
        CustomNodo<T> current = first;
        while (current!=null) {            
            System.out.print("["+current.getData()+"] ");
            current = current.getNext();
        }
    }
    
    
}
