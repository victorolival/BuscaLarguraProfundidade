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
        Grafos grafo2 = new Grafos(5);
        
        System.out.println("Grafo 1");
        
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
        
        grafo.imprimilistaadj(0);
        grafo.imprimilistaadj(1);
        grafo.imprimilistaadj(2);
        grafo.imprimilistaadj(3);
        grafo.imprimilistaadj(4);
                
        grafo.buscalargura(grafo, 1);
        
        System.out.println("===========================================================================");
        
        System.out.println("Grafo 2");
        
        grafo2.inseriraresta(0, 2);
        grafo2.inseriraresta(0, 3);
        grafo2.inseriraresta(1, 0);
        grafo2.inseriraresta(1, 2);
        grafo2.inseriraresta(2, 3);
        grafo2.inseriraresta(4, 0);
        grafo2.inseriraresta(4, 1);
        grafo2.inseriraresta(4, 2);
        grafo2.inseriraresta(4, 3);
        
        grafo2.imprimilistaadj(0);
        grafo2.imprimilistaadj(1);
        grafo2.imprimilistaadj(2);
        grafo2.imprimilistaadj(3);
        grafo2.imprimilistaadj(4);
        
        grafo2.buscalargura(grafo2, 1);
        
    }
    
}
