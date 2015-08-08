/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.util;

/**
 *
 * @author mariusz
 */
public enum GlobalNames {
    INVESTMENT_FUND("Towarzystwo Funduszy Inwestycyjnych");
    
    private String name;
    
    private GlobalNames(String name) {
        setNames(name);
    }

    public String getNames() {
        return name;
    }

    public void setNames(String name) {
        this.name = name;
    }
}
