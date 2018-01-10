/**Programa para comprobar el resultado de un text de unos alumno*/
/**Podria a ver podido introducir el resultado correcto por teclado pero no lo he creido necesario*/

public class MonforteTaboadaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String matriz [][] = new String [5][10];// En esta matriz almacenare las respuestas a cada pregunta de todos los alumnos
		String correcto [] = {"B","D","A","C","B","C","A","C","B","D"};//creo una matriz con los resultados correctos para compararla con la de  alumnos
		int resultado [][] = new int [5][2];// creo otra matriz entero para almacenar los aciertos y fallos
		int numero = 0; // creo un numero para convertirlo en letra despues de un random
		double notas [] = new double [5];//aqui se almacenaran las Calificaciones
		
		for (int i = 0; i < matriz.length; i++) {//vamos a rellenar la matriz con letras aleatorias utilizando la funcion Math.random
			for (int j = 0; j < matriz[0].length; j++) {
				numero = (int)(Math.random()*4)+1;
				switch (numero) {//para estas cosas me parace mas legible el Swith que el If
				case 1:
					matriz [i][j] = "A";
					
					break;
				case 2:
					matriz [i][j] = "B";
					
					break;
				case 3:
					matriz [i][j] = "C";
					
					break;
				case 4:
					matriz [i][j] = "D";
					
					break;
				default:
					break;
				}
				
			}
		}
		
		//comparamos uno a uno con el resultado correcto  del examen y apuntamos las correctas y las falsas
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz[0].length; i++) {
				if (matriz[j][i].compareTo(correcto[i]) == 0) {// como he decidido yo como ponerlas no hace falta el compareToignorecase
					resultado [j][0] = resultado [j][0] + 1;
				}
				else {
					resultado[j][1] = resultado [j][1] + 1;
					
				}
			}	
		}
		for (int i = 0; i < resultado.length; i++) {//rellenamos una matriz  con las notas
			double suma = 0;
			for (int j = 0; j < resultado[0].length; j++) {
			suma = resultado[i][0] - resultado[i][1]*0.30;
			}
			notas [i] = suma ; 
		}
		
		System.out.printf("Solucion : ");// imprimo todo como aparece en la hoja Como todos los vectores tienen una dimension igual no hay mucho problema
		for (int i = 0; i < correcto.length; i++) {	//imprimo la solucion correcta
		System.out.printf("%3s ",correcto[i]);
		}
		System.out.println("\n");
		System.out.println("                                                                  "+"  Aciertos "+"    Fallos   "+"Calificacion");
		
		for (int i = 0; i < matriz.length; i++) {// utilizamos este for para todos los vectores con dimension 5
			System.out.print("Alumno    "+(i+1)+":  ");
			for (int j = 0; j < matriz[0].length; j++) {//para imprimir las respuestas
				System.out.printf("%4s ",matriz[i][j]);
			}
			for (int j = 0; j < resultado[0].length; j++) {
				System.out.printf("      %3d    ", resultado[i][j]);	
			}
			System.out.printf("    %+1.2f ",notas[i]);
			System.out.println();
		}
	}

}
