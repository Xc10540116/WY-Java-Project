package 第四章.井字棋;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int[][] board = new int[len][len];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		// 读入矩阵
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++){
				board[i][j] = in.nextInt();
			}
		}
		
		// 检查行
		for(int i=0; i<board.length; i++){
			numOfX = 0;
			numOfO = 0;
			for(int j=0; j<board.length; j++){
				if(board[i][j] == 1)
					numOfX++;
				else
					numOfO++;
			}
			if(numOfX == len || numOfO == len) 
			{
				gotResult = true;
				break;
			}
		}
		
		// 检查列
		if(!gotResult){
			for(int i=0; i<board.length; i++){
				numOfX = 0;
				numOfO = 0;
				for(int j=0; j<board.length; j++){
					if(board[j][i] == 1)
						numOfX++;
					else
						numOfO++;
				}
				if(numOfX == len || numOfO == len) 
				{
					gotResult = true;
					break;
				}
			}
		}
		
		// 检查对角
		if(!gotResult){
			numOfX = 0;
			numOfO = 0;
			for(int i=0; i<board.length; i++){
				if(board[i][i] == 1)
					numOfX++;
				else
					numOfO++;
				if(numOfX == len || numOfO == len) 
				{
					gotResult = true;
					break;
				}
			}
		}
		
		// 检查反对角线
		if(!gotResult){
			numOfX = 0;
			numOfO = 0;
			for(int i=0; i<board.length; i++){
				if(board[i][len-i-1] == 1)
					numOfX++;
				else
					numOfO++;
				if(numOfX == len || numOfO == len) 
				{
					gotResult = true;
					break;
				}
			}
		}
		
		if(gotResult){
			if(numOfX == len)
				System.out.print("X");
			else
				System.out.print("O");
		}
		else
			System.out.print("NIL");
	}

}
