
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
        package org.allbinary.media




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.time.TimeDelayHelper

open public class AllBinaryVisualDebugVibration : AllBinaryVibrationME {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(Integer.MAX_VALUE)
override fun vibrate(duration: Int, type: Int, volume: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var duration = duration
    //var type = type
    //var volume = volume
this.timeDelayHelper!!.delay= duration
}


    private val VIBRATING: String = "Vibrating"

    private var anchor: Int = Anchor.TOP_LEFT

open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    this.timeDelayHelper!!.delay= Integer.MAX_VALUE

    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    var myFont: MyFont = MyFont.getInstance()!!


    var width: Int = myFont!!.stringWidth(VIBRATING)!!

graphics.drawString(VIBRATING, displayInfoSingleton!!.getLastHalfWidth() -(width shr 1), 0, anchor)

                                    }
                                
}


}
                
            

