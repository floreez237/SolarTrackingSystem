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
public class SolarPanel {

    private double photoVDemand;
    private double totalEnergy;
    private double safetyFactor;
    private double averagePower;
    private double panelVoltage;
    private double shortCircuitCurrent;
    private double solarPanelUnitPrice;

    public SolarPanel() {
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public double getPhotoVDemand() {
        return photoVDemand;
    }

    public void setPhotoVDemand(double photoVDemand) {
        this.photoVDemand = photoVDemand;
    }

    public double getTotalEnergy() {
        return totalEnergy;
    }

    public void setTotalEnergy(double totalEnergy) {
        this.totalEnergy = totalEnergy;
    }

    public double getSafetyFactor() {
        return safetyFactor;
    }

    public void setSafetyFactor(double safetyFactor) {
        this.safetyFactor = safetyFactor;
    }

    public double getAveragePower() {
        return averagePower;
    }

    public void setAveragePower(double averagePower) {
        this.averagePower = averagePower;
    }

    public double getPanelVoltage() {
        return panelVoltage;
    }

    public void setPanelVoltage(double panelVoltage) {
        this.panelVoltage = panelVoltage;
    }

    public double getShortCircuitCurrent() {
        return shortCircuitCurrent;
    }

    public void setShortCircuitCurrent(double shortCircuitCurrent) {
        this.shortCircuitCurrent = shortCircuitCurrent;
    }

    public double getSolarPanelUnitPrice() {
        return solarPanelUnitPrice;
    }

    public void setSolarPanelUnitPrice(double solarPanelUnitPrice) {
        this.solarPanelUnitPrice = solarPanelUnitPrice;
    }

    public int computeNumberPanelsInSeries() {

        return 1;
    }

    public int computeNumberPanelsInParallel() {

        return 1;
    }

    public int computeTotalNumberOfPanels() {

        return 1;
    }

    public double computeAveragePeakPower() {

        return 1.0;
    }

    public double computePVDemand() {

        return 1.0;
    }

    public double computeTotalSolarPanelCost() {
        return 1.0;
    }

    public double computeCurentOfSystem(){
        
        return 1.0;
    }

}
