/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import java.util.Comparator;

/**
 *
 * @author Joseph
 */
public class Chromosome implements Comparable{
    private double first;
    private double second;
    private double third;
    private double fourth;
    private int fifth;
    private double fitness;
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
    
    public void setNum1(double n1){
        first = n1;
    }
    public void setNum2(double n2){
        second = n2;
    }
    public void setNum3(double n3){
        third = n3;
    }
    public void setNum4(double n4){
        fourth = n4;
    }
    public void setNum5(int n5){
        fifth = n5;
    }
    public void setFitness(double f){
        fitness = f;
    }
    public double getFitness(){
        return fitness;
    }

    public int compareTo(Object o) {
            if (this.fitness == ((Chromosome) o).fitness)
                return 0;
            else if ((this.fitness) > ((Chromosome) o).fitness)
                return -1;
            else
                return 1;
    }




    
    
}
