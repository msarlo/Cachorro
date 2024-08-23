import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Cachorro gigi = new Cachorro();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("informe o nome do dog");
        gigi.setNome(scanner.next());
        
        System.out.println("informe a idade do dog");
        gigi.setIdade(scanner.nextFloat());
        
        System.out.println("informe a raça do dog");
        gigi.setRaça(scanner.next());
        
        gigi.comer();
        gigi.dormir();
        gigi.estadoAtual();
        
        
    }
}
