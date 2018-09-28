package imp;

import java.util.ArrayList;

public abstract class GenericImpressora {

    public String imprime(ArrayList<String> frases){

       String texto = new String();
        for (int i = 0; i <  frases.size(); i++) {

         texto += (frases.get(i)) + "\n" ;

        }
       return texto;
    }


    public String ligado(boolean ligar){

        if (ligar = true) {
            return "Impressora Ligada";
        }
         return "Impressora desligada";

    }

}

