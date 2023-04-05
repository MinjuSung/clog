package com.example.myapplication

fun main(){
    checkNum(1)
    forAndWhile()
    nullchkeck()

}
//4.조건식 if, when
fun maxBy(a:Int,b:Int): Int {
    if(a>b){
        return a
    }else{
        return b
    }
}
fun maxBy2(a: Int, b: Int)= if(a>b) a else b

fun checkNum(score : Int){
    when(score) {
        0 -> println("This is 0")
        1 -> println("This is 1")
        2, 3 -> println("This is 2 0r 3")
        else -> println("I don't know") //안써도 됨
    }
    var b : Int = when(score){
        1->1
        2->2
        else -> 3 // 이때는  써줘야 함
    }
    println("b : ${b}")
    when(score){
        in 90..100-> println("You are genius")
        in 10..80->println("Not bad")
        else ->println("okay")
    }
}
// Expression vs Statement
// 값을 만들면 expression , 뚱땅뚱땅해서값을 반환하면 expression
// 코틀린의 모든 함수는 expression으로 사용됨
//자바 void 는 Statement , 명령을 지시하는 문장 같은 것은 Statement
//if 자바에서는 Statement , 코틀린에서는 expression 으로도 사용 가능

//5. Array and List
//Array는 기본적으로 정해져있는 사이즈가 있음. 할당이 되서 나오기 때문에 처음에 크기 지정해줘야함
//List (1. List:수정불가능 2. MutableList:수정가능)

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2=arrayOf(1,"d",3.4f)
    val list2=listOf(1,"d",11L)

    val arrayList= arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}
//6.반복문 for / while
fun forAndWhile(){
    val students= arrayListOf("minju","yuna","doyoung","jungwoo")
    for (name in students){
        println("${name}")
    }

    for ((index,name)in students.withIndex()){ //.withIndex ; 인덱스와 이름 함께 사용 할 수 있음
            println("${index+1}번째 학생: ${name}")
    }

    var sum:Int=0
    for (i in 1..10 step 2 ){ //step2 ; 1+3+5+ 이렇게 , i in 10 down to 1 ; 10부터 1까지 , 1 until 100 ; 1부터 99 ,100 포함 안함
    sum+=i // sum=sum+1
    }
    println(sum)
    var index=0
    while(index<10){
        println("current index : ${index}")
        index++
    }
}
//7. NonNull and Nullable
fun nullchkeck(){
    //NPE : Null Pointer Exception
    //?
    var name : String = "minju" // NonNull;null 이면 안되는 타입 , 타입 생략 가넝한
    var nullName : String?=null //?를 붙이면 Nullable 타입이 됨 , 타입 생략 하면 안됨
    var nameInUpperCase= name.toUpperCase() //NonNull
    var nullNameUpperCase=nullName?.toUpperCase() // null 이면 null을 반환하고 null이 아니면 실행


    val lastName : String?= null //"Sung" 쓰면 민주성으로 출력
    val fullName = name + " "+ (lastName?:"NO lastName")
    println(fullName)

}
    //!! ; null 이 아닌걸 보증
fun ignoreNulls(str:String?){ //null 타입
    val mNotNull : String=str!! //절대로 null 일리 없으니까 null 이 아니라고 생각해라
        val upper=mNotNull.toUpperCase() //윗 줄에서 null이 아님을 확신시켜줬기 때문에 ? 안써도 됨

        val email:String? = "minjusung@naver.com"
        email?.let{
                println("my email is ${email}")
        }
}
