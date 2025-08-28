
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
        package org.allbinary.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.Animation

open public class AnimationFrameToImageUtil
            : Object
         {
        

        companion object {
            
    private val instance: AnimationFrameToImageUtil = AnimationFrameToImageUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnimationFrameToImageUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstanceTranslate(width: Int, height: Int, animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
: Image{
var width = width
var height = height
var animationInterface = animationInterface

    var image: Image = GameFeatureImageCacheFactory.getInstance()!!.get(instance::class.toString()!!, ((width *3) shr 1), ((height *3) shr 1))!!


    var graphics: Graphics = image.getGraphics()!!


    var tranlateX: Int = (width shr 2)


    var tranlateY: Int = (height shr 2)

graphics.translate(tranlateX, tranlateY)
animationInterface!!.paint(graphics, 0, 0)
graphics.translate( -tranlateX,  -tranlateY)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun getInstance(width: Int, height: Int, animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Image{
var width = width
var height = height
var animationInterface = animationInterface

    var image: Image = GameFeatureImageCacheFactory.getInstance()!!.get(instance::class.toString()!!, width, height)!!


    var graphics: Graphics = image.getGraphics()!!

animationInterface!!.paint(graphics, 0, 0)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


}
                
            

