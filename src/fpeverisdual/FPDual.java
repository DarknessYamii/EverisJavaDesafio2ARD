package fpeverisdual;

import operators.Pinball;
/**
 * Main App
 * DESAFIO EverisJava2 FPDual - EVERIS
 * 
 * -- Explicacion de mi idea de trabajo -- 
 * He supuesto que hay dos personas jugando en dos maquinas Pinball
 * diferentes, cada uno hace una puntuacion cada vez que se lanza las bolas y para suponer quien gana
 * simplemente realice un generador random de numero y el mayor random generado es el que gana el punto.
 * Ya despues de esto simplemente he hecho minijuegos y cosas varias
 * 
 * @author aruidelg
 *
 */
public class FPDual {

	/**
	 * Static method
	 * This method will run all our functions
	 */
	private static void operatorsChallenge() {

		Pinball pinball = new Pinball();
		pinball.launchBall();
		pinball.WinDraft();

		//This IF will tell us IF pinball belongs to operator.Pinball or not
		if (pinball instanceof Pinball) {

			System.out.println("You are using an instace of operator.Pinball ");

		} else {

			System.out.println("You are not using an instance of operator.Pinball");

		}
	}

	/**
	 * Main method
	 * This will run the method which contains all the functions
	 * @param args
	 */
	public static void main(String[] args) {

		operatorsChallenge();

	}

}
