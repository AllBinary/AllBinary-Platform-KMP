
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.animation.text.TextAnimation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class CaptionAnimationHelper : CaptionAnimationHelperBase {
        

    private val timeHelper: TimeDelayHelper = TimeDelayHelper(620)

    private val textAnimation: TextAnimation = TextAnimation(AnimationBehavior.getInstance())

    private val captionAnimation: Animation

    private var animation: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!
public constructor        (captionAnimation: Animation, captionDx: Int, captionDy: Int, dx: Int, dy: Int){
    //var captionAnimation = captionAnimation
    //var captionDx = captionDx
    //var captionDy = captionDy
    //var dx = dx
    //var dy = dy
this.captionAnimation= CaptionAnimation(captionAnimation, this.textAnimation, captionDx, captionDy, dx, dy)
}

override fun isShowing()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.animation == this.captionAnimation)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun tick()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.timeHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    this.animation= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)

                                    }
                                
}

override fun update(message: String, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
var message = message
var basicColor = basicColor
this.textAnimation!!.setBasicColorP(basicColor)
this.textAnimation!!.setText(message)
this.animation= this.captionAnimation
this.timeHelper!!.setStartTime()
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
this.animation.paint(graphics, x, y)
}


}
                
            

