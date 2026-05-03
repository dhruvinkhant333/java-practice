package apack;

public class A {
    
    public int pubVar;
    protected int protVar;
    private int privVar;
    
    // Why do we need a constructor? To initialize the variables with specific values
    public A(int pub, int prot, int priv) {
        this.pubVar = pub;
        this.protVar = prot;
        this.privVar = priv;
    }
    
    // Why is this method needed? To access private variable outside the class through getter
    public void displayAll() {
        System.out.println("Class A - Public: " + pubVar + ", Protected: " + protVar + ", Private: " + privVar);
    }
}
