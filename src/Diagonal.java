import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Qual a ordem da matriz?");
        n = sc.nextInt();
        double[][] matriz = new double[n][n];
        double soma = 0;

        System.out.println("Digite um valor real");
        for(int i =0; i < n; i++){
            for(int j=0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
                if( i == j ){
                    soma = soma + matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }
}
    

