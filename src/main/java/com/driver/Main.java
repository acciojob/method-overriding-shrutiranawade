package com.driver;

public class Main {
    public static class A{
        public  String meth(){
            System.out.println("Invoking method from class A");
            return "Invoking method from class A";
                    }
    }
  public static class B extends A {
        public String meth(){
            System.out.println("Method is overridden in Extendend class B");
            return "Method is overridden in Extendend class B";
      }
  }
  public static void main(String[]args){
        A b1 = new A();
        b1.meth();
        B b2 = new B();
        b2.meth();
  }
}
