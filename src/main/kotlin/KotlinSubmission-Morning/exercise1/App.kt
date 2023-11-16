package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    //penentuan variabel dan nilainya
    val NamaAwal: String = "Ary"
    val NamaAkhir: String = "Palupi"
    val usia: Int = 21
    val status: Boolean = true

    //cetak nilai dalam variabel
    println("Nama: $NamaAwal $NamaAkhir")
    println("Usia: $usia tahun")
    println("Status: ${if (status) "Single" else "Tidak Single"}")
}

fun main() {
    //fungsi u/ memanggil myProfile
    myProfile()
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")

    println("Group Members:")
    for (member in groupMember) {
        println("- $member")
    }

    println("Session: $session")

    // Mengembalikan nilai berupa String yang berisi pesan informasi (opsional)
    return "Informasi member grup telah dicetak."
}

fun main() {
    val groupId = "3.13"
    val groupMembers = listOf("Ary", "Liza", "Dika", "Rodhiyana", "Randi", "Izud")
    val session = "Morning"

    val result = groupDetail(groupId, groupMembers, session)

    // Menampilkan hasil kembalian (opsional)
    println(result)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    //buat variable yang berisi list member
    val LizzyMember = listOf("Ary", "Liza", "Dika", "Rodhiyana", "Randi", "Izud")

    //akses item yang berisi nama saya
    val NamaSaya = LizzyMember[0]

    //mencetak nilai kembalian (nama saya saja)
    println("Nama Saya : $NamaSaya")

    //mencetak nilai kembalian (seluruh anggota team)
    return LizzyMember //return listof anggota member
}
fun main(){
    // panggil fungsi myTeam
    val teamMembers = myTeam()
    //cetak daftar anggota grup (mengembalikan nilai variabel LizzyMember)
    println("Daftar Anggota Lizzy: $teamMembers")
}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Peja", "Kak Ilham")
    val countOfGroup = myTeam().size

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(groupId = "3.13", myTeam, session = "Morning")

}