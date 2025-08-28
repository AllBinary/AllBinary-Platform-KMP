
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
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.util.CircularIndexUtil

open public class ImageSegmentAnimation : ImageAnimation {
        

    private var startX: Int

    private var startY: Int

    private var drawWidth: Int

    private var drawHeight: Int

    private var circularIndexUtil: CircularIndexUtil

    private var sequenceArray: IntArray
protected constructor        (image: Image, animationBehavior: AnimationBehavior)                        

                            : this(image, PrimitiveIntUtil.getArrayInstance(), animationBehavior)

        Updates for KMP build        
        {
    //var image = image
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor        (image: Image, sequenceArray: IntArray, animationBehavior: AnimationBehavior)                        

                            : super(image, animationBehavior)

        Updates for KMP build        
        {
    //var image = image
    //var sequenceArray = sequenceArray
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.startX= 0
this.startY= 0
this.drawWidth= this.getImage()!!.getWidth()
this.drawHeight= this.getImage()!!.getHeight()
this.circularIndexUtil= CircularIndexUtil.getInstance(this.drawHeight)
this.sequenceArray= sequenceArray
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.circularIndexUtil!!.next()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.circularIndexUtil!!.previous()
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var index = index
this.circularIndexUtil!!.setIndex(index)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.circularIndexUtil!!.getIndex()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.circularIndexUtil!!.getSize()
}

override fun setSequence(sequenceArray: IntArray)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var sequenceArray = sequenceArray
this.sequenceArray= sequenceArray
}

override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.sequenceArray
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y
}


open fun getStartX()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startX
}


open fun setStartX(startX: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var startX = startX
this.startX= startX
}


open fun getStartY()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startY
}


open fun setStartY(startY: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var startY = startY
this.startY= startY
}


open fun getDrawWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return drawWidth
}


open fun setDrawWidth(drawWidth: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var drawWidth = drawWidth
this.drawWidth= drawWidth
}


open fun getDrawHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return drawHeight
}


open fun setDrawHeight(drawHeight: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var drawHeight = drawHeight
this.drawHeight= drawHeight
}


}
                
            

