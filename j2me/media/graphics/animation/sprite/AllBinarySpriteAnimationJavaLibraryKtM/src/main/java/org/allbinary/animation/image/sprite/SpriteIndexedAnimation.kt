
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
        package org.allbinary.animation.image.sprite




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorUtil
import org.allbinary.graphics.color.ColorCompositeInterface
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels

open public class SpriteIndexedAnimation : IndexedAnimation
                , ColorCompositeInterface {
        

    val sprite: Sprite

    val image: Image

    private val basicColorArray: Array<BasicColor?>
public constructor        (sprite: Sprite, image: Image, animationBehavior: AnimationBehavior)                        

                            : this(sprite, image, BasicColorUtil.getInstance()!!.ZERO_ARRAY, animationBehavior){

                    var sprite = sprite


                    var image = image


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (sprite: Sprite, image: Image, basicColorArray: Array<BasicColor?>, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var sprite = sprite


                    var image = image


                    var basicColorArray = basicColorArray


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.sprite= sprite
this.image= image
this.basicColorArray= basicColorArray

    
                        if(this.basicColorArray!!.size != 0 && this.getSize() != this.basicColorArray!!.size)
                        
                                    {
                                    


                            throw Exception(StringMaker().
                            append(CommonLabels.getInstance()!!.TOTAL_LABEL)!!.append(this.getSize())!!.append("!=")!!.append(this.basicColorArray!!.size)!!.toString())

                                    }
                                
}


                @Throws(Exception::class)
            override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize()
}

override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor




                        for (index in 0 until this.basicColorArray!!.size)


        {
    
                        if(basicColor == this.basicColorArray[index])
                        
                                    {
                                    this.setFrame(index)
break;

                    

                                    }
                                
}

}

override fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{
    
                        if(this.basicColorArray!!.size < this.getFrame())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicColorArray[this.getFrame()]!!

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicColorFactory.getInstance()!!.WHITE

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
this.sprite.setPosition(x, y)
sprite.paint(graphics)
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
this.sprite.setPosition(x, y)
sprite.paint(graphics)
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
sprite.paint(graphics)
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{this.sprite.nextFrame()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{this.sprite.prevFrame()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.sprite.getRawFrameCount()
}

override fun setFrame(frame: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame
this.sprite.setFrame(frame)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.sprite.getFrame()
}

override fun isLastFrame()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.sprite.getFrame() == this.getSize() -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun getLastFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize()
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


open fun close()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Throwable::class)
            override fun finalize()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

