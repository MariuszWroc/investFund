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
public class FillData {
    private final static BigDecimal[] minValuesArray;
    private final static BigDecimal[] maxValuesArray;
    private final static String[] descriptionArray;
    
    static {
        minValuesArray = new BigDecimal[5];
        minValuesArray[0] = BigDecimal.valueOf(-0.05d);
        minValuesArray[1] = BigDecimal.valueOf(-0.15d);
        minValuesArray[2] = BigDecimal.valueOf(-0.65d);
        minValuesArray[3] = BigDecimal.valueOf(-0.80d);
        minValuesArray[4] = BigDecimal.valueOf(-1.00d);
    }
    
    static {
        maxValuesArray = new BigDecimal[5];
        maxValuesArray[0] = BigDecimal.valueOf(0.40d);
        maxValuesArray[1] = BigDecimal.valueOf(0.60d);
        maxValuesArray[2] = BigDecimal.valueOf(0.85d);
        maxValuesArray[3] = BigDecimal.valueOf(0.96d);
        maxValuesArray[4] = BigDecimal.valueOf(1.10d);
    }
    
    static {
        descriptionArray = new String[]{"1","2","3","4","5"};
    }
    
    public void populate(List<InvestmentFundsTypeVO> list, int size) {
        for(int i=0; i<size; i++) {
            InvestmentFundsTypeVO fundsTypeVO = new InvestmentFundsTypeVO(i, descriptionArray[i], BigDecimal.valueOf(100.00d), minValuesArray[i], maxValuesArray[i]);
            list.add(fundsTypeVO);
        }
    }
    
    
    
}
