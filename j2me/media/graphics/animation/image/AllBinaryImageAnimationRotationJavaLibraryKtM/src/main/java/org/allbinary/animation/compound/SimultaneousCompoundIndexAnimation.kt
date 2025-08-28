
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
import org.allbinary.animation.IndexedAnimation
import org.allbinary.logic.math.PrimitiveIntUtil

open public class SimultaneousCompoundIndexAnimation : IndexedAnimation {
        

    private var animationInterfaceArray: Array<IndexedAnimation?>
public constructor        (animationInterfaceArray: Array<IndexedAnimation?>, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior)

        Updates for KMP build        
        {
    //var animationInterfaceArray = animationInterfaceArray
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.animationInterfaceArray= animationInterfaceArray
}


open fun setFrame(frameIndex: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var frameIndex = frameIndex




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
this.animationInterfaceArray[index]!!.setFrame(frameIndex)
}

}


open fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getFrame()
}


                @Throws(Exception::class)
            
open fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getAnimationSize()
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[0]!!.getSize()
}


open fun previousFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
this.animationInterfaceArray[index]!!.previousFrame()
}

}


                @Throws(Exception::class)
            
open fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
this.animationInterfaceArray[index]!!.nextFrame()
}

}


open fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var sequence = sequence
}


open fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PrimitiveIntUtil.getArrayInstance()
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var x = x
    //var y = y




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
this.animationInterfaceArray[index]!!.paint(graphics, x, y)
}

}


open fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var x = x
    //var y = y
    //var z = z




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
this.animationInterfaceArray[index]!!.paintThreed(graphics, x, y, z)
}

}


                @Throws(Exception::class)
            
open fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl




                        for (index in this.animationInterfaceArray!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
this.animationInterfaceArray[index]!!.set(gl)
}

}


open fun getAnimationInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<IndexedAnimation?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterfaceArray
}


open fun setAnimationInterfaceArray(animationInterfaceArray: Array<IndexedAnimation?>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var animationInterfaceArray = animationInterfaceArray
this.animationInterfaceArray= animationInterfaceArray
}


}
                
            

