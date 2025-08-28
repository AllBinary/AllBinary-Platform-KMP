
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.image.opengles.OpenGLSurfaceChangedInterface

open public class Animation
            : Object
        
                , AnimationInterface
                , OpenGLSurfaceChangedInterface {
        

    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!

    var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    var colorP: Int= 0

    var changeBasicColorP: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    var changeColorP: Int= 0

    var alphaP: Int= 0
protected constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun setAlpha(alpha: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var alpha = alpha
this.alphaP= alpha
}


                @Throws(Exception::class)
            override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var x = x
    //var y = y
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())
}

override fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var x = x
    //var y = y
    //var z = z
}


open fun isThreed()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicColor
}


open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var basicColor = basicColor
this.basicColor= basicColor
this.colorP= this.basicColor!!.toInt()
}


open fun getChangeBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.changeBasicColorP
}


open fun changeBasicColor(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var basicColor = basicColor
this.changeBasicColorP= basicColor
this.changeColorP= this.changeBasicColorP!!.toInt()
}


open fun getChangeColor()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.changeColorP
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.colorP
}


open fun setScale(scaleX: Float, scaleY: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var scaleX = scaleX
    //var scaleY = scaleY
}


open fun setMaxScale(maxScaleX: Float, maxScaleY: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var maxScaleX = maxScaleX
    //var maxScaleY = maxScaleY
}


                @Throws(Exception::class)
            override fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gl = gl
}


open fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var dx = dx
}


open fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var dy = dy
}


open fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

