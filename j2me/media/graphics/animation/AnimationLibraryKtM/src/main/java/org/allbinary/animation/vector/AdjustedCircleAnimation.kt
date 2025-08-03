
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
        package org.allbinary.animation.vector



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.AndroidUtil
import org.allbinary.graphics.color.BasicColor
import org.allbinary.math.AngleFactory

open public class AdjustedCircleAnimation : CircleAnimation {
        

    private var xAdjustment: Int

    private var yAdjustment: Int
public constructor        (width: Int, height: Int, xAdjustment: Int, yAdjustment: Int, basicColor: BasicColor)                        

                            : super(width, height, basicColor){

                    var width = width


                    var height = height


                    var xAdjustment = xAdjustment


                    var yAdjustment = yAdjustment


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.xAdjustment= xAdjustment
this.yAdjustment= yAdjustment
}

public constructor        (width: Int, height: Int, innerWidth: Int, basicColor: BasicColor)                        

                            : super(width, height, basicColor){

                    var width = width


                    var height = height


                    var innerWidth = innerWidth


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    
    var widthPortion: Int = (((innerWidth /3) *10) /7)

this.xAdjustment=  -((width shr 1) -widthPortion)
this.yAdjustment= this.xAdjustment

                                    }
                                
                        else {
                            this.xAdjustment=  -((width shr 1) -innerWidth)
this.yAdjustment= this.xAdjustment

                        }
                            
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())
graphics!!.drawArc(x +this.xAdjustment, y +this.yAdjustment, width, height, 0, TOTAL_ANGLE)
}


}
                
            

