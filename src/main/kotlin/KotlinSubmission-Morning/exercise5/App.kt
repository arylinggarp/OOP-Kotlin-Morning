package id.infinitelearning.KotlinSubmission.exercise5

/**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
class Hero(val nama: String, val senjata: String) {
    // Jika diperlukan, Anda dapat menambahkan propertis atau metode lainnya di sini
}

fun main() {
    //instans dari class Hero (isi nilai variable tersebut dengan class Hero)
    val hero = Hero("Ali Bin Abi Thali", "Pedang Zulfikar")

    //cetak informasi hero
    println("Hero: ${hero.nama}, Power: ${hero.senjata}")
}





    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
fun setProfile(name: String, age: Int, height: Double)
    //untuk mengatur data profil sesuai kebutuhan
    println("Name: $name")
    println("Age: $age years old")
    println("Height: $height cm")
}

fun main() {
    //call setProfile function dengan nilai (data diri)
    setProfile("Ary Linggar Palupi", 21, 153.0)
}





    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
//menampilkan data profil
    fun stateProfile(name: String, members: Int, mentors: Int) {
        println("Name: $name")
        println("Member: $members mentee")
        println("Mentor: $mentors mentor")
    }

//fungsi untuk aktivitas-aktivitas
fun walk(steps: Int) {
    println("Jalan $steps kali")
}
fun run(jalan: Int) {
    println("Lari $jalan kali")
}
fun eat(meals: Int) {
    println("Makan $meals kali")
}
fun drink(glasses: Int) {
    println("Minum $glasses kali")
}
fun jump(times: Int) {
    println("Lompat $times kali")
}
fun sit(times: Int) {
    println("Duduk $times kali")
}



    /**
    Challenge:
    ===============Class A Morning===============
    Uprising Moon Inteligent -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Codenesia -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Massive Bareng -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    POSESIVE -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Shelter Nerd -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Fantastic Ten -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    TitansTech -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    Masapuan -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    CollaboraCrew -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    CodeSmiths -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    Webdroid -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    Dasa Impi ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
    LogicLiberators -> jalan 2x, lari 1x, makan 5x, minum 2x, lompat 3x, duduk 1x
    Fifty-One -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

    ===============Class B Morning===============
    Infinine -> jalan 2x, lari 4x, makan 3x, minum 2x, lompat 1x, duduk 2x
    Akatsuki -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x
    Lumos -> jalan 2x, lari 1x, makan 5x, minum 2x, lompat 3x, duduk 1x
    Big Bang & Dinosaur -> jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
    Baldwin -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    Sychronize -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    WIB (Waktu Indonesia Bahagia) -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    Eternal Light -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    Lizzy Team -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    Best of stars -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    Project Nusantara -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Orion -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Freiwilliger -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
fun main(){
    //memanggil aktivitas sesuai dengan challenge
    walk(1)
    run(3)
    eat(1)
    drink(1)
    jump(2)
    sit(1)


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    stateProfile("Lizzy", 13, 2)

}