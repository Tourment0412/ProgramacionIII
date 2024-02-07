package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N17MultiplicacionMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Deficinicion de matrices
		
		//2*3
		int [][] mat1= {{1,2,3},
						{3,2,5}};
		//3*3
		int [][] mat2= {{-1,2,2},
						{6,3,3},
						{2,3,2}};
		try {
			int [][]matrizResultante= multiplicarMatrices(mat1,mat2);
			printMatrix(matrizResultante);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static int [][]multiplicarMatrices(int[][] mat1, int[][] mat2) throws Exception {
		if(mat1[0].length!=mat2.length)
			throw new Exception("No se puede hacer la multiplicacion");
		int [][] matrizResultante= new int [mat1.length][mat2[0].length];
		matrizResultante= multiplicarMatrizAux(mat1,mat2,matrizResultante,0,0,0);
		
		return matrizResultante;
	}

	private static int [][] multiplicarMatrizAux(int[][] mat1, int [][] mat2, int[][] matrizResultante, int i, int j, int k) {

		// TODO Auto-generated method stub
		if(i>=matrizResultante.length)
			return matrizResultante;
		if(j< mat2[0].length) {
			if(k<mat2.length) {
				matrizResultante[i][j]+= mat1[i][k]*mat2[k][j];
				return multiplicarMatrizAux(mat1, mat2, matrizResultante, i, j, k+1);
			}
			return multiplicarMatrizAux(mat1,mat2,matrizResultante,i,j+1,0);
		}
		return multiplicarMatrizAux(mat1, mat2, matrizResultante, i+1, 0, 0);
		
	}
	
	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
