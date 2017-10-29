/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_4_38_Class {
    private int sample;
    private long[][] populationProj;
    private long population, basePopulation;
    private double growthRate;

    public Exercise_4_38_Class(long basePopulation, double growthRate, int sample){
        setBasePopulation(basePopulation);
        setGrowthRate(growthRate);
        setSample(sample);
    }
    // SETTERS
    public void setBasePopulation(long basePopulation){
        this.basePopulation = basePopulation;
        population = basePopulation;
    }
    public void setGrowthRate(double growthRate){
        this.growthRate = growthRate;
    }
    public void setSample(int sample){
        this.sample = sample;
        populationProj = new long[sample][sample];
    }
    // GETTERS
    public int getSample(){
        return sample;
    }
    public long[][] getPopulationProjection(){
        return projectPopulation();
    }
    // populate the projection array with projected population data
    private long[][] projectPopulation(){
        for(int i=0; i<sample; i++){
            population *= (1 + growthRate);
            populationProj[0][i] = population;

            populationProj[1][i] = (i == 0) ?
                            population - basePopulation :
                            population - populationProj[0][i-1];
        }
        return populationProj;
    }
}
