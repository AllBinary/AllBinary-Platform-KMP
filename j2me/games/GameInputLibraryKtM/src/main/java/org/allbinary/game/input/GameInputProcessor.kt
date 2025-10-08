
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.layer.AllBinaryLayerManager

open public class GameInputProcessor
            : Object
         {
        
companion object {
            
    private val instance: GameInputProcessor = GameInputProcessor()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameInputProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            protected constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    open fun processReleased(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    open fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent, analogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var gameKeyEvent = gameKeyEvent
    //var analogValue = analogValue
}


                @Throws(Exception::class)
            
    open fun process(allbinaryLayerManager: AllBinaryLayerManager, keyAsInteger: Integer)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var keyAsInteger = keyAsInteger
}


                @Throws(Exception::class)
            
    open fun processReleased(allbinaryLayerManager: AllBinaryLayerManager, keyAsInteger: Integer)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var keyAsInteger = keyAsInteger
}


}
                
            

