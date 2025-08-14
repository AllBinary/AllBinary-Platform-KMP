
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
        package org.allbinary.game.ai




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.ai.ArtificialIntelligence
import org.allbinary.game.displayable.canvas.CanvasUtil
import org.allbinary.game.input.GameInput
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class BasicAI : ArtificialIntelligence
                , GameKeyEventSourceInterface {
        

        companion object {
            
    val AI_VISITOR: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(2)!!
            

    val ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(1)!!
            

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val ownerLayerInterface: AllBinaryLayer

    private val gameInput: GameInput

    private var lastKey: Int =  -1

    private val gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!
            
public constructor        (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput){

                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput
this.ownerLayerInterface= ownerLayerInterface
this.gameInput= gameInput
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun processAI(key: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var key = key

    
                        if(key !=  -1)
                        
                                    {
                                    this.gameInput!!.add(gameKeyEventFactory!!.getInstance(this, key))

                                    }
                                
}


open fun setLastKey(lastKey: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var lastKey = lastKey
this.lastKey= lastKey
}


open fun getLastKey()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lastKey
}


open fun getOwnerLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ownerLayerInterface
}


open fun getGameInput()
        //nullable = true from not(false or (false and true)) = true
: GameInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameInput
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.qualifiedName!!
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
stringBuffer!!.append(this.getName())
stringBuffer!!.append(
                            " LastKey: ")
stringBuffer!!.append(CanvasUtil.getKeyName(this.getLastKey()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}

override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


}
                
            

