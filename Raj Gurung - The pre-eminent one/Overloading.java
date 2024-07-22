class Calculator{
    public void calc(){
        System.out.println("Calculator");
    }
    public void calc(int x,int y){
        System.out.println("Calculator "+(x+y));
    }
    public void calc(double x, double y){
        System.out.println("Calculator "+(x+y));
        }
        }
    public class Overloading{
        public static void main(String[] args) {    
            Calculator c=new Calculator();
            c.calc(10,20);
            c.calc(10.5,20.5);
            c.calc();
            
        }
    }