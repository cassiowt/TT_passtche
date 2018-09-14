package app1;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class aplicativo {

//    static PaisED pais;
//    static EstadoED estado;
//    static CidadeED cidade;
//    static BairroED bairro;
//    static EnderecoED endereco;

    public static void main(String[] args) {

//        //  Criado os objetos
//        pais = new PaisED("Argentina");
//        estado = new EstadoED("La Paloma", "LP", pais);
//        cidade = new CidadeED("Corriente", estado);
//        bairro = new BairroED("Vila del Sur" , cidade);
//        endereco = new EnderecoED();
//
//        //inserirDados();
//
//        inserirDados2();
//
//        imprimirEndereco(endereco);

        listaEndereco();
    }

//    private static void inserirDados() {
//        // Setar dados para objetos
//        pais.setNome("Brasil");
//        estado.setNome("Rio Grande do Sul");
//        estado.setSigla("RS");
//        estado.setPaisED(pais);
//        cidade.setNome("Porto Alegre");
//        cidade.setEstadoED(estado);
//        bairro.setNome("Higienópolis");
//        bairro.setCidadeED(cidade);
//        endereco.setRua("São Fransisco da California");
//        endereco.setNumero(23);
//        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
//        endereco.setComplemento("n/a");
//        endereco.setCep("90550080");
//        endereco.setBairro(bairro);
//        endereco.setValido(true);
//
//        imprimirEndereco(endereco);
//    }
//
//    private static void inserirDados2() {
//        // Setar dados para objetos
//        endereco.setRua("São Fransisco da California");
//        endereco.setNumero(23);
//        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
//        endereco.setComplemento("n/a");
//        endereco.setCep("90550080");
//        endereco.setBairro(bairro);
//        endereco.setValido(true);
//
//        imprimirEndereco(endereco);
//    }

    private static void imprimirEndereco(EnderecoED endereco) {

        System.out.println("Endereco do Cliente");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(endereco.getTipoLogradouro().getDescricao() + " " + endereco.getRua() + ", " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Bairro: " + endereco.getBairro().getNome());
        System.out.println("Cidade: " + endereco.getBairro().getCidadeED().getNome());
        System.out.println("UF: " + endereco.getBairro().getCidadeED().getEstadoED().getSigla());
        System.out.println("País: " + endereco.getBairro().getCidadeED().getEstadoED().getPaisED().getNome());

    }


    private static void listaEndereco(){
        List<EnderecoED> enderecos = new ArrayList<EnderecoED>();

        PaisED pais = new PaisED("Brasil");
        EstadoED estado = new EstadoED("Rio Grande do Sul", "RS", pais);
        CidadeED cidade = new CidadeED("Porto Alegre", estado);
        CidadeED cidade2 = new CidadeED("Camaquã", estado);
        BairroED bairro = new BairroED("São João", cidade);
        BairroED bairro2 = new BairroED("Centro", cidade2);


        enderecos.add(new EnderecoED("São Franciso da California", 23, "n/a", "90550080",TipoLogradouroED.RUA,
                            new BairroED("Higienópolis",
                            new CidadeED("Porto Alegre",
                            new EstadoED("Rio Grande do Sul", "RS" ,
                            new PaisED("Brasil")))),  true));

        enderecos.add(new EnderecoED("Marcelo Gama", 193, "202", "90540040", TipoLogradouroED.RUA, bairro, true));

        enderecos.add(new EnderecoED("Presidente Vargas", 503,"01", "96180000", TipoLogradouroED.AVENIDA, bairro2, true));

        System.out.println(enderecos.size());

        for (int i = 0; i <  enderecos.size(); i++) {

        }

        enderecos.forEach(i->
                System.out.println(i.getRua()));
    }
}
