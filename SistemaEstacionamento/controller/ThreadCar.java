package controller;

import java.util.concurrent.Semaphore;

public class ThreadCar extends Thread {
	private int idCar;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;
	
	public ThreadCar(int idCar, Semaphore semaforo){
		this.idCar = idCar;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run(){
		carroAndando();
		try {
			semaforo.acquire();
			carroParado();
			carroSaindo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			semaforo.release();
		}
	}
	
	private void carroAndando(){
		int distFinal = (int)((Math.random() * 2001) + 1000);
		int distPercorrida = 0;
		int deslocamento = (int)((Math.random() * 6) + 10);
		int tempo = 30;
		while (distPercorrida < distFinal){
			distPercorrida += deslocamento;
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Carro #"+idCar+" andou "+distPercorrida+" metros");
		}
		posChegada++;
		System.out.println("Carro #"+idCar+" foi o "+posChegada+"o. carro a chegar");
	}
	
	private void carroParado() {
		System.out.println("Carro #"+idCar+" estacionou");
		int tempoParado = (int)((Math.random() * 2501) + 500);
		try {
			Thread.sleep(tempoParado);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void carroSaindo(){
		posSaida++;
		System.out.println("Carro #"+idCar+" foi o "+posSaida+"o. a sair");
	}
}
