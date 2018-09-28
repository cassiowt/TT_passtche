package imp;

import java.util.ArrayList;

public class TestaImpressora {

    private static Impressora impressora;

    public static void main(String[] args) {
        impressora = new Impressora("HP420Color", 70.00f);

        impressora.setLigada(true);

        impressora.ligaImpressora();

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Bom dia,");
        frases.add("Gostaria de comunicar aos alunos, que neste sábado, ");
        frases.add("excepsionalmente teremos aula.");
        frases.add("\n");
        frases.add("Ateciosamente, Cássio");


        System.out.println(impressora.imprime(frases));
    }

}
