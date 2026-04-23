
package com.mycompany.arbolbinario;

public class Main {

    public static void main(String[] args) {
         // Construcción del árbol
        ArbolBinario arbol = new ArbolBinario(10);
        arbol.raiz.izquierdo = new Nodo(5);
        arbol.raiz.derecho = new Nodo(15);
        arbol.raiz.izquierdo.izquierdo = new Nodo(3);
        arbol.raiz.izquierdo.derecho = new Nodo(7);
        arbol.raiz.derecho.izquierdo = new Nodo(12);
        arbol.raiz.derecho.derecho = new Nodo(18);

        // Recorridos
        System.out.println("Recorrido Inorden:");
        arbol.inorden(arbol.raiz);   // 3 5 7 10 12 15 18

        System.out.println("\nRecorrido Preorden:");
        arbol.preorden(arbol.raiz);  // 10 5 3 7 15 12 18

        System.out.println("\nRecorrido Postorden:");
        arbol.postorden(arbol.raiz); // 3 7 5 12 18 15 10
    }
}
