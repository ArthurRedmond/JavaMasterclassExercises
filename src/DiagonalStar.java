public class DiagonalStar {

    public static void printSquareStar(int number) {
        int rowCount = number;
        int currentRow = 0;
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            while (currentRow < rowCount) {
                for (int i = 0; i < rowCount; i++) {
                    if (currentRow == 0 || currentRow == rowCount - 1) {
                        System.out.print("*");
                    } else if (currentRow > 0 && currentRow < rowCount) {
                        if (i == 0 || i == rowCount - 1) {
                            System.out.print("*");
                        } else if (i == currentRow) {
                            System.out.print("*");
                        } else if (i == (rowCount - (currentRow + 1))) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
                currentRow++;
            }
        }
    }
}
