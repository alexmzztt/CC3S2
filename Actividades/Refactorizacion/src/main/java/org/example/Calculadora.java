package org.example;

public class Calculadora {
    private boolean status;

    public Calculadora() {
        this.status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int rest (int a, int b) {
        return a - b;
    }

   // public int division(int a, int b) {
  //      return a / b;
  //  }
   public int division(int a, int b) {
       if (b == 0) {
           throw new IllegalArgumentException("No se puede dividir por cero");
       } else {
           return a / b;
       }
   }

    public int multiplicacion (int a, int b) {
        return a*b;
        }

    public int elevar (int a, int b) {
        return math.pow(a,b);
    }
}
