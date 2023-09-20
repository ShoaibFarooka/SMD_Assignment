package com.example.q1

open class Cricketer(var name1: String = "NULL", var age1: Int = 0, var nationality1: String = "NULL") {

    var name : String
    var age : Int
    var nationality : String

    init{
        println("This is Cricketer Class")
        name = name1
        age = age1
        nationality = nationality1

    }

    open fun print()
    {
        println("Name: $name")
        println("Age : $age")
        println("Nationality: $nationality")
    }

}


interface Batsman
{
    var score: Int
    var batRanking : Int


    open fun print()
    {
        println("Score: $score")
        println("Bat Ranking: $batRanking")
    }

    open fun getranking() : Int
    {
        return batRanking
    }

}

interface Bowler
{
    var wickets: Int
    var bowlRanking : Int

    open fun print()
    {
        println("Score: $wickets")
        println("Bat Ranking: $bowlRanking")
    }

    open fun getranking() : Int
    {
        return bowlRanking
    }
}

class AllRounder(var n1: String = "NULL", var ag1: Int = 0, var nation1: String = "NULL", var sc1 : Int = 0, var btrank : Int = 0 , var wk1: Int = 0 , var blrank : Int = 0, var rank : Int)
    :Batsman, Bowler, Cricketer(n1, ag1,nation1)
{
    var ranking : Int
    init {
        println("This is All Rounder")
        ranking = rank
    }
    override var score: Int = 0
       get() = sc1
    override var wickets: Int = 0
        get() = wk1
    override var batRanking: Int = 0
        get() = btrank
    override var bowlRanking: Int = 0
        get() = blrank

    override fun getranking(): Int {
        return ranking
    }

    override fun print() {
        println("Name: $name")
        println("Age : $age")
        println("Nationality: $nationality")
        super<Batsman>.print()
        super<Bowler>.print()

    }
}
