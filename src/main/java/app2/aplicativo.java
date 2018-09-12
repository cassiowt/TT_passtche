package app2;

import model.*;

public class aplicativo {
    public static void main(String[] args) {

        // Criado os objetos

        PaisED pais = new PaisED();
        EstadoED estado = new EstadoED();
        CidadeED cidade = new CidadeED();
        BairroED bairro = new BairroED();
        EnderecoED endereco = new EnderecoED();

        // Setar dados para os objetos

        pais.setNome("Brasil");
        estado.setNome("Rio Grande do Sul");
        estado.setSigla("RS");
        estado.setPaisED(pais);
        cidade.setNome("Porto Alegre");
        cidade.setEstadoED(estado);
        bairro.setNome("Bela Vista");
        bairro.setCidadeED(cidade);
        endereco.setRua("São Francisco da Califórnia");
        endereco.setNumero(25);
        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
        endereco.setComplemento("n/a");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);
    }
}
