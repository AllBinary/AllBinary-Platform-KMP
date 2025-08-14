
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
import org.allbinary.util.CircularIndexUtil

open public class CompoundIndexedAnimation : IndexedAnimation
                , CompoundAnimationInterface {
        

    private var circularIndexUtil: CircularIndexUtil

    private var animationInterfaceArray: Array<IndexedAnimation?>
public constructor        (animationInterfaceArray: Array<IndexedAnimation?>, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var animationInterfaceArray = animationInterfaceArray


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.animationInterfaceArray= animationInterfaceArray
this.circularIndexUtil= CircularIndexUtil.getInstance(this.animationInterfaceArray!!.size)
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index
this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!.setFrame(index)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!.getFrame()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!.getSize()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!.previousFrame()
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
{this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!.nextFrame()
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!.paint(graphics, x, y)
}

override fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y


                    var z = z
this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!.paintThreed(graphics, x, y, z)
}

override fun getCurrentAnimation()
        //nullable = true from not(false or (false and true)) = true
: IndexedAnimation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceArray[this.circularIndexUtil!!.getIndex()]!!
}

override fun nextAnimation()
        //nullable = true from not(false or (false and true)) = true
{
    var frame: Int = this.getFrame()!!
            

this.circularIndexUtil!!.next()
this.setFrame(frame)
}

override fun previousAnimation()
        //nullable = true from not(false or (false and true)) = true
{
    var frame: Int = this.getFrame()!!
            

this.circularIndexUtil!!.previous()
this.setFrame(frame)
}

override fun setAnimation(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index

    var frame: Int = this.getFrame()!!
            

this.circularIndexUtil!!.setIndex(index)
this.setFrame(frame)
}


open fun getAnimationInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<IndexedAnimation?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterfaceArray
}


open fun setAnimationInterfaceArray(animationInterfaceArray: Array<IndexedAnimation?>)
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




                        for (index in this.animationInterfaceArray!!.size downTo 0)


        {this.animationInterfaceArray[index]!!.set(gl)
}

}


}
                
            

