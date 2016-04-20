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
    private Fila fila = new Fila();
    private Lista[] verticesprocessados; 
    private Lista[] verticesvisitados; 

    

    Grafos(int vertices){
        this.vertices = vertices;
        this.l = new Lista[vertices];
        for(int i=0; i<l.length;i++){
            l[i] = new Lista();
        }
        this.verticesprocessados = new Lista[1];
        for(int j=0; j<verticesprocessados.length;j++){
            verticesprocessados[j] = new Lista();
        }
        this.verticesvisitados = new Lista[1];
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
        
        fila.push(verticeinicial);
        while(!fila.isEmpty()){
            int verticevisitado = fila.peek();
            fila.pop();
            verticesvisitados[0].inserir(verticevisitado);
            
            for (int i = 0; i < l[verticevisitado].tamanho(); i++) {
                if(!verticesvisitados[0].consta(l[verticevisitado].get(i)) && !verticesprocessados[0].consta(l[verticevisitado].get(i))){
                    fila.push(l[verticevisitado].get(i));
                    verticesprocessados[0].inserir(l[verticevisitado].get(i));
                }
            }
        }
        System.out.print("Árvore geradora: ");
        for(int i=0; i<verticesvisitados[0].tamanho();i++)
            System.out.print(verticesvisitados[0].get(i)+",");
        System.out.println("");
        
        
        
        
    }
    

    
    
    
    
}