class Display{
    public void Display(String n){
        System.out.println("Name is "+n);
    }
    public void Sum(int x,int y){
        System.out.println("Sum is "+(x+y));
    }
}
class Method3{
    public static void main(String[] args) {
        Display d=new Display();
        d.Display("Raj");   
        d.Sum(10,20);

    }
}