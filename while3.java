public class while3{
    public static void main(String[] args){
        int a = 1;
        int sum = 0;
        while(a<=10){
            sum = (sum + a * a);
            a++;
        }
        System.out.print(sum);
    }
}