
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
import org.allbinary.logic.string.StringUtil
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.InitUpdatePaintable
import org.allbinary.input.motion.button.CommonButtons
import org.allbinary.input.motion.button.TouchButtonLocationHelper
import org.allbinary.logic.math.PrimitiveLongUtil

open public class SelectionHudPaintable : InitUpdatePaintable {
        

    val myFont: MyFont = MyFont.getInstance()!!
            

    val y: Int = CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE +17

    private val primitiveLongUtil: PrimitiveLongUtil

    private var x: Int= 0

    var textX: Int= 0

    var imageX: Int= 0

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.BLACK

    private var color: Int= 0

    private var width: Int= 0

    private var height: Int= 0

    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var animationInterface: Animation
protected constructor        (){this.update()
this.setAnimationInterface(NullAnimationFactory.getFactoryInstance()!!.getInstance(0))
this.primitiveLongUtil= PrimitiveLongUtil(10000)
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{
    var touchButtonLocationHelper: TouchButtonLocationHelper = TouchButtonLocationHelper()


    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            

this.x= CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE +touchButtonLocationHelper!!.getColumnsRemainderHalf()
this.textX= this.getX() +4
this.width= displayInfoSingleton!!.getLastWidth() -this.getX() *2
this.imageX= this.getWidth() +touchButtonLocationHelper!!.getColumnsRemainderHalf() -10
this.setHeight(CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE +myFont!!.DEFAULT_CHAR_HEIGHT)
}


open fun updateSelectionInfo()
        //nullable = true from not(false or (false and true)) = true
{}


open fun updateInfo()
        //nullable = true from not(false or (false and true)) = true
{}


    private val backgroundColor: Int = BasicColorFactory.getInstance()!!.GREY.toInt()!!
            

open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
graphics.setColor(backgroundColor)
graphics.drawRect(this.getX(), y, this.getWidth(), this.getHeight())
graphics.setColor(this.getColor())
graphics.drawString(getName(), this.textX, y, 0)
}


open fun getPrimitiveLongUtil()
        //nullable = true from not(false or (false and true)) = true
: PrimitiveLongUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return primitiveLongUtil
}


open fun setAnimationInterface(animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
{

                    var animationInterface = animationInterface
this.animationInterface= animationInterface
}


open fun getAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterface
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor
this.basicColor= basicColor
this.setColor(basicColor!!.toInt())
}


open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


open fun setColor(color: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var color = color
this.color= color
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return color
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var height = height
this.height= height
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x
}


}
                
            

