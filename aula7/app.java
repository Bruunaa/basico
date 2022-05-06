package aula7;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("-------------------Constantes atribuídas------------------");
        int dia = DiasSemana.SEGUNDA;
        System.out.println(dia);
        System.out.println("-------------------Enum atribuídas---------------------");
        DiaSemana dEnum = DiaSemana.DOMINGO;
        System.out.println(dEnum.toString() + " - " + dEnum.getValor());
        System.out.println("-------------------Classes atribuídas---------------------");
        Data dataPrincipal = new Data(1, 4, 2022, DiaSemana.SEXTA);
        System.out.println(dataPrincipal.getDiaSemana());
        System.out.println("----------------------Classes de Repetição-----------------");
        DiaSemana[] diasVetor = DiaSemana.values();

        for (int i = 0; i < diasVetor.length; i++) {
            System.out.println(diasVetor[i]);
            if (diasVetor[i].getValor() == dataPrincipal.getDiaSemana().getValor()) {
                System.out.println("Foi este dia aqui");
            } else {
                System.out.println("Não foi esse dia!");
            }
        }

        System.out.println("---------------------Classes de repetição Rápida-----------");
        for (DiaSemana diaRapido : DiaSemana.values()) {
            if (diaRapido.getValor() == dataPrincipal.getDiaSemana().getValor()) {
                System.out.println(diaRapido+", foi este dia aqui!");
            } else {
                System.out.println(diaRapido+", não foi este dia!");
            }
        }
        System.out.println("---------------------Classes Enum Separadas por valor ----------");
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        





        // System.out.println(dataPrincipal.getDiaSemana().getValor()); //dia da semana,
        // aparece string, get valor numero atribuido
    }
}
