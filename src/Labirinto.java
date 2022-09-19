import java.util.*;
public class Labirinto {
	
	public static void risolviLabirinto(int m[][], int x, int y) {
		java.util.Stack stack = new java.util.Stack();
		int [][] appoggio = new int[5][5];
		Posizione cellaPartenza, cella;
		cellaPartenza = new Posizione();
		cella = new Posizione();
		stack.push(cella);
		appoggio[cellaPartenza.x][cellaPartenza.y] = 1;
		while(!stack.empty()) {
			if(cellaPartenza.x == x && cellaPartenza.y == y) {
				while(!stack.empty()) {
					cellaPartenza = (Posizione) stack.pop();
					System.out.print("[" + cellaPartenza.x + ", "+ cellaPartenza.y + "] ");
				}
				System.out.println();
			}else if(cellaPartenza.x+1<5 && m[cellaPartenza.x+1][cellaPartenza.y] == 1 && appoggio[cellaPartenza.x+1][cellaPartenza.y]==0) {
				cellaPartenza.x++;
				cella = new Posizione();
				cella.x = cellaPartenza.x;
				cella.y = cellaPartenza.y;
				stack.push(cella);
				appoggio[cellaPartenza.x][cellaPartenza.y] = 1;
			}else if(cellaPartenza.x-1>=0 && m[cellaPartenza.x-1][cellaPartenza.y] == 1 && appoggio[cellaPartenza.x-1][cellaPartenza.y]==0) {
				cellaPartenza.x--;
				cella = new Posizione();
				cella.x = cellaPartenza.x;
				cella.y = cellaPartenza.y;
				stack.push(cella);
				appoggio[cellaPartenza.x][cellaPartenza.y] = 1;
			}else if(cellaPartenza.y+1<5 && m[cellaPartenza.x][cellaPartenza.y+1] == 1 && appoggio[cellaPartenza.x][cellaPartenza.y+1]==0) {
				cellaPartenza.y++;
				cella = new Posizione();
				cella.x = cellaPartenza.x;
				cella.y = cellaPartenza.y;
				stack.push(cella);
				appoggio[cellaPartenza.x][cellaPartenza.y] = 1;
			}else if(cellaPartenza.y-1>=0 && m[cellaPartenza.x][cellaPartenza.y-1] == 1 && appoggio[cellaPartenza.x][cellaPartenza.y-1]==0) {
				cellaPartenza.x++;
				cella = new Posizione();
				cella.x = cellaPartenza.x;
				cella.y = cellaPartenza.y;
				stack.push(cella);
				appoggio[cellaPartenza.x][cellaPartenza.y] = 1;
			}else {
				stack.pop();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m = {
		        { 1, 0, 1, 1, 0 },
		        { 1, 1, 1, 0, 1 },
		        { 0, 1, 0, 1, 1 },
		        { 1, 1, 1, 1, 1 },
		        { 1, 1, 1, 1, 1 }
		    };
		System.out.println("Percorso: ");
		risolviLabirinto(m, 0, 0);
		
	}

}
