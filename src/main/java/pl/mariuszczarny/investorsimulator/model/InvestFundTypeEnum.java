/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.model;

/**
 *
 * @author mczarny
 */
public enum InvestFundTypeEnum { 
    ONE("ONE"), 
    TWO("TWO"), 
    THREE("THREE");

    private final String value;

    InvestFundTypeEnum(String value){
        this.value = value; 
}
    
    public String getValue() {
        return value;
    }

}
