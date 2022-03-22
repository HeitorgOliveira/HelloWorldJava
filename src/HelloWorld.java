import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Tudo maiúsculo? (S/N) ");
        String decisao = input.nextLine();
        System.out.println("------------------------------");
        if (decisao.compareTo("s") == 0)
            System.out.println("Olá, " + maiuscula(nome));
        else
            System.out.println("Olá, " + nome);
        System.out.println("------------------------------");
    }
    public static String maiuscula(String s)
    {
        return (s.toUpperCase());
    }
}
