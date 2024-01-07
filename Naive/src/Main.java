import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<ArrayList<Double>> solutionMatrix = new ArrayList<>();

    public ArrayList<ArrayList<Double>> naiveMatrix(ArrayList<ArrayList<Double>> matrix1, ArrayList<ArrayList<Double>> matrix2){
        int dim1 = matrix1.size();
        int dim2 = matrix2.size();

        for (int i = 0; i < dim1; i++){
            ArrayList<Double> tempSolution = new ArrayList<>();
            for (int j = 0; j < dim1; j++){
                double temp = 0;
                for (int element = 0; element < dim2; element++){
                    temp += ((matrix1.get(i).get(element)) * (matrix2.get(element).get(j)));

                }
                tempSolution.add(temp);
            }
            solutionMatrix.add(tempSolution);
        }
        return solutionMatrix;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of each matrix (n): ");
        int n = scanner.nextInt();

        ArrayList<ArrayList<Double>> matrix1 = new ArrayList<>();
        ArrayList<ArrayList<Double>> matrix2 = new ArrayList<>();

        System.out.println("Enter the first matrix:");
        for (int i = 0; i < n; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextDouble());
            }
            matrix1.add(row);
        }

        System.out.println("Enter the second matrix:");
        for (int i = 0; i < n; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextDouble());
            }
            matrix2.add(row);
        }

        Main m = new Main();

        System.out.println("Solution: " + m.naiveMatrix(matrix1, matrix2));
    }
}