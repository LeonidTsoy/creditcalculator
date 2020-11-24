package com.schedule.creditcalculator.model;

import java.math.BigDecimal;


public class calculate {
    private String data;
    private BigDecimal result;
    private BigDecimal total;

    public calculate(BigDecimal result, BigDecimal total, String data) {
        this.result = result;
        this.total = total;
        this.data = data;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


