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
        for(int i=0; i<l.length;i++){
            l[i] = new Lista();
        }
          
    }       
    
    
    public void inseriraresta(int origem, int destino){
        l[origem].inserir(destino);
    }
    
    public void removeraresta(int origem, int destino){
        for(int i=0; i<l[origem].tamanho();i++){
            if(l[origem].get(i) == destino)
                l[origem].remover(i);
        }
                
        
    }
    public void existearesta(int origem, int destino){
        boolean existe = false;
        for(int i=0; i< l[origem].tamanho();i++){
            if(l[origem].get(i) == destino)
                existe = true;
        }
        if(existe == true)
            System.out.println("Existe aresta entre os vertices "+origem+" e "+destino);
        else
            System.out.println("Não existe aresta entre os vertices "+origem+" e "+destino);
        
            
    }
    public void listararestasadj (int vertice){
        System.out.print("Vertice "+vertice+": ");
        for(int i=0; i<l[vertice].tamanho();i++)
            System.out.print(l[vertice].get(i)+",");
        System.out.println("");
    }

    public Lista getL(int vertice) {
        return l[vertice];
    }

    public int getVertices() {
        return vertices;
    }
    

    
    
    
    
}