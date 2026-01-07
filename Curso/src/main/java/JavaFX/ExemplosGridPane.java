package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class ExemplosGridPane extends Application{
    @Override
    public void start (Stage palco){ //cria o palco |(stage) = estagio|
        //criação dos elementos (Rótulos, campos de texto e botões)
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("E-mail:");

        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("enviar");

        //criação do GridPane
        GridPane gridpane = new GridPane();
        gridpane.setHgap(8);// espaçamento Horizontal entre as celulas
        gridpane.setVgap(8);// espaçamento vertical entre as celulas
        gridpane.setPadding(new Insets(5)); // espaçamento externo

        //adicionando elementos ao GridPane
        gridpane.addRow(0, rotuloNome,campoNome);
        gridpane.addRow(1,rotuloEmail,campoEmail);
        gridpane.addRow(2,botaoEnviar);

        //criação da cena de exibição do palco
        Scene cena = new Scene(gridpane, 400, 200);
        palco.setScene(cena);
        palco.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}
