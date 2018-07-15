package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCar;

public class CarPark {

	public static void main(String[] args) {
		int permissoes = 3;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(int idCar = 0; idCar < 10; idCar++){
			Thread tCar = new ThreadCar(idCar, semaforo);
			tCar.start();
		}
	}

}
