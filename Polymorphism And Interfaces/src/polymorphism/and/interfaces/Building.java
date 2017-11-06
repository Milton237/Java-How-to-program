/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.and.interfaces;

/**
 *
 * @author MILTON PRO
 */
public class Building implements CarbonFootprint{
    // calculate carbon footprint
    @Override
    public double getCarbonFootprint(){
        return 0.0f;
    }
}
