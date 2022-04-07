package Ex1;

public class Areas {

    public Areas() {
    }
    public int Trieagle(int a,int b,int c){
       int p=(a+b+c)/2;
       return (int)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double Rectangle(int a,int b){
        return a*b;
    }
    public double Square(int a){
        return a*a;
    }
    public int Rhombus(int a,int h){
        return a*h;
    }

}
