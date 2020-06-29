class Rectangle{
    int length;
    int width;
    void setWidth(int width){
        this.width=width;
    }
    void setLength(int length){
        this.length=length;
    }
    int getWidth(){
        return width;
    }
    int getLength(){
        return length;
    }
}


//
class Squre extends Rectangle{
    @Override
    void setWidth(int width){
        length=width;
        this.width=width;
    }
    @Override
    void setLength(int length){
        this.length=length;
        this.length=length;
    }
}