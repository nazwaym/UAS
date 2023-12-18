import java.util.Scanner;

public class MazeGame {
    //deklarasi properti yang informasi permainan seperti ukuran map,posisi, pemain, coin, kunci.
    public static void main(String[] args) {
        // Inisialisasi peta labirin
        char[][] maze = {
                { 'M', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
                { '#', ' ', '#', ' ', ' ', 'O', '#', ' ', 'O', ' ', '#' },
                { '#', ' ', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#' },
                { '#', ' ', ' ', ' ', '#', ' ', 'V', ' ', ' ', '#', '#' },
                { '#', '#', '#', ' ', '#', ' ', '#', ' ', '#', ' ', '#' },
                { '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
                { '#', 'O', '#', '#', ' ', ' ', '#', '#', 'K', ' ', '#' },
                { '#', ' ', ' ', ' ', 'V', ' ', ' ', '#', 'V', ' ', '#' },
                { '#', ' ', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#' },
                { '#', ' ', '#', '#', '#', ' ', '#', ' ', ' ', ' ', '#' },
                { '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', 'E' }
        };

        // Inisialisasi posisi awal pemain dan status kunci
        int playerRow = 0;
        int playerCol = 0;
        int coinsCollected = 0; // Menambah variabel untuk menghitung koin yang dikumpulkan
        boolean hasKey = false;

        // Inisialisasi objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Loop utama permainan
        while (true) {
            // Menampilkan peta labirin
            printMaze(maze);

            // Menampilkan pesan dan menerima input arah dari pengguna
            System.out.println("Coins collected: " + coinsCollected);
            System.out.print("Pilih arah (W/A/S/D): ");
            char move = scanner.next().charAt(0);

            // Mengubah posisi pemain berdasarkan input
            switch (move) {
                case 'W':
                    if (isValidMove(maze, playerRow - 1, playerCol)) {
                        maze[playerRow][playerCol] = ' '; // Menghapus pemain dari posisi sebelumnya
                        playerRow--;
                    }
                    break;
                case 'A':
                    if (isValidMove(maze, playerRow, playerCol - 1)) {
                        maze[playerRow][playerCol] = ' '; // Menghapus pemain dari posisi sebelumnya
                        playerCol--;
                    }
                    break;
                case 'S':
                    if (isValidMove(maze, playerRow + 1, playerCol)) {
                        maze[playerRow][playerCol] = ' '; // Menghapus pemaindD dari posisi sebelumnya
                        playerRow++;
                    }
                    break;
                case 'D':
                    if (isValidMove(maze, playerRow, playerCol + 1)) {
                        maze[playerRow][playerCol] = ' '; // Menghapus pemain dari posisi sebelumnya
                        playerCol++;
                    }
                    break;
            }

            // Memeriksa sel di4tgg lokasi pemain dan melakukan tindakan sesuai dengan isi sel
            char cell = maze[playerRow][playerCol];
            if (cell == 'O') {
                System.out.println("Anda mengambil sebuah koin!");
                maze[playerRow][playerCol] = ' '; // Hapus koin setelah diambil
                coinsCollected++;
            } else if (cell == 'V') {
                System.out.println("Anda menginjak virus! Game Over!");
                break;
            } else if (cell == 'K') {
                System.out.println("Anda mengambil kunci!");
                maze[playerRow][playerCol] = ' ';
                hasKey = true;
            } else if (cell == 'E') {
                if (hasKey) {
                    System.out.println("Selamat! Anda berhasil membuka pintu keluar!");
                } else {
                    System.out.println("Anda belum memiliki kunci. Anda tidak bisa keluar!");
                }
                break;
            }

            // Menempatkan pemain di lokasi baru
            maze[playerRow][playerCol] = 'M';
        }

        // Menutup objek Scanner setelah selesai menggunakan
        scanner.close();
    }

   // Method untuk menampilkan peta labirin
    private static void printMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Metode untuk memeriksa apakah gerakan pemain valid
    // Method untuk memeriksa apakah gerakan pemain valid
    private static boolean isValidMove(char[][] maze, int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] != '#';
    }
}
