fun main() {

    // Variabel didalam kotlin
    // Val variabel yang bersifat read-only atau immutable, etelah Anda memberikan nilai Anda tidak dapat mengubah nilainya

    val nama: String = "Zein"
    val umur: Int = 19

    // var adalah variabel yang dapat diubah nilainya setelah deklarasi awal
    var nilai: Int = 80
    nilai = 100
    //Print variabel nilai
    println("Nilai : $nilai")

    //Variabel tanpa tipe data eksplisit
    val pesan = "Ini adalah pesan"  // Kotlin akan mengidentifikasi ini sebagai String
    val angka = 42                  // Kotlin akan mengidentifikasi ini sebagai Int

    // Tipe Data didalam kotlin
    // Ada Int, String, Char, Double, Float, Boolean dll
    val alamat: String = "Bantul"
    val ipk: Double = 4.0
    val mahasiswa: Boolean = true

    // Struktur kontrol
    //Inputkan Usia
    print("Masukkan Usia : ")
    var inputUsia: String? = readLine()
    val usia: Int = inputUsia?.toIntOrNull() ?: 0  // Mengonversi input menjadi Integer

    //Mengecek kriteria umur menggunakan if else
    if (usia >= 18) {
        println("$nama sudah dewasa")
    } else {
        println("$nama masih anak-anak")
    }

    // Contoh For Loop untuk mengulang elemen dalam Array
    val angkaku = arrayOf(1, 2, 3, 4, 5)
    for (item in angkaku) {
        println("Angka ke : $item")
    }

    // While loop digunakan untuk mengulang kode selama kondisi tertentu benar
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    // Fungsi
    val daftarNilai: List<Int> = listOf(90, 67, 78, 77, 88)
    val totalNilai = hitungTotalNilai(daftarNilai) //kita akan memanggil fungsi hitungTotalNilai

    println("Total nilai: $totalNilai")
}
    // ini fungsi nya
    fun hitungTotalNilai(daftarNilai: List<Int>): Int {
        var total = 0
        for (nilai in daftarNilai) {
            total += nilai
        }
        return total
    }
