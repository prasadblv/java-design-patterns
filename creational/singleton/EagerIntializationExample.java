package creational.singleton;

/**
 *  Example of Eager Intiaialization.
 */
public class EagerIntializationExample {

    private static final EagerIntializationExample instance = new EagerIntializationExample();

    //Private Constructor
    private EagerIntializationExample(){
        //No Code
    }

    public static EagerIntializationExample getInstance(){
        return instance;
    }

    public static void main(String ...s ){
        EagerIntializationExample instance1 = EagerIntializationExample.getInstance();
        System.out.println("Instance Id 1 : " + instance1.hashCode());
        EagerIntializationExample instance2 = EagerIntializationExample.getInstance();
        System.out.println("Instance Id 2 : " + instance2.hashCode());

        if (instance1 == instance2){
            System.out.println("EagerIntializationExample is a singleton");
        } else{
            System.out.println("EagerIntializationExample is not a singleton");
        }
    }
}
