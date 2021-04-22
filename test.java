import java.math.BigDecimal;
import java.util.Scanner;
/**
 * @author YR
 * @create 2020-12-17 16:59
 */
public class test {
    public static double a_b(double a,double b){
        BigDecimal _a= new BigDecimal(String.valueOf(a));
        BigDecimal _b= new BigDecimal(String.valueOf(b));
    return (Double.parseDouble((_a.subtract(_b)).toString()));
    }
    public static char findTheDifference(String s, String t) {
        char ans = t.charAt(s.length());
        for(int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
            ans ^= t.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /*
        boolean gay=false;
        String g=new String("yes");
        System.out.println("yes or no? ans: ");
        switch(g=s.nextLine()){
            case "yes":
                System.out.println("yes");
                break;
            case"no ":
                System.out.println("no");
                break;
            default:
                System.out.println("wtf");
        }
        //boolean?opt1:opt2
        System.out.println(g.equals("yes")?"big yes":"big no");
        //<<n= *2^n
        System.out.println(2<<3);
        System.out.println(a_b(0.0002,0.0001));
        char c='a';
        System.out.println(findTheDifference("yesn","noy"));
        */
        //100.for
        /*double i[]=new double[1000];
        for (int j = 0; j < i.length; j++) {
            i[j]=1000*Math.random();
        }
        for(double k:i){
            System.out.print(k+"\t");
        }
        String ss[]=new String[20];
    tool.String(ss);*/
        int[]l=new int[10];
    int i;
    int j;
    int k;
        for(k=0;k<=6;k++) {
            for (j = 1; j <=10; j++) {
                for (i = 0; i < 100; i++) {

                }
                System.out.println(k+""+j);
            }
        }
    }

}
