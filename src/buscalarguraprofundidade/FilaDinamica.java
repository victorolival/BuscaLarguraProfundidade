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
public class FilaDinamica {
    No inicio = null;
    No fim = null;
    
    
    public boolean Vazia(){
        if (inicio == fim)
            return true && inicio == null && fim == null;
        else
            return false;
    } 
    
    public void Push(int valor){
        No novo = new No(valor);
        
        if(Vazia()){
            inicio = novo;
            fim = novo;
            fim.noprox = inicio;
        }
        else{
            novo.noprox = inicio;
            fim.noprox = novo;
            fim = novo;
        }
    }
    
    public int Pop(){
        int aux;
        
        if(Vazia())
            return aux=0;
        else{
            aux = inicio.valor;
            fim = inicio;
            inicio = inicio.noprox;
            fim.noprox = inicio;
        }
        return aux;
    }
    
    public int Peek(){
        return inicio.valor;
        
    } 
    
    
    
}
