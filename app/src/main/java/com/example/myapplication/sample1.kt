package com.example.myapplication

 fun main(){
helloWorld()

     println(add(a=4,b=5))
     //3. String Template
     val name = "Minju"
     val lastName = "Sung"
     println("My name is ${name+lastName}")
     println("This is 2$")
 }
//1.함수
fun helloWorld() {
    println("Hello World")
}
//함수명 보다 변수 이름 먼저, 함수명 앞글자 대문자로
fun add(a:Int,b:Int):Int{
    return a+b
}
//2. val vs var
//Val = value
fun hi(){
    val a : Int = 10
    var b : Int = 9

    var e : String
    b=200
    val c = 100
    var d = 100 // 둘 다 int 안써도 됨

    var name= "min ju" // String 생략

}
