package main.java.factorymedthod2;

abstract class Plan {
    protected double rate = 1;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println("Hello from calculate" + units);
        System.out.println(units * this.rate);
    }
}
