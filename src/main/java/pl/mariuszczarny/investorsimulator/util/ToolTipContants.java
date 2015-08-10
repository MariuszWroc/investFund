/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.util;

/**
 *
 * @author mczarny
 */
public enum ToolTipContants {
    SELL_BUTTON_TIP("Sprzedaj"), 
    BUY_BUTTON_TIP("Kupuj");
    
    private final String value;
    
    private ToolTipContants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
