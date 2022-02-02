import kotlin.math.PI
import kotlin.math.sqrt



fun main(){
	val squareCabin = SquareCabin(4, 50.0)
    with(squareCabin){
    	print("\nSquareCabin\n=============")
    	print("\nResidents: ${capacity}")
    	print("\nBulding material: ${buildingMaterial}")
    	print("\nHas room? ${hasSpace()}\n")
        println("Floor area: ${floorArea()}")
    }
    
    val roundHut = RoundHut(3, 10.0)
    with(roundHut){
        print("\nRoundHut\n=============")
    	print("\nResidents: ${capacity}")
    	print("\nBulding material: ${buildingMaterial}")
    	print("\nHas room? ${hasSpace()}\n")
        println("Floor area: %.2f".format(floorArea()))
        println("Carpet size: %.2f".format(calculateMaxCarpetSize()))
        println("Has room? ${hasSpace()}")
		getRoom()
		println("Has room? ${hasSpace()}")
		getRoom()
    }
    
    val roundTower = RoundTower(4, 10.0)
    with(roundTower){
        print("\nRoundTower\n=============")
    	print("\nResidents: ${capacity}")
    	print("\nBulding material: ${buildingMaterial}")
    	print("\nHas room? ${hasSpace()}\n")
        println("Floor area: %.2f".format(floorArea()))
        println("Carpet size: %.2f".format(calculateMaxCarpetSize()))
    }
}



abstract class Dweling(private var residents : Int){
	abstract val buildingMaterial : String
    abstract val capacity : Int
    	
    fun hasSpace() : Boolean{
        return capacity > residents
    }
    
    fun getRoom(){
        if(capacity > residents){
            residents++
            println("You got a room.")
        }
       	else
        	println("Sorry, at capacity and no rooms left.")
    }
    
    abstract fun floorArea() : Double
}



class SquareCabin(residents : Int, val lenght : Double) : Dweling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea() : Double{
        return lenght * lenght
    }
}



open class RoundHut(
    residents : Int, 
    val radius : Double) : Dweling(residents){
    
    override var buildingMaterial = "Straw"
    override var capacity = 4
    
    override fun floorArea() : Double{
        return PI * radius * radius
    }
    
    fun calculateMaxCarpetSize() : Double{
        val diameter = radius * 2
        return sqrt(diameter * diameter / 2)
    }
}



class RoundTower(
    residents : Int,
    radius : Double,
    val floors : Int = 2) : RoundHut(residents, radius){
    
    override var buildingMaterial = "Stone"
    override var capacity = 4 * floors
    
    override fun floorArea() : Double{
        return super.floorArea() * floors
    }
}