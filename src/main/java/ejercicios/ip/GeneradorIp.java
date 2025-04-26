package ejercicios.ip;

import java.util.Random;

public class GeneradorIp {
	 private static Random rand = new Random();

	    public static int generarNumero(int minimo, int maximo) {
	        return rand.nextInt((maximo - minimo + 1)) + minimo;
	    }

	    public static String generarIPV4() {
	        int[] ip = new int[4];

	        ip[0] = generarNumero(1, 254);
	        ip[1] = generarNumero(0, 254);
	        ip[2] = generarNumero(0, 254);
	        ip[3] = generarNumero(1, 254);

	        return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
	    }
	

}
