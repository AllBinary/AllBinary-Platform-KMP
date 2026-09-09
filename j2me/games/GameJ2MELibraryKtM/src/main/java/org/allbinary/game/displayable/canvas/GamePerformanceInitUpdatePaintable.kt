
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.canvas.GameStatisticsFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.paint.InitUpdatePaintable

open public class GamePerformanceInitUpdatePaintable : InitUpdatePaintable
                , UpdateMyFontInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val halfHeight: Int = DisplayInfoSingleton.getInstance()!!.getLastHalfHeight()!!

    private val yArray: IntArray = intArrayOf(this.halfHeight +30,this.halfHeight +30,this.halfHeight +30 +15,this.halfHeight +30 +15,this.halfHeight +30 +30,this.halfHeight +30 +30,this.halfHeight +30 +45,this.halfHeight +30 +45)

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var baseRefreshHelperCharArray: Array<CharArray?> = Array(0) { CharArray(0) }

    private var defaultStringWidth: Int= 0

    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.defaultStringWidth= MyFontProcessor.defaultStringWidth(font, 2)
this.myFontProcessor= MyFontProcessor.getInstance()
}


    override fun init()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun update()
        //nullable = true from not(false or (false and true)) = true
{
this.baseRefreshHelperCharArray= GameStatisticsFactory.getInstance()!!.to2DCharArray()
}


    private val RED: Int = BasicColorFactory.getInstance()!!.RED.toInt()!!

    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.myFontProcessor!!.process(graphics)
graphics.setColor(this.RED)

    var charArray: CharArray


    var charArray2: CharArray


    var size2: Int= 0


    var size3: Int= 0


    var size: Int = this.baseRefreshHelperCharArray!!.size -2





                        for (index in size downTo 0)

        {
charArray= this.baseRefreshHelperCharArray[index]!!
charArray2= this.baseRefreshHelperCharArray[index +1]!!
size2= charArray!!.size
size3= charArray2!!.size
graphics.drawChars(charArray, 0, size2, 0, this.yArray[index]!!, 0)
graphics.drawChars(charArray2, 0, size3, size2 *this.defaultStringWidth, this.yArray[index +1]!!, 0)
}

}


}
                
            

