/**37.-Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100,
 *  y hacer su matriz transpuesta.
 * @author jmonf
 *
 */
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz [][] = new int [4][5];
		int traspuesta [][] = new int [5][4];

		for (int i = 0; i < matriz.length; i++) {//generar al tiempo la matriz y la traspuesta
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random()*100)+1;
				traspuesta [j][i] = matriz[i][j];
			}

		}
		System.out.println("Imprimir matriz generada");//imprimir la matriz
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%03d ", matriz[i][j]); 
			}
		}
		System.out.println("\n");
		System.out.println("Imprimir matriz traspuesta");//imprimir la matriz traspuesta
		for (int i = 0; i < traspuesta.length; i++) {
			System.out.println();
			for (int j = 0; j < traspuesta[0].length; j++) {
				System.out.printf("%03d ", traspuesta[i][j]); 
			}
		}
		/* ordenar la matriz*/
		int auxiliar = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[0].length-1; k++) {
			for (int j = 0; j < matriz[0].length-1; j++) {
				if (matriz[i][j+1] > matriz[i][j]) {
				auxiliar = matriz[i][j];
				matriz[i][j] = matriz[i][j+1];
				matriz[i][j+1] = auxiliar;
				}
			}
			}
		}
		for (int j = 0; j < matriz[0].length; j++) {
			for (int k = 0; k < matriz.length-1; k++) {
			for (int i = 0; i < matriz.length-1; i++) {
				if (matriz[i+1][j] > matriz[i][j]) {
				auxiliar = matriz[i][j];
				matriz[i][j] = matriz[i+1][j];
				matriz[i+1][j] = auxiliar;
				}
			}
			}
		}
		System.out.println("\n");
		System.out.println("Imprimir matriz ordenada");//imprimir la matriz ordenada
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%03d ", matriz[i][j]); 
			}
		}
	}

}
