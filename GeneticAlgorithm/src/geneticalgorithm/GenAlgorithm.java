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

public class GenAlgorithm extends javax.swing.JFrame {

    final int MEAN = 0;
    final double STD_DEV = 1.15;
    private double gen;
    private int genNum;
    private List<Chromosome> chromosomeList = new ArrayList<Chromosome>();
    Chromosome c = new Chromosome();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(generateButton)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(numField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numField5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(makeChromosomeButton)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeChromosomeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateButton))
                .addGap(84, 84, 84))
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
    
    public void readFile(){
        
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
    private javax.swing.JButton makeChromosomeButton;
    private javax.swing.JTextField numField1;
    private javax.swing.JTextField numField2;
    private javax.swing.JTextField numField3;
    private javax.swing.JTextField numField4;
    private javax.swing.JTextField numField5;
    private javax.swing.JTextField resultField;
    // End of variables declaration//GEN-END:variables
}
