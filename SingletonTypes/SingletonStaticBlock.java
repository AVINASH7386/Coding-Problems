package SingletonTypes;

/*
 *  In this static block instantiation its also a eager instantiation, but only difference object is created in static block
 *  so that we can have access on ts creation like exception handling.
 */
public class SingletonStaticBlock {
    
    public static SingletonStaticBlock instance;

    private SingletonStaticBlock()
    {
    // private Constructor
    }
    
    static
    {
        instance = new SingletonStaticBlock();
    }
}
