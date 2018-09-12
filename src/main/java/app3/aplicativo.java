package app3;

import model.*;

public class aplicativo {

    static PaisED pais;
    static EstadoED estado;
    static CidadeED cidade;
    static BairroED bairro;
    static EnderecoED endereco;


    public static void main(String[] args) {

        // Criados os objetos

        pais = new PaisED("Argentina");
        estado = new EstadoED("La Paloma ", "LP", pais);
        cidade = new CidadeED("Buenos Aires ",estado);
        bairro = new BairroED("Via del Sur ", cidade);
        endereco = new EnderecoED();

        // Setar dados para os objetos

        inserirDados2();

        //inserirDados();


        imprimirEndereco(endereco);


    }

    private static void inserirDados2() {

        endereco.setRua("Flores");
        endereco.setNumero(28);
        endereco.setTipoLogradouro(TipoLogradouroED.ROTA);
        endereco.setComplemento("n/a");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);
    }

    private static void inserirDados() {
        pais.setNome("Brasil");
        estado.setNome("Rio Grande do Sul");
        estado.setSigla("RS");
        estado.setPaisED(pais);
        cidade.setNome("Porto Alegre");
        cidade.setEstadoED(estado);
        bairro.setNome("Bela Vista");
        bairro.setCidadeED(cidade);
        endereco.setRua("São Francisco da California");
        endereco.setNumero(23);
        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
        endereco.setComplemento("n/a");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);
    }

    private static void imprimirEndereco(EnderecoED endereco) {

        System.out.println("Endereco do Cliente");
        System.out.println("-------------------");
        System.out.println(endereco.getTipoLogradouro() + ": " + endereco.getRua() + "," + endereco.getNumero());
        System.out.println("Complemento:" + endereco.getComplemento());
        System.out.println("Cep: " + endereco.getCep());
        System.out.println("Bairro: " + endereco.getBairro().getNome());
        System.out.println("Cidade: " + endereco.getBairro().getCidadeED().getNome());
        System.out.println("Estado: " + endereco.getBairro().getCidadeED().getEstadoED().getSigla());
        System.out.println("Pais: " + endereco.getBairro().getCidadeED().getEstadoED().getPaisED().getNome());
    }
}

