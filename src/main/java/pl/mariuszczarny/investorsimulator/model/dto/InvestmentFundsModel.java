/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.model.dto;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author mczarny
 */
public class InvestmentFundsModel {
    private DefaultComboBoxModel documentComboBoxModel;
    
	public DefaultComboBoxModel getDocumentComboBoxModel() {
		if (documentComboBoxModel == null){
			documentComboBoxModel = new DefaultComboBoxModel();
		}
		return documentComboBoxModel;
	}
}
