public class Chessboard {
    public static void main(String[] args) {
        // Создаем двумерный массив 8x8
        int[][] chessboard = new int[8][8];

        // Заполняем массив элементами 0 и 1, как на шахматной доске
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                // Если сумма индексов является четной, присваиваем 0 (белое поле),
                // в противном случае присваиваем 1 (черное поле)
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = 0;
                } else {
                    chessboard[i][j] = 1;
                }
            }
        }

        // Выводим массив на печать
        for (int[] row : chessboard) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}