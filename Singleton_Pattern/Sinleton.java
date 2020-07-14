import org.graalvm.compiler.core.common.type.ArithmeticOpTable.IntegerConvertOp.SignExtend;

public class Sinleton {
    // shared instance which will be one and only one
    public static Sigleton instance;

    // making constructor private
    private Sinleton(){}
    
    //i am using double check because i liked it there are a lot of ways by the way acc to req
    public static Sinleton getInstanceWithDoubleCheck(){
        if(instance == null){
            synchronized (Singleton.class) {
                // see double check for if it got stuck in multithreading above :p
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}