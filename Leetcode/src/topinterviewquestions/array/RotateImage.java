package topinterviewquestions.array;

import java.util.HashSet;
import java.util.Set;

public class RotateImage {

	Set<String> processedCells = new HashSet<>();
	
   public void rotate(int[][] matrix) {
      
   	int halfLength = (int)Math.ceil(matrix.length / 2.0);
   	
   	for(int x=0; x<halfLength; x++) {
   		for(int y=0; y<halfLength; y++) {
   			if(!processedCells.contains(String.valueOf(x) + "," + String.valueOf(y)) ) {
   				rotateSet(matrix, x, y);
   			}
   		}	
   	}
   	
   }
   
   private void rotateSet(int[][] matrix, int startX, int startY) {
   	
   	int currentX = startX;
   	int currentY = startY;
   	
   	int buffer = matrix[currentY][currentX];
   	
   	for(int i=0; i<4; i++) {
      	int[] newPos = convertCoord(currentX, currentY, matrix.length);
      	int newX = newPos[0];
      	int newY = newPos[1];
      	
      	processedCells.add(String.valueOf(newX) + "," + String.valueOf(newY));
      	
      	int tempBuffer = matrix[newY][newX];
      	matrix[newY][newX] = buffer;
      	buffer = tempBuffer;
      	currentX = newX;
      	currentY = newY;
   	}
   	
   }
   
   
   
   private int[] convertCoord(int x, int y, int length) {
   	int[] newCoords = new int[2];
   	newCoords[0] = length - 1 - y;
   	newCoords[1] = x;
   	return newCoords;
   }
	
   public static void main(String[] args) {
   	
//   	int[][] matrix = new int[][] { {1,2,3},{4,5,6},{7,8,9} };
   	int[][] matrix2 = new int[][] { {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16} };
   	
   	new RotateImage().rotate(matrix2);
//   	outputMatrix(matrix);
   	outputMatrix(matrix2);
   			
   }
   
   public static void outputMatrix(int[][] image) {
   	for(int y=0;y<image.length; y++) {
   		for(int x=0;x<image.length; x++) {
   			System.out.print((image[y][x] + ",   ").substring(0, 4));
   		}
   		System.out.println("");
   	}
   }
   
}
