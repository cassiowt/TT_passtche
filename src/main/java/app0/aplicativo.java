package app0;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class aplicativo {

    static PaisED     pais;
    static EstadoED   estado;
    static CidadeED   cidade;
    static BairroED   bairro;
    static EnderecoED endereco;


    public static void main(String[] args) {
/*
        // Criado os objetos
           pais     = new PaisED("Argentina");
           estado   = new EstadoED("La Paloma","LP",pais);
           cidade   = new CidadeED("Corriente",estado);
           bairro   = new BairroED("Via del Sur",cidade);
           endereco = new EnderecoED();

           insirirDados2();

           imprimirEndereco(endereco);
           */
            lista();

    }

    private static void insirirDados2() {
        // Setar dados para os objetos

        endereco.setRua("Flores");
        endereco.setNumero(28);
        endereco.setTipoLogradouro(TipoLogradouroED.ROTA);
        endereco.setComplemento("n/a");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);
    }

    private static void insirirDados() {
        // Setar dados para os objetos

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

        System.out.println("Endereço do Cliente");
        System.out.println("---------------------------------------------");
        System.out.println(endereco.getTipoLogradouro().getDescricao() + " " + endereco.getRua() + ", " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: "    + endereco.getCep());
        System.out.println("Bairro: " + endereco.getBairro().getNome());
        System.out.println("Cidade: " + endereco.getBairro().getCidadeED().getNome());
        System.out.println("UF: "     + endereco.getBairro().getCidadeED().getEstadoED().getSigla());
        System.out.println("Pais: "   + endereco.getBairro().getCidadeED().getEstadoED().getPaisED().getNome());



    }

    private static void lista(){

        List<PaisED> paises = new ArrayList<PaisED>();

        paises.add(new PaisED("Brasil"));
        paises.add(new PaisED("Argentina"));
        paises.add(new PaisED("Canada"));
        paises.add(new PaisED("França"));

        System.out.println(paises.size());

        for (int i = 0; i <  paises.size(); i++) {
            System.out.println(paises.get(i).getNome());
        }

        paises.forEach(i->
                System.out.println(i.getNome())
        );

    }

}
