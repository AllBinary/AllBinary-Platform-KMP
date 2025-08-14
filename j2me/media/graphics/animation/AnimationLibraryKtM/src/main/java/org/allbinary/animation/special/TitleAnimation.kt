
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
        package org.allbinary.animation.special




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.IndexedAnimationBehavior
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.PrimitiveIntUtil

open public class TitleAnimation : SpecialAnimation {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    var deltaX: Float= 0.0f

    var deltaY: Float= 0.0f

    var deltaZ: Float= 0.0f

    val basicColorArray: Array<BasicColor?>

    val dxArray: IntArray

    val dyArray: IntArray

    val widthP: Int

    val animationInterfaceArray: Array<IndexedAnimation?>

    val sizeP: Int

    val y: Int

    private var lastFrameStartTime: Long

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            
public constructor        (animationInterfaceArray: Array<IndexedAnimation?>, basicColorArray: Array<BasicColor?>, dxArray: IntArray, dyArray: IntArray)                        

                            : this(animationInterfaceArray, basicColorArray, dxArray, dyArray, 0, Integer.MIN_VALUE, IndexedAnimationBehavior(1, 250)){

                    var animationInterfaceArray = animationInterfaceArray


                    var basicColorArray = basicColorArray


                    var dxArray = dxArray


                    var dyArray = dyArray


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (animationInterfaceArray: Array<IndexedAnimation?>, basicColorArray: Array<BasicColor?>, dxArray: IntArray, dyArray: IntArray, y: Int, width: Int)                        

                            : this(animationInterfaceArray, basicColorArray, dxArray, dyArray, y, width, IndexedAnimationBehavior(1, 250)){

                    var animationInterfaceArray = animationInterfaceArray


                    var basicColorArray = basicColorArray


                    var dxArray = dxArray


                    var dyArray = dyArray


                    var y = y


                    var width = width


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (animationInterfaceArray: Array<IndexedAnimation?>, basicColorArray: Array<BasicColor?>, dxArray: IntArray, dyArray: IntArray, y: Int, width: Int, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var animationInterfaceArray = animationInterfaceArray


                    var basicColorArray = basicColorArray


                    var dxArray = dxArray


                    var dyArray = dyArray


                    var y = y


                    var width = width


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.lastFrameStartTime= System.currentTimeMillis()
this.animationInterfaceArray= animationInterfaceArray
this.sizeP= this.animationInterfaceArray!!.size
this.basicColorArray= basicColorArray
this.dxArray= dxArray
this.dyArray= dyArray
this.y= y
this.widthP= width
this.reset()
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
    var currentTime: Long = System.currentTimeMillis()!!
            


    var totalTimeElapsed: Long = currentTime -lastFrameStartTime


    var indexedAnimationBehavior: IndexedAnimationBehavior = this.getAnimationBehavior() as IndexedAnimationBehavior


    
                        if(totalTimeElapsed > indexedAnimationBehavior!!.frameDelayTime)
                        
                                    {
                                    this.previousFrame()
this.lastFrameStartTime= currentTime

                                    }
                                

    
                        if(this.animationInterfaceArray[0]!!.getFrame() == 0)
                        
                                    {
                                    indexedAnimationBehavior!!.loopIndex++

                                    }
                                
}

override fun isComplete()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var indexedAnimationBehavior: IndexedAnimationBehavior = this.getAnimationBehavior() as IndexedAnimationBehavior


    
                        if(indexedAnimationBehavior!!.loopTotal ==  -1 || indexedAnimationBehavior!!.loopIndex < indexedAnimationBehavior!!.loopTotal || this.getFrame() != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
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

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getSize()
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getFrame()
}

override fun setFrame(frame: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame




                        for (index in 0 until sizeP)


        {this.animationInterfaceArray[index]!!.setFrame(frame)
}

}

override fun setLastFrame()
        //nullable = true from not(false or (false and true)) = true
{this.setFrame(this.getSize() -1)
}

override fun reset()
        //nullable = true from not(false or (false and true)) = true
{this.setLastFrame()

    var indexedAnimationBehavior: IndexedAnimationBehavior = (this.getAnimationBehavior() as IndexedAnimationBehavior)

indexedAnimationBehavior!!.reset()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in 0 until sizeP)


        {this.animationInterfaceArray[index]!!.previousFrame()
}

}


open fun paint(graphics: Graphics, frame: Int, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var frame = frame


                    var x = x


                    var y = y
this.setFrame(frame)
this.paint(graphics, x, y)
}


    val CLEAR_COLOR: BasicColor = BasicColorFactory.getInstance()!!.CLEAR_COLOR
override fun paint(graphics: Graphics, ax: Int, ay: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var ax = ax


                    var ay = ay

    var x: Int = 0


    
                        if(this.widthP != Integer.MIN_VALUE)
                        
                                    {
                                    x= ((displayInfoSingleton!!.getLastWidth() -this.widthP) /2)

                                    }
                                

    var deltaX: Int= 0


    var deltaY: Int= 0





                        for (index in 0 until sizeP)


        {deltaX= this.dxArray[index] +x
deltaY= this.dyArray[index] +y

    
                        if(this.basicColorArray[index] != CLEAR_COLOR)
                        
                                    {
                                    this.basicSetColorUtil!!.setBasicColorP(graphics, this.basicColorArray[index]!!)

                                    }
                                
this.animationInterfaceArray[index]!!.paint(graphics, deltaX, deltaY)
}

}


}
                
            

