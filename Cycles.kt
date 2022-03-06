fun main() {
   cycles()
}


fun cycles(){
    
    val arrayFruits = listOf("Яблоко", "Апельсин", "Груша")
    
    //for(index in 0..(arrayFruits.size - 1)){ //Так работает, но лучше писать:
    for(index in 0 until arrayFruits.size){
        println(arrayFruits[index])
    }
    println()
    
    for(index in arrayFruits){
        
        println(index)
    }
    println()
    
    
    for((index, item) in arrayFruits.withIndex()){
        println("Index: ${index}, Item: ${item} ")
    }
    println()
    
    for(index in 10 downTo 4 step 2){
        println("Index: ${index} with step 2")
    }
    println()
    
    arrayFruits.forEach{
        println("It is $it")
    }
    
}