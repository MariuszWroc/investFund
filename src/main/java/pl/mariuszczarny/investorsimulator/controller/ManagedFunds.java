/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.controller;

import java.util.ArrayList;
import java.util.List;
import pl.mariuszczarny.investorsimulator.model.InvestmentFundsTypeVO;

/**
 *
 * @author mariusz
 */
public class ManagedFunds {
    private List<InvestmentFundsTypeVO> fundsTypes;
    private FillData fillData = new FillData();

    public ManagedFunds() {
        fundsTypes = new ArrayList<InvestmentFundsTypeVO>();
        fillData.populate(fundsTypes, 5);
    }

    public List<InvestmentFundsTypeVO> getFundsList() {
        return fundsTypes;
    }

    public void setAccountsList(List<InvestmentFundsTypeVO> accountsList) {
        this.fundsTypes = accountsList;
    }
}
