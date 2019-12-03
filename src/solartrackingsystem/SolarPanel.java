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
    private static final double TSCH = 1.0;// give a value for this
    private double photoVDemand; // what is this
    private double totalEnergy;
    private double safetyFactor;
    private double averagePower;
    private double panelVoltage;
    private double panelCurrent;
    private double shortCircuitCurrent;
    private double solarPanelUnitPrice;
    private Inverter inverter;// I have added this so as to calculate system current

    public SolarPanel() {
    }

    public void setInverter(Inverter inverter) {
        this.inverter = inverter;
    }

    public double getPanelCurrent() {
        return panelCurrent;
    }

    public void setPanelCurrent(double panelCurrent) {
        this.panelCurrent = panelCurrent;
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

        return (int)Math.ceil(inverter.getInputVoltage() / panelCurrent);
    }

    public int computeNumberPanelsInParallel() {

        return 1;
        return (int)Math.ceil(this.computeCurentOfSystem() / panelCurrent);
    }

    public int computeTotalNumberOfPanels() {

        return this.computeNumberPanelsInParallel() * this.computeNumberPanelsInSeries();
    }

    public double computeAveragePeakPower() {

        return this.computePVDemand() / TSCH;
    }

    public double computePVDemand() {
        
        return totalEnergy/safetyFactor;
    }

    public double computeTotalSolarPanelCost() {
        return 1.0;
    }

    public double computeCurentOfSystem(){
        
        return this.computeAveragePeakPower() / inverter.getInputVoltage();
    }

}
