
package com.mycompany.arbolbinario;


public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario(int valor) {
        raiz = new Nodo(valor);
    }

    // Recorrido en inorden (izq - raíz - der)
    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    // Recorrido en preorden (raíz - izq - der)
    public void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    // Recorrido en postorden (izq - der - raíz)
    public void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}
