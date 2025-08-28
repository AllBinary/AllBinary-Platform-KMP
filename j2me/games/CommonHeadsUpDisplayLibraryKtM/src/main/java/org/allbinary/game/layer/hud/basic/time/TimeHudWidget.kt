
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
        package org.allbinary.game.layer.hud.basic.time




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.math.PrimitiveLongSingleton

open public class TimeHudWidget : BasicHud {
        

    private val TIME_STRING: String = "Time "

    private val TIME_CHAR_ARRAY: CharArray = charArrayOf('T','i','m','e',' ')

    private var offset: Int

    private var string: CharArray = PrimitiveLongSingleton.getInstance()!!.ZERO

    private var totalDigits: Int = 1

    private val timer: Timer
public constructor        (location: Int, direction: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int, basicColor: BasicColor, timer: Timer)                        

                            : super(location, direction, maxHeight, maxWidth, bufferZone, basicColor)

        Updates for KMP build        
        {
var location = location
var direction = direction
var maxHeight = maxHeight
var maxWidth = maxWidth
var bufferZone = bufferZone
var basicColor = basicColor
var timer = timer


                            //For kotlin this is before the body of the constructor.
                    
this.timer= timer
this.set()

    var myFont: MyFont = MyFont.getInstance()!!

this.offset= myFont!!.stringWidth(this.TIME_STRING) +myFont!!.stringWidth(3)

    
                        if(direction == 0)
                        
                                    {
                                    


                            throw Exception(BasicHudFactory.getInstance()!!.DIRECTION_EXCEPTION)

                                    }
                                
}

public constructor        (location: Int, direction: Int, maxWidth: Int, basicColor: BasicColor, timer: Timer)                        

                            : this(location, direction, 14, maxWidth, 2, basicColor, timer)

        Updates for KMP build        
        {
var location = location
var direction = direction
var maxWidth = maxWidth
var basicColor = basicColor
var timer = timer


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (location: Int, direction: Int, basicColor: BasicColor, timer: Timer)                        

                            : this(location, direction, 14, MyFont.getInstance()!!.getSize() *5, 2, basicColor, timer)

        Updates for KMP build        
        {
var location = location
var direction = direction
var basicColor = basicColor
var timer = timer


                            //For kotlin this is before the body of the constructor.
                    
}


open fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.timer.update()
this.set()
}


open fun set()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.string= timer.getTimeChars()
totalDigits= timer.getCurrentTotalDigits()
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
super.paint(graphics, TIME_CHAR_ARRAY, 0, TIME_CHAR_ARRAY.size, string, 0, totalDigits, offset)
}


open fun getTimer()
        //nullable = true from not(false or (false and true)) = true
: Timer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timer
}


}
                
            

