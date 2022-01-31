fun main(){
	val squareCabin = SquareCabin(4)
    with(squareCabin){
    	print("\nSquareCabin\n=============")
    	print("\nResidents: ${capacity}")
    	print("\nBulding material: ${buildingMaterial}")
    	print("\nHas room? ${hasSpace()}\n")
    }
    
    val roundHut = RoundHut(3)
    with(roundHut){
        print("\nRoundHut\n=============")
    	print("\nResidents: ${capacity}")
    	print("\nBulding material: ${buildingMaterial}")
    	print("\nHas room? ${hasSpace()}\n")
    }
    
    val roundTower = RoundTower(4)
    with(roundTower){
        print("\nRoundTower\n=============")
    	print("\nResidents: ${capacity}")
    	print("\nBulding material: ${buildingMaterial}")
    	print("\nHas room? ${hasSpace()}\n")
    }
}

abstract class Dweling(private var residents : Int){
	abstract val buildingMaterial : String
    abstract val capacity : Int
    	
    fun hasSpace() : Boolean{
        return capacity > residents
    }
}

class SquareCabin(residents : Int) : Dweling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

open class RoundHut(residents : Int) : Dweling(residents){
    override var buildingMaterial = "Straw"
    override var capacity = 4
    
}

class RoundTower(
    residents : Int, 
    val floors : Int = 2) : RoundHut(residents){
    override var buildingMaterial = "Stone"
    override var capacity = 4 * floors
}