package SingletonTypes;

/*
 *  When the Singleton class is loaded, inner class is not loaded and hence doesn't create object whe loading the class. Inner class is created only when getInstance method is called.
 *  so it may seem like eager initialization but its lazy initialization.
 */

public class SingletonBillPugh {
    
    private SingletonBillPugh()
    {

    }

    private static class BillPughSingleton
    {
        private static final SingletonBillPugh Instance = new SingletonBillPugh();
    }
    
    public static SingletonBillPugh getInstance()
    {
        return BillPughSingleton.Instance;
    }

}

/*
 *  This is the most Widely used approach as it doesn't use Synchronization.
 */