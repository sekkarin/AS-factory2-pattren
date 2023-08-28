package factorymedthod2;

import main.java.factorymedthod2.GetPlanFactory;
import main.java.factorymedthod2.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GetPlanFactory planFactory = new GetPlanFactory();
        Plan p = planFactory.getPlan("DomesticPlan");
        p.calculateBill(500);
    }
}