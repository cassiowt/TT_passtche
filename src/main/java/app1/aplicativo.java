package app1;

import model.*;

public class aplicativo {

    static  PaisED pais;
    static EstadoED estado;
    static CidadeED cidade;
    static BairroED bairro;
    static EnderecoED endereco;

    public static void main(String[] args) {

        //  Criado os objetos
        pais = new PaisED("Argentina");
        estado = new EstadoED("La Paloma", "LP", pais);
        cidade = new CidadeED("Corriente", estado);
        bairro = new BairroED("Vila del Sur" , cidade);
        endereco = new EnderecoED();

        //inserirDados();

        inserirDados2();

        imprimirEndereco(endereco);

    }

    private static void inserirDados() {
        // Setar dados para objetos
        pais.setNome("Brasil");
        estado.setNome("Rio Grande do Sul");
        estado.setSigla("RS");
        estado.setPaisED(pais);
        cidade.setNome("Porto Alegre");
        cidade.setEstadoED(estado);
        bairro.setNome("Higienópolis");
        bairro.setCidadeED(cidade);
        endereco.setRua("São Fransisco da California");
        endereco.setNumero(23);
        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
        endereco.setComplemento("n/a");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);

        imprimirEndereco(endereco);
    }

    private static void inserirDados2() {
        // Setar dados para objetos
        endereco.setRua("São Fransisco da California");
        endereco.setNumero(23);
        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
        endereco.setComplemento("n/a");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);

        imprimirEndereco(endereco);
    }

    private static void imprimirEndereco(EnderecoED endereco) {

        System.out.println("Endereco do Cliente");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(endereco.getTipoLogradouro() + " " + endereco.getRua() + ", " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Bairro: " + endereco.getBairro().getNome());
        System.out.println("Cidade: " + endereco.getBairro().getCidadeED().getNome());
        System.out.println("UF: " + endereco.getBairro().getCidadeED().getEstadoED().getSigla());
        System.out.println("País: " + endereco.getBairro().getCidadeED().getEstadoED().getPaisED().getNome());

    }
}
