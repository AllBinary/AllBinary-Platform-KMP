
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
        package org.allbinary.game.ai.tactical




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.ai.BasicAI
import org.allbinary.game.ai.InputProbability
import org.allbinary.game.input.GameInput
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.time.GameTickTimeDelayHelperFactory

open public class BasicRandomAI : BasicAI {
        

    private var i_random: Int = 0

    private val inputProbability: InputProbability

    private val visitor: Visitor

    private val keyArray: IntArray = intArrayOf(Canvas.UP,Canvas.DOWN,Canvas.LEFT,Canvas.RIGHT,Canvas.KEY_NUM1,Canvas.KEY_NUM7,Canvas.KEY_NUM9)
public constructor        (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput, inputProbability: InputProbability, visitor: Visitor)                        

                            : super(ownerLayerInterface, gameInput){
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput
var inputProbability = inputProbability
var visitor = visitor


                            //For kotlin this is before the body of the constructor.
                    
this.inputProbability= inputProbability
this.visitor= visitor
}


    private val myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!

                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.inputProbability!!.getTimeDelayHelper()!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    i_random= myRandomFactory!!.getAbsoluteNextInt(this.inputProbability!!.getMax())

    var repeat: Boolean = false


    var repeatLikelyhoodIntegerArray: Array<Integer?> = this.inputProbability!!.getRepeatLikelyhoodIntegerArray()!!


    
                        if(this.getLastKey() !=  -1 && repeatLikelyhoodIntegerArray[this.getLastKey()]!!.toInt() >= i_random)
                        
                                    {
                                    repeat= true

                                    }
                                

    
                        if(!repeat)
                        
                                    {
                                    
    var likelyhoodIntegerArray: Array<Array<Integer?>?> = this.inputProbability!!.getLikelyhoodIntegerArray()!!

i_random= myRandomFactory!!.getAbsoluteNextInt(this.inputProbability!!.getMax())

    var size: Int = keyArray!!.size
                


    var likelyhoodIntegerKeyArray: Array<Integer?>





                        for (index in 0 until size)

        {

    var key: Int = keyArray[index]!!

likelyhoodIntegerKeyArray= likelyhoodIntegerArray[key]!!

    
                        if(likelyhoodIntegerArray!!.size >= key && likelyhoodIntegerKeyArray[0] != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(i_random >= likelyhoodIntegerKeyArray[0]!!.toInt() && i_random < likelyhoodIntegerKeyArray[1]!!.toInt())
                        
                                    {
                                    this.setLastKey(key)
break;

                    

                                    }
                                

                                    }
                                
}


                                    }
                                
this.visitor.visit(this)

                                    }
                                
}


}
                
            

