/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtree;

/**
 *
 * @author Stevan Atehortúa
 */
public class CustomBinarySearchTree<T> {

    private CustomNodoBST<T> root;

    public void addItem(Integer key) {

        if (this.root == null) {
            this.root = new CustomNodoBST<T>(key);
            return;
        }

        CustomNodoBST<T> currentNode = this.root;
        CustomNodoBST<T> newNode = new CustomNodoBST<T>(key);

        while (currentNode != null) {
            if (key < currentNode.getKey()) {
                if (currentNode.getPrev() == null) {
                    currentNode.setPrev(newNode);
                    newNode.setParent(currentNode);
                    break;
                } else {
                    currentNode = currentNode.getPrev();
                }
            } else {
                if (currentNode.getNext() == null) {
                    currentNode.setNext(newNode);
                    newNode.setParent(currentNode);
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }

        }
    }

    public CustomNodoBST<T> getItemByKey(Integer key) {
        CustomNodoBST<T> currentNode = this.root;
        System.out.println("by key : "+currentNode.getKey());

        while (currentNode != null) {
            if (key == currentNode.getKey()) {
                return currentNode;
            }
            if (key < currentNode.getKey()) {
                currentNode = currentNode.getPrev();
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return null;
    }

    public CustomNodoBST<T> findInOrderSuccessor(CustomNodoBST<T> inputNode) {  
        if (getItemByKey(inputNode.getKey()) == null) {
            return null;
        }
        CustomNodoBST<T> successorNode = null;
        Integer searchKey = inputNode.getKey();
        while (successorNode == null) {            
            ++searchKey;
            System.out.println("llave : "+searchKey);
            CustomNodoBST<T> news = getItemByKey(searchKey);
            if (news != null) {
                successorNode = news;
               break;
            }
        }
        
        return successorNode;
    }
}
