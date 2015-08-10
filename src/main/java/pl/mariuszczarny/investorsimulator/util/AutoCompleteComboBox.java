/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.util;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author mczarny
 */
public class AutoCompleteComboBox<T> extends JComboBox {
    private static final long serialVersionUID = 1L;
    private DefaultComboBoxModel model;
    
    JComboBox<T> comboBox = new JComboBox<>();
    
    public void setComboBox(Object T) {
        comboBox.setModel(model);
    }
}
