public class TicTacToe{
	static String[][][] displayBoard;
	boolean playerOneTurn = true;
	
	public static void main(String[] args){
		startGame();
		viewBoard();
	}
	
	public static void startGame(){
		displayBoard = new String[9][11][11];
		
		//Creating the board
		for(int x = 0; x < 9; x++){
			for(int i = 0; i < 11; i++){
				for(int k = 0; k < 11; k++){
					displayBoard[x][i][k] = "'";
				}
			}
		}
		
		//Adding lines to the board
		for(int x = 0; x < 9; x++){
			for(int i = 0; i < 11; i++){
				displayBoard[x][i][3] = "|";
				displayBoard[x][i][7] = "|";
			}
		}
		for(int x = 0; x < 9; x++){
			for(int i = 0; i < 11; i++){
				displayBoard[x][3][i] = "-";
				displayBoard[x][7][i] = "-";
			}
		}
	}
	
	public static void viewASection(int section){
		for(String[] row : displayBoard[section] ){
			for(String col : row){
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	
	//The sections are split to make it easier to add the dividing line. 	
	public static void viewBoard(){
		viewTop();
		divider();
		viewMiddle();
		divider();
		viewBottom();
	}
	
	public static void viewTop(){
		for(int x = 0; x < 11; x++){
			for(int i = 0; i < 3; i++){
				for(int k = 0; k < 11; k++){
					System.out.print(displayBoard[i][x][k] + " ");
				}
				if(i != 2)
					System.out.print(" ||| ");
			}
				System.out.println();
		}
	}
	
	public static void viewMiddle(){
		for(int x = 0; x < 11; x++){
			for(int i = 3; i < 6; i++){
				for(int k = 0; k < 11; k++){
					System.out.print(displayBoard[i][x][k] + " ");
				}
				if(i != 5)
					System.out.print(" ||| ");
			}
				System.out.println();
		}
	}
	
	public static void viewBottom(){
		for(int x = 0; x < 11; x++){
			for(int i = 6; i < 9; i++){
				for(int k = 0; k < 11; k++){
					System.out.print(displayBoard[i][x][k] + " ");
				}
				if(i != 8)
					System.out.print(" ||| ");
			}
				System.out.println();
		}
	}
	
	public static void divider(){
		System.out.println("===========================================================================");
	}
	
	
	//This is used to put the X's and O's into the visible playing field
	public static void placeDigit(int grid, int place, String digit){
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
			displayBoard[grid][row-1][col-1] = digit;
			displayBoard[grid][row-1][col] = " ";
			displayBoard[grid][row-1][col+1] = digit;
			
			displayBoard[grid][row][col-1] = " ";
			displayBoard[grid][row][col] = digit;
			displayBoard[grid][row][col+1] = " ";
			
			displayBoard[grid][row+1][col-1] = digit;
			displayBoard[grid][row+1][col] = " ";
			displayBoard[grid][row+1][col+1] = digit;
		}
		
		if(digit.equals("O")){
			displayBoard[grid][row-1][col-1] = " ";
			displayBoard[grid][row-1][col] = digit;
			displayBoard[grid][row-1][col+1] = " ";
			
			displayBoard[grid][row][col-1] = digit;
			displayBoard[grid][row][col] = " ";
			displayBoard[grid][row][col+1] = digit;
			
			displayBoard[grid][row+1][col-1] = " ";
			displayBoard[grid][row+1][col] = digit;
			displayBoard[grid][row+1][col+1] = " ";
			
		}
	}
}