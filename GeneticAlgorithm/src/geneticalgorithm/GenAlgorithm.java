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
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenAlgorithm extends javax.swing.JFrame {

    final int MEAN = 0;
    final double STD_DEV = 1.15;
    
    private double gen;
    private int genNum;
    private List<Chromosome> chromosomeNextGen = new ArrayList<Chromosome>();
    private List<Chromosome> chromosomeList = new ArrayList<Chromosome>();
    private List<stockData> stockDataList = new ArrayList<stockData>();
    private List<Chromosome> childList = new ArrayList<Chromosome>();
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

        selectFileButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        mutationField = new javax.swing.JTextField();
        percentLabel = new javax.swing.JLabel();
        probabilityLabel = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        elitistRadioButton = new javax.swing.JRadioButton();
        tournamentRadioButton = new javax.swing.JRadioButton();
        clearWindowButton = new javax.swing.JButton();
        kPointRadioButton = new javax.swing.JRadioButton();
        uniformRadioButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        populationSize = new javax.swing.JTextField();
        populationSizeLabel = new javax.swing.JLabel();
        percentagePopulationField = new javax.swing.JTextField();
        percentageLabel = new javax.swing.JLabel();
        numGenerationsField = new javax.swing.JTextField();
        numGenerationsLabel = new javax.swing.JLabel();
        percentLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genetic Algorithm");

        selectFileButton.setText("Select File");
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setFocusable(false);
        jScrollPane1.setViewportView(textArea);

        mutationField.setText("0");

        percentLabel.setText("%");

        probabilityLabel.setText("Probability of mutation(default = 0): ");

        printButton.setText("Print Chromosomes");
        printButton.setEnabled(false);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        elitistRadioButton.setSelected(true);
        elitistRadioButton.setText("Elitist");
        elitistRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elitistRadioButtonActionPerformed(evt);
            }
        });

        tournamentRadioButton.setText("Tournament");
        tournamentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tournamentRadioButtonActionPerformed(evt);
            }
        });

        clearWindowButton.setText("Clear Window");
        clearWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearWindowButtonActionPerformed(evt);
            }
        });

        kPointRadioButton.setText("K-Point");
        kPointRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kPointRadioButtonActionPerformed(evt);
            }
        });

        uniformRadioButton.setSelected(true);
        uniformRadioButton.setText("Uniform");
        uniformRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniformRadioButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Run");
        submitButton.setEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorLabel.setText("Select data input file");

        populationSize.setText("10");

        populationSizeLabel.setText("Population Size: ");

        percentagePopulationField.setText("0");

        percentageLabel.setText("Percentage formed using selection: ");

        numGenerationsField.setText("1");

        numGenerationsLabel.setText("Number of generations to run");

        percentLabel1.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearWindowButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(percentageLabel)
                    .addComponent(populationSizeLabel)
                    .addComponent(probabilityLabel)
                    .addComponent(numGenerationsLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(errorLabel)
                        .addComponent(mutationField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(populationSize, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(percentagePopulationField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numGenerationsField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(printButton)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percentLabel)
                            .addComponent(percentLabel1))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(uniformRadioButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kPointRadioButton)
                                    .addGap(4, 4, 4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(elitistRadioButton)
                                    .addGap(32, 32, 32))
                                .addComponent(tournamentRadioButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorLabel)
                    .addComponent(selectFileButton))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populationSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(populationSizeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentagePopulationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentLabel1)
                    .addComponent(percentageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(elitistRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tournamentRadioButton)
                        .addGap(13, 13, 13)
                        .addComponent(kPointRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uniformRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearWindowButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mutationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentLabel)
                            .addComponent(probabilityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numGenerationsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numGenerationsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(printButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // clear the list for new file
            stockDataList.clear();
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                readFile2(selectedFile);
                submitButton.setEnabled(true);
                errorLabel.setText(null);
                
            } catch (IOException ex) {
                Logger.getLogger(GenAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        displayChromosomes(chromosomeNextGen);
    }//GEN-LAST:event_printButtonActionPerformed

    private void tournamentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tournamentRadioButtonActionPerformed
        elitistRadioButton.setSelected(false);
        tournamentRadioButton.setSelected(true);
    }//GEN-LAST:event_tournamentRadioButtonActionPerformed

    private void elitistRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elitistRadioButtonActionPerformed
        tournamentRadioButton.setSelected(false);
        elitistRadioButton.setSelected(true);

    }//GEN-LAST:event_elitistRadioButtonActionPerformed

    private void clearWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearWindowButtonActionPerformed
        // TODO add your handling code here:
        textArea.setText(null);
    }//GEN-LAST:event_clearWindowButtonActionPerformed

    private void kPointRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kPointRadioButtonActionPerformed
        uniformRadioButton.setSelected(false);
        kPointRadioButton.setSelected(true);
    }//GEN-LAST:event_kPointRadioButtonActionPerformed

    private void uniformRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniformRadioButtonActionPerformed
        uniformRadioButton.setSelected(true);
        kPointRadioButton.setSelected(false);
    }//GEN-LAST:event_uniformRadioButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        // checks each field to see if range is valid
        if (mutationField.getText().isEmpty() || Integer.parseInt(mutationField.getText()) < 0) {
            errorLabel.setText("Error: Mutation field out of bounds");
        } else if (percentagePopulationField.getText().isEmpty() || Integer.parseInt(percentagePopulationField.getText()) < 0) {
            errorLabel.setText("Error: Percentage population field out of bounds");
        } else if (populationSize.getText().isEmpty() || Integer.parseInt(populationSize.getText()) < 0) {
            errorLabel.setText("Error: Population size field out of bound");
        } else {
            runSimulation();
        }
            
    }//GEN-LAST:event_submitButtonActionPerformed

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
    
    
    // perform simulation operations
    public void runSimulation(){
        double initChrom = 0.0, average = 0.0, max = 0.0, min = 0.0, percent = 0.0, probability;
        int i = 0, numGenerations, n = 0, countGen = 0, popSize = 0;
        Chromosome maxChromosome = new Chromosome();
        errorLabel.setText(null);
        printButton.setEnabled(true);

        // gets the number of generations desired by user
        numGenerations = Integer.parseInt(numGenerationsField.getText());

        //gets user input for population size and percentage desired
        // calculates the number of chromosomes to use for cloning or crossover
        popSize = Integer.parseInt(populationSize.getText());
        percent = (Double.parseDouble(percentagePopulationField.getText()) * .01);
        initChrom = (double) popSize * percent;

        // create random chromosomes then sort them by fitness
        makeMultipleChromosomes(popSize);
        chromosomeList = sortChromosomes(chromosomeList);
        
        // number of chromosomes to clone followed by the number that will be created through crossover
        int numClone = (int) initChrom;
        int numCross = popSize - numClone;

        // runs number of selected generations
        while (n < numGenerations) {

            // determines which selection algorithm is selected    
            if (elitistRadioButton.isSelected()) {
                elitistNextGen(numClone);
            } else {
                tournamentNextGen(numClone);
            }

            Chromosome b = new Chromosome();
            // runs number to crossover
            while (i < numCross) {
                if (kPointRadioButton.isSelected()) {
                    b = kPointCreation(chromosomeList);
                } else {
                    b = uniformCreation(chromosomeList);
                }
                chromosomeNextGen.add(b);
                //printChromosome(b);
                b = new Chromosome();
                i++;
            }
            i = 0;           
            // gets probability of mutation
            probability = Double.parseDouble(mutationField.getText()) * .01;

            // mutate the chromosomes
            mutateChromosomes(chromosomeNextGen, probability);

            // compute the fitness after mutation
            computeFitness(stockDataList, chromosomeNextGen);

            // sort the chromosomes by fitness
            chromosomeNextGen = sortChromosomes(chromosomeNextGen);
            countGen++;
            n++;
            // displays average, max, and min of fitness after 10 generations
            if (countGen >= 10) {
                average = calculateAverage(chromosomeNextGen);
                average = Math.round(average * 100.0) / 100.0;
                max = findMax(chromosomeNextGen);
                min = findMin(chromosomeNextGen);
                textArea.append("\nFitness stats after 10 generations:");
                textArea.append("\nMax: " + max + "| Min: " + min + "| Average: " + average + "\n");
                countGen = 0;
            }
            chromosomeList = copyChromosomeList(chromosomeNextGen);
        }
        // displays the maximum chromosome after simulation
        maxChromosome = findMaxChromosome(chromosomeNextGen);
        displayMaxChromosome(maxChromosome);
    }
    
    // sorts chromosomes
    public List<Chromosome> sortChromosomes(List<Chromosome> cl){
        Collections.sort(cl);
        return cl;
    }
    // displays the maximum chromosome
    public void displayMaxChromosome(Chromosome c){
        textArea.append("\nMax Chromosome: " + c.getNum1() + " | "  + c.getNum2() + " | "  + c.getNum3() + 
                        " | "  + c.getNum4() + " | "  + c.getNum5() + " | Fitness = "  + c.getFitness() + "\n");
    }
    
    // returns a compy of a chromosome list
    public List<Chromosome> copyChromosomeList(List<Chromosome> l1){
        Iterator iter = l1.iterator();
        int count = 0;
        Chromosome c = new Chromosome();
        List<Chromosome> ch = new ArrayList<Chromosome>();
        while(iter.hasNext()){
            c = new Chromosome();
            c.setNum1(l1.get(count).getNum1());
            c.setNum2(l1.get(count).getNum2());
            c.setNum3(l1.get(count).getNum3());
            c.setNum4(l1.get(count).getNum4());
            c.setNum5(l1.get(count).getNum5());
            c.setFitness(l1.get(count).getFitness());
            ch.add(c);

            count++;
            iter.next();
        }
        return ch;
    }
    
    // calculates the average fitness of chromosome list
    public double calculateAverage(List<Chromosome> ls){
        int counta = 0;
        double a = 0, sum = 0.0;
        Iterator iter = ls.iterator();
        while(iter.hasNext()){
            sum = ls.get(counta).getFitness() + sum;
            iter.next();
            counta++;
        }
        a = sum / counta;
        
        
        return a;
    }
    
    // returns the maximum fitness value
    public double findMax(List<Chromosome> ls){
        int counta = 0;
        double num = ls.get(counta).getFitness();
        Iterator iter = ls.iterator();
        while(iter.hasNext()){
            if(num < ls.get(counta).getFitness()){
                num = ls.get(counta).getFitness();
            }
            iter.next();
            counta++;
        }
        
        return num;
    }
    
    // finds tha maximum chromosome based on fitness
    public Chromosome findMaxChromosome(List<Chromosome> ls){
        int counta = 0;
        double num = 0.0;
        Iterator iter = ls.iterator();
        Chromosome maxChrom = new Chromosome();
        while(iter.hasNext()){
            if(num <= ls.get(counta).getFitness()){
                num = ls.get(counta).getFitness();
                maxChrom = ls.get(counta);
            }
            iter.next();
            counta++;
        }
        
        return maxChrom;
    }
    
    // finds the lowest fitness in chromosome list
    public double findMin(List<Chromosome> ls){
        int counta = 0;
        double num = ls.get(0).getFitness();
        Iterator iter = ls.iterator();
        while(iter.hasNext()){
            if(num > ls.get(counta).getFitness()){
                num = ls.get(counta).getFitness();
            }
            iter.next();
            counta++;
        }
        
        return num;
    }
    
    // prints chromosomes to text area
    public void displayChromosomes(List<Chromosome> c1){
        Iterator iter = c1.iterator(); 
        int i = 0;
        

        while(iter.hasNext()){
            textArea.append("Chromosome " + (i+1) + ": " + c1.get(i).getNum1()+" | " + c1.get(i).getNum2() + " | " + c1.get(i).getNum3()+
            " | " + c1.get(i).getNum4() + " | " + c1.get(i).getNum5() + "   fitness =  " + c1.get(i).getFitness() + "\n");
            iter.next();
            i++;
        }
    }
    
    // reads in a fie that is selected by user
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
    }
    
    // displays the stock list data (NOT USED)
    public void printStockData2(){
        Iterator iter = stockDataList.iterator();
        int i = 0;
        
        while(iter.hasNext()){
            System.out.println("Data1: " + stockDataList.get(i).getCol1() + "Data2: " + stockDataList.get(i).getCol2() + "Data3: " + stockDataList.get(i).getCol3()  );
            iter.next();
            i++;
        }
    }
    
    // computes the fitness of chromosomes based on input file data
    public void computeFitness(List<stockData> sd, List<Chromosome> ch){
        Iterator stockIter = sd.iterator();
        Iterator chromIter = ch.iterator();
        int i = 0, j = 0, countStock = 0, countChrom = 0, check = 0;
        double currentStockData = 0.0;
        double tempData = 0.0;
        double sum = 0.0;
        boolean match = false;
        
        //iterate through chromosomes
        while(chromIter.hasNext()){
            while(stockIter.hasNext()){
                currentStockData = sd.get(j).getCol1();
                
                    if ((sd.get(j).getCol1() > ch.get(i).getNum1())&& (sd.get(j).getCol1() < ch.get(i).getNum2())){
                        check++;   
                    }
                
                    if ((sd.get(j).getCol2() > ch.get(i).getNum3())&& (sd.get(j).getCol2() < ch.get(i).getNum4())){
                        check++;      
                    }

                    if (check > 1){
                        if (ch.get(i).getNum5() == 0){
                            tempData = sd.get(j).getCol3();
                            tempData = tempData * -1.0;
                        }
                        else
                            tempData = sd.get(j).getCol3();

                        match = true;
                        sum = tempData + sum;
                        check = 0;
                    }
                stockIter.next();
                countStock++;
                if(countStock > 2){
                    countStock = 0;
                }
                j++;
            }
            j = 0;
            stockIter = sd.iterator(); // reset iterator
            sum = Math.round(sum*100.0)/100.0;
            chromIter.next();
            
            if(match != true){
                sum = -5000;

            }
            ch.get(i).setFitness(sum);
            check = 0;
            sum = 0;
            match = false;
            tempData = 0;
            i++;
            
            
        }        
        //displayChromosomes(ch);
    }    

    // compares a chromosome to a stock data
    public boolean compare(double stock, double chrom){
        if (stock > chrom){
            return true;
        }
        return false;
    }
    

    // displays stock data (NOT USED)
    public void printStockData(){
        Iterator it =  stockDataList.iterator(); 
        int count2 = 0;
        stockData a = new stockData();
        while(it.hasNext()){
            it.next();
            System.out.println(it.next());
            count2++;
        }
        
    }
    
    // creates random multiple chromosomes
    public void makeMultipleChromosomes(int numChromosomes){
        chromosomeList.clear();
        Chromosome cTemp;
        int i = 0;
        while (i < numChromosomes){
            cTemp = new Chromosome();
            cTemp = generateChromosome();
            chromosomeList.add(cTemp);
            i++;
        }
    }
    
    // generates a random 0 or 1
    public int generateRandomBin(){
        Random r = new Random();
        return r.nextInt(1 - 0 + 1);
    }
    
    // generates a random number based on maximum and minimum values
    public int randomNum(int max, int min){
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
    
    // generates a random filled chromosome
    public Chromosome generateChromosome(){
        double num1, num2, num3, num4;
        int num5;
        Chromosome c = new Chromosome();
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
    
    // generates a random number with set Standard deviation
    public double generateRandom(){
        double num = 0.0;
        
        Random a = new Random();
        num = a.nextGaussian() * STD_DEV;
        
        return num;
    }
    
    //runs elitist algorithm for selection
    public void elitistNextGen(int numToClone){
        chromosomeNextGen.clear();
        int numChromosomes = countNumberChromosomes(chromosomeList);
        int i = 0;
        if (numToClone > numChromosomes)
            numToClone = numChromosomes;
        
        while (i < numToClone){
            chromosomeNextGen.add(chromosomeList.get(i));
            i++;
        }
        i = 0;
    }
    
    // runs tournament algorithm for selection
    public void tournamentNextGen(int numToClone){
        chromosomeNextGen.clear();
        int numChromosomes = countNumberChromosomes(chromosomeList);
        int i = 0;
        if (numToClone > numChromosomes)
            numToClone = numChromosomes;
        
        while (i < numToClone){
            chromosomeNextGen.add(tournamentSelection(chromosomeList));
            i++;
        }
        i = 0;
    }
    
    // returns the count of number chromosomes in a list
    public int countNumberChromosomes(List<Chromosome> cc){
        Iterator iter = cc.iterator();
        int count = 0;
        while(iter.hasNext()){
            count++;
            iter.next();
        }
        return count;
    }
    
    //this function will run mutations on each chromosome's attributes
    // with a passed in probability
    public void mutateChromosomes(List<Chromosome> cc, double probability){
        Iterator iter = cc.iterator();
        int i = 0;
       
        while (iter.hasNext()){
            if(Math.random() <= probability)
            cc.get(i).setNum1(Math.round(generateRandom()*100.0)/100.0);
            
            if(Math.random() <= probability)
            cc.get(i).setNum2(Math.round(generateRandom()*100.0)/100.0);
            
            if(Math.random() <= probability)
            cc.get(i).setNum3(Math.round(generateRandom()*100.0)/100.0);
            
            if(Math.random() <= probability)
            cc.get(i).setNum4(Math.round(generateRandom()*100.0)/100.0);
            
            if(Math.random() <= probability)
            cc.get(i).setNum5(generateRandomBin());
            
            
            i++;
            iter.next();
        }
        
    }
    
    // this function uses tournament selection to clone the next generation chromosomes
    // based on which randomly selected two chromosomes has higher fitness
    public Chromosome tournamentSelection(List<Chromosome> cc){
        int numChromosomes = countNumberChromosomes(cc);
        int n1, n2;
        n1 = randomNum(numChromosomes-1, 0);
        n2 = randomNum(numChromosomes-1, 0);

        
        if(cc.get(n1).getFitness() > cc.get(n2).getFitness())
        {
            return cc.get(n1);
        }
        else
            return cc.get(n2);
    }
    
    
    //this function takes two random chromosomes, and crosses their attributes
    //to create a new child.
    public Chromosome kPointCreation(List<Chromosome> c1){
        int numChromosomes = countNumberChromosomes(c1);
        int n1, n2;
        double temp;
        Chromosome child = new Chromosome();
        n1 = randomNum(numChromosomes-1, 0);
        n2 = randomNum(numChromosomes-1, 0);
        
        child.setNum1(c1.get(n1).getNum1());
        child.setNum2(c1.get(n1).getNum2());
        child.setNum3(c1.get(n2).getNum3());
        child.setNum4(c1.get(n2).getNum4());
        child.setNum5(c1.get(n2).getNum5());
        
        return child;
    }
    
    // this function takes two random chromosomes
    // and randomly chooses which attributes to take from two parents
    public Chromosome uniformCreation(List<Chromosome> c1){
        int numChromosomes = countNumberChromosomes(c1);
        int n1, n2;
        double temp;
        Chromosome child = new Chromosome();
        n1 = randomNum(numChromosomes-1, 0);
        n2 = randomNum(numChromosomes-1, 0);
        
        if(Math.random() <= 0.5)
            child.setNum1(c1.get(n1).getNum1());
        else
            child.setNum1(c1.get(n2).getNum1());
        
        if(Math.random() <= 0.5)
            child.setNum2(c1.get(n1).getNum2());
        else
            child.setNum2(c1.get(n2).getNum2());
        
        if(Math.random() <= 0.5)
            child.setNum3(c1.get(n1).getNum3());
        else
            child.setNum3(c1.get(n2).getNum3());
        
        if(Math.random() <= 0.5)
            child.setNum4(c1.get(n1).getNum4());
        else
            child.setNum4(c1.get(n2).getNum4());
        
        if(Math.random() <= 0.5)
            child.setNum5(c1.get(n1).getNum5());
        else
            child.setNum5(c1.get(n2).getNum5());
        
        if(child.getNum1() > child.getNum2()){
            temp = child.getNum1();
            child.setNum1(child.getNum2());
            child.setNum2(temp);
        }
        if(child.getNum3() > child.getNum4()){
            temp = child.getNum3();
            child.setNum3(child.getNum4());
            child.setNum4(temp);
        }
        
        return child;
        
        
    }
    
    
    // prints a single chromosome
    public void printChromosome(Chromosome a){
        textArea.append("\n" + a.getNum1() + " | " + a.getNum2() + " | "  + a.getNum3() + " | " 
                + a.getNum4() + " | " + a.getNum5() + " | " + "\n");
        
    }
    
    // swaps a chromosome's attributes used for uniform selection
    public Chromosome swap(double num1, double num2, Chromosome cc){
        double temp;
        temp = num1;
        cc.setNum1(num2);
        cc.setNum2(temp);
        return cc;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearWindowButton;
    private javax.swing.JRadioButton elitistRadioButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kPointRadioButton;
    private javax.swing.JTextField mutationField;
    private javax.swing.JTextField numGenerationsField;
    private javax.swing.JLabel numGenerationsLabel;
    private javax.swing.JLabel percentLabel;
    private javax.swing.JLabel percentLabel1;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JTextField percentagePopulationField;
    private javax.swing.JTextField populationSize;
    private javax.swing.JLabel populationSizeLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel probabilityLabel;
    private javax.swing.JButton selectFileButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JRadioButton tournamentRadioButton;
    private javax.swing.JRadioButton uniformRadioButton;
    // End of variables declaration//GEN-END:variables
}
