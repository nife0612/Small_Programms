fun main(){
    arrays()
    
    lists()
    
}

fun arrays(){
    val number = 5
    println(number)
    
    val numbers = arrayOf(4,6,2,1,34,35,58,2)
    println(numbers)
    
    val numbers2 : Array<Int> = arrayOf(3,4,5,3)
    
    
    // Нельза перезаписать, но можно считывать (Лучше не использовать)  
    val  onlyRead = arrayOf(3, "kdhsf", true, 'd')
    
   	val numbers3 : IntArray = intArrayOf(3, 3, 54, 6)
   	val array = IntArray(7)
    
 
    println((numbers.sortedArray()).contentToString())
}

fun lists(){
    
    val numbers = listOf(4, 0, 3, 2, 5, 1)
    // numbers[2] = 2 // Только для чтения, нельзя перезаписывать
    println(numbers[3])
    
    
    val numbersAL = arrayListOf(4, 0, 3, 22, 5, 1)
    numbersAL[4] = 2 // Можно изменять, в отличии от List
    numbersAL.add(22)
    
    println(numbersAL[numbersAL.size - 1])    
}