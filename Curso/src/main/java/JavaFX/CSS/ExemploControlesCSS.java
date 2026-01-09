package JavaFX.CSS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploControlesCSS extends Application {

    @Override
    public void start(Stage palco){
        Label label = new Label("Ola mundo! Sou uma etiqueta (label)");
        label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 14px; -fx-font-style: italic; -fx-font-weight: bold;");

        Button button = new Button("Clique aqui");
        button.setStyle("-fx-font-family: 'Verdana'; -fx-font-size: 12px;");

        TextField campoTexto = new TextField();
        campoTexto.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 16px;");

        VBox layout = new VBox(label,button,campoTexto);

        Scene cena = new Scene(layout, 300, 200);

        palco.setScene(cena);
        palco.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
