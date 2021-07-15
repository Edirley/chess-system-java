package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int columm) {
		this.row = row;
		this.column = columm;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int columm) {
		this.column = columm;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	

}
