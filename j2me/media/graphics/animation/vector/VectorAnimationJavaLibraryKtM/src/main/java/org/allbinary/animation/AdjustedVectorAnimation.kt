
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
        package org.allbinary.animation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor

open public class AdjustedVectorAnimation : VectorAnimation {
        

    private var dx: Int

    private var dy: Int
public constructor        (currentPoints: Array<Array<IntArray?>?>, basicColor: BasicColor, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(currentPoints, basicColor, animationBehavior){

                    var currentPoints = currentPoints


                    var basicColor = basicColor


                    var dx = dx


                    var dy = dy


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.dx= dx
this.dy= dy
}

public constructor        (currentPoints: Array<IntArray?>, basicColor: BasicColor, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(currentPoints, basicColor, animationBehavior){

                    var currentPoints = currentPoints


                    var basicColor = basicColor


                    var dx = dx


                    var dy = dy


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
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
                
            

