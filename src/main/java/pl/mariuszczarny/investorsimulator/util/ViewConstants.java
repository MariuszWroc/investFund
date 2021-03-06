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
public enum ViewConstants {
    SELL_BUTTON("sprzedaj"), 
    BUY_BUTTON("kupuj"),
    INVESTMENT_FUND("Towarzystwo Funduszy Inwestycyjnych"),
    FRAME_TITLE("nazwa okna"),
    FUDS_TYPE("Wybierasz fundusz");
    
    private final String value;
    
    private ViewConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
