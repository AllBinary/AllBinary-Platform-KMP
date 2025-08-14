
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.animation.text




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.AnimationBehavior

open public class AdjustCustomTextAnimation : CustomTextAnimation {
        

    private var dx: Int

    private var dy: Int
public constructor        (text: String, fontSize: Int, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(text, fontSize, animationBehavior){

                    var text = text


                    var fontSize = fontSize


                    var dx = dx


                    var dy = dy


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.dx= dx
this.dy= dy
}

override fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx
}

override fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx
this.dx= dx
}

override fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dy
}

override fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dy = dy
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
                
            

