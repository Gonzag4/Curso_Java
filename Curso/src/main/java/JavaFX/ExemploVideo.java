package JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

import javafx.scene.media.*;

public class ExemploVideo extends Application {

    @Override
    public void start (Stage palcoPrincial) {
        String urlDoVideo = "file:///c:/Curso/meus-videos/Happy-Feet-2.mp4"; // cominho do video
        Media media = new Media(urlDoVideo);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hBox = new HBox();
        hBox.getChildren().add(mediaView);

        Scene scene = new Scene(hBox, 800, 600);

        palcoPrincial.setTitle("Exemplo vídeo");
        palcoPrincial.setScene(scene);
        palcoPrincial.show();

        mediaPlayer.play();
    }
    public static void main(String[] args){
        launch(args);
    }
}
