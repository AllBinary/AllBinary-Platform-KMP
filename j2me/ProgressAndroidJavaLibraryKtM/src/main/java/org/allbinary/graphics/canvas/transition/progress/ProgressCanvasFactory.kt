
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
        package org.allbinary.graphics.canvas.transition.progress




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.logic.string.StringUtil

open public class ProgressCanvasFactory
            : Object
         {
        
companion object {
            
    private val instance: ProgressCanvas = AndroidBasicTitleProgressBar(StringUtil.getInstance()!!.EMPTY_STRING, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ProgressCanvas{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    open fun getLazyInstance()
        //nullable = true from not(false or (false and true)) = true
: PaintableInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullPaintable.getInstance()
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

