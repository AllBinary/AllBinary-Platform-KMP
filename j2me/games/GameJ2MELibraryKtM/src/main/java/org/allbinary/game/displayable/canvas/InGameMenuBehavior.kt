
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

open public class InGameMenuBehavior : BaseMenuBehavior {
        

        companion object {
            
    private val instance: InGameMenuBehavior = InGameMenuBehavior()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InGameMenuBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            override fun onDisplayChangeEvent(allBinaryGameCanvas: AllBinaryGameCanvas, displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
    //var displayChangeEvent = displayChangeEvent
allBinaryGameCanvas!!.updateMenu(displayChangeEvent)
}

override fun initSpecialPaint(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.setNonBotPaintableP(GameCanvasNonBotPaintable(allBinaryGameCanvas))
}


                @Throws(Exception::class)
            override fun initMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.initMenu2()
}


                @Throws(Exception::class)
            override fun updateMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.initMenu2()
}


                @Throws(Exception::class)
            override fun popupMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.popupMenu2()
}

override fun closeMenu(allBinaryGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameCanvas = allBinaryGameCanvas
allBinaryGameCanvas!!.closeMenu2()
}


}
                
            

