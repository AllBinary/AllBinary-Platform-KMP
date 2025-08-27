
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
        package org.allbinary.animation.compound




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.RotationAnimation
import org.allbinary.direction.Direction
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.math.Angle
import org.allbinary.math.AngleInfo

open public class SimultaneousCompoundRotationAnimation : RotationAnimation {
        

    private var animationInterfaceArray: Array<RotationAnimation?>
public constructor        (animationInterfaceArray: Array<RotationAnimation?>, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var animationInterfaceArray = animationInterfaceArray


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.animationInterfaceArray= animationInterfaceArray
}

override fun setFrame(frameIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frameIndex = frameIndex




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.setFrame(frameIndex)
}

}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getFrame()
}


                @Throws(Exception::class)
            override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getAnimationSize()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getSize()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.previousFrame()
}

}


                @Throws(Exception::class)
            override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.nextFrame()
}

}

override fun previousRotation()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.previousRotation()
}

}

override fun nextRotation()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.nextRotation()
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

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.paint(graphics, x, y)
}

}

override fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y


                    var z = z




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.paintThreed(graphics, x, y, z)
}

}

override fun setFrame(direction: Direction)
        //nullable = true from not(false or (false and false)) = true
{

                    var direction = direction




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.setFrame(direction)
}

}

override fun setFrame(angle: Angle)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.setFrame(angle)
}

}

override fun adjustFrame(newAngle: Angle)
        //nullable = true from not(false or (false and false)) = true
{

                    var newAngle = newAngle
this.adjustFrame(newAngle!!.getValue())
}

override fun adjustFrame(angle: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.adjustFrame(angle)
}

}

override fun getAngleInfoP()
        //nullable = true from not(false or (false and true)) = true
: AngleInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getAngleInfoP()
}


open fun getAnimationInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<RotationAnimation?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterfaceArray
}


open fun setAnimationInterfaceArray(animationInterfaceArray: Array<RotationAnimation?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var animationInterfaceArray = animationInterfaceArray
this.animationInterfaceArray= animationInterfaceArray
}


                @Throws(Exception::class)
            override fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        {this.animationInterfaceArray[index]!!.set(gl)
}

}


}
                
            

