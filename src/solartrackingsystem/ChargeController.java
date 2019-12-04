package solartrackingsystem;


public class ChargeController {
    private double singleChargeControllerCurrent;

    public ChargeController() {
    }

    public double getChargeControllerCurrent() {
        return singleChargeControllerCurrent;
    }

    public void setChargeControllerCurrent(double chargeControllerCurrent) {
        this.singleChargeControllerCurrent = chargeControllerCurrent;
    }
    
    public double totalChargeControllerCurrent(double shortCircuitCurrent,int numberParallelPanels,double SafetyFactor){
        return shortCircuitCurrent*numberParallelPanels*SafetyFactor;
    }
    
    public int numberOfChargeControllers(double totalChargeControllerCurrent,double singleChargeControllerCurrent){
        return (int) Math.ceil(totalChargeControllerCurrent/singleChargeControllerCurrent);
    }
}
