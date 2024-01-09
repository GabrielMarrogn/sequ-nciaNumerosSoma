import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        

        for(;;){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int soma = 0;

            if(n > m){
                int temp  = m;
                m = n;
                n = temp;
            }

            if(n <= 0 || m <= 0){
                break;
            }

            for(int i =n; i <= m; i++){
                soma = soma + i;
                System.out.print(i +" ");
            }
            System.out.println("Sum=" +soma);
        }

        sc.close();
    }
}
