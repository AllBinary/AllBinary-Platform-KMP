
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.font.MyFont

open public class MultiSelectPaintable : SelectionHudPaintable {
        

    private var totalCharArray: CharArray

    private val rootNameList: BasicArrayList = BasicArrayList()

    private var rootNamesString: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (){}


open fun update(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list
this.clear()

    var size: Int = list.size()!!
            

this.totalCharArray= this.getPrimitiveLongUtil()!!.getCharArray(size)

    var rtsLayer: RTSLayer = 
                null
            





                        for (index in list.size() -1 downTo 0)


        {rtsLayer= list.get(index) as RTSLayer

    
                        if(!this.rootNameList!!.contains(rtsLayer!!.getRootName()))
                        
                                    {
                                    this.rootNameList!!.add(rtsLayer!!.getRootName())

                                    }
                                
}


    var COMMA_SEP: String = CommonSeps.getInstance()!!.COMMA_SEP


    var stringBuffer: StringMaker = StringMaker()





                        for (index in this.rootNameList!!.size() -1 downTo 0)


        {
    var rootName: String = this.rootNameList!!.get(index) as String

stringBuffer!!.append(rootName)

    
                        if(index != 0)
                        
                                    {
                                    stringBuffer!!.append(COMMA_SEP)

                                    }
                                
}

this.rootNamesString= stringBuffer!!.toString()
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{this.rootNameList!!.clear()
}


    private val TOTAL: String = "Total Selected: "

    private val totalWidth: Int = MyFont.getInstance()!!.stringWidth(TOTAL)!!
            

    private val backgroundColor: Int = BasicColorFactory.getInstance()!!.GREY.toInt()!!
            

open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
graphics.setColor(backgroundColor)
graphics.drawRect(this.getX(), y, this.getWidth(), this.getHeight())
graphics.setColor(this.getColor())
graphics.drawString(TOTAL, this.textX, y, 0)
graphics.drawChars(this.totalCharArray, 0, this.getPrimitiveLongUtil()!!.getCurrentTotalDigits(), this.textX +this.totalWidth, y, 0)

    var textLine2Y: Int = (y +myFont!!.DEFAULT_CHAR_HEIGHT)

graphics.drawString(this.rootNamesString, this.textX, textLine2Y, 0)
}


}
                
            

