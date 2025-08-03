
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.animation.AnimationBehavior
import org.allbinary.graphics.Anchor

open public class TopToBottomImageAnimation : ImageSegmentAnimation {
        

    private var currentHeight: Int
public constructor        (image: Image, sequenceArray: IntArray, animationBehavior: AnimationBehavior)                        

                            : super(image, sequenceArray, animationBehavior){

                    var image = image


                    var sequenceArray = sequenceArray


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.currentHeight= 0

    
                        if(this.getSequence()[0] ==  -1)
                        
                                    {
                                    this.setFrame(this.getSize() -1)

                                    }
                                
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.getSequence()[0] ==  -1)
                        
                                    {
                                    super.previousFrame()

                                    }
                                
                        else {
                            super.nextFrame()

                        }
                            
this.update()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.getSequence()[0] ==  -1)
                        
                                    {
                                    super.nextFrame()

                                    }
                                
                        else {
                            super.previousFrame()

                        }
                            
this.update()
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index
super.setFrame(index)
this.update()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.currentHeight= this.getDrawHeight() *this.getFrame() /this.getSize()
}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
graphics!!.drawRegion(this.getImage(), this.getStartX(), this.getStartY(), this.getDrawWidth(), this.currentHeight, Sprite.TRANS_NONE, x, y, anchor)
}


}
                
            

