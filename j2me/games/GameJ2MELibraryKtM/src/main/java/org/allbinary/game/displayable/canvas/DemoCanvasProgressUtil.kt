
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
        package org.allbinary.game.displayable.canvas



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.paint.PaintableComposite
import org.allbinary.graphics.paint.PaintableInterface

open public class DemoCanvasProgressUtil
            : Object
         {
        

        companion object {
            
open fun showProgress(demoCanvas: DemoCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var demoCanvas = demoCanvas
DemoCanvasProgressUtil.showProgress(demoCanvas, false)
}


open fun showProgress(demoCanvas: DemoCanvas, background: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var demoCanvas = demoCanvas


                    var background = background

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            

progressCanvas!!.startBackground(background)

    var paintableArray: Array<PaintableInterface?> = arrayOfNulls(2)

paintableArray[0]= progressCanvas
paintableArray[1]= demoCanvas!!.getDefaultPaintableInterface()
demoCanvas!!.setDefaultPaintableInterface(PaintableComposite(paintableArray))
demoCanvas!!.setPaintableInterface(demoCanvas!!.getDefaultPaintableInterface())
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

