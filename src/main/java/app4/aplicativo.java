package app4;

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

        //criado os objetos
        pais = new PaisED();
        estado = new EstadoED();
        cidade = new CidadeED();
        bairro = new BairroED();
        endereco = new EnderecoED();

        //inserirDados();

        //imprimirEndereco(endereco);

        litaEndereco ();
    }

    private static void inserirDados() {
        //setar dados para os objetos
        pais.setNome("Brasil");
        estado.setNome("Rio Grande do Sul");
        estado.setSigla("RS");
        estado.setPaisED(pais);
        cidade.setNome("Porto Alegre");
        cidade.setEstadoED(estado);
        bairro.setNome("Bela Vista");
        bairro.setCidadeED(cidade);
        endereco.setTipoLogradouro(TipoLogradouroED.RUA);
        endereco.setRua("São Francisco da California");
        endereco.setNumero(23);
        endereco.setComplemento("casa");
        endereco.setCep("90550080");
        endereco.setBairro(bairro);
        endereco.setValido(true);
    }

    private static void imprimirEndereco(EnderecoED endereco) {

        System.out.println("Endereço do Cliente: ");
        System.out.println("----------------------------------------------------");
        System.out.println(endereco.getTipoLogradouro() + " " + endereco.getRua() + "," + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Bairro: " + endereco.getBairro().getNome());
        System.out.println("Cidade: " + endereco.getBairro().getCidadeED().getNome());
        System.out.println("UF: " + endereco.getBairro().getCidadeED().getEstadoED().getSigla());
        System.out.println("País: " + endereco.getBairro().getCidadeED().getEstadoED().getPaisED().getNome());
    }

    private static void litaEndereco ()
    {
        List<EnderecoED> endereco = new ArrayList<EnderecoED>();

        endereco.add(new EnderecoED("Boa Vista"));
        endereco.add(new EnderecoED("Partenon"));
        endereco.add(new EnderecoED("Centro"));

        endereco.forEach(i -> System.out.println(i.getBairro()));
    }
}
