package test;

public class TestArray {
    public static void main(String[] args) {
        int[] a={0,1,2,3,4};
        int[] b;
        b=a;
        System.out.println("a0 ="+a[0]+" b0 ="+b[0]);
        a[4]=12;
        System.out.println("a0 ="+a[4]+" b0 ="+b[4]);

    }
}
