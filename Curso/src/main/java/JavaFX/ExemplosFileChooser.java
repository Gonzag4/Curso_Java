package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.stage.FileChooser;
import java.io.File;

public class ExemplosFileChooser extends Application {

    @Override
    public void start (Stage palco){
        FileChooser seletorDeArquivo = new FileChooser();
        seletorDeArquivo.setTitle("Escolha um arquivo.");

        Button botaoAbrir = new Button("Abrir arquivo.");
        botaoAbrir.setOnAction(e ->{ //dispara evento e executa o conteudo da função lambida
            File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palco);
            if (arquivoSelecionado != null){
                exibirImagem(arquivoSelecionado,palco);
            }
        });

        VBox layout = new VBox(botaoAbrir);
        Scene cena = new Scene(layout, 800, 600);
        palco.setTitle("Testando File Chooser");
        palco.setScene(cena);
        palco.show();
    }
    private void exibirImagem(File arquivo, Stage palcoDoArquivoSelecionado){
        Image imagem = new Image(arquivo.toURI().toString());
        ImageView imageView = new ImageView(imagem);

        VBox layout;

        //linha abaixo retorna o VBox atual
        layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();

        // alinha a baixo e adiciona imagem ao layout
        layout.getChildren().add(imageView);

        //ajustar o tamanho da imagem
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);

        palcoDoArquivoSelecionado.setTitle("Seletor de arquivos");
    }
    public static void main(String[] args){
        launch(args);
    }

}
