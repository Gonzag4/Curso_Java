package JavaFX;

import javafx.application.Application;
import javafx.scene.web.WebView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExemploStreamings extends Application {

    @Override
    public void start(Stage palco){
        WebView webView = new WebView();

        String urlVideo;

        urlVideo = "Url do video";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView, 800, 600);

        palco.setTitle("Exemplo de video de streaming");
        palco.setScene(cena);
        palco.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
