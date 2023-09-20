package com.example.myapplication

abstract class Person(var AID: Int=0, var N: String="NULL", var Ad: String="NULL", var PH: Int=0, var Prof: String="NULL")
{
    var adharid: Int
    var name: String
    var address: String
    var phone: Int
    var profession: String
    init {
        adharid=AID
        name=N
        address=Ad
        phone=PH
        profession=Prof
    }

    open fun register(UID: String): String {
        return "The Person is Registered: $UID"
    }
    fun perform(duty: String): String
    {
        return "Person $name Performed task: $duty"
    }
    fun include(service: String): String
    {
        return "Service $service included to Person $name"
    }
   fun like(item: String): String
    {
        return "Person : $name likes Item: $item"
    }
}

open class Student(
    adharid1: Int,
    name1: String,
    address1: String,
    phone1: Int=0,
    profession1: String,
    ID: Int=0,
    major: String="NULL",
    year: Int=0,
    semester: Int=0,
    college: String="NULL",
    grade: Double=0.0)
    :Person(adharid1,name1,address1,phone1,profession1)
{
    var sid1: Int
    var major1: String
    var year1: Int
    var semester1: Int
    var college1: String
    var grade1: Double
    init
    {
        println("This is polymorphic class Student")
        college1=college
        sid1=ID
        major1=major
        year1=year
        semester1=semester
        grade1=grade
    }
    override fun register(course: String): String
    {
        return "Course ID: $course is registered for Student: $sid1"
    }
    open fun getgrade(Course: String):Double
    {
        return grade1
    }
    fun attend(Course: String):String
    {
        return "Student $name attended course $Course"
    }
   fun learn():String
    {
        return "Student $name is learning"
    }

}

open class Staff(adharid1: Int,
                 name1: String,
                 address1: String,
                 phone1: Int,
                 profession1: String,
                 emp_id1: String="NULL",
                 emp_role1: String="NULL",
                 emp_dept1: String="NULL",
                 emp_Salary1: Double=0.0,
                 emp_Experience1: Int=0
):Person(adharid1,name1,address1,phone1,profession1)
{
    var empid: String
    var emprole: String
    var empdept: String
    var empsalary: Double = 0.0
    var empexperience: Int = 0
    init
    {
        println("This is polymorphic class Staff")
        empid=emp_id1
        empexperience=emp_Experience1
        empsalary=emp_Salary1
        empdept=emp_dept1
        emprole=emp_role1


    }
   fun attend(Duty: String):String
    {
        return "Employee $empid performed task $Duty"
    }
    fun getPromotion():String
    {
        return "Employee $empid got promoted"
    }
    fun getSalary():Double
    {
        return empsalary
    }
}

class Technician(techType: String="NULL",
                 adharid1: Int,
                 name1: String,
                 address1: String,
                 phone1: Int,
                 profession1: String,
                 emp_id1: String,
                 emp_role1: String,
                 emp_dept1: String,
                 emp_Salary1: Double,
                 emp_Experience1: Int):Staff(adharid1,name1,address1, phone1,profession1,emp_id1,emp_role1,emp_dept1,emp_Salary1,emp_Experience1)
{
    var techType1: String="NULL"
    init
    {
        println("This is concrete class Technician")
        techType1=techType
    }
    fun mantain(lab:String):String
    {
        return "Tech mantained lab $lab"
    }
    fun install(system:String):String
    {
        return "Tech installed system $system"
    }
}

class PGStudent(rollno: String="NULL",
                specialization: String="NULL",
                adharid1: Int,
                name1: String,
                address1: String,
                phone1: Int,
                profession1: String,
                sid1: Int,
                major1: String,
                year1: Int,
                semester1: Int,
                college1: String,
                grade1: Double):Student(adharid1,name1,address1,phone1,profession1,sid1,major1,year1,semester1,college1,grade1)
{
    var rollno1: String
    var specialization1: String

    init
    {
        println("This is concrete class PG_Student")
        rollno1=rollno
        specialization1=specialization
    }
    fun submitthesis()
    {
        println("PG Student submitted thesis on $specialization1")
    }
}

