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
    private double batteryVolatage;
    private int numberOfBackupDays;
    private double depthOfDischarge;
    private SolarPanel solarPanel;

    public Battery() {
    }

    public void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    
    public double getBatteryVolatage() {
        return batteryVolatage;
    }

    public void setBatteryVolatage(double batteryVolatage) {
        this.batteryVolatage = batteryVolatage;
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
        return solarPanel.computePVDemand() * numberOfBackupDays / (depthOfDischarge * batteryVolatage);
    }
    
    public int computeNumberOfBatteriesInSeries(){
        return 1;
    }
    
    public int computeNumberBatteriesInParallel(){
        return 1;
    }
    public int computeTotalNumberOfBatteries(){// you made error in UML here
        return 1;
    }
}
