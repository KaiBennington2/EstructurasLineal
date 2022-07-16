/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructuraslineales;

import com.mycompany.binarysearchtree.CustomBinarySearchTree;
import com.mycompany.listasEnlazadas.CustomLinkedList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

/**
 *
 * @author Stevan Atehortúa
 */
public class EstructurasLineales {

    public static void main(String[] args) {

        CustomBinarySearchTree<Integer> tree = new CustomBinarySearchTree<>();
        //lista esta vacia ? True o False

        //agregar un item mas al arbol
        tree.addItem(20);
        tree.addItem(9);
        tree.addItem(25);
        tree.addItem(5);
        tree.addItem(12);
        tree.addItem(11);
        tree.addItem(14);

        System.out.println(tree.getItemByKey(12).getNext().getKey().toString());
//        System.out.println(tree.findInOrderSuccessor(tree.getItemByKey(12)));
        
    }
    
//    public static void main(String[] args) {
//
//        CustomLinkedList list = new CustomLinkedList();
//        //lista esta vacia ? True o False
//        list.isEmpty();
//        //tamaño de la lista
//        list.size();
//        //agregar un item mas a la lista
//        list.addItem(1);
//        list.addItem("mama");
//        list.addItem("como");
//        list.addItem("estas?");
//        //listar items de la lista
//        list.printAll();
//        
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
//        
//    }
}
