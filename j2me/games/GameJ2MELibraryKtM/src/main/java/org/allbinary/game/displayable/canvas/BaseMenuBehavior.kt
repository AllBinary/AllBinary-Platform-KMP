
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.paint.NullPaintable

open public class BaseMenuBehavior
            : Object
         {
        

        companion object {
            
    private val instance: BaseMenuBehavior = BaseMenuBehavior()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BaseMenuBehavior{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun onDisplayChangeEvent(allBinaryGameCanvas: AllBinaryGameCanvas, displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas


                    var displayChangeEvent = displayChangeEvent
}


open fun initSpecialPaint(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.setNonBotPaintableP(NullPaintable.getInstance())
}


                @Throws(Exception::class)
            
open fun initMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
}


                @Throws(Exception::class)
            
open fun updateMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
}


                @Throws(Exception::class)
            
open fun popupMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
}


open fun closeMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameCanvas = allBinaryGameCanvas
}


}
                
            

