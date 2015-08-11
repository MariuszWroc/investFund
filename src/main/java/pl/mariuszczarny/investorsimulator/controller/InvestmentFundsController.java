/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import pl.mariuszczarny.investorsimulator.model.dto.InvestmentFundsModel;
import pl.mariuszczarny.investorsimulator.service.InvestmentFundsService;
import pl.mariuszczarny.investorsimulator.view.InvestmentFundsView;

/**
 *
 * @author mczarny
 */
public class InvestmentFundsController {
    private final static Logger fLogger = Logger.getLogger("InvestmentFundsController");
    private InvestmentFundsModel model;
    private InvestmentFundsView view;
    
    public InvestmentFundsController() {
        initListeners();
        Simulation firstSimulation = new Simulation();
    }

    private void initListeners() {
        initSellButtonListener();
        initBuyButtonListener();
    }

    private void initSellButtonListener() {
        fLogger.log(Level.INFO, "initSellButtonListener");
        getView().getSellButton().addActionListener(new SellButtonListener(this));
    }

    private void initBuyButtonListener() {
        fLogger.log(Level.INFO, "initBuyButtonListener");
        getView().getBuyButton().addActionListener(new BuyButtonListener(this));
    }

    public InvestmentFundsModel getModel() {
        if (model == null) {
            model = new InvestmentFundsModel();
	}
        return model;
    }

    public void setModel(InvestmentFundsModel model) {
        this.model = model;
    }

    public InvestmentFundsView getView() {
        if (view == null) {
            view = new InvestmentFundsView(getModel());
	}
	return view;
    }

    public void setView(InvestmentFundsView view) {
        this.view = view;
    }
    
    public void onBuyButtonAction() {
        InvestmentFundsService.add();
    }

    void onSellButtonAction() {
        InvestmentFundsService.substract();
    }
}
