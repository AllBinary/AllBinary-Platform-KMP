
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
        package org.allbinary.layer




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class Layer
            : Object
         {
        

        companion object {
            
    val ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(0)!!

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    var x: Int= 0

    var y: Int= 0

    var z: Int = 3

    private var width: Int= 0

    private var height: Int= 0

    private var visible: Boolean = true
public constructor        (width: Int, height: Int)
            : super()
        {

                    var width = width


                    var height = height
setLayerWidth(width)
setLayerHeight(height)
}


open fun setPosition(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var z = z
this.x= x
this.y= y
this.z= z
}


open fun move(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx


                    var dy = dy
this.x += dx
this.y += dy
}


open fun move(dx: Int, dy: Int, dz: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx


                    var dy = dy


                    var dz = dz
this.x += dx
this.y += dy
this.z += dz
}


open fun getXP()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x
}


open fun getYP()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y
}


open fun getZP()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return z
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun getDepth()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun setVisible(visible: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var visible = visible
this.visible= visible
}


open fun isVisible()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return visible
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!

logUtil!!.put(commonStrings!!.NOT_IMPLEMENTED, this, canvasStrings!!.PAINT)
}


open fun setLayerWidth(width: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var width = width

    
                        if(width < 0)
                        
                                    {
                                    


                            throw IllegalArgumentException()

                                    }
                                
this.width= width
}


open fun setLayerHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var height = height

    
                        if(height < 0)
                        
                                    {
                                    


                            throw IllegalArgumentException()

                                    }
                                
this.height= height
}


open fun toString(stringBuffer: StringMaker)
        //nullable = true from not(false or (true and false)) = true
{

                    var stringBuffer = stringBuffer
}


}
                
            

