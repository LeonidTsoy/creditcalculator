package com.schedule.creditcalculator.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculatorController {
    private BigDecimal summa;
    private BigDecimal period;
    private ArrayList<calculate> schedule = new ArrayList<calculate>();


    public CalculatorController(BigDecimal summa, BigDecimal period) {
        this.summa = summa;
        this.period = period;
    }

    public BigDecimal getSumma() {

        return summa;
    }

    public void setSumma(BigDecimal summa) {

        this.summa = summa;
    }

    public BigDecimal getPeriod() {
        return period;
    }

    public void setPeriod(BigDecimal period) {

        this.period = period;
    }

    public ArrayList CalculatorResult() {
        BigDecimal result = summa.divide(period);
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(period) < 1; i = i.add(BigDecimal.ONE)) {
            Calendar date = new GregorianCalendar();
            date.add(Calendar.DAY_OF_MONTH, +i.subtract(BigDecimal.ONE).intValueExact());
            String data = date.get(Calendar.YEAR)+"."+(date.get(Calendar.MONTH)+1)+"."+date.get(Calendar.DAY_OF_MONTH)+".";
            BigDecimal total = result.multiply(i);
            calculate m = new calculate(result, total, data);
            schedule.add(m);
        }
        return schedule;
    }
}

