
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.special.SpecialAnimationInterface
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class ImageArraySpecialAnimation : ImageArrayAnimation
                , SpecialAnimationInterface {
        

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(270)
public constructor        (imageArray: Array<Image?>, animationBehavior: AnimationBehavior)                        

                            : super(imageArray, animationBehavior){
    //var imageArray = imageArray
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.reset()
}


    private var loopCount: Int = 0

open fun getLoopCount()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return loopCount
}

override fun setLastFrame()
        //nullable = true from not(false or (false and true)) = true
{
this.circularIndexUtil!!.setIndex(this.circularIndexUtil!!.getSize() -1)
}

override fun reset()
        //nullable = true from not(false or (false and true)) = true
{
this.setFrame(this.getSize() -1)
loopCount= 0
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.getFrame() > 0)
                        
                                    {
                                    
    
                        if(timeDelayHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    this.previousFrame()

    
                        if(this.getFrame() == 0)
                        
                                    {
                                    loopCount++

                                    }
                                

                                    }
                                

                                    }
                                
}


    private val loopCountTotal: Int = 1
override fun isComplete()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(loopCount < loopCountTotal || this.getFrame() != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
var x = x
var y = y
x= DisplayInfoSingleton.getInstance()!!.getLastHalfWidth() -(this.getImage(this.circularIndexUtil!!.getIndex())!!.getWidth() shr 1)
y= 5
super.paint(graphics, x, y)
}


}
                
            

