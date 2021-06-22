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

	public int getColumm() {
		return column;
	}

	public void setColumm(int columm) {
		this.column = columm;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	

}
