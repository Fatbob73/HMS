package com.hms;

public class HMS {

    public static void main(String[] args) {
        HealthInsurancePlan insurancePlan = new PlatinumPlan();
        Patient patient = new Patient();
        patient.setInsurancePlan(insurancePlan);

        double staffPremium = insurancePlan.computeMonthlyPremium(100000, 58, false);

        System.out.println("Staff Premium: " + staffPremium);

//        double amount = 1000.0;
//        double[] payments = Billing.computePaymentAmount(patient, amount);
    }

}
