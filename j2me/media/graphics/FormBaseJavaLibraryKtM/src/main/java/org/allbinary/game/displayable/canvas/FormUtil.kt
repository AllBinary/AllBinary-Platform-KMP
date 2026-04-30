
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
        
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.communication.log.LogUtil

open public class FormUtil
            : Object
         {
        
companion object {
            
    private val instance: FormUtil = FormUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FormUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FormUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    open fun createFormRectangle()
        //nullable = true from not(false or (false and true)) = true
: Rectangle{

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    var pointFactory: PointFactory = PointFactory.getInstance()!!


    var rectangle: Rectangle = Rectangle(pointFactory!!.createXY(30, 10), displayInfo!!.getLastWidth() -30, displayInfo!!.getLastHeight() -35)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangle
}


    open fun createPopupMenuRectangle()
        //nullable = true from not(false or (false and true)) = true
: Rectangle{

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    var myFont: MyFont = MyFont.getInstance()!!


    var popupMenuRectangle: Rectangle = RectangleFactory.SINGLETON


    var pointFactory: PointFactory = PointFactory.getInstance()!!


    
                        if(displayInfo!!.getLastHeight() < 320)
                        
                                    {
                                    popupMenuRectangle= Rectangle(pointFactory!!.createXY(0, 25), myFont!!.defaultStringWidth(3), (myFont!!.DEFAULT_CHAR_HEIGHT *4) +2)

                                    }
                                
                        else {
                            popupMenuRectangle= Rectangle(pointFactory!!.createXY(0, displayInfo!!.getLastHalfHeight() -70), myFont!!.defaultStringWidth(3), (myFont!!.DEFAULT_CHAR_HEIGHT *5))

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return popupMenuRectangle
}


}
                
            

