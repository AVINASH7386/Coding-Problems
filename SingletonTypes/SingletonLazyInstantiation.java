package SingletonTypes;

/*
 *  In this lazy instantiation object is created when its required and if there is instance created already same instance is returned
 *  Exception handling is possible
 *  Instance is not created directly
 */

public class SingletonLazyInstantiation {
    
    private static SingletonLazyInstantiation instance;
    
    private SingletonLazyInstantiation()
    {

    }

    public static SingletonLazyInstantiation getInstance()
    {
        if( instance != null )
        {
            instance = new SingletonLazyInstantiation();
        }
        return instance;
    }
}
/*
 *  This is not thread Safe
 */