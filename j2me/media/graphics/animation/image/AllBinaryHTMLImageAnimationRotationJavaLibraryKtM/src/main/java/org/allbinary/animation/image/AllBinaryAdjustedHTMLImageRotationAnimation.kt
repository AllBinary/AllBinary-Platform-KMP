
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
import org.allbinary.math.AngleInfo

open public class AllBinaryAdjustedHTMLImageRotationAnimation : AllBinaryHTMLImageRotationAnimation {
        

    private var dx: Int= 0

    private var dy: Int= 0
public constructor        (originalImage: Image, image: Image, angleInfo: AngleInfo, totalAngle: Short, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(originalImage, image, angleInfo, totalAngle, animationBehavior){

                    var originalImage = originalImage


                    var image = image


                    var angleInfo = angleInfo


                    var totalAngle = totalAngle


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


open fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx
this.dx= dx
}


open fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.dx
}


open fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dy = dy
this.dy= dy
}


open fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.dy
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
super.paint(graphics, x +this.dx, y +this.dy)
}


}
                
            

