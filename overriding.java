class a{
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class b extends a{
    void add(int a, int b){
        super.add(a,b);
        System.out.println(a*b);
    }
}

public class overriding {
    public static void main(String[] args) {
        a obj = new b();
        obj.add(5, 3); // Output: 15
    }
}
