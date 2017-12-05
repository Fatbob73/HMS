package com.hms;

public class GoldPlan extends HealthInsurancePlan {

    public GoldPlan() {
        setCoverage(0.8);
    }

    @Override
    public double computeMonthlyPremium(double salary) {
        return salary * 0.7;
    }

}