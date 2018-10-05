package rn;

import dao.ImagemDAO;
import model.ImagemED;

import java.util.ArrayList;
import java.util.List;

public class ImagemRN {

    ImagemDAO imagemDAO = new ImagemDAO();

    public long createImagem(ImagemED imagem){
        long id = 0;
        try {
            if(imagem.getEndereco().length() > 5)
                id =  imagemDAO.save(imagem);
            else throw new Exception("Imagem invalido");
        } catch (Exception e){
            e.getMessage();
        }
        return id;
    }

    public void alterImagem(ImagemED imagem){
        try {
            imagemDAO.update(imagem);
        } catch (Exception e){
            e.getMessage();
        }
    }
    public void deleteImagem(ImagemED imagem) {
        try {
            imagemDAO.delete(imagem);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public ImagemED findImagem(long id){
        ImagemED ImagemED = new ImagemED();
        try {
            ImagemED  = (ImagemED) imagemDAO.find(ImagemED.class, id );
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return ImagemED;
    }

    public List<ImagemED> findAllImagens(){
        List<ImagemED>  imagem		= new ArrayList<ImagemED>();
        try {
            imagem  =  imagemDAO.findAll(ImagemED.class);
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return imagem;
    }



}
