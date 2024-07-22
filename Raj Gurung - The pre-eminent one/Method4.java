class RED{
     int display4(int x,int y ){
        int sum = x+y;
        return sum;    
    }
}
    class Method4{
        public static void main(String[]args){
            RED obj = new RED();
            int sum = obj.display4(10,20);
            System.out.println(sum);

        }
    } 
