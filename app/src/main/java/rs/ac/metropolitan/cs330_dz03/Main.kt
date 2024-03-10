package rs.ac.metropolitan.cs330_dz03

import kotlin.random.Random

fun main(){
    val prisustvo= Prisustvo()

    for (i in 1..15){
    println("\nOdsutni u nastavnoj nedelji $i:\n")
        for((key,value) in prisustvo.prisustvo){
            val rand= Random.nextInt(0,2)
            if(rand==0){
                println("${key.indeks} ${key.ime} ${key.prezime} ")
            }
            else{
               prisustvo.prisustvo[key] = (value ?: 0) + 1

            }
        }

    }

}