package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 50;
        String nome = "Maria";
        boolean acompanhado = false;
        double altura = 1.82;
        double peso = 80;

        double imc = (peso) / (altura * altura);
        if (idade >= 40) {
            if (imc < 22) {
                System.out.println("IMC = " + imc + " fique atento com a sua sub-alimentação");
            } else if (imc < 30) {
                System.out.println("IMC= " + imc + " Parabéns");
            } else if(imc <= 35) {
                System.out.println("IMC= " + imc + " Você esta com sobrepeso");
            }else{
                System.out.println("IMC=" +imc+ "Procure um médico");
            }

        } else if (idade > 40) {
            if (imc < 25) {
                System.out.println("IMC = " + imc + " fique atento com a sua sub-alimentação");
            } else if (imc <= 35) {
                System.out.println("IMC= " + imc + " Parabéns");
            } else {
                System.out.println("IMC=" +imc+ "Faça mais exercícios");
            }
        }
    }
}

// Cara acima de 40 anos - 22 subnutrição
// 22 e 30 Parabéns
// + 30 sobrepeso
// + 35 obesidade
// - 40 anos
// - 25 subnutrição
// 24 a 35 sobrepeso (controle)
// +35 exercicio