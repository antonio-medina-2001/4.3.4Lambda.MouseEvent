
package expresioneslambda2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExpresionesLambda2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 350);
        
        Text texto = new Text(125,125,"Hola quiero moverme");
        pane.getChildren().add(texto);
        
        texto.setOnMouseDragged(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent event) {
           texto.setX(event.getX());
           texto.setY(event.getY());
        }
    });
  
        primaryStage.setTitle("ExpresionLambda, EJ2.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
