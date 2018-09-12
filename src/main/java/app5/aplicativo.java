package app5;

import model.*;

public class aplicativo {

    static PaisED pais;
    static EstadoED estado;
    static CidadeED cidade;
    static BairroED bairro;
    static EnderecoED endereco;

    public static void main(String[] args) {

        //Criando os objetos.
        pais = new PaisED();
        estado = new EstadoED();
        cidade = new CidadeED();
        bairro = new BairroED();
        endereco = new EnderecoED();

        //inserirDados();

        //Setar dados para os objetos
        pais.setNome("Brasil");
        estado.setNome("Rio Grande do Sul");
        estado.setSigla("RS");
        estado.setPaisED(pais);
        cidade.setNome("Porto Alegre");
        cidade.setEstadoED(estado);
        bairro.setNome("Bela Vista");
        bairro.setCidadeED(cidade);
        endereco.setRua("São Francisco da Califa");
        endereco.setNumero(23);
        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
        endereco.setComplemento("n/a");
        endereco.setCep("90850080");
        endereco.setBairro(bairro);
        endereco.setValido(true);

        imprimirEndereco(endereco);

    }

        private static void insirirdados2() {

            endereco.setRua("São Francisco da Califa");
            endereco.setNumero(23);
            endereco.setTipoLogradouro(TipoLogradouroED.RUA);
            endereco.setComplemento("n/a");
            endereco.setCep("90850080");
            endereco.setBairro(bairro);
            endereco.setValido(true);
        }



    private static void imprimirEndereco(EnderecoED endereco) {
        System.out.println("Endereço do Cliente");
        System.out.println("-----------------------------");
        System.out.println(endereco.getTipoLogradouro()+" "+ endereco.getRua()+ "," + endereco.getNumero());
        System.out.println("Complemento: "+ endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Bairro: "+endereco.getBairro().getNome());
       //ystem.out.println("Cidade: "+ endereco.getBairro().getCidade().getNome());
    }
}
