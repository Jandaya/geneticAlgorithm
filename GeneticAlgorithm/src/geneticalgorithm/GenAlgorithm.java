/*
    Joseph Andaya
    Project 1
    COMP 151: Artificial Intelligence
 */
package geneticalgorithm;
//import org.apache.commons.math.distribution.NormalDistribution;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenAlgorithm extends javax.swing.JFrame {

    final int MEAN = 0;
    final double STD_DEV = 1.15;
    private double gen;
    private int genNum;
    private List<Chromosome> chromosomeList = new ArrayList<Chromosome>();
    private List<stockData> stockDataList = new ArrayList<stockData>();
    private Chromosome c = new Chromosome();
    private stockData s = new stockData();
    private File selectedFile;
    private String sFile;
    private JFileChooser fc = new JFileChooser();
    private double sumData = 0.00;

    public GenAlgorithm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        numField1 = new javax.swing.JTextField();
        numField2 = new javax.swing.JTextField();
        numField3 = new javax.swing.JTextField();
        numField4 = new javax.swing.JTextField();
        numField5 = new javax.swing.JTextField();
        makeChromosomeButton = new javax.swing.JButton();
        selectFileButton = new javax.swing.JButton();
        numChromosomesButton = new javax.swing.JButton();
        numChromosomesField = new javax.swing.JTextField();
        multipleChromosomesError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        makeChromosomeButton.setText("Make Chromosome");
        makeChromosomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeChromosomeButtonActionPerformed(evt);
            }
        });

        selectFileButton.setText("Select File");
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });

        numChromosomesButton.setText("Mult Chromosomes");
        numChromosomesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numChromosomesButtonActionPerformed(evt);
            }
        });

        multipleChromosomesError.setForeground(new java.awt.Color(255, 0, 0));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setFocusable(false);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(selectFileButton)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(multipleChromosomesError)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numField5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numChromosomesField)))
                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numChromosomesButton)
                    .addComponent(makeChromosomeButton)
                    .addComponent(generateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(selectFileButton)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeChromosomeButton))
                .addGap(23, 23, 23)
                .addComponent(multipleChromosomesError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numChromosomesButton)
                    .addComponent(numChromosomesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateButton)
                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        String txt;
        /*
        gen = generateRandom();
        gen = Math.round(gen*100.0)/100.0;
        txt = Double.toString(gen);
        */
        
        genNum = generateRandomBin();
        txt= Integer.toString(genNum);
        resultField.setText(txt);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void makeChromosomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeChromosomeButtonActionPerformed
        // TODO add your handling code here:
        Chromosome c1 = generateChromosome();
        String txt1, txt2, txt3, txt4, txt5;
        double num1, num2, num3, num4;
        int num5;
        num1 = c1.getNum1();
        num2 = c1.getNum2();
        num3 = c1.getNum3();
        num4 = c1.getNum4();
        num5 = c1.getNum5();
        
        txt1 = Double.toString(num1);
        txt2 = Double.toString(num2);
        txt3 = Double.toString(num3);
        txt4 = Double.toString(num4);
        txt5 = Integer.toString(num5);
        
        numField1.setText(txt1);
        numField2.setText(txt2);
        numField3.setText(txt3);
        numField4.setText(txt4);
        numField5.setText(txt5);
        
    }//GEN-LAST:event_makeChromosomeButtonActionPerformed

    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        // TODO add your handling code here:
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                readFile2(selectedFile);
            } catch (IOException ex) {
                Logger.getLogger(GenAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void numChromosomesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numChromosomesButtonActionPerformed
        // TODO add your handling code here:
        if (!(numChromosomesField.getText().isEmpty())){
            int numChrom1 = Integer.parseInt(numChromosomesField.getText());
            makeMultipleChromosomes(numChrom1);
            printChromosomes();
        }
        else
            multipleChromosomesError.setText("Field is empty.");
        
        //chromosomeList.clear();
    }//GEN-LAST:event_numChromosomesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenAlgorithm().setVisible(true);
            }
        });
    }
    
    public void printChromosomes(){
        
        Iterator iter = chromosomeList.iterator(); 
        int i = 0;
        while(iter.hasNext()){
            System.out.println("col1: " + chromosomeList.get(i).getNum1()+"col2: " + chromosomeList.get(i).getNum2() + "col3: " + chromosomeList.get(i).getNum3()+
            "col4: " + chromosomeList.get(i).getNum4() + "col5: " + chromosomeList.get(i).getNum5());
            textArea.append("col1: " + chromosomeList.get(i).getNum1()+"col2: " + chromosomeList.get(i).getNum2() + "col3: " + chromosomeList.get(i).getNum3()+
            "col4: " + chromosomeList.get(i).getNum4() + "col5: " + chromosomeList.get(i).getNum5() + "\n");
            iter.next();
            i++;
        }
    }
    
    public void readFile2(File selected)throws IOException{
        Scanner scan = new Scanner(selectedFile);
        stockData sTemp = new stockData();
        int count1 = 0;
        double indata = 0.0;
        while(scan.hasNext()){
            if(count1 == 0){
                sTemp.setCol1(scan.nextDouble());
            }
            else if(count1 == 1){
                sTemp.setCol2(scan.nextDouble());
            }
            else if (count1 == 2){
                sTemp.setCol3(scan.nextDouble());
            }
            
            count1++;
            if(count1 > 2){
                count1 = 0;
                stockDataList.add(sTemp);
                sTemp = new stockData();
            }
        }
        //printStockData2();
        compareData();
    }
    
    public void printStockData2(){
        Iterator iter = stockDataList.iterator();
        int i = 0;
        
        while(iter.hasNext()){
            System.out.println("Data1: " + stockDataList.get(i).getCol1() + "Data2: " + stockDataList.get(i).getCol2() + "Data3: " + stockDataList.get(i).getCol3()  );
            iter.next();
            i++;
        }
    }
    
    public void compareData(){
        Iterator stockIter = stockDataList.iterator();
        Iterator chromIter = chromosomeList.iterator();
        int i = 0, j = 0, countStock = 0, countChrom = 0, check = 0;
        double currentStockData = 0.0;
        double tempData = 0.0;
        double sum = 0.0;
        
        
        while(chromIter.hasNext()){
 
            while(stockIter.hasNext()){
                
                currentStockData = stockDataList.get(j).getCol1();
                //System.out.println("Comparing... " + currentStockData + " & " + chromosomeList.get(i).getNum1());
                if (countStock == 0){
                    if ((currentStockData > chromosomeList.get(i).getNum1())&& (currentStockData < chromosomeList.get(i).getNum2())){
                        check++;
                        //System.out.println("Pass0");
                        
                    }
                }
                else if (countStock == 1){
                    if ((stockDataList.get(j).getCol2() > chromosomeList.get(i).getNum3())&& (stockDataList.get(j).getCol2() < chromosomeList.get(i).getNum4())){
                        check++;
                        //System.out.println("Pass1");
                        
                    }
                }
                else if (countStock == 2){
                    if (chromosomeList.get(i).getNum5() == 0){
                        tempData = stockDataList.get(j).getCol3();
                        tempData = tempData * -1.0;
                    }
                    if (check == 2){
                        //System.out.println("Passed Both!!!");
                        sum = tempData + sum;
                    }
                }
                stockIter.next();
                countStock++;
                if(countStock > 2){
                    countStock = 0;
                    check = 0;
                }
                j++;
            }
            j = 0;
            stockIter = stockDataList.iterator(); // reset iterator
            chromIter.next();
            System.out.println("Fitness of Chromosome " + i + " = " + sum);
            chromosomeList.get(i).setFitness(sum);
            i++;
            
            
        }
        System.out.println("Done! ");
        
    }
    
    public boolean compare(double stock, double chrom){
        if (stock > chrom){
            return true;
        }
        return false;
    }
    
    public void readFile(File selected)throws IOException{
        Scanner scan = new Scanner(selectedFile);
        int count1 = 0;
        int check = 0;
        double currentData = 0.0;
        while(scan.hasNext()){
            //System.out.print(scan.next());
            if(count1 == 0){
                //s.setCol1(scan.nextDouble());
                currentData = scan.nextDouble();
                System.out.println("count 0: " +currentData);
                if ((currentData > c.getNum1())&& (currentData < c.getNum2()))
                {
                    check++;
                    System.out.println("Pass0");
                }
            }
            else if (count1 == 1){
                //s.setCol2(scan.nextDouble());
                currentData = scan.nextDouble();
                                System.out.println("count 1: " + currentData);
                if ((currentData > c.getNum3())&& (currentData < c.getNum4()))
                {
                    check++;
                    System.out.println("Pass1");
                }
            }
            else if (count1 == 2){
                currentData = scan.nextDouble();
                                System.out.println("count 2: " +currentData);
                if (c.getNum5() == 0)
                    currentData = currentData * -1.0;
                if (check == 2){
                    sumData = currentData + sumData;
                }
                /*
                s.setCol3(scan.nextDouble());
                stockDataList.add(s);
                count1 = 0;
                s = new stockData();
                */
            }
            
            count1++;
            if(count1 > 2){
                check  = 0;
                count1 = 0;
            }
            /*
            if( count1 > 2){
                System.out.println();
                count1 = 0;
                s = new stockData();
            }*/
        }
        System.out.println(sumData);
        sumData = 0.0;

    }
    
    public void printStockData(){
        Iterator it =  stockDataList.iterator(); 
        int count2 = 0;
        stockData a = new stockData();
        while(it.hasNext()){
            /*System.out.println(stockDataList.get(count2).getCol1());
            System.out.println(stockDataList.get(count2).getCol2());
            System.out.println(stockDataList.get(count2).getCol3());
            */
            it.next();
            System.out.println(it.next());
            count2++;
        }
        
    }
    
    public void makeMultipleChromosomes(int numChromosomes){
        Chromosome cTemp;
        
        int i = 0;
        while (i < numChromosomes){
            cTemp = new Chromosome();
            cTemp = generateChromosome();
            chromosomeList.add(cTemp);
            i++;
        }
    }
    
    public int generateRandomBin(){
        Random r = new Random();
        return r.nextInt(1 - 0 + 1);
    }
    
    public Chromosome generateChromosome(){
        double num1, num2, num3, num4;
        int num5;
        num1 = Math.round(generateRandom()*100.0)/100.0;
        
        num2 = Math.round(generateRandom()*100.0)/100.0;
        num3 = Math.round(generateRandom()*100.0)/100.0;
        num4 = Math.round(generateRandom()*100.0)/100.0;
        num5 = generateRandomBin();
        
        while(num1 > num2)
        {
            num1 = Math.round(generateRandom()*100.0)/100.0;
            num2 = Math.round(generateRandom()*100.0)/100.0;
        }
        
        while (num3 > num4)
        {
            num3 = Math.round(generateRandom()*100.0)/100.0;
            num4 = Math.round(generateRandom()*100.0)/100.0;
        }
        
        c = new Chromosome(num1, num2, num3, num4, num5);
        return c;
    }
    
    public double generateRandom(){
        double num = 0.0;
        
        Random a = new Random();
        num = a.nextGaussian() * STD_DEV;
        
        return num;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeChromosomeButton;
    private javax.swing.JLabel multipleChromosomesError;
    private javax.swing.JButton numChromosomesButton;
    private javax.swing.JTextField numChromosomesField;
    private javax.swing.JTextField numField1;
    private javax.swing.JTextField numField2;
    private javax.swing.JTextField numField3;
    private javax.swing.JTextField numField4;
    private javax.swing.JTextField numField5;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton selectFileButton;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
