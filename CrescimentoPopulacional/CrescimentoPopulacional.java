package CrescimentoPopulacional;

import java.util.Scanner;

public class CrescimentoPopulacional {

    public static void main(String[]args){

        Scanner input = new Scanner (System.in);

        System.out.println("Digite a quantidade da população A: ");
        int popA = input.nextInt();

        System.out.println("Qual a porcentagem de crescimento da população A: ");
        double porcentA = input.nextDouble();


        System.out.println("Digite a quantidade da população B: ");
        int popB = input.nextInt();

        System.out.println("Qual a porcentagem de crescimento da população B: ");
        double porcentB = input.nextDouble();

        int cont = 0;


       if(porcentA > porcentB && popA < popB) {
           do {
               popA += (popA / 100) * porcentA;
               popB += (popB / 100) * porcentB;
               cont++;
           } while (popA < popB);

           System.out.println("A população A vai ser maior a população B em "+cont+" anos.");
      
        }else{
           System.out.println("Dados inválidos! A quantidade da população A deve ser menor que de B e o crescimento em porcentagem de A deve ser maior que o de B.");
       }


    }
}