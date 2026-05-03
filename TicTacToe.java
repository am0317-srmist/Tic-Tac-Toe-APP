public class TicTacToe {

    // Convert slot (1–9) → row & column (0–2)
    public static int[] convertToIndex(int slot) {
        int row = (slot - 1) / 3;   // integer division
        int col = (slot - 1) % 3;   // remainder

        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int slot = 5; // example input

        int[] index = convertToIndex(slot);

        System.out.println("Row: " + index[0]);
        System.out.println("Column: " + index[1]);
    }
}