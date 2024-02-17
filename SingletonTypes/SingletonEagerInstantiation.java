package SingletonTypes;

/*
 * the names sugguests eager or early instantiation, an object of class is created early irrespective of requirement,
 * the created instance is returned whenever required
 * simple to implement, create private instance variable, make private constructor, and static getInstance method to return instance
 */
public class SingletonEagerInstantiation {
        
    private static final SingletonEagerInstantiation instance = new SingletonEagerInstantiation();

    private SingletonEagerInstantiation(){

    }

    public static SingletonEagerInstantiation getInstance()
    {
        return instance;
    }
}

/*
 * May lead to resource wastage , because instance is creted always ireespective of requirement,
*/
