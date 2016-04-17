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
             
        Grafos grafo = new Grafos(5);
        
        grafo.inseriraresta(0, 1);
        grafo.inseriraresta(0, 2);
        grafo.inseriraresta(0, 3);
        grafo.inseriraresta(0, 4);
        grafo.inseriraresta(1, 0);
        grafo.inseriraresta(1, 2);
        grafo.inseriraresta(1, 4);
        grafo.inseriraresta(2, 0);
        grafo.inseriraresta(2, 1);
        grafo.inseriraresta(2, 3);
        grafo.inseriraresta(2, 4);
        grafo.inseriraresta(3, 0);
        grafo.inseriraresta(3, 2);
        grafo.inseriraresta(3, 4);
        grafo.inseriraresta(4, 0);
        grafo.inseriraresta(4, 1);
        grafo.inseriraresta(4, 2);
        grafo.inseriraresta(4, 3);
        
        grafo.existearesta(0, 1);
        
        grafo.listararestasadj(0);
        grafo.listararestasadj(1);
        grafo.listararestasadj(2);
        grafo.listararestasadj(3);
        grafo.listararestasadj(4);
        
    }
    
}
