package JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ExemploImagem extends Application  {
    public void start (Stage palco){
        // caminho absoluto para a imagem
        String caminhoImagem = "file:///C:/Users/gonza/Downloads/vida-de-gato.jpg";

        Image imagem = new Image(caminhoImagem);
        ImageView imageview = new ImageView(imagem);

        //confuguração para ajustar o tamanho imagem
        imageview.setFitWidth(718);// largura desejada em um pixel
        imageview.setFitHeight(428);//altura desejada em um pixel
        imageview.setPreserveRatio(true);// mantém a proporção original da imagem

        VBox layout = new VBox(imageview);
        Scene cena = new Scene(layout, 700, 700);

        palco.setScene(cena);
        palco.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
