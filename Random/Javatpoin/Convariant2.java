package Javatpoin;

class A1 {  
    A1 foo() {  
        return this;   
    }  
    
    void print() {  
        System.out.println("Di dalam kelas A1");  
    }  
}  
  
class A2 extends A1 {  
    @Override  
    A1 foo() {  
        return this;   
    }  
    
    @Override  
    void print() {  
        System.out.println("Di dalam kelas A2");  
    }  
}  
  
class A3 extends A2 {  
    @Override  
    A1 foo() {  
        return this;   
    }  
    
    @Override  
    void print() {  
        System.out.println("Di dalam kelas A3");  
    }  
}  
  
public class Convariant2 {  
    public static void main(String args[]) {  
        A1 a1 = new A1();  
        a1.foo().print();  
    
        A2 a2 = new A2();  
        ((A2)a2.foo()).print();  
    
        A3 a3 = new A3();  
        ((A3)a3.foo()).print();  
    }  
}
