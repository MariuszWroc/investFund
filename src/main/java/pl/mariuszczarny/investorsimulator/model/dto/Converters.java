/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.model.dto;

import pl.mariuszczarny.investorsimulator.model.UnitTypeEnum;

/**
 *
 * @author mczarny
 */
public class Converters {
    private InvestmentFundsModel model;

    public Long getSpinnerAsLong() {
        return getModel().getSpinnerNumberModel().getNumber().longValue();
    }
    
    public String getDescriptionComboBoxAsString() {
        return getModel().getDefaultComboBoxModel().getSelectedItem().toString();
    }
    
    public InvestmentFundsModel getModel() {
        return model;
    }

    public void setModel(InvestmentFundsModel model) {
        this.model = model;
    }
}
