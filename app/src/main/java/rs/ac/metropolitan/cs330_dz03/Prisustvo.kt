package rs.ac.metropolitan.cs330_dz03

class Prisustvo() {
    val student1= Student(5000,"Atila","Kujundzic")
    val student2= Student(5001,"Pera","Detlic")
    val student3= Student(5002,"Dusko","Dugousko")
    val student4= Student(5003,"Sime","Josip")
    val student5= Student(5004,"Kalamarko","Krakovic")

    var prisustvo:MutableMap<Student,Int?> = mutableMapOf(
    student1 to null,
    student2 to null,
    student3 to null,
    student4 to null,
    student5 to null,

)
}