
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
        package org.allbinary.animation.caption



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.media.Player
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.AnimationEventHandler
import org.allbinary.animation.IndexedAnimation
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class CaptionIndexedAnimation : IndexedAnimation {
        

    private var animationInterface: Animation

    private var movieIndexedAnimationInterface: IndexedAnimation

    private var captionDx: Int

    private var captionDy: Int

    private var dx: Int

    private var dy: Int

    private var time: Int

    private var END_EVENT: AllBinaryEventObject

    private var timeDelayHelper: TimeDelayHelper

    private var player: Player
public constructor        (animationInterface: Animation, movieIndexedAnimationInterface: IndexedAnimation, player: Player, captionDx: Int, captionDy: Int, dx: Int, dy: Int, time: Int, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var animationInterface = animationInterface


                    var movieIndexedAnimationInterface = movieIndexedAnimationInterface


                    var player = player


                    var captionDx = captionDx


                    var captionDy = captionDy


                    var dx = dx


                    var dy = dy


                    var time = time


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.animationInterface= animationInterface
this.movieIndexedAnimationInterface= movieIndexedAnimationInterface
this.captionDx= captionDx
this.captionDy= captionDy
this.dx= dx
this.dy= dy
this.time= time
this.END_EVENT= AllBinaryEventObject(this)

    var timePerFrame: Int = this.time /this.getSize()

this.timeDelayHelper= TimeDelayHelper(timePerFrame)
this.player= player
this.player.start()
}


                @Throws(Exception::class)
            override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.timeDelayHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    this.movieIndexedAnimationInterface!!.nextFrame()

                                    }
                                

    
                        if(this.isLastFrame())
                        
                                    {
                                    AnimationEventHandler.getInstance()!!.fireEvent(this.END_EVENT)

                                    }
                                
}

override fun isLastFrame()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.movieIndexedAnimationInterface!!.getFrame() == this.getSize() -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{this.movieIndexedAnimationInterface!!.previousFrame()
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index
this.movieIndexedAnimationInterface!!.setFrame(index)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.movieIndexedAnimationInterface!!.getFrame()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.movieIndexedAnimationInterface!!.getSize()
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

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
this.animationInterface!!.paint(graphics, x +this.captionDx, y +this.captionDy)
this.movieIndexedAnimationInterface!!.paint(graphics, x +this.captionDx +dx, y +this.captionDy +dy)
}

override fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y


                    var z = z
this.animationInterface!!.paintThreed(graphics, x +this.captionDx, y +this.captionDy, z)
this.movieIndexedAnimationInterface!!.paintThreed(graphics, x +this.captionDx +dx, y +this.captionDy +dy, z)
}


}
                
            

