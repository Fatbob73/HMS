package com.hms;

public class BlueCrossBlueShield implements InsuranceBrand {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double computeMonthlyPremium(HealthInsurancePlan plan, int age, boolean smoking) {
        double premium = 0.0;

        if (age > 55 ) {
            if (plan instanceof PlatinumPlan) {
                premium += 200;
            } else if (plan instanceof GoldPlan) {
                premium += 150;
            } else if (plan instanceof SilverPlan) {
                premium += 100;
            } else if (plan instanceof BronzePlan) {
                premium += 50;
            }
        }

        if (smoking) {
            if (plan instanceof PlatinumPlan) {
                premium += 100;
            } else if (plan instanceof GoldPlan) {
                premium += 90;
            } else if (plan instanceof SilverPlan) {
                premium += 80;
            } else if (plan instanceof BronzePlan) {
                premium += 70;
            }
        }

        return premium;
    }

}