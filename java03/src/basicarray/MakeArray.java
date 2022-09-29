package basicarray;

public class MakeArray {
    public static void main(String[] args) {

    int num[] = new int[3];

    num[0] = 100;
    num[1] = 200;
    num[2] = 300;
    
    for(int i=0; i < num.length; i++) {
	System.out.println(i + ": " + num[i]);
    }
    
    for(int x: num) {
	System.out.println(x);
    }

    int[] s= { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println("s에 저장된 주소 >> " + s);
    System.out.println(s[0]);
    System.out.println(s[3]);
    System.out.println(s[6]);
    System.out.println(s.length);

    int[] s2 = new int[5];
    s2[0] = 100;
    s2[1] = 200;
    s2[2] = 300;

    s2[s2.length - 1] = 500;
    System.out.println("s2에 저장된 주소 >> " + s2);

    }
}
