public class Collection_Methods {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);    //  10 output
        String b=Integer.toString(a);
        System.out.println(b);    //   "10" output
        int c=Integer.parseInt(b);
        System.out.println(c);       // 10 output


        int d=10;
        int g=10;
        System.out.println(d==g);    //true output
         Integer n=128;
         Integer m=129;
         System.out.println(n==m);    //false because its compare refrence not actual data

        System.out.println(Integer.compare(n,m));      // if a==b then output 0 , a>b then 1 , if a>b but b bigger then -1
    }
}
