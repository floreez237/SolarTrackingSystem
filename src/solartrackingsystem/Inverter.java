/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrackingsystem;

/**
 *
 * @author flori
 */
public class Inverter {
    private double inputVoltage;
    private Load load;// You will use this to get the total Power
    public Inverter() {
    }

    public Inverter(double inputVoltage) {
        this.inputVoltage = inputVoltage;
    }

    @SuppressWarnings("empty-statement")
    public double getInputVoltage() {
        
        return inputVoltage;
    }

    public void setInputVoltage(double inputVoltage) {
        this.inputVoltage = inputVoltage;
    }
    
    public double computeInverterPower(){
        return 1.0;
    }
    
  
}
