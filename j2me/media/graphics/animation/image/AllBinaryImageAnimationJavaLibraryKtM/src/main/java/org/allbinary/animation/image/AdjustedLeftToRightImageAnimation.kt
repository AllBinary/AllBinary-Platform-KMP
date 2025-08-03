
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
import org.allbinary.animation.AnimationBehavior

open public class AdjustedLeftToRightImageAnimation : LeftToRightImageAnimation {
        

    private var dx: Int= 0

    private var dy: Int= 0
public constructor        (image: Image, sequenceArray: IntArray, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(image, sequenceArray, animationBehavior){

                    var image = image


                    var sequenceArray = sequenceArray


                    var dx = dx


                    var dy = dy


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.init(dx, dy)
}


                @Throws(Exception::class)
            
open fun init(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx


                    var dy = dy
this.dx= dx
this.dy= dy
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
super.paint(graphics, x +this.dx, y +this.dy)
}


}
                
            

