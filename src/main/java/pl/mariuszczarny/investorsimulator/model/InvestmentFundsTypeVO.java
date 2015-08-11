/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.model;

import java.math.BigDecimal;

/**
 *
 * @author mczarny
 */
public class InvestmentFundsTypeVO {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String description;
    private BigDecimal amount;
    private BigDecimal minChangeValue;
    private BigDecimal maxChangeValue;

    public InvestmentFundsTypeVO(Integer id, String description, BigDecimal amount, BigDecimal minChangeValue, BigDecimal maxChangeValue) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.minChangeValue = minChangeValue;
        this.maxChangeValue = maxChangeValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getMinChangeValue() {
        return minChangeValue;
    }

    public void setMinChangeValue(BigDecimal minChangeValue) {
        this.minChangeValue = minChangeValue;
    }

    public BigDecimal getMaxChangeValue() {
        return maxChangeValue;
    }

    public void setMaxChangeValue(BigDecimal maxChangeValue) {
        this.maxChangeValue = maxChangeValue;
    }
    
}
