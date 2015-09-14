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
    public class CustomComparator implements Comparator<Chromosome> {
    @Override
    public int compare(Chromosome o1, Chromosome o2) {
        //return o1.getFitness().compareTo(o2.getFitness());
        return Double.compare(o1.getFitness(), o2.getFitness());
    }
}

