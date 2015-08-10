/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mczarny
 */
class SellButtonListener implements ActionListener {
    private final InvestmentFundsController controller;

    public SellButtonListener(InvestmentFundsController controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.onSellButtonAction();
    }
    
}
