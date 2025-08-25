
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.logic.math.PrimitiveIntUtil

open public class SimultaneousCompoundIndexedAnimation : IndexedAnimation {
        

    private var animationInterfaceArray: Array<Animation?>
public constructor        (animationInterfaceArray: Array<Animation?>, animationBehavior: AnimationBehavior)                        

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

    var indexedAnimation: IndexedAnimation





                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)


        {indexedAnimation= this.animationInterfaceArray[index]!! as IndexedAnimation
indexedAnimation!!.setFrame(frameIndex)
}

}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var indexedAnimation: IndexedAnimation = this.animationInterfaceArray[0]!! as IndexedAnimation




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return indexedAnimation!!.getFrame()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var indexedAnimation: IndexedAnimation = this.animationInterfaceArray[0]!! as IndexedAnimation




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return indexedAnimation!!.getSize()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{
    var indexedAnimation: IndexedAnimation





                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)


        {indexedAnimation= this.animationInterfaceArray[index]!! as IndexedAnimation
indexedAnimation!!.previousFrame()
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


                @Throws(Exception::class)
            override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)


        {this.animationInterfaceArray[index]!!.nextFrame()
}

}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y

    var size: Int = this.animationInterfaceArray!!.size
                





                        for (index in 0 until size)


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

    var size: Int = this.animationInterfaceArray!!.size
                





                        for (index in 0 until size)


        {this.animationInterfaceArray[index]!!.paintThreed(graphics, x, y, z)
}

}


open fun getAnimationInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Animation?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterfaceArray
}


open fun setAnimationInterfaceArray(animationInterfaceArray: Array<Animation?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var animationInterfaceArray = animationInterfaceArray
this.animationInterfaceArray= animationInterfaceArray
}


}
                
            

