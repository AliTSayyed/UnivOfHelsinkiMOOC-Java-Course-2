package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.control.Label;
public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        TextArea textArea = new TextArea("");
        layout.setCenter(textArea);
        
        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("Letters: 0"));
        texts.getChildren().add(new Label("Words: 0"));
        texts.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(texts);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
       launch(TextStatisticsApplication.class);
    }

}
