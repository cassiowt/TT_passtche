package app2;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class aplicativo {

    static PaisED pais;
    static EstadoED estado;
    static CidadeED cidade;
    static BairroED bairro;
    static EnderecoED endereco;

    public static void main(String[] args) {

//        // Criado os objetos
//
//         pais = new PaisED("Argentina");
//         estado = new EstadoED("La Paloama" , "LP" , pais);
//         cidade = new CidadeED("cidade: cidad" , estado);
//         bairro = new BairroED("nome: kkk" , cidade);
//         endereco = new EnderecoED();
//
//        //inserirDados();
//        //inserirDados2();
//        //imprimirEndereco(endereco);

        listaBairro();

    }

    private static void inserirDados2() {
        // Setar dados para os objetos

        endereco.setRua("São Francisco da Califórnia");
        endereco.setNumero(25);
        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
        endereco.setComplemento("n/a");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);
    }

    private static void inserirDados1() {
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

    private static void imprimirEndereco(EnderecoED endereco) {

        System.out.println("Endereço do cleinte ");
        System.out.println("--------------------");
        System.out.println(endereco.getTipoLogradouro() + " " + endereco.getRua() + ", " + endereco.getNumero());
        System.out.println("Complemento " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Bairro: " + endereco.getBairro().getNome());
        System.out.println("Cidade: " + endereco.getBairro().getCidadeED().getNome());
        System.out.println("UF: " + endereco.getBairro().getCidadeED().getEstadoED().getSigla());
        System.out.println("Pais: " + endereco.getBairro().getCidadeED().getEstadoED().getPaisED().getNome());
    }

    private static void listaBairro(){

        List<BairroED> bairros = new ArrayList<BairroED>();

        PaisED brasil = new PaisED("Brasil");
        EstadoED rs = new EstadoED("rio grande do sul" , "RS" , brasil);
        CidadeED poa = new CidadeED("porto alegre" , rs);

        bairros.add(new BairroED("Moinhos de vento" , poa ));
        bairros.add(new BairroED("Bomfim" , poa ));

        bairros.forEach(i->
                System.out.println(i.getNome()));

    }
}