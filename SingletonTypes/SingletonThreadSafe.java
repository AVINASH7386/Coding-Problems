package SingletonTypes;

/*
 *  In this implementation instance is created when its required and its thread safe, multiple threads cannot access at same time.
 */

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe()
    {

    }

    synchronized public static SingletonThreadSafe getInstance()
    {
        if( instance != null )
        {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}

/*
 *  Get Instance method is sunchronized so it causes slow performance as multiple threads cant access it simutaneously
 */
