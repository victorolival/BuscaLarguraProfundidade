/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalarguraprofundidade;

/**
 *
 * @author victor.rolival
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafos grafo = new Grafos(6);
        int vetor [] = new int[6];
        
        grafo.esistearesta(0, 1);
        grafo.inseriraresta(0, 1);
        grafo.inseriraresta(0, 5);
        grafo.inseriraresta(5, 0);
        grafo.esistearesta(0, 5);
        vetor = grafo.listararestasadj(0);
        grafo.imprimi(vetor);
        System.out.println();
        vetor = grafo.listararestasadj(5);
        grafo.imprimi(vetor);
        
    }
    
}
