package SingletonTypes;

/*
 *  Performance overhead gets reduced because of synchronized keyword
 *  first time it can affect performance
 */

public class SingletonLazyDobleCheck {
    
    private static SingletonLazyDobleCheck instance;

    private SingletonLazyDobleCheck()
    {

    }
    public static SingletonLazyDobleCheck getInstance()
    {
        if( instance == null )
        {
            synchronized (SingletonLazyDobleCheck.class)
            {
                if( instance == null )
                {
                    instance = new SingletonLazyDobleCheck();
                }
            }
        }
        return instance;
    }
}
/*
 *  Prior to java5, memory model had a lot of issues and above methods caused failure in certain scenarios in multithreaded environment.
 *  bill Pugh sugguested a concept of inner static classes to use for singleton
 */ 
