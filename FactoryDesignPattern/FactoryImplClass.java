package FactoryDesignPattern;

public class FactoryImplClass {
    
    public FactoryInterface getFactory(String payment)
    {
        if( payment == null )
        {
            return null;
        }
        if( payment == "Credit Card")
        {
            return new CreditCardImpl();
        }
        else if ( payment == "Debit Card")
        {
            return new DebitCardimpl();
        }
        else if ( payment == "UPI" )
        {
            return new UPIImpl();
        }
        else 
        {
            return null;
        }
    }
}
