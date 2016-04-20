/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalarguraprofundidade;

/**
 *
 * @author Fabio
 */
public class Fila {

    
    private Node primeiro;
    
    private Node ultimo;
    
    public Fila () {
        primeiro = null;
        ultimo = null;
    }
    
    public void push (int valor) {
        Node no = new Node ();
        no.setValor(valor);
        no.setProximo(null);
        
        if (ultimo == null) {
            ultimo = no;
            primeiro = no;
        } else {
            ultimo.setProximo(no);
            ultimo = no;
        }
        
        
    }
    
    public boolean isEmpty () {
        if (primeiro == null && ultimo == null)
            return true;
        return false;
    }
    
    
    public int peek () {
        return primeiro.getValor();  
    }
    
    public int pop () {
        if (isEmpty()) {
            System.out.println("queue empty");
            return 0;
        }
        int valor = primeiro.getValor();
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getProximo();
        }
        return valor;
    }
    
}
