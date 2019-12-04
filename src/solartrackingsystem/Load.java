/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrackingsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author flori
 */
public class Load {
    private String loadName;
    private int quantity;
    private double supplyCurrent;
    private double supplyPower;
    private double supplyVoltage;
    private int hourUsePerDay;
    private static List<Load> listOfLoads=new ArrayList<>();

    public String getLoadName() {
        return loadName;
    }

    public void setLoadName(String loadName) {
        this.loadName = loadName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSupplyCurrent() {
        return supplyCurrent;
    }

    public void setSupplyCurrent(double supplyCurrent) {
        this.supplyCurrent = supplyCurrent;
    }

    public double getSupplyPower() {
        return supplyPower;
    }

    public void setSupplyPower(double supplyPower) {
        this.supplyPower = supplyPower;
    }

    public double getSupplyVoltage() {
        return supplyVoltage;
    }

    public void setSupplyVoltage(double supplyVoltage) {
        this.supplyVoltage = supplyVoltage;
    }

    public int getHourUsePerDay() {
        return hourUsePerDay;
    }

    public void setHourUsePerDay(int hourUsePerDay) {
        this.hourUsePerDay = hourUsePerDay;
    }

    public static List<Load> getListOfLoads() {
        return Collections.unmodifiableList(listOfLoads);
    }

    public  void addLoad(Load load){
        listOfLoads.add(load);
    }

    public Load(String loadName, int quantity, double supplyCurrent, double supplyPower, double supplyVoltage, int hourUsePerDay) {
        this.loadName = loadName;
        this.quantity = quantity;
        this.supplyCurrent = supplyCurrent;
        this.supplyPower = supplyPower;
        this.supplyVoltage = supplyVoltage;
        this.hourUsePerDay = hourUsePerDay;
    }
    
    public Load(){
        
    }
    
    public void removeLoad(Load load){
        listOfLoads.remove(load);
    }
    
    public double totalPowerPerLoad(Load load){
        return supplyPower*quantity;
    }
    
    public double totalEnergyPerLoad(Load load){
        return totalPowerPerLoad(load)*hourUsePerDay;
    }
    
    public  double computeSytemPower(){
        double systemPower=0.0;
        systemPower = listOfLoads.stream().map((load) -> totalPowerPerLoad(load)).reduce(systemPower,
                (accumulator, _item) -> accumulator + _item);
        return systemPower;
    }
    
    public  double computeTotalEnergy(){
        double totalEnergy=0.0;
        totalEnergy = listOfLoads.stream().map((load) -> totalEnergyPerLoad(load)).reduce(totalEnergy,
                (accumulator, _item) -> accumulator + _item);
        return totalEnergy;
    }
    
}
