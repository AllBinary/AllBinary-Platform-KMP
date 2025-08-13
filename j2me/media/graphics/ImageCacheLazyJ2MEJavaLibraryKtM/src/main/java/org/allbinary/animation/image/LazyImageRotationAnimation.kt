
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.animation.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.NullIndexedAnimation
import org.allbinary.animation.RotationAnimation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.image.ImageCache
import org.allbinary.image.ImageCacheFactory
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.ScaleProperties

open public class LazyImageRotationAnimation : RotationAnimation {
        

        companion object {
            
    private val SET_REAL_ANIMATION: String = "setRealAnimation"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val layoutIndex: Int

    val instanceId: Int

    val animationInterfaceFactoryInterface: BaseImageAnimationFactory

    private val NULL_INDEX_ANIMATION: IndexedAnimation

    private var animation: IndexedAnimation

    var scaleProperties: ScaleProperties = ScaleProperties.instance
public constructor        (layoutIndex: Int, instanceId: Int, scaleProperties: ScaleProperties, animationInterfaceFactoryInterface: BaseImageAnimationFactory, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var layoutIndex = layoutIndex


                    var instanceId = instanceId


                    var scaleProperties = scaleProperties


                    var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.layoutIndex= layoutIndex
this.instanceId= instanceId
this.animationInterfaceFactoryInterface= animationInterfaceFactoryInterface

    var imageCache: ImageCache = ImageCacheFactory.getInstance()!!
            

imageCache!!.add(this)
this.scaleProperties= scaleProperties
NULL_INDEX_ANIMATION= object: NullIndexedAnimation(animationBehavior)
                                {
                                
open override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
}

                                }
                            
animation= object: IndexedAnimation(animationBehavior)
                                {
                                
    private var index: Int= 0

open override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index
this.index= index
}

open override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.index
}

open override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y

        try {
            ImageCacheFactory.getInstance()!!.insertFirst(this@LazyImageRotationAnimation)
animation= NULL_INDEX_ANIMATION
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)
}

}

open override fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y


                    var z = z

        try {
            ImageCacheFactory.getInstance()!!.insertFirst(this@LazyImageRotationAnimation)
animation= NULL_INDEX_ANIMATION
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)
}

}

                                }
                            
}


open fun setRealAnimation()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var animation: IndexedAnimation = this.animation

this.animationInterfaceFactoryInterface!!.setInitialScale(scaleProperties)
this.animation= this.animationInterfaceFactoryInterface!!.getInstance(this.instanceId) as IndexedAnimation
this.animation.setState(animation)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, SET_REAL_ANIMATION, e)
}

}

override fun setScale(scaleX: Float, scaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleX = scaleX


                    var scaleY = scaleY
this.animation.setScale(scaleX, scaleY)
}

override fun getAnimationBehavior()
        //nullable = true from not(false or (false and true)) = true
: AnimationBehavior{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getAnimationBehavior()
}


                @Throws(Exception::class)
            override fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl
this.animation.set(gl)
}

override fun setAlpha(alpha: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var alpha = alpha
this.animation.setAlpha(alpha)
}

override fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx
this.animation.setDx(dx)
}

override fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dy = dy
this.animation.setDy(dy)
}

override fun setMaxScale(maxScaleX: Float, maxScaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxScaleX = maxScaleX


                    var maxScaleY = maxScaleY
this.animation.setMaxScale(maxScaleX, maxScaleY)
}

override fun changeBasicColor(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor
this.animation.changeBasicColor(basicColor)
}

override fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getBasicColorP()
}

override fun getChangeBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getChangeBasicColor()
}

override fun getChangeColor()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getChangeColor()
}

override fun getColor()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getColor()
}

override fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getDx()
}

override fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getDy()
}

override fun isThreed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.isThreed()
}


                @Throws(Exception::class)
            override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{this.animation.nextFrame()
}

override fun reset()
        //nullable = true from not(false or (false and true)) = true
{this.animation.reset()
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index
this.animation.setFrame(index)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getFrame()
}


                @Throws(Exception::class)
            override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getAnimationSize()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getSize()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{this.animation.previousFrame()
}

override fun isLastFrame()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.isLastFrame()
}

override fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true
{

                    var sequence = sequence
this.animation.setSequence(sequence)
}

override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getSequence()
}

override fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animation.getWidth()
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y

        try {
            this.animation.paint(graphics, x, y)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.PROCESS, e)
}

}


open fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y


                    var z = z

        try {
            this.animation.paintThreed(graphics, x, y, z)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.PROCESS, e)
}

}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var image: Image = this.animationInterfaceFactoryInterface!!.getImage()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(super.toString())!!.append(commonSeps!!.SPACE)!!.append(image.getName())!!.append(commonSeps!!.SPACE)!!.append(image.getWidth())!!.append(commonSeps!!.SPACE)!!.append(image.getHeight())!!.toString()
}


}
                
            

