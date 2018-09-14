package app;

import model.*;

public class app {
    public static void main(String[] args) {
        PaisED paisED = new PaisED();
        EstadoED estadoED = new EstadoED();
        CidadeED cidadeED = new CidadeED();
        BairroED bairroED = new BairroED();
        EnderecoED enderecoED = new EnderecoED();

        paisED.setNome("Brasil");
        estadoED.setNome("Rio Grande do Sul");
        estadoED.setPaisED(paisED);
        estadoED.setSigla("RS");
        cidadeED.setNome("Porto Alegre");
        cidadeED.setEstadoED(estadoED);
        bairroED.setNome("Partenon");
        bairroED.setCidadeED(cidadeED);

        enderecoED.setRua("Ipiranga");
        enderecoED.setNumero(4554);
        enderecoED.setComplemento("n/a");
        enderecoED.setCep("91520270");
        enderecoED.setTipoLogradouro(TipoLogradouroED.AVENIDA);
        enderecoED.setBairro(bairroED);

        imprimeEndereco(enderecoED);
    }

    private static void imprimeEndereco(EnderecoED enderecoED) {
        System.out.printf(enderecoED.getRua());
    }
}
