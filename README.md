## 1.1 Latar Belakang

Latar belakang dari proyek ini adalah memberikan wadah bagi saya untuk mengaplikasikan pengetahuan dan keterampilan yang telah saya kembangkan selama proses pembelajaran. Selama pengembangan game ini, saya telah memperoleh beragam pengalaman, seperti merancang konsep game, merancang antarmuka web, dan mengimplementasikan kode dalam bahasa pemrograman untuk menciptakan berbagai fitur dalam game. Dalam konteks saat ini, perkembangan teknologi dan pendidikan tidak dapat dipisahkan. Sebagai seorang mahasiswa, saya ingin berpartisipasi dalam upaya mengimplementasikan pelajaran yang sudahh saya pelajari atau membuat sebuah permainaan yang dapat bermanfaat dalam menggabungkan dunia pendidikan dan teknologi dalam proses pembelajaran anak-anak. Hal ini dikarenakan dalam zaman sekarang, pendidikan telah menjadi sangat canggih, dan sudah banyak permainan yang menggabungkan unsur pembelajaran, seperti permainan maze (labirin).

Labirin adalah permainan yang umumnya berupa jaringan jalan yang rumit dan berliku-liku. Biasanya, labirin dibuat untuk tujuan hiburan, dan merupakan teka-teki dengan banyak jalan buntu. Tujuan dari permainan ini adalah bagi pemain untuk menemukan 4 koin dan menemukan kunci untuk pintu jalan keluarr, dengan catatan diberi waktu 2menit untuk menyelesaikan misi tersebut dan harus melewati rintangan.

Selain sebagai sarana game hiburan, game juga dapat memiliki unsur pendidikan, yang sering disebut sebagai game edukasi. Game edukasi memiliki potensi besar untuk meningkatkan motivasi dalam proses pembelajaran. Game edukasi berusaha untuk mengembangkan seluruh aspek perkembangan anak, termasuk aspek kognitif, afektif, dan psikomotorik. Dalam hal game edukasi dengan konsep labirin, diharapkan mampu melatih motorik halus, membangun kemampuan pemecahan masalah, meningkatkan koordinasi mata dan tangan, serta melatih kesabaran anak.



## 1.2. Deksripsi Teknologi Informasi
daway adalah orang yang selalu menyukai tantangan. dia selalu menyelesaikan labirin sampai bisaa finish, tetapi sebelum sampai finish. tetapi dalam game maze disini daway harus melewati rintangan dulu yaitu mengambil 4 koint lalu mengambil sebuah kunci untuk keluar dari labirin, tetapi nanti ada virus yang akan menghalangi ketika mengambil kunci  ataupun koin, dan daway haruss sampai kepintu keluar sebelum 2 menit.tetapi ketika waktu habis 2 menit akan diulangi dari awal. game maze ini yaitu game yang menyelesaikan/mengatasi rintangan rintangan dalam permaianan maze. user harus menyelasaikan rintangan, yaitu pertama tama bisa terlebih dahulu mengumpulkan 3 koint meskipun ada rintangan yang menghalangi ketika mengambil koin satu persatu, ketika koint terkumpul 4 koin, baru bisa mengambil kunci pintu keluar lalu langsung mencari pintu keluar.

## 3 Branding
### A. Nama/Merk Game :
Maze game mencari kunci
### B. Deskripsi Target User :
- Usia 8 tahun ke atas
- seseorang yang ingin main game sambil belajar
### C. Genre :
- Edukasi


## 4. User Story

sebagai | Saya Ingin Bisa | Sehingga | Prioritas
---|---|---|---
Player|  akan jalan jalan untuk mencari jalan | bisa mencari kunci dan pintu keluar  | ⭐⭐⭐⭐⭐
Player|  mengumpulkan koint | bisa mendapatkan kunci/keluar dari pintu keluar  | ⭐⭐⭐⭐⭐
Player|  melewati virus | bisa mendapatkan kunci  | ⭐⭐⭐⭐⭐
player|  mengambil kunci | memenangkan permainan | ⭐⭐⭐⭐⭐
player|   memeprhatikan waktu | waktu abis, permainan akan game over | ⭐⭐⭐⭐⭐

## 5. Struktur Data 
<img width="310" alt="struktur" src="https://github.com/nazwaym/UAS/assets/145254945/011b4b7d-0cfb-4697-ac40-32bf51de4d9a">

## 6. Desain ser Interface
<img width="337" alt="ss" src="https://github.com/nazwaym/UAS/assets/145254945/5c206cb0-f0bd-475f-b620-2eb7a99d49c0">
<img width="290" alt="22" src="https://github.com/nazwaym/UAS/assets/145254945/c8b46d5b-63b4-4aa7-8589-58d21a9bd7d3">
<img width="494" alt="33" src="https://github.com/nazwaym/UAS/assets/145254945/27769269-fa64-4e58-ab22-082d2317bd68">
<img width="182" alt="Screenshot 2023-12-28 143110" src="https://github.com/nazwaym/UAS/assets/145254945/74ae2cbd-f4ef-4cf3-9f0e-c4a750138494">


## 7. Flowchart dari Algoritma

![flochart maze drawio](https://github.com/nazwaym/pdp_jobinterview.md/assets/145254945/fefa0be9-e132-4793-8920-d883bf94e9b2)

## 8. Link demo game di youtobe
Dalam proses

## 9. Game menerapkan prinsip prisnip dasar pemrograman 
 - Variable
   - Data Type
   - Operator
   - Boolean
   - Conditions: if / else / switch
   - Looping: while / for
   - Array
   - Method
   - Class

## 8. Link folder kode pemrogramn
https://github.com/nazwaym/UAS/blob/main/MazeGame.java

## 9. screenrecording
https://drive.google.com/drive/folders/1VFxVG5kFP28jGWK3jOwSB8Bwlzucobtr




# 2. Bagaimana konsep variable, data type dan operator pada bahasa pemrograman digunakan dalam pembuatan game ini ?
## **A)class mazegame**
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
**Variabel dan Tipe data:** 
maze: Mewakili peta labirin sebagai array dua dimensi dengan tipe data char[][].
scanner: Objek Scanner digunakan untuk menerima input dari pengguna dengan tipe data Scanner.
game: Objek Game digunakan untuk memulai dan mengendalikan permainan.

## **B) class map**
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

**Variabel dan Tipe data:** 
maze: Mewakili peta labirin sebagai array dua dimensi dengan tipe data char[][].
**Metode dan Konsep:**
printMap(): Mencetak peta labirin ke konsol.
getCell(Tipe data : int row, int col): Mengembalikan karakter pada posisi tertentu di peta.
setCell(Tipe data : int row, int col, char value): Menetapkan nilai karakter pada posisi tertentu di peta.
getRows(): Mengembalikan jumlah baris dalam peta.
getCols(): Mengembalikan jumlah kolom dalam peta.
isValidMove(Tipe data : int row, int col): Memeriksa apakah langkah yang diambil pemain adalah langkah yang valid.

**##C) Class Player**
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

**Variabel dan Tipe data:** 
row, col: Menyimpan posisi pemain dalam peta.
coinsCollected: Menyimpan jumlah koin yang dikumpulkan.
hasKey: Menyimpan informasi apakah pemain memiliki kunci atau tidak dengan tipe data boolean.
**Metode dan Konsep:**
getRow(), getCol(), getCoinsCollected(), hasKey(): Metode-metode getter untuk mendapatkan informasi tentang pemain.
collectCoin(): Menambahkan jumlah koin yang dikumpulkan.
setHasKey(): Menandai bahwa pemain memiliki kunci.

**##d) class game:**

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

**Variabel dan Tipe data:** 
map: Objek dari class Map yang merepresentasikan peta labirin.
player: Objek dari class Player yang merepresentasikan pemain.
scanner: Objek Scanner untuk menerima input dari pengguna.

**Metode dan Konsep:**

startGame(): Memulai permainan dengan perulangan while(true) untuk menampilkan peta, menerima input, dan meng-handle pergerakan pemain.
handleMove(char move): Mengubah posisi pemain berdasarkan input arah.
handleCell(char cell): Menangani sel di lokasi pemain dan menjalankan aksi sesuai dengan jenis sel tersebut.


**Konsep Operator:**
Pada Umumnya:

Operator = untuk assignment, misalnya: this.maze = maze;.
Operator == untuk perbandingan, misalnya: getCell(row, col) == '#';.
Operator && untuk logika AND, misalnya: row >= 0 && row < getRows() && col >= 0 && col < getCols() && getCell(row, col) != '#';.
Pada Class Game:Operator switch digunakan untuk memilih aksi berdasarkan input pengguna.


# 3. Bagaimana konsep boolean dan conditions pada bahasa pemrograman digunakan dalam pembuatan game ini ?
Konsep boolean dan kondisi digunakan dalam game Maze saya ini untuk mengatur alur permainan , dan membuat keputusan berdasarkan kondisi tertentu. Berikut adalah beberapa contoh penggunaan konsep tersebut dalam kode:

*Variabel Boolean:

Variabel hasKey bertipe boolean. Digunakan untuk menyimpan status apakah pemain sudah memiliki kunci atau belum (true jika sudah, false jika belum).
Pernyataan Kondisional:

*Pernyataan kondisional if, else if, dan else digunakan untuk menentukan tindakan yang akan diambil berdasarkan isi sel pada peta (cell).
Contoh: Jika sel adalah 'O', maka pemain mengambil koin. Jika sel adalah 'V', pemain kalah karena menginjak virus. Jika sel adalah 'K', pemain mengambil kunci. Jika sel adalah 'E', permainan selesai berdasarkan kondisi apakah pemain memiliki kunci atau tidak.
Operator Kondisional:

*Operator kondisional (==) digunakan untuk memeriksa apakah nilai suatu variabel sama dengan suatu nilai tertentu.
Operator kondisional (&&) digunakan untuk menggabungkan beberapa kondisi. Contoh: Pintu keluar hanya dapat dibuka jika pemain memiliki kunci (hasKey).
Looping:

*Loop while (true) digunakan sebagai loop utama permainan yang terus berjalan hingga pemain menang atau kalah.
Fungsi (isValidMove):

*Fungsi ini menggunakan kondisi boolean (return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] != '#') untuk memeriksa apakah gerakan pemain valid.

# 4. Bagaimana konsep looping dan array pada bahasa pemrograman digunakan dalam pembuatan game ini ?
Konsep looping digunakan dalam game ini dengan menggunakan loop while (true). Loop ini berfungsi untuk menjalankan permainan secara terus-menerus sampai pemain menang atau kalah. Selama loop berjalan, pemain dapat terus berinteraksi dengan permainan dan membuat gerakan di dalam labirin.

Konsep array digunakan untuk menyimpan struktur peta labirin. Variabel maze adalah array dua dimensi yang merepresentasikan setiap sel dalam labirin. Setiap karakter di dalam array mewakili elemen tertentu dalam permainan, seperti pemain ('M'), dinding ('#'), koin ('O'), virus ('V'), kunci ('K'), dan pintu keluar ('E'). Peta labirin ini memudahkan penyimpanan dan pengaturan elemen-elemen dalam permainan.

Selain itu, loop dan array bekerja bersama untuk mengatur alur permainan. Loop digunakan untuk menampilkan peta labirin, menerima input dari pengguna, dan mengupdate posisi pemain berdasarkan input tersebut. Array digunakan untuk merepresentasikan dan memanipulasi struktur labirin serta menyimpan informasi seperti posisi pemain, koin yang dikumpulkan, dan status kunci.

# 5. Bagaimana konsep method pada bahasa pemrograman digunakan dalam pembuatan game ini ?
Dalam game ini, method digunakan untuk membuat blok-blok kode dengan tujuan tertentu. Method `printMaze` digunakan untuk menampilkan peta labirin ke layar, dan method `isValidMove` digunakan untuk memeriksa apakah gerakan pemain valid. Penggunaan method membantu menjaga agar kode terlihat lebih bersih dan terorganisir.
Contohnya, ketika permainan berjalan, method `printMaze` dipanggil untuk menampilkan peta labirin sehingga pemain dapat melihat posisi dan kondisi saat ini. Method ini menggunakan perulangan untuk menampilkan setiap karakter dalam array `maze` sehingga tampilan peta lebih mudah dipahami.
Selanjutnya, method `isValidMove` berperan dalam memeriksa apakah gerakan yang diinginkan oleh pemain valid atau tidak. Method ini menerima parameter berupa posisi baris dan kolom yang diinginkan oleh pemain, dan kemudian melakukan pengecekan apakah posisi tersebut berada dalam batas peta dan tidak mengenai dinding ('#'). Penggunaan method ini membantu menjaga agar logika validasi gerakan pemain terpisah dan mudah dimengerti.

# 6. Bagaimana konsep class pada bahasa pemrograman digunakan dalam pembuatan game ini ?
dalam game ini saya menggunakan 1 class yaitu mazegame, dimana didalamnnya ada atribut : map ( map), posisi pemain dan jumlah koin game 
serta method method untuk menginisialisaisi, pengaturan peta, pergerakan pemain, pengecekan kunci sudah diambil atau belum, pengambilan coin.

# 7. Jelaskan algoritma buatan sendiri yang digunakan pada pembuatan game ini !
perama setellah pemain masuk dalam game maze user akan bisa memilih hero terlebuh dahulu lalu (opsional) jika sudah memeilih hero, user bisa melanjutkan ke level game, lalu pada saat memilih level ,  akan ada sistem selamat datang dan diberitahukan waktu game penyelesaian, lalu setelah itu  game akan dimulai. pertama tama user bisa mengambil terlebih dahulu koin koin yang ada digame tetapi dengan catatan harus berhati hati dikarenakan setiap kita mengambil koin pemain akan di halangi dengan virus yang bisa mematikan pemain. lalu setelah itu pemain jga harus mengambil kunci terlebih dahulu seblum keluar ke pintu keluar, karena jika tida menga,bil pintu keluar pemain tida bisa keluar dari labirin/game over.(dalam permainan itu juga pemain harus memperhatikan waktu permainan).
