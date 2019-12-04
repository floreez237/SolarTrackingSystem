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
public class Battery {
    private double volatage;
    private int numberOfBackupDays;
    private double depthOfDischarge;
    private SolarPanel solarPanel;
    private double capacity;
    private Inverter inverter;

    public Battery() {
    }
    
    

    public void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    
    public double getVolatage() {
        return volatage;
    }

    public void setVolatage(double volatage) {
        this.volatage = volatage;
    }

    public int getNumberOfBackupDays() {
        return numberOfBackupDays;
    }

    public void setNumberOfBackupDays(int numberOfBackupDays) {
        this.numberOfBackupDays = numberOfBackupDays;
    }

    public double getDepthOfDischarge() {
        return depthOfDischarge;
    }

    public void setDepthOfDischarge(double depthOfDischarge) {
        this.depthOfDischarge = depthOfDischarge;
    }
    
    public double computeBatteryStorageCapacity(){
        return solarPanel.computePVDemand() * numberOfBackupDays / (depthOfDischarge * volatage);
    }
    
    public int computeNumberOfBatteriesInSeries(){
        return (int)Math.ceil(inverter.getInputVoltage() / this.volatage);
    }
    
    public int computeNumberBatteriesInParallel(){
        return (int)Math.ceil(computeTotalNumberOfBatteries() / computeNumberOfBatteriesInSeries());
    }
    public int computeTotalNumberOfBatteries(){
        
        return (int)Math.ceil(this.computeBatteryStorageCapacity() / this.capacity);
    }

    public void setInverter(Inverter inverter) {
        this.inverter = inverter;
    }
}
