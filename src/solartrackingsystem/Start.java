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
public class Start {

    public static void main(String[] args) {
        Battery battery = new Battery();
        ChargeController chargeController = new ChargeController();
        Inverter inverter = new Inverter();
        Load load = new Load();
        SolarPanel solarPanel = new SolarPanel();
        
        solarPanel.setInverter(inverter);
        battery.setSolarPanel(solarPanel);
        battery.setInverter(inverter);
        inverter.setSolarPanel(solarPanel);
        inverter.setLoad(load);
        

        
    }
}
