/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

/**
 *
 * @author Joseph
 */
public class Chromosome {
    private double first;
    private double second;
    private double third;
    private double fourth;
    private int fifth;
    public Chromosome(double n1, double n2, double n3, double n4, int n5){
        first = n1;
        second = n2;
        third = n3;
        fourth = n4;
        fifth = n5;
    }
    public  Chromosome(){
        
    }
    public double getNum1(){
        return first;
    }
    public double getNum2(){
        return second;
    }
    public double getNum3(){
        return third;
    }
    public double getNum4(){
        return fourth;
    }
    public int getNum5(){
        return fifth;
    }
}
