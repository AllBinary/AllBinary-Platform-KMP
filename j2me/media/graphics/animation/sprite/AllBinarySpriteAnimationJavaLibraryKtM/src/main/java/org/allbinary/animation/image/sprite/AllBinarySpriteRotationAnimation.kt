
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
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.animation.AnimationBehavior
import org.allbinary.direction.Direction
import org.allbinary.math.Angle
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.math.FrameUtil

open public class AllBinarySpriteRotationAnimation : HackRotationSpriteIndexedAnimation {
        
public constructor        (sprite: Sprite, image: Image, animationBehavior: AnimationBehavior)                        

                            : super(sprite, image, AngleInfo.getInstance((AngleFactory.getInstance()!!.TOTAL_ANGLE /sprite.getRawFrameCount()).toShort()), animationBehavior){
    //var sprite = sprite
    //var image = image
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.angleInfo!!.adjustAngle(this.sprite.getFrame())
}

override fun nextRotation()
        //nullable = true from not(false or (false and true)) = true
{
this.sprite.nextFrame()
this.angleInfo!!.adjustAngle(this.sprite.getFrame())
}

override fun previousRotation()
        //nullable = true from not(false or (false and true)) = true
{
this.sprite.prevFrame()
this.angleInfo!!.adjustAngle(this.sprite.getFrame())
}

override fun setFrame(direction: Direction)
        //nullable = true from not(false or (false and false)) = true
{
var direction = direction

    var angle: Angle = directionUtil!!.getFrameAngle(direction)!!

this.adjustFrame(angle)
}

override fun setFrame(angle: Angle)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
this.adjustFrame(angle)
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var index = index
this.sprite.setFrame(index)
this.angleInfo!!.adjustAngle(this.getFrame())
}

override fun adjustFrame(angle: Angle)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
this.adjustFrame(angle.getValue())
}


    private val frameUtil: FrameUtil = FrameUtil.getInstance()!!
override fun adjustFrame(angle: Short)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
this.setFrame(frameUtil!!.getFrameForAngle(angle, this.angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement().toInt()))
}


}
                
            

