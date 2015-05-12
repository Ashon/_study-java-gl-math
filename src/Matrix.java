
public class Matrix {
	int row;
	int column;
	double [][] matrix;
	
	public Matrix(int row, int column){
		this.row = row;
		this.column = column;
		matrix = new double[row][];
		for(int i = 0; i < row; i++){
			matrix[i] = new double[column];
			for(int j = 0; j < column; j++)
				matrix[i][j] = 0;
		}
	}
	public void add(double num){
		for(int i = 0; i < row; i++)
			for(int j = 0; j < column; j++)
				matrix[i][j] += num;
	}
	public void add(Matrix m){
		if(row == m.row && column == m.column)
			for(int i = 0; i < row; i++)
				for(int j = 0; j < column; j++)
					matrix[i][j] += m.matrix[i][j];
	}

	public void sub(double num){
		for(int i = 0; i < row; i++)
			for(int j = 0; j < column; j++)
				matrix[i][j] -= num;
	}
	public void sub(Matrix m){
		if(row == m.row && column == m.column)
			for(int i = 0; i < row; i++)
				for(int j = 0; j < column; j++)
					matrix[i][j] -= m.matrix[i][j];
	}
}
