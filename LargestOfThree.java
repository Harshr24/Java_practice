public class LargestOfThree {
    public static void main(String args[]){
        int a = 10, b = 30, c = 6;
        if((a>=b) && (a>=c)){
            System.out.println("largest is a  ");
        }
        else if(b >=c ){
            System.out.println("largest is b  ");
        }
        else{
            System.out.println("larhest is c ");
        }
    }
}
