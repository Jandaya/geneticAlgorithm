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
public class stockData  {
    private double col1;
    private double col2;
    private double col3;
    public stockData(){
        
    }
    public stockData(double c1, double c2, double c3){
        col1 = c1;
        col2 = c2;
        col3 = c3;
    }
    
    public void setCol1(double c1){
        col1 = c1;
    }
    public void setCol2(double c2){
        col2 = c2;
    }
    public void setCol3(double c3){
        col3 = c3;
    }
    
    public double getCol1(){
        return col1;
    }
    public double getCol2(){
        return col2;
    }
    public double getCol3(){
        return col3;
    }
    
    
}
