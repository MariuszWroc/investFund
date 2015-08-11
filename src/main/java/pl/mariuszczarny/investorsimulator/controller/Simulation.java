/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.controller;

import java.math.BigDecimal;
import java.util.List;
import pl.mariuszczarny.investorsimulator.model.InvestmentFundsTypeVO;

/**
 *
 * @author mariusz
 */
public class Simulation {
    private InvestmentFundsTypeVO fundsTypeVO;
        private final List<InvestmentFundsTypeVO> fundsList;
        
    public Simulation() {
        ManagedFunds managedFunds= new ManagedFunds();
        fundsList = managedFunds.getFundsList();
    }

    
    public void nextValues() {
//managedFunds
    }

    private void populateRandom(List<InvestmentFundsTypeVO> list) {
            for (InvestmentFundsTypeVO fund : list) {
                final BigDecimal amount = fund.getAmount().add(
                        randomize(fund.getMinChangeValue(), fund.getMaxChangeValue()));
                fund.setAmount(amount);
            }
        
    }
    
    private static BigDecimal randomize(BigDecimal minVal, BigDecimal maxVal) {
        double min = minVal.doubleValue();
        double max = maxVal.doubleValue();
        return new BigDecimal((Math.random() * (max - min)) + min);
    }

    public InvestmentFundsTypeVO getFundsTypeVO() {
        return fundsTypeVO;
    }

    public void setFundsTypeVO(InvestmentFundsTypeVO fundsTypeVO) {
        this.fundsTypeVO = fundsTypeVO;
    }
}
