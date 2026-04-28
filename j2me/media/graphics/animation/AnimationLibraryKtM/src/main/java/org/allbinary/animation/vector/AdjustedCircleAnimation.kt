
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.AndroidUtil
import org.allbinary.graphics.color.BasicColor

open public class AdjustedCircleAnimation : CircleAnimation {
        
companion object {
            
    open fun createAnimation(width: Int, height: Int, xAdjustment: Int, yAdjustment: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: AdjustedCircleAnimation{
    //var width = width
    //var height = height
    //var xAdjustment = xAdjustment
    //var yAdjustment = yAdjustment
    //var basicColor = basicColor

    var adjustedCircleAnimation: AdjustedCircleAnimation = AdjustedCircleAnimation(width, height, basicColor)

adjustedCircleAnimation!!.initXY(xAdjustment, yAdjustment)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adjustedCircleAnimation
}


    open fun createW(width: Int, height: Int, innerWidth: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: AdjustedCircleAnimation{
    //var width = width
    //var height = height
    //var innerWidth = innerWidth
    //var basicColor = basicColor

    var adjustedCircleAnimation: AdjustedCircleAnimation = AdjustedCircleAnimation(width, height, basicColor)

adjustedCircleAnimation!!.init(innerWidth)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adjustedCircleAnimation
}


        }
            
    private var xAdjustment: Int= 0

    private var yAdjustment: Int= 0
public constructor (width: Int, height: Int, basicColor: BasicColor)                        

                            : super(width, height, basicColor){
    //var width = width
    //var height = height
    //var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun initXY(xAdjustment: Int, yAdjustment: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var xAdjustment = xAdjustment
    //var yAdjustment = yAdjustment
this.xAdjustment= xAdjustment
this.yAdjustment= yAdjustment
}


    open fun init(innerWidth: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var innerWidth = innerWidth

    
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


    override fun paintXY(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
this.basicSetColorUtil!!.setBasicColorP3(graphics, this.getBasicColorP(), this.getColor())
graphics.drawArc(x +this.xAdjustment, y +this.yAdjustment, this.width, this.height, 0, TOTAL_ANGLE)
}


}
                
            

