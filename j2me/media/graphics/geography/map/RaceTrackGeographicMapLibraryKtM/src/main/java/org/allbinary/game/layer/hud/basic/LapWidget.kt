
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
        package org.allbinary.game.layer.hud.basic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.game.layer.hud.LapInfo
import org.allbinary.graphics.color.BasicColor

open public class LapWidget : BasicHud {
        

    private val LAP_STR: String = "Lap "

    private val OF_STR: String = " of "

    private var string: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (location: Int, direction: Int, basicColor: BasicColor)                        

                            : super(location, direction, 15, 40, 2, basicColor){
var location = location
var direction = direction
var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}


open fun update(lapInfo: LapInfo)
        //nullable = true from not(false or (false and false)) = true
{
var lapInfo = lapInfo

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(LAP_STR)
stringBuffer!!.append(lapInfo!!.getCurrentLap())
stringBuffer!!.append(OF_STR)
stringBuffer!!.append(lapInfo!!.getTotalLaps())
this.string= stringBuffer!!.toString()
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics, this.string)
}


}
                
            

