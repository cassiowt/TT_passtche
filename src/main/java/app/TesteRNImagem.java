package app;

import model.ImagemED;
import rn.ImagemRN;


import java.util.ArrayList;
import java.util.List;

public class TesteRNImagem {

    static ImagemRN imagemRN =  new ImagemRN();

    public static void main(String[] args) {
        adicionaImagem();
        buscaImagem();
        buscaTodosImagens();
        alteraImagem(2l);
        deletaImagem(2l);
    }

    private  static void deletaImagem(long idImagem){
        ImagemED i = imagemRN.findImagem(idImagem);
        i.setEndereco("www.terra.com.br");
        imagemRN.deleteImagem(i);
    }

    private  static void alteraImagem(long idImagem){
        ImagemED i = imagemRN.findImagem(idImagem);
        i.setEndereco("www.blabla.com");
        imagemRN.alterImagem(i);
    }

    private static void buscaImagem() {

        System.out.println(imagemRN.findImagem(2));
    }
    private static void buscaTodosImagens() {
        List<ImagemED> imagem =  new ArrayList<ImagemED>();
        imagemRN.findAllImagens().forEach(i-> System.out.println(i));
    }

    private static void adicionaImagem() {
        ImagemED imagem =  new ImagemED("www.google.com",10);
        imagemRN.createImagem(imagem);
    }
}
