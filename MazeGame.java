import java.util.Scanner;

public class MazeGame {
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

        // Inisialisasi objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Game dan memulai permainan
        Game game = new Game(maze, scanner);
        game.startGame();

        // Menutup objek Scanner setelah selesai menggunakan
        scanner.close();
    }
}

class Map {
    private char[][] maze;

    public Map(char[][] maze) {
        this.maze = maze;
    }

    public void printMap() {
        for (char[] row : maze) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public char getCell(int row, int col) {
        return maze[row][col];
    }

    public void setCell(int row, int col, char value) {
        maze[row][col] = value;
    }

    public int getRows() {
        return maze.length;
    }

    public int getCols() {
        return maze[0].length;
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < getRows() && col >= 0 && col < getCols() && getCell(row, col) != '#';
    }
}

class Player {
    private int row;
    private int col;
    private int coinsCollected;
    private boolean hasKey;

    public Player(int row, int col) {
        this.row = row;
        this.col = col;
        this.coinsCollected = 0;
        this.hasKey = false;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getCoinsCollected() {
        return coinsCollected;
    }

    public boolean hasKey() {
        return hasKey;
    }

    public void collectCoin() {
        coinsCollected++;
    }

    public void setHasKey() {
        hasKey = true;
    }
}

class Game {
    private Map map;
    private Player player;
    private Scanner scanner;

    public Game(char[][] maze, Scanner scanner) {
        this.map = new Map(maze);
        this.player = new Player(0, 0);
        this.scanner = scanner;
    }

    public void startGame() {
        while (true) {
            // Menampilkan peta labirin
            map.printMap();

            // Menampilkan pesan dan menerima input arah dari pengguna
            System.out.println("Koin yang dikumpulkan: " + player.getCoinsCollected());
            System.out.print("Pilih arah (W/A/S/D): ");
            char move = scanner.next().charAt(0);

            // Mengubah posisi pemain berdasarkan input
            handleMove(move);

            // Memeriksa sel di lokasi pemain dan melakukan tindakan sesuai dengan isi sel
            char cell = map.getCell(player.getRow(), player.getCol());
            handleCell(cell);

            // Menempatkan pemain di lokasi baru
            map.setCell(player.getRow(), player.getCol(), 'M');
        }
    }

    private void handleMove(char move) {
        int newRow = player.getRow();
        int newCol = player.getCol();

        switch (move) {
            case 'W':
                newRow--;
                break;
            case 'A':
                newCol--;
                break;
            case 'S':
                newRow++;
                break;
            case 'D':
                newCol++;
                break;
        }

        if (map.isValidMove(newRow, newCol)) {
            map.setCell(player.getRow(), player.getCol(), ' '); // Menghapus pemain dari posisi sebelumnya
            player = new Player(newRow, newCol);
        }
    }

    private void handleCell(char cell) {
        if (cell == 'O') {
            System.out.println("Anda mengambil sebuah koin!");
            player.collectCoin(); // Menambahkan coinsCollected
            map.setCell(player.getRow(), player.getCol(), ' '); // Menghapus koin setelah diambil
        } else if (cell == 'V') {
            System.out.println("Anda menginjak virus! Game Over!");
            System.exit(0);
        } else if (cell == 'K') {
            System.out.println("Anda berhasil mengambil kunci, silakan cari jalan keluar!");
            map.setCell(player.getRow(), player.getCol(), ' ');
            player.setHasKey();
        } else if (cell == 'E') {
            if (player.hasKey()) {
                System.out.println("Selamat! Anda berhasil membuka pintu keluar!");
                map.setCell(player.getRow(), player.getCol(), ' '); // Menghapus pemain setelah keluar
            } else {
                System.out.println("Anda belum memiliki kunci. Anda tidak bisa keluar!");
            }
            System.exit(0);
        }
    }
}
