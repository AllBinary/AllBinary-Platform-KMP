
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
        package org.allbinary.animation.vector




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.ColorCompositeInterface
import org.allbinary.layer.PositionInterface
import org.allbinary.logic.NullUtil

open public class LineAnimation : Animation
                , ColorCompositeInterface
                , PositionInterface {
        

    private var newLine: Array<IntArray?> = Array(2) { IntArray(2) }

    private var tempLine: Array<IntArray?> = NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY

    private var line: Array<IntArray?> = Array(2) { IntArray(2) }
public constructor        (basicColor: BasicColor)

        Updates for KMP build        
        {
var basicColor = basicColor
this.setBasicColorP(basicColor)
}


open fun init(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var x = x
var y = y
this.newLine[0]!![0]= x
this.newLine[0]!![1]= y
this.newLine[1]!![0]= x
this.newLine[1]!![1]= y
this.tempLine= this.line
this.line= this.newLine
this.newLine= this.tempLine
}

override fun setPosition(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var x = x
var y = y
var z = z
this.newLine[0]!![0]= this.line[1]!![0]!!
this.newLine[0]!![1]= this.line[1]!![1]!!
this.newLine[1]!![0]= x
this.newLine[1]!![1]= y
this.tempLine= this.line
this.line= this.newLine
this.newLine= this.tempLine
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y

    var currentLine: Array<IntArray?> = this.line

this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())
graphics.drawLine(currentLine[0]!![0]!!, currentLine[0]!![1]!!, currentLine[1]!![0]!!, currentLine[1]!![1]!!)
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


}
                
            

