
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
        package org.allbinary.game.layer.hud.basic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.math.MathUtil
import org.allbinary.logic.math.PrimitiveLongSingleton
import org.allbinary.logic.math.PrimitiveLongUtil

open public class VelocityWidget : BasicHud {
        

    private val KILOMETERS_PER_HOUR_STR: CharArray = charArrayOf(' ','k','m','/','h')

    private val totalChars: Int = KILOMETERS_PER_HOUR_STR.size
                

    private var velocity: Int

    private var maxVelocity: Int

    private var string: CharArray = PrimitiveLongSingleton.getInstance()!!.ZERO

    private var totalDigits: Int = 1

    private val primitiveLongUtil: PrimitiveLongUtil

    private val offset: Int

    private var offset2: Int= 0
public constructor        (powerOfTenVelocity: Int, location: Int, direction: Int, basicColor: BasicColor)                        

                            : super(location, direction, 14, MyFont.getInstance()!!.getSize() *(5 +MathUtil.getInstance()!!.getTotalDigits(powerOfTenVelocity) +1), 2, basicColor){

                    var powerOfTenVelocity = powerOfTenVelocity


                    var location = location


                    var direction = direction


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.maxVelocity= powerOfTenVelocity
this.velocity= 0
this.primitiveLongUtil= PrimitiveLongUtil(powerOfTenVelocity)

    var myFont: MyFont = MyFont.getInstance()!!
            

this.offset= myFont!!.stringWidth(this.primitiveLongUtil!!.getMaxDigits()) +myFont!!.stringWidth(2)
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.velocity
}


open fun add(value: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.set(this.velocity +value)
}


open fun set(value: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

    var lastVelocity: Int = this.velocity

this.velocity= value

    
                        if(this.velocity > this.maxVelocity)
                        
                                    {
                                    this.velocity= 0

                                    }
                                

    
                        if(lastVelocity != this.velocity)
                        
                                    {
                                    this.string= primitiveLongUtil!!.getCharArray(this.velocity *18)

    
                        if(OpenGLFeatureUtil.getInstance()!!.isAnyThreed())
                        
                                    {
                                    this.totalDigits= primitiveLongUtil!!.getCurrentTotalDigits() +1

                                    }
                                
                        else {
                            this.totalDigits= primitiveLongUtil!!.getCurrentTotalDigits()

                        }
                            

    var myFont: MyFont = MyFont.getInstance()!!
            

this.offset2= this.offset -myFont!!.stringWidth(this.totalDigits) -myFont!!.stringWidth(2)

                                    }
                                
}


open fun reduce(value: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.set(this.velocity -value)
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
super.paint(graphics, string, 0, this.totalDigits, KILOMETERS_PER_HOUR_STR, 0, this.totalChars, offset2, offset)
}


}
                
            

