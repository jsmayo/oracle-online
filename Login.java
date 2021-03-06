import javafx.stage.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.event.*;




public class Login extends Application {
	public static void main(String [] args){
		launch(args);
	}
	@Override
	public void start(Stage myStage){
		myStage.setTitle("JavaFX Welcome");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text scenetitle = new Text("Welcome");
		//scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20)); using CSS
		scenetitle.setId("welcome-text");
		grid.add(scenetitle,0,0,2,1);
		
		Label userName = new Label("User Name:");
		grid.add(userName,0,1 );
		
		TextField userText = new TextField();
		grid.add(userText, 1, 1);
		
		Label pw = new Label("Passworld:");
		grid.add(pw, 0, 2);
		
		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		//grid.setGridLinesVisible(true);
		
		Button btn = new Button("Sign In");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn,1,4);
		Text actiontarget = new Text();
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent ae){
					//actiontarget.setFill(Color.FIREBRICK); Using CSS
					actiontarget.setText("Sign in button pressed!");
				}
		});
		
	
		grid.add(actiontarget, 1,6);
		actiontarget.setId("actiontarget");
		
		Scene myScene = new Scene(grid, 300,275);
		myStage.setScene(myScene);
		myScene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
		//myStage.getChildren().addAll(btn, userName, userText, pw, pwBox, actiontarget, scenetitle);
		myStage.show();
	}
}