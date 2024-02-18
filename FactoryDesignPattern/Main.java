package FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        FactoryImplClass paymentService = new FactoryImplClass();
        
        FactoryInterface obj = paymentService.getFactory("Credit Card");
        obj.display();
        FactoryInterface obj1 = paymentService.getFactory("Debit Card");
        obj1.display();
        FactoryInterface obj2 = paymentService.getFactory("UPI");
        obj2.display();
        // System.out.println(obj.display());
        
    }
}
