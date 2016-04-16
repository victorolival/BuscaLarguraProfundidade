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
public class Grafos {
    private int vertices;
    private Lista[] l;


    Grafos(int vertices){
        this.vertices = vertices;
        this.l = new Lista[vertices];
        l[0] = new Lista();
        for(int i=0; i<l.length;i++){
            l[i] = new Lista();
        }
          
    }       
    
    
    public void inseriraresta(int origem, int destino){
        l[origem].inserir(destino);
    }
    
    public void removeraresta(int origem, int destino){
        for (int i=0; i < vetoradj[origem]
            
        }
        vetoradj [origem][destino] = 0;
    }
    public void esistearesta(int origem, int destino){
        if(vetoradj [origem] = destino == true)
            System.out.println("Não Existe");
        else
            System.out.println("Existe");
    }
    public int[] listararestasadj (int vertice){
        int vetor [] = new int [matrizadj[vertice].length];
        for(int i = 0; i < matrizadj[vertice].length; i++){
           vetor[i]= matrizadj[vertice][i];
        }
        return vetor;
            
                
    }
    
    public void imprimi(int vetor[]){
        for(int i=0; i<vetor.length; i++){
            System.out.print(vetor[i]);
        }
    }
}