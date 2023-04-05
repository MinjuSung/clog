package com.example.myapplication

//1.lambda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수이다.
//1) 메소드의 파라미터로 넘겨줄 수 가 있다. fun maxBy(a:Int)
//2) return 값으로 사용할 수가 있다.

//람다의 기본 정의
//val lambdaName: Type ={argumentList->codeBody}

val square : (Int)->(Int)={number->number*number} // val square = {number:Int->number*number}
val nameAge ={name:String,age:Int->
    "My name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("minju",24))
    val a="minju said"
    val b="doyoung said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("doyoung",28))
    println(calculateGrade(97))

    val lambda={number:Double->
        number==4.3213
    }
    println(invokeLambda(lambda))
    println(invokeLambda({it>3.22}))
}

//확장함수
val pizzaIsGreat : String.()->String={
    this + " Pizza is the best!"
}

fun extendString(name:String, age:Int):String{
    val introduceMyself :String.(Int)->String={"I am ${name} and ${it}years old"}
    return name.introduceMyself(age)
}

//람다의 return
val calculateGrade:(Int)->String={
    when(it){
        in 0..40 ->"fail"
        in 41..70->"pass"
        in 71..100->"perfect"
        else ->"Error" // 이때 else 꼭 정의 해줘야함
    }
}
 //람다를 표헌하는 여러가지 방식
fun invokeLambda(lambda:(Double)->Boolean): Boolean{
    return lambda(5.2343)
}
