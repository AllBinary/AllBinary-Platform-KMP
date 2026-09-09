
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
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.time.TimeDelayHelper

open public class AllBinaryVisualDebugVibration : AllBinaryVibrationME
                , UpdateMyFontInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(Integer.MAX_VALUE)

    private val VIBRATING: String = "Vibrating"

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var anchor: Int = Anchor.TOP_LEFT

    private var width: Int= 0

    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.width= font.stringWidth(this.VIBRATING)
this.myFontProcessor= MyFontProcessor.getInstance()
}


    override fun vibrate(duration: Int, type: Int, volume: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var duration = duration
    //var type = type
    //var volume = volume
this.timeDelayHelper!!.delay= duration
}


    open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this.timeDelayHelper!!.isTimeTNT())
                        
                                    {
                                    this.timeDelayHelper!!.delay= Integer.MAX_VALUE
this.myFontProcessor!!.process(graphics)
graphics.drawString(this.VIBRATING, this.displayInfoSingleton!!.getLastHalfWidth() -(width shr 1), 0, this.anchor)

                                    }
                                
}


}
                
            

