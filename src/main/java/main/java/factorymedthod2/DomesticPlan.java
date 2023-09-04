package main.java.factorymedthod2;

public class DomesticPlan extends Plan {
    
    @Override
    void getRate() {
        this.rate = 3.50;
        System.out.println(this.rate + " sada");

    }
}
