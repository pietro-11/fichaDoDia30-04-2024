import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      ArrayList<String> caixaMagica = new ArrayList<>();
 
    Scanner scan = new Scanner(System.in);

    System.out.println("Adicione 4 itens a  lista de compras!");
    System.out.println("O que deseja de primeiro item, na lista?: ");
    String nome1 = scan.nextLine();
    caixaMagica.add(nome1);
    
    System.out.println("O que deseja de segundo item, na lista?: ");
    String nome2 = scan.nextLine();
    caixaMagica.add(nome2);

    System.out.println("O que deseja de terceiro item, na lista?: ");
    String nome3 = scan.nextLine();
    caixaMagica.add(nome3);

    System.out.println("O que deseja de quarto item, na lista?: ");
    String nome4 = scan.nextLine();
    caixaMagica.add(nome4);

    System.out.println("O que deseja fazer agora? 1-REMOVER ITEM / 2-EXIBIR LISTA / 3-BUSCAR ITEM");
    int resposta = scan.nextInt();
    
    if (resposta == 1) {
    	Scanner scanR = new Scanner(System.in);
    	System.out.print("Qual item deseja remover?: ");
    	String respR = scanR.nextLine();
    	caixaMagica.remove(respR);
    } else if (resposta == 2) {
    	System.out.print("Aqui está sua lista: " + caixaMagica);
    	System.out.print("\nSua lista contém: " + caixaMagica.size() + " itens.");
    } else if (resposta == 3) {
    	Scanner scanB = new Scanner(System.in);
    	System.out.print("Qual item deseja buscar?: ");
    	String respB = scanB.nextLine();
    	if (caixaMagica.contains(respB)) {
    		System.out.println(respB + " está na sua lista!");
    	} else { 
    		System.out.println(respB + " não está na sua lista!");

    	}
    }
    
    
  }

}
