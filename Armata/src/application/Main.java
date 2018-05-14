package application;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/*
* G��wny watek aplikacji klienta - nas�uchuje wiadomosci z serwera.
* Pierwsza wiadomo�� zaczyna si� od WELCOME, zawiera token z jakim gracz zaczyna gre P1 lub P2
* P�zniej rozpoczyna sie dzialanie w petli - nasluchiwanie jednej z wiadomosci / komendy:
* 		"VALID_MOVE" , "OPPONENT_MOVED", "VICTORY", ...
* 		program b�dzie reagowa� odpowiednio do wiadomosci i przekazywanych argumentow 
* 
* 		Je�li nast�pi "VICTORY", "TIE" lub "DEFEAT" program zapyta uzytkownika czy kontynuowac gre,
* 			// TODO - opracowac remis - np brak pociskow
* 		w przypadku odpowiedzi negatywnej do serwera zostanie wys�ana wiadomo�� "QUIT"
* 		z serwera do przeciwnika zostanie wys�ana wiadomo�� "OPPONENT_QUIT" a w odpowiedzi na nia
* 		z aplikacji przeciwnika r�wnie� wysy�ane jest "QUIT" 
*/
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Game armata = new Game(primaryStage);
		Client client = new Client();
		client.setGame(armata);
		client.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		launch(args);
				
	}

	


	
	
		
	
	
		
	
	
	
	
	
	
}


