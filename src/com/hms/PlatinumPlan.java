package com.hms;

public class PlatinumPlan extends HealthInsurancePlan {

    public PlatinumPlan() {
        setCoverage(0.9);
    }

    @Override
    public double computeMonthlyPremium(double salary) {
//        return (salary * 0.08) / 12;
        return  Math.round(((salary * 0.08) / 12) * 100D) / 100D;
    }

}