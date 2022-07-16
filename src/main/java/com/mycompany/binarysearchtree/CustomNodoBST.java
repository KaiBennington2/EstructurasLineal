/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtree;

/**
 *
 * @author Stevan Atehortúa
 */
public class CustomNodoBST<T> {
    
    private Integer key;
    private T data;
    private CustomNodoBST<T> prev;
    private CustomNodoBST<T> next;
    private CustomNodoBST<T> parent;

    public CustomNodoBST(Integer key) {
        this.key = key;
        this.parent = null;
        this.prev = null;
        this.next = null;
    }

    public Integer getKey() {
        return key;
    }

    public CustomNodoBST<T> getPrev() {
        return prev;
    }

    public CustomNodoBST<T> getNext() {
        return next;
    }

    public CustomNodoBST<T> getParent() {
        return parent;
    }

    public void setPrev(CustomNodoBST<T> prev) {
        this.prev = prev;
    }

    public void setNext(CustomNodoBST<T> next) {
        this.next = next;
    }

    public void setParent(CustomNodoBST<T> parent) {
        this.parent = parent;
    }
    
    
    
}
