package com.hms;

public class Billing {

    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        double paymentByInsurance = 0.0;

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        if (patientInsurancePlan != null) {
            paymentByInsurance = amount * patientInsurancePlan.getCoverage();
            payments[0] = paymentByInsurance;

            if (patientInsurancePlan instanceof PlatinumPlan) {
                payments[1] = amount - payments[0] - 50;
            } else if (patientInsurancePlan instanceof GoldPlan) {
                payments[1] = amount - payments[0] - 40;
            } else if (patientInsurancePlan instanceof SilverPlan) {
                payments[1] = amount - payments[0] - 30;
            } else {
                payments[1] = amount - payments[0] - 25;
            }
        } else {
            payments[1] = amount - 20;
        }

        System.out.println("Amount: " + amount);
        System.out.println("Coverage: " + patientInsurancePlan.getCoverage());
        System.out.println("Insurance payment: " + payments[0]);
        System.out.println("Patient payments: " + payments[1]);

        return payments;
    }

}
