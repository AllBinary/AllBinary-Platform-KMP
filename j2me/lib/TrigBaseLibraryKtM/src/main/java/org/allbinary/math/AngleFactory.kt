
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class AngleFactory
            : Object
         {
        
companion object {
            
    private val instance: AngleFactory = AngleFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AngleFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
var args = args

    var stringMaker: StringMaker = StringMaker()


    var angleFactory: AngleFactory = AngleFactory.getInstance()!!





                        for (index in 0 until 360)

        {
stringMaker!!.append(index)!!.append(CommonSeps.getInstance()!!.FORWARD_SLASH)!!.append(angleFactory!!.getClosestDirection(index)!!.getValue())!!.append(CommonSeps.getInstance()!!.NEW_LINE)
}

LogUtil.getInstance()!!.put(stringMaker!!.toString(), "main", "main")
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val TOTAL_ANGLE: Short = 360

    val QUARTER_TOTAL_ANGLE: Short = 90

    private val angleArray: Array<Angle?> = arrayOfNulls(TOTAL_ANGLE.toInt())

    private val NEGATIVE_ONE: Short =  -1

    val NOT_ANGLE: NamedAngle = NamedAngle(NEGATIVE_ONE, CommonStrings.getInstance()!!.EMPTY)

    val DOWN: NamedAngle

    val UP: NamedAngle

    val LEFT: NamedAngle

    val RIGHT: NamedAngle
public constructor ()
            : super()
        {

    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!


    var total: Short = angleArray!!.size.toShort()

UP= NamedAngle(0.toShort(), commonPhoneStrings!!.UP)
angleArray[0]= UP




                        for (index in 1 until 90)

        {
angleArray[index]= Angle(index.toShort())
}

RIGHT= NamedAngle(90.toShort(), commonPhoneStrings!!.RIGHT)
angleArray[90]= RIGHT




                        for (index in 91 until 180)

        {
angleArray[index]= Angle(index.toShort())
}

DOWN= NamedAngle(180.toShort(), commonPhoneStrings!!.DOWN)
angleArray[180]= DOWN




                        for (index in 181 until 270)

        {
angleArray[index]= Angle(index.toShort())
}

LEFT= NamedAngle(270.toShort(), commonPhoneStrings!!.LEFT)
angleArray[270]= LEFT




                        for (index in 271 until total)

        {
angleArray[index]= Angle(index.toShort())
}

}


    private val frameUtil: FrameUtil = FrameUtil.getInstance()!!

    open fun getInstance(index: Int)
        //nullable =  from not(true or (false and false)) = 
: Angle{
    //var index = index

    var adjustedIndex: Int = frameUtil!!.adjustAngleToFrameAngle(index).toInt()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleArray[adjustedIndex]!!
}


    open fun getClosestDirection(angle: Int)
        //nullable = true from not(false or (false and false)) = true
: Angle{
var angle = angle

    
                        if((angle >= 315 && angle < 360) || (angle >= 0 && angle < 45))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.UP

                                    }
                                
                             else 
    
                        if(angle >= 45 && angle < 135)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.RIGHT

                                    }
                                
                             else 
    
                        if(angle >= 135 && angle < 225)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.DOWN

                                    }
                                
                             else 
    
                        if(angle >= 225 && angle < 315)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.LEFT

                                    }
                                



                            throw RuntimeException()
}


    open fun getGeneralDirection()
        //nullable = true from not(false or (false and true)) = true
: Angle{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NOT_ANGLE
}


}
                
            

