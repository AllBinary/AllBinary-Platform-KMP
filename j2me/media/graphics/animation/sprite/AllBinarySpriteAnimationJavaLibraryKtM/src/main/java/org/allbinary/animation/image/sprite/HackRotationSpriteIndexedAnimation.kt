
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
        package org.allbinary.animation.image.sprite




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.RotationAnimation
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.math.AngleInfo

open public class HackRotationSpriteIndexedAnimation : RotationAnimation {
        

    val sprite: Sprite

    private val image: Image
public constructor        (sprite: Sprite, image: Image, angleInfo: AngleInfo, animationBehavior: AnimationBehavior)                        

                            : super(angleInfo, animationBehavior){

                    var sprite = sprite


                    var image = image


                    var angleInfo = angleInfo


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.sprite= sprite
this.image= image
}


                @Throws(Exception::class)
            override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize()
}


open fun paint(g: Graphics, frame: Int, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var g = g


                    var frame = frame


                    var x = x


                    var y = y
this.setFrame(frame)
this.paint(g, x, y)
}

override fun paint(g: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var g = g


                    var x = x


                    var y = y
this.sprite.setPosition(x, y)
this.paint(g)
}


open fun paint(g: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var g = g
this.sprite.paint(g)
}

override fun nextRotation()
        //nullable = true from not(false or (false and true)) = true
{this.sprite.nextFrame()
}

override fun previousRotation()
        //nullable = true from not(false or (false and true)) = true
{this.sprite.prevFrame()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.sprite.getRawFrameCount()
}

override fun setFrame(frame: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame
this.sprite.setFrame(frame)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.sprite.getFrame()
}

override fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true
{

                    var sequence = sequence
}

override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PrimitiveIntUtil.getArrayInstance()
}


}
                
            

