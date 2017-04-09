package 第四章.井字棋;

import java.util.Scanner;

public class UseCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		// 读入矩阵
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		// 检查行
		for(int i=0; i<board.length; i++)
		{
			numOfX = 0;
			numOfO = 0;
			for(int j=0; j<board[i].length; j++)
			{
				if( board[i][j] == 1)
				{
					numOfX++;
				} 
				else 
				{
					numOfO++;
				}
			}
			if(numOfX == SIZE || numOfO == SIZE) 
			{
				gotResult = true;
				break;
			}
		}
		
		// 检查列
		if(!gotResult){
			
			for( int i=0; i<SIZE; i++)
			{
				numOfX = 0;
				numOfO = 0;
				for( int j=0; j<SIZE; j++)
				{
					if(board[j][i] == 1)
					{
						numOfX++;
					}
					else
					{
						numOfO++;
					}
				}
				if(numOfX == SIZE || numOfO == SIZE) 
				{
					gotResult = true;
					break;
				}
			}
		}
		
		// 检查对角线
		if(!gotResult)
		{
			numOfX = 0;
			numOfO = 0;
			for(int i=0; i<SIZE; i++)
			{
				if(board[i][i] == 1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}	
			}
			if(numOfX == SIZE || numOfO == SIZE) 
			{
				gotResult = true;
			}
		}
		
		// 检查反对角线
		if(!gotResult)
		{
			numOfX = 0;
			numOfO = 0;
			for(int i=0; i<SIZE; i++)
			{
				if(board[i][SIZE-i-1] == 1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}	
			}
			if(numOfX == SIZE || numOfO == SIZE) 
			{
				gotResult = true;
			}
		}
		
		if(gotResult)
		{
			if(numOfX == SIZE)
			{
				System.out.print("X");
			}
			else
			{
				System.out.print("O");
			}
		}
		else
		{
			System.out.print("NIL");
		}
	}

}
