package main.java.factorymedthod2;

public class GetPlanFactory {
    public Plan getPlan(String planType) {

        if (planType.equalsIgnoreCase("DomesticPlan")) {
            System.out.println("work" + planType);
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("CommercialPlan")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("InstitutionPlan")) {
            return new InstitutionPlan();
        } else if (planType.equalsIgnoreCase("StudenPlan")) {
            return new StudenPlan();
        }
        return null;
    }
}
