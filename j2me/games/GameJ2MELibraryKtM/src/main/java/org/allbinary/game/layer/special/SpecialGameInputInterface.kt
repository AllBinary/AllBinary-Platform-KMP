
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
        
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.layer.AllBinaryLayerManager
interface SpecialGameInputInterface : PaintableInterface {
        

                @Throws(Exception::class)
            
open fun up()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun down()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun right()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun left()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun strafeLeft()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun strafeRight()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun fire(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun special1(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun special2(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun special3(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun special4(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun special5(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


}
                
            

