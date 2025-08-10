public class Primee_number {
    public static void main(String[] args) {
        int num=4;
        int temp=0;
        for(int i=1;i<=num;i++) {
            if(num%i==0) {
                temp++;
            }
        }
        if(temp==2) {
            System.out.println("num is prime");
        } else {
            System.out.println("not prime");
        }
    }

}