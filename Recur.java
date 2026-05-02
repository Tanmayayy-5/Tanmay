public class Recur {
    static void recur(int a){
        if(a>5)
            return;

            a++;
         System.out.println(a);
        
        recur(a);
    }
    public static void main(String[]args) {
        
        int a=0;
        recur(a);
    }
}
