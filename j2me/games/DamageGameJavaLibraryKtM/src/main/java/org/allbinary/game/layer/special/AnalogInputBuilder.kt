
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
        package org.allbinary.game.layer.special




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.input.GameInputProcessor

open public class AnalogInputBuilder
            : Object
         {
        

        companion object {
            
    private val instance: AnalogInputBuilder = AnalogInputBuilder()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnalogInputBuilder{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun disable(inputProcessorArray: Array<GameInputProcessor?>, collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputProcessorArray = inputProcessorArray


                    var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer
inputProcessorArray[Canvas.UP]= SpecialUpGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.DOWN]= SpecialDownGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.RIGHT]= SpecialRightGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.LEFT]= SpecialLeftGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.KEY_NUM0]= Special1GameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.KEY_NUM5]= Special3GameInputProcessor(collidableDestroyableDamageableLayer)
}


open fun enable(inputProcessorArray: Array<GameInputProcessor?>, collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputProcessorArray = inputProcessorArray


                    var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer
inputProcessorArray[Canvas.UP]= SpecialAnalogUpGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.DOWN]= SpecialAnalogDownGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.RIGHT]= SpecialAnalogRightGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.LEFT]= SpecialAnalogLeftGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.KEY_NUM0]= SpecialAnalogLeftTriggerGameInputProcessor(collidableDestroyableDamageableLayer)
inputProcessorArray[Canvas.KEY_NUM5]= SpecialAnalogRightTriggerGameInputProcessor(collidableDestroyableDamageableLayer)
}


}
                
            

