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
public enum GlobalValues {
    FRAME_HEIGHT(300),
    FRAME_WEIGHT(250),
    COMMISSION(2);
    
    private final int value;
    
    private GlobalValues(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
