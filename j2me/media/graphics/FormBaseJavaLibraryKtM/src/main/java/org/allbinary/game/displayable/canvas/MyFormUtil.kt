
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
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class MyFormUtil
            : Object
         {
        
companion object {
            
    private val instance: MyFormUtil = MyFormUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MyFormUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MyFormUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var popupMenuRectangle: Rectangle = RectangleFactory.SINGLETON

    open fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    var width: Int = MyFontProcessor.defaultStringWidth(font, 3)!!


    var pointFactory: PointFactory = PointFactory.getInstance()!!


    
                        if(displayInfo!!.getLastHeight() < 320)
                        
                                    {
                                    this.popupMenuRectangle= Rectangle(pointFactory!!.createXY(0, 25), width, (font.getHeight() *4) +2)

                                    }
                                
                        else {
                            this.popupMenuRectangle= Rectangle(pointFactory!!.createXY(0, displayInfo!!.getLastHalfHeight() -70), width, (font.getHeight() *5))

                        }
                            
}


    open fun getPopupMenuRectangle()
        //nullable = true from not(false or (false and true)) = true
: Rectangle{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.popupMenuRectangle
}


}
                
            

