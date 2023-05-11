//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.driver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
          Product p= new Product();
          p.product(1,2);
          p.product(1,2,3);
          p.product(1.0,2.0);
    }

    public static  class Product{

        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y,int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
}
