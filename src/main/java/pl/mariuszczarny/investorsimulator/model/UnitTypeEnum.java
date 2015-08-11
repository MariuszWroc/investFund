/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.model;

/**
 *
 * @author mariusz
 */
public enum UnitTypeEnum { 
    UNITA(2, 0),
    UNITB(0, 2);

    private final Integer buyValue;
    private final Integer sellValue;

    UnitTypeEnum(Integer buyValue, Integer sellValue){
        this.buyValue = buyValue;
        this.sellValue = sellValue; 
}

    public Integer getBuyValue() {
        return buyValue;
    }

    public Integer getSellValue() {
        return sellValue;
    }

}
