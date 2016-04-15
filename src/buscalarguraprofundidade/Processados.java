/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalarguraprofundidade;

/**
 *
 * @author symbol
 */
public class Processados {
    private static final int tamanhoFila = 1000;
    
    private int verticesprocessados[];
    
    private int total;
    
    public Processados () {
        verticesprocessados = new int[tamanhoFila];
        total = 0;
    }
    
    public void push (int valor) {
        if ( isFull ()) {
            System.out.println("fila cheia");
            return;
        }            
        int indice = total;
        total +=1;
        verticesprocessados[indice]= valor;
    }
    
    public boolean isEmpty () {
        if (total == 0)
            return true;
        return false;
    }
    
    public boolean isFull () {
        if ( (total) >= tamanhoFila) {
            return true;
        }
        return false;
    }
    
    public int peek () {
        return verticesprocessados[0];  
    }
    
    public int pop () {
        if (isEmpty()) {
            System.out.println("fila vazia");
            return 0;
        }
        int valor = verticesprocessados[0];
        for (int i=0; i< (total-1); i+=1)
            verticesprocessados[i]=verticesprocessados[i+1];
        total-=1;
        return valor;
    }
    
}
