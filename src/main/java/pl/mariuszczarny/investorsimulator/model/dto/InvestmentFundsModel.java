/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.model.dto;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

/**
 *
 * @author mczarny
 */
public class InvestmentFundsModel {
    private DefaultComboBoxModel documentComboBoxModel;
    private SpinnerNumberModel spinnerNumberModel;
    private PlainDocument documentModel;

    public DefaultComboBoxModel getDefaultComboBoxModel() {
        if (documentComboBoxModel == null) {
            documentComboBoxModel = new DefaultComboBoxModel();
        }
        return documentComboBoxModel;
    }

    public SpinnerNumberModel getSpinnerNumberModel() {
        if (spinnerNumberModel == null) {
            spinnerNumberModel = new SpinnerNumberModel();
        }
        return spinnerNumberModel;
    }

    public Document getAmountModel() {
        if (documentModel == null) {
            documentModel = new PlainDocument();
        }
        return documentModel;
    }

    public Map<String, Object> getComboBoxAsMap() {
        String fundsTypeItem = getDefaultComboBoxModel().getSelectedItem().toString();
        Map<String, Object> mappedFundsTypeItem = new HashMap<String, Object>();
        mappedFundsTypeItem.containsKey(fundsTypeItem);
        return mappedFundsTypeItem;
    }
}
