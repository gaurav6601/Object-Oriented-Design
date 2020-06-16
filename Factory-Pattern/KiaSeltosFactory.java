import java.util.ArrayList;

class KiaSeltosFactory{
    int horsepower
    int engine;
    int torque;

    protected KiaSeltos makeKia(){
        engine=new KiaEngine();
        return this;
    }

    public void run(){

        // here car does't know which variant is returning 
        KiaSeltos car = makeKia();
        System.out.println("Kia car running");
    }
}

class KiaSeltosGTX extends KiaSeltosFactory{
    @Override
    public KiaSeltos makeKia(){
        super.makeKia();
        engine = new KiaSeltosGTXEngine();
        return this;
    }
}


class KiaSeltosHTX extends KiaSeltosFactory{
    @Override
    public KiaSeltos makeKia(){
        super.makeKia();
        engine = new KiaSeltosHTXEngine();
        return this;
    }
}



public class Client{
    public static void main(String[] args) {
        ArrayList<KiaSeltos> kiacars= new ArrayList<>();
        kiacars.add(new KiaSeltosGTX());
        kiacars.add(new KiaSeltosHTX());
        for(KiaSeltos car : kiacars){
            car.run();
        }
    }
}