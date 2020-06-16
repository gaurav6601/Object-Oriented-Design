class KiaSeltos{
    int horsepower
    int engine;
    int torque;

    protected void makeKia(){
        engine=new KiaEngine();
    }

    public void run(){
        System.out.println("Kia running");
    }


};

class Client{
    public static void main(){
        KiaSeltos mynewcar = new KiaSeltos();
        mynewcar.run();
    }
}
