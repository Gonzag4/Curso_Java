package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExemplosLayouts extends Application {
    @Override
    public void start(Stage palco){
        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");
        Button button4 = new Button("Botão 4");

        HBox hbox = new HBox(button1, button2);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(button3, button4);
        vbox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hbox);
        borderPane.setCenter(vbox);

        Scene cena = new Scene(borderPane, 300, 300);
        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args){
        launch(args);

    }
}
