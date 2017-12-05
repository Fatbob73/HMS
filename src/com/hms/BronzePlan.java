package com.hms;

public class BronzePlan extends HealthInsurancePlan {

    public BronzePlan() {
        setCoverage(0.6);
    }

    @Override
    public double computeMonthlyPremium(double salary) {
        return salary * 0.5;
    }

}