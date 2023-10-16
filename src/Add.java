public class Add {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(Add.add(54,87));
        System.out.println(Add.add(65,98,31));
    }

}
