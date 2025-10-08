
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
        package org.allbinary.game.layer.hud.basic.notification




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class GameNotification
            : Object
         {
        
companion object {
            
    val NULL_GAME_NOTIFICATION_EVENT: GameNotificationEvent = GameNotificationEvent(NullUtil.getInstance()!!.NULL_OBJECT, StringUtil.getInstance()!!.EMPTY_STRING, Integer(0), BasicColorFactory.getInstance()!!.RED, BooleanFactory.getInstance()!!.FALSE)

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val stringList: BasicArrayList = BasicArrayList()

    val timeList: BasicArrayList = BasicArrayList()

    val colorList: BasicArrayList = BasicArrayList()

    open fun add(string: String, seconds: Integer, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
var string = string
var seconds = seconds
var basicColor = basicColor

    
                        if(!this.stringList!!.contains(string))
                        
                                    {
                                    this.stringList!!.add(string)
this.timeList!!.add(seconds)
this.colorList!!.add(basicColor)

                                    }
                                
}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{
this.stringList!!.clear()
this.timeList!!.clear()
this.colorList!!.clear()
}


    open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.stringList!!.size()
}


}
                
            

