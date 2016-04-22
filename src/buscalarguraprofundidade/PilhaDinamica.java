package buscalarguraprofundidade;

public class PilhaDinamica {
    
    private Node topo;
    
    public PilhaDinamica () {
        topo = null;
        
    }
    
    public void push (int valor) {
        Node n = new Node ();
        n.setValor(valor);
        n.setProximo(topo);
        topo = n;        
    }
    
    public boolean isEmpty () {
        if (topo == null)
            return true;
        return false;
    }
    
    
    public int peek () {
        return topo.getValor();  
    }
    
    public int pop () {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return 0;
        }
        Node aux = topo;
        topo = topo.getProximo();
        return aux.getValor();        
    }
}
