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
    private FilaDinamica fila = new FilaDinamica();
    private Lista[] verticesadj; 
    private Lista[] verticesvisitados; 

    

    Grafos(int vertices){
        this.vertices = vertices;
        this.l = new Lista[vertices];
        for(int i=0; i<l.length;i++){
            l[i] = new Lista();
        }
        this.verticesadj = new Lista[vertices];
        for(int j=0; j<verticesadj.length;j++){
            verticesadj[j] = new Lista();
        }
        this.verticesvisitados = new Lista[vertices];
        for(int k=0; k<verticesvisitados.length;k++){
            verticesvisitados[k] = new Lista();
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
    public Lista listararestasadj (int vertice){
        /*System.out.print("Vertice "+vertice+": ");
        for(int i=0; i<l[vertice].tamanho();i++)
            System.out.print(l[vertice].get(i)+",");
        System.out.println("");
        */
        return l[vertice];
    
        
    }
    
    public void imprimilistaadj (int vertice){
        System.out.print("Vertice "+vertice+": ");
        for(int i=0; i<l[vertice].tamanho();i++)
            System.out.print(l[vertice].get(i)+",");
        System.out.println("");
    }

    public void buscalargura (Grafos grafo, int verticeinicial){
        int verticeprocessando = verticeinicial;
        fila.Push(verticeprocessando);
        while(!fila.Vazia()){
            int verticevisitado = fila.Peek();
            fila.Pop();
            verticesvisitados[0].inserir(verticevisitado);
            
            
        }
        
        
        
        
    }
    

    
    
    
    
}