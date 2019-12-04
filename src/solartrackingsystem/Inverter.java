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
    private SolarPanel solarPanel;
    
    public Inverter() {
    }

    public Inverter(double inputVoltage) {
        this.inputVoltage = inputVoltage;
    }
    
    public double getInputVoltage() {
        return inputVoltage;
    }

    public void setInputVoltage(double inputVoltage) {
        this.inputVoltage = inputVoltage;
    }
    
    public double computeInverterPower(){
        return load.computeSytemPower() / solarPanel.getSafetyFactor();
    }

    public void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    public void setLoad(Load load) {
        this.load = load;
    }
    
  
}
