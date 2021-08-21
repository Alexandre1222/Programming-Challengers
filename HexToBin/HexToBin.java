import java.util.Scanner;

public class HexToBin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto que deseja converter: ");
       String n = sc.next();
       for(int j = 0; j < n.length()-1; j++){
           System.out.print(Integer.toHexString(n.charAt(j)) + " ");
       }
    }
}