/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalarguraprofundidade;

/**
 *
 * @author alexandre.gcazaroes1
 * 
 */
public class Pilha {

    private static final int tamanhoPilha = 100;
    private int itens[];
    private int topo;
    
    public Pilha () {
        itens = new int[tamanhoPilha];
        topo = -1;
    }
    
    public boolean isEmpty () {
        if (topo < 0)
            return true;
        return false;
    }
    
    public void push (int valor) {
        if ( isFull() ) {
            System.out.println("pilha cheia");
            return;
        }            
        topo +=1;
        int indice = topo;
        itens[indice]= valor;
    }
    
    public int pop () {
        if (isEmpty()) {
            System.out.println("pilha vazia");
            return 0;
        }
        int indice = topo;
        topo = topo -1;
        return itens[indice];
    }
    
    public boolean isFull () {
        if ( (topo+1) >= tamanhoPilha) {
            return true;
        }
        return false;
    }
    
    public int peek () {
        return itens[topo];  
    }
    
}