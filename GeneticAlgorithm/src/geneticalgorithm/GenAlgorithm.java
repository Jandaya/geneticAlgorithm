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

        selectFileButton = new javax.swing.JButton();
        numChromosomesButton = new javax.swing.JButton();
        numChromosomesField = new javax.swing.JTextField();
        multipleChromosomesError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        multipleChromosomesLabel = new javax.swing.JLabel();
        mutationField = new javax.swing.JTextField();
        mutationButton = new javax.swing.JButton();
        percentLabel = new javax.swing.JLabel();
        probabilityLabel = new javax.swing.JLabel();
        nextGenField = new javax.swing.JTextField();
        nextGenButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sortButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        elitistRadioButton = new javax.swing.JRadioButton();
        tournamentRadioButton = new javax.swing.JRadioButton();
        clearWindowButton = new javax.swing.JButton();
        kPointRadioButton = new javax.swing.JRadioButton();
        uniformRadioButton = new javax.swing.JRadioButton();
        crossoverButton = new javax.swing.JButton();
        crossoverTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        printChild = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        populationSize = new javax.swing.JTextField();
        populationSizeLabel = new javax.swing.JLabel();
        percentagePopulationField = new javax.swing.JTextField();
        percentageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectFileButton.setText("Select File / Calculate fitness");
        selectFileButton.setEnabled(false);
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });

        numChromosomesButton.setText("Create");
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

        multipleChromosomesLabel.setText("Enter number of Chromosomes:");

        mutationField.setText("0");

        mutationButton.setText("Mutate");
        mutationButton.setEnabled(false);
        mutationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutationButtonActionPerformed(evt);
            }
        });

        percentLabel.setText("%");

        probabilityLabel.setText("Probability of mutation(default = 0): ");

        nextGenButton.setText("Next Generation");
        nextGenButton.setEnabled(false);
        nextGenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextGenButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Number of Chromosomes to next generation:");

        sortButton.setText("sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
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

        crossoverButton.setText("Crossover");
        crossoverButton.setEnabled(false);
        crossoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossoverButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("number of children to create");

        printChild.setText("Print Child");
        printChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printChildActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.setEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorLabel.setText("Error");

        populationSizeLabel.setText("Population Size: ");

        percentageLabel.setText("Percentage formed using selection: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(771, Short.MAX_VALUE)
                .addComponent(clearWindowButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(printChild)
                        .addGap(73, 73, 73)
                        .addComponent(printButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(errorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(probabilityLabel)
                                    .addGap(40, 40, 40))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(multipleChromosomesLabel)
                            .addComponent(multipleChromosomesError, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(populationSizeLabel)
                            .addComponent(percentageLabel))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(sortButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(submitButton)
                            .addComponent(mutationField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextGenField)
                            .addComponent(crossoverTextField)
                            .addComponent(numChromosomesField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(populationSize)
                            .addComponent(percentagePopulationField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(percentLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mutationButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(crossoverButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(numChromosomesButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(nextGenButton)))))
                .addGap(35, 35, 35)
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
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectFileButton)
                    .addComponent(sortButton)
                    .addComponent(printButton)
                    .addComponent(printChild))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populationSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(populationSizeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentagePopulationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numChromosomesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multipleChromosomesLabel)
                    .addComponent(numChromosomesButton)
                    .addComponent(errorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mutationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mutationButton)
                            .addComponent(percentLabel)
                            .addComponent(probabilityLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextGenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(nextGenButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crossoverButton)
                            .addComponent(crossoverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(elitistRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tournamentRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kPointRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uniformRadioButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton)
                    .addComponent(multipleChromosomesError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(clearWindowButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                readFile2(selectedFile);
                nextGenButton.setEnabled(true);
                mutationButton.setEnabled(true);
                submitButton.setEnabled(true);
                crossoverButton.setEnabled(true);
            } catch (IOException ex) {
                Logger.getLogger(GenAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void numChromosomesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numChromosomesButtonActionPerformed
        if (!(numChromosomesField.getText().isEmpty())){
            int numChrom1 = Integer.parseInt(numChromosomesField.getText());
            makeMultipleChromosomes(numChrom1);
            printChromosomes();
            selectFileButton.setEnabled(true);
        }
        else
            multipleChromosomesError.setText("Field is empty.");
        
        //chromosomeList.clear();
    }//GEN-LAST:event_numChromosomesButtonActionPerformed

    private void nextGenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextGenButtonActionPerformed
        int numClone = Integer.parseInt(nextGenField.getText());
        if(elitistRadioButton.isSelected())
            elitistNextGen(numClone);
        else
            tournamentNextGen(numClone);
        displayChromosomes(chromosomeNextGen);
    }//GEN-LAST:event_nextGenButtonActionPerformed

    private void mutationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutationButtonActionPerformed
        double probability = Double.parseDouble(mutationField.getText()) * .01;
        System.out.println(probability);
        mutateChromosomes(chromosomeList, probability);
    }//GEN-LAST:event_mutationButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        printChromosomes();
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

    private void printChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printChildActionPerformed
        // TODO add your handling code here:
        Chromosome a = new Chromosome();
        a = uniformCreation(chromosomeList);
        printChromosome(a);
    }//GEN-LAST:event_printChildActionPerformed

    private void crossoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossoverButtonActionPerformed
        // TODO add your handling code here:
        int i = 0;
        Chromosome b = new Chromosome();
        int num = Integer.parseInt(crossoverTextField.getText());
        while(i < num){
            b = uniformCreation(chromosomeList);
            childList.add(b);
            //printChromosome(b);
            b = new Chromosome();
            i++;
        }
        displayChromosomes(childList);
    }//GEN-LAST:event_crossoverButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        sortChromosomes();
        //printChromosomes();
    }//GEN-LAST:event_sortButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        double initChrom = 0.0;
        
        
        if (numChromosomesField.getText().isEmpty() || Integer.parseInt(numChromosomesField.getText()) < 0)
            errorLabel.setText("Error fields out of bound");
        else if (crossoverTextField.getText().isEmpty() || Integer.parseInt(crossoverTextField.getText()) < 0)
            errorLabel.setText("Error fields out of bound");
        else if (nextGenField.getText().isEmpty() || Integer.parseInt(nextGenField.getText()) < 0)
            errorLabel.setText("Error fields out of bound");
        else if (mutationField.getText().isEmpty() || Integer.parseInt(mutationField.getText()) < 0)
            errorLabel.setText("Error fields out of bound");

        else{
            errorLabel.setText(null);

            int numChrom1 = Integer.parseInt(populationSize.getText());
            double prob = (Double.parseDouble(percentagePopulationField.getText()) * .01);
            initChrom = (double)numChrom1 * prob;
            
            System.out.println("initchrom: " + initChrom);
            
            makeMultipleChromosomes(numChrom1);
            
        
        //int numClone = Integer.parseInt(nextGenField.getText());
            int numClone = (int)initChrom;
        if(elitistRadioButton.isSelected())
            elitistNextGen(numClone);
        else
            tournamentNextGen(numClone);
        //displayChromosomes(chromosomeNextGen);
        
        
        int i = 0;
        Chromosome b = new Chromosome();
        int num = Integer.parseInt(crossoverTextField.getText());
        while(i < num){
            b = uniformCreation(chromosomeList);
            chromosomeNextGen.add(b);
            //printChromosome(b);
            b = new Chromosome();
            i++;
        }
        //displayChromosomes(childList);              
        
        double probability = Double.parseDouble(mutationField.getText()) * .01;
        System.out.println(probability);
        mutateChromosomes(chromosomeNextGen, probability);
        
        
        displayChromosomes(chromosomeNextGen);
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
    public void sortChromosomes(){
        textArea.append("\nSorting chromosomes...");

        Collections.sort(chromosomeList);
        
        textArea.append ( "done!\n" );
        printChromosomes();


    }
    
    public void displayChromosomes(List<Chromosome> c1){
        Iterator iter = c1.iterator(); 
        int i = 0;
        

        while(iter.hasNext()){
            System.out.println("col1: " + c1.get(i).getNum1()+"col2: " + c1.get(i).getNum2() + "col3: " + c1.get(i).getNum3()+
            "col4: " + c1.get(i).getNum4() + "col5: " + c1.get(i).getNum5());
            textArea.append("Chromosome " + (i+1) + ": " + c1.get(i).getNum1()+" | " + c1.get(i).getNum2() + " | " + c1.get(i).getNum3()+
            " | " + c1.get(i).getNum4() + " | " + c1.get(i).getNum5() + "   fitness =  " + c1.get(i).getFitness() + "\n");
            iter.next();
            i++;
        }
    }
    
    public void printChromosomes(){
        Iterator iter = chromosomeList.iterator(); 
        int i = 0;
        

        while(iter.hasNext()){
            System.out.println("col1: " + chromosomeList.get(i).getNum1()+"col2: " + chromosomeList.get(i).getNum2() + "col3: " + chromosomeList.get(i).getNum3()+
            "col4: " + chromosomeList.get(i).getNum4() + "col5: " + chromosomeList.get(i).getNum5());
            textArea.append("Chromosome " + (i+1) + ": " + chromosomeList.get(i).getNum1()+" | " + chromosomeList.get(i).getNum2() + " | " + chromosomeList.get(i).getNum3()+
            " | " + chromosomeList.get(i).getNum4() + " | " + chromosomeList.get(i).getNum5() + "   fitness =  " + chromosomeList.get(i).getFitness() + "\n");
            iter.next();
            i++;
        }
    }
    
    public void printChromosomes2(){
        
        Iterator iter = chromosomeNextGen.iterator(); 
        int i = 0;
        while(iter.hasNext()){
            System.out.println("col1: " + chromosomeNextGen.get(i).getNum1()+"col2: " + chromosomeNextGen.get(i).getNum2() + "col3: " + chromosomeNextGen.get(i).getNum3()+
            "col4: " + chromosomeNextGen.get(i).getNum4() + "col5: " + chromosomeNextGen.get(i).getNum5());
            textArea.append("Chromosome " + (i+1) + ": " + chromosomeNextGen.get(i).getNum1()+" | " + chromosomeNextGen.get(i).getNum2() + " | " + chromosomeNextGen.get(i).getNum3()+
            " | " + chromosomeNextGen.get(i).getNum4() + " | " + chromosomeNextGen.get(i).getNum5() + "\n");
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
        boolean match = false;
        
        
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
                        match = true;
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
            sum = Math.round(sum*100.0)/100.0;
            chromIter.next();
            
            if(match != true){
                sum = -5000;
                                        //System.out.println("in match");

            }
            System.out.println("Fitness of Chromosome " + (i+1) + " = " + sum);
            textArea.append("Fitness of Chromosome " + (i+1) + " = " + sum + "\n");
            chromosomeList.get(i).setFitness(sum);
            sum = 0;
            match = false;
            tempData = 0;
            i++;
            
            
        }
        sortChromosomes();
        
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
            it.next();
            System.out.println(it.next());
            count2++;
        }
        
    }
    
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
    
    public int generateRandomBin(){
        Random r = new Random();
        return r.nextInt(1 - 0 + 1);
    }
    public int randomNum(int max, int min){
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
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
    
    public void elitistNextGen(int numToClone){
        chromosomeNextGen.clear();
        int numChromosomes = countNumberChromosomes();
        int i = 0;
        if (numToClone > numChromosomes)
            numToClone = numChromosomes;
        
        while (i < numToClone){
            chromosomeNextGen.add(chromosomeList.get(i));
            i++;
        }
        i = 0;
    }
    
    public void tournamentNextGen(int numToClone){
        chromosomeNextGen.clear();
        int numChromosomes = countNumberChromosomes();
        int i = 0;
        if (numToClone > numChromosomes)
            numToClone = numChromosomes;
        
        while (i < numToClone){
            chromosomeNextGen.add(tournamentSelection());
            i++;
        }
        i = 0;
    }
    
    
    public int countNumberChromosomes(){
        Iterator iter = chromosomeList.iterator();
        int count = 0;
        while(iter.hasNext()){
            count++;
            iter.next();
        }
        return count;
    }
    
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
    
    public Chromosome tournamentSelection(){
        int numChromosomes = countNumberChromosomes();
        int n1, n2;
        n1 = randomNum(numChromosomes-1, 0);
        n2 = randomNum(numChromosomes-1, 0);
        System.out.println(n1);
        System.out.println(n2);

        
        if(chromosomeList.get(n1).getFitness() > chromosomeList.get(n2).getFitness())
        {
            return chromosomeList.get(n1);
        }
        else
            return chromosomeList.get(n2);
    }
    
    public Chromosome uniformCreation(List<Chromosome> c1){
        int numChromosomes = countNumberChromosomes();
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
    
    public void printChromosome(Chromosome a){
        textArea.append("\n" + a.getNum1() + " | " + a.getNum2() + " | "  + a.getNum3() + " | " 
                + a.getNum4() + " | " + a.getNum5() + " | " + "\n");
        
    }
    
    public Chromosome swap(double num1, double num2, Chromosome cc){
        double temp;
        temp = num1;
        cc.setNum1(num2);
        cc.setNum2(temp);
        return cc;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearWindowButton;
    private javax.swing.JButton crossoverButton;
    private javax.swing.JTextField crossoverTextField;
    private javax.swing.JRadioButton elitistRadioButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kPointRadioButton;
    private javax.swing.JLabel multipleChromosomesError;
    private javax.swing.JLabel multipleChromosomesLabel;
    private javax.swing.JButton mutationButton;
    private javax.swing.JTextField mutationField;
    private javax.swing.JButton nextGenButton;
    private javax.swing.JTextField nextGenField;
    private javax.swing.JButton numChromosomesButton;
    private javax.swing.JTextField numChromosomesField;
    private javax.swing.JLabel percentLabel;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JTextField percentagePopulationField;
    private javax.swing.JTextField populationSize;
    private javax.swing.JLabel populationSizeLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton printChild;
    private javax.swing.JLabel probabilityLabel;
    private javax.swing.JButton selectFileButton;
    private javax.swing.JButton sortButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JRadioButton tournamentRadioButton;
    private javax.swing.JRadioButton uniformRadioButton;
    // End of variables declaration//GEN-END:variables
}
