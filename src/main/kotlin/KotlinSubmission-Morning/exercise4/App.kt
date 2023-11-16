package id.infinitelearning.KotlinSubmission.exercise4
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

fun main() {
    val input = "satu"

    try {
        //try to konversi string ke angka
        // "123" menjadi 123 (input)
        val Konversi = input.toInt()
        println("Angka yang dihasilkan: $Konversi")
    } catch (e: NumberFormatException) {
        //try to cath kesalahan jika string tidak dapat diubah menjadi angka
        println("Error: Tidak dapat mengonversi string ke angka.")
    } catch (e: Exception) {
        //untuk mengatasi kesalahan umum
        println("Terjadi kesalahan: ${e.message}")
    }
}

