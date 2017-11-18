public class TicTacToe{
	static String[][] displayBoard;
	boolean playerOneTurn = true;
	
	public static void main(String[] args){
		startGame();
		placeDigit(1, "X");
		placeDigit(5, "O");
		viewBoard();
	}
	
	public static void startGame(){
		displayBoard = new String[11][11];
		
		//Creating the board
		for(int i = 0; i < 11; i++){
			for(int k = 0; k < 11; k++){
				displayBoard[i][k] = "'";
			}
		}
		
		//Adding lines to the board
		for(int i = 0; i < 11; i++){
			displayBoard[i][3] = "|";
			displayBoard[i][7] = "|";
		}
		for(int i = 0; i < 11; i++){
			displayBoard[3][i] = "-";
			displayBoard[7][i] = "-";
		}
	}
	
	public static void viewBoard(){
		for(String[] row : displayBoard){
			for(String value : row){
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
	
	public static void placeDigit(int place, String digit){
		int row = 0;
		int col = 0;
		
		if(place == 1){
			row = 1;
			col = 1;
		}
		if(place == 2){
			row = 1;
			col = 5;
		}
		if(place == 3){
			row = 1;
			col = 9;
		}
		if(place == 4){
			row = 5;
			col = 1;
		}
		if(place == 5){
			row = 5;
			col = 5;
		}
		if(place == 6){
			row = 5;
			col = 9;
		}
		if(place == 7){
			row = 9;
			col = 1;
		}
		if(place == 8){
			row = 9;
			col = 5;
		}
		if(place == 9){
			row = 9;
			col = 9;
		}
		
		
		if(digit.equals("X")){
			displayBoard[row-1][col-1] = digit;
			displayBoard[row-1][col] = " ";
			displayBoard[row-1][col+1] = digit;
			
			displayBoard[row][col-1] = " ";
			displayBoard[row][col] = digit;
			displayBoard[row][col+1] = " ";
			
			displayBoard[row+1][col-1] = digit;
			displayBoard[row+1][col] = " ";
			displayBoard[row+1][col+1] = digit;
		}
		
		if(digit.equals("O")){
			displayBoard[row-1][col-1] = " ";
			displayBoard[row-1][col] = digit;
			displayBoard[row-1][col+1] = " ";
			
			displayBoard[row][col-1] = digit;
			displayBoard[row][col] = " ";
			displayBoard[row][col+1] = digit;
			
			displayBoard[row+1][col-1] = " ";
			displayBoard[row+1][col] = digit;
			displayBoard[row+1][col+1] = " ";
			
		}
	}
}
