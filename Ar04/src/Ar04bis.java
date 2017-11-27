/**4.	Generar una matriz de 5x5  (numérica entera entre -100 y 100)
	e imprimir el valor mayor y el menor y los lugares donde se encuentran.*/
public class Ar04bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][] = new int [5][5];
		int mayor = 0;
		int menor = 0;
		int posmayor[] = new int [2];
		int posmenor[] = new int [2];
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = ((int)(Math.random()*201))-100;
				System.out.printf("%+04d ", matriz[i][j]);
			}

		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz [i][j];
					posmenor [0] = i+1;
					posmenor [1] = j+1;
				}
				if (matriz[i][j]> mayor) {
					mayor = matriz [i][j];
					posmayor [0] = i+1;
					posmayor [1] = j+1;				}
			}
		}
		System.out.println("\n");
		System.out.println("el numero mayor es :"+mayor+" y se encuentra en la fila "+posmayor[0]+" y en la columna "+posmayor[1]);
		System.out.println("el numero menor es :"+menor+" y se encuentra en la fila "+posmenor[0]+" y en la columna "+posmenor[1]);

	}

}


