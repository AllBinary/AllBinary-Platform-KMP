
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.ai.sequence




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.ai.ArtificialIntelligenceTransitionInterface
import org.allbinary.game.ai.ArrayAI
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class SequenceAI : ArrayAI {
        
companion object {
            
    private val SEQUENCE_AI: String = "Sequence AI"

        }
            
    private var index: Int= 0
public constructor (artificialIntelligenceInterfaceArray: Array<ArtificialIntelligenceInterface?>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(artificialIntelligenceInterfaceArray, ownerLayerInterface, gameInput){
var artificialIntelligenceInterfaceArray = artificialIntelligenceInterfaceArray
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager
this.getArtificialIntelligenceInterface()[index]!!.processAI(allBinaryLayerManager)
}


    open fun next()
        //nullable = true from not(false or (false and true)) = true
{
this.index++

    var artificialIntelligenceInterface: ArtificialIntelligenceInterface = this.getSelectedArtificialIntelligenceInterface()!!


    
                        if(artificialIntelligenceInterface!!.getId() == ArtificialIntelligenceTransitionInterface.ID)
                        
                                    {
                                    
    var artificialIntelligenceTransitionInterface: ArtificialIntelligenceTransitionInterface = (artificialIntelligenceInterface as ArtificialIntelligenceTransitionInterface)

artificialIntelligenceTransitionInterface!!.transition()

                                    }
                                
}


    open fun getIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index
}


    open fun setIndex(index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var index = index
this.index= index
}


    open fun getSelectedArtificialIntelligenceInterface()
        //nullable = true from not(false or (false and true)) = true
: ArtificialIntelligenceInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getArtificialIntelligenceInterface()[this.index]!!
}


    override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SEQUENCE_AI
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())
stringBuffer!!.append(" Selected AI: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.getSelectedArtificialIntelligenceInterface()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

