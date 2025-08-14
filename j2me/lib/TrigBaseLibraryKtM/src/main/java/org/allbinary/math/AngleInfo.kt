
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
        package org.allbinary.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class AngleInfo
            : Object
         {
        

        companion object {
            
open fun getInstance(angleIncrement: Short)
        //nullable =  from not(true or (false and false)) = 
: AngleInfo{

                    var angleIncrement = angleIncrement



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AngleInfo(AngleIncrementInfoFactory.getInstance()!!.getInstance(angleIncrement))
}


    private val ANGLE: String = "Angle: "

        }
            
    private val angleIncrementInfo: AngleIncrementInfo

    private var angle: Short = 0
private constructor        (angleIncrementInfo: AngleIncrementInfo)
            : super()
        {

                    var angleIncrementInfo = angleIncrementInfo
this.angleIncrementInfo= angleIncrementInfo
}


    private val frameUtil: FrameUtil = FrameUtil.getInstance()!!
            

open fun adjustAngle(frame: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame

    var newAngle: Int = this.angleIncrementInfo!!.getAngleIncrement() *frame -90

this.setAngle(frameUtil!!.adjustAngleToFrameAngle(newAngle).toShort())
}


open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Short{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angle
}


open fun setAngle(angle: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.angle= angle
}


open fun getAngleIncrementInfo()
        //nullable = true from not(false or (false and true)) = true
: AngleIncrementInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.angleIncrementInfo
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(ANGLE)
stringBuffer!!.append(this.angle)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.getAngleIncrementInfo()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

