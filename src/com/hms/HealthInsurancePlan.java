package com.hms;

public abstract class HealthInsurancePlan {

    private InsuranceBrand offeredBy;
    private double coverage;

    public abstract double computeMonthlyPremium(double salary);

    public InsuranceBrand getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(InsuranceBrand offeredBy) {
        this.offeredBy = offeredBy;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

}