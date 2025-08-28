
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
        package org.allbinary.game.layer.hud.basic.level




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.logic.NullUtil
import org.allbinary.logic.math.PrimitiveLongUtil

open public class LevelHudWidget : BasicHud
                , PaintableInterface {
        

    private var level: Int

    private var maxlevel: Int

    private val levelString: CharArray

    private var levelNumberCharArray: CharArray = NullUtil.getInstance()!!.NULL_CHAR_ARRAY

    private var levelNumberTotalDigits: Int= 0

    private val offset: Int

    private val primitiveLongUtil: PrimitiveLongUtil
public constructor        (maxlevel: Int, location: Int, direction: Int)                        

                            : this(maxlevel, location, direction, MyFont.getInstance()!!.getSize() *4)

        Updates for KMP build        
        {
var maxlevel = maxlevel
var location = location
var direction = direction


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (maxlevel: Int, location: Int, direction: Int, maxWidth: Int)                        

                            : super(location, direction, 14, maxWidth, 2, BasicColorFactory.getInstance()!!.GREY)

        Updates for KMP build        
        {
var maxlevel = maxlevel
var location = location
var direction = direction
var maxWidth = maxWidth


                            //For kotlin this is before the body of the constructor.
                    

    var myFont: MyFont = MyFont.getInstance()!!

this.primitiveLongUtil= PrimitiveLongUtil(1000)

    var LEVEL: String = "Lv "

this.levelString= LEVEL.toCharArray()
this.offset= myFont!!.charsWidth(this.levelString, 0, this.levelString!!.size) +myFont!!.getSize()
this.maxlevel= maxlevel
this.level= maxlevel
this.update()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
levelNumberCharArray= this.primitiveLongUtil!!.getCharArray(this.level)
levelNumberTotalDigits= this.primitiveLongUtil!!.getCurrentTotalDigits()
}


open fun setLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var level = level
this.level= level
this.update()
}


open fun nextLevel()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.level++
this.update()
}


open fun previousLevel()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.level--

    
                        if(this.level < 0)
                        
                                    {
                                    this.level= 0

                                    }
                                
this.update()
}


open fun isComplete()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    
                        if(this.level <= maxlevel)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
super.paint(graphics, levelString, 0, levelString!!.size, levelNumberCharArray, 0, levelNumberTotalDigits, this.offset)
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
}


}
                
            

