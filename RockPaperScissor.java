import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor{
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo de pedra, papel e tesoura");
        System.out.println("Escolha uma opção:\n");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt() - 1;
        System.out.println(escolha);

        Random random = new Random();
        int escolhaMaquina = random.nextInt(3);

        if(escolha == 0){
            if(escolhaMaquina == 0){
                System.out.println("Você escolheu pedra e seu oponente escolheu pedra");
                System.out.println("Foi um empate");
            }else if(escolhaMaquina == 1){
                System.out.println("Você escolheu pedra e seu oponente escolheu papel");
                System.out.println("Você perdeu");
            }else{
                System.out.println("Você escolheu pedra e seu oponente escolheu tesoura");
                System.out.println("Você venceu");
            }
        }
        if(escolha == 1){
            if(escolhaMaquina == 0){
                System.out.println("Você escolheu papel e seu oponente escolheu pedra");
                System.out.println("VOcê venceu");
            }else if(escolhaMaquina == 1){
                System.out.println("Você escolheu papel e seu oponente escolheu papel");
                System.out.println("Foi um empate");
            }else{
                System.out.println("Você escolheu papel e seu oponente escolheu tesoura");
                System.out.println("Você perdeu");
            }
        }
        if(escolha == 2){
            if(escolhaMaquina == 0){
                System.out.println("Você escolheu tesoura e seu oponente escolheu pedra");
                System.out.println("Você perdeu");
            }else if(escolhaMaquina == 1){
                System.out.println("Você escolheu tesoura e seu oponente escolheu papel");
                System.out.println("Você venceu");
            }else{
                System.out.println("Você escolheu tesoura e seu oponente escolheu tesoura");
                System.out.println("Foi um empate");
            }
        }


    }
}