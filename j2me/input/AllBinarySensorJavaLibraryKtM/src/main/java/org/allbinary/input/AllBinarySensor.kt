
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
        package org.allbinary.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AllBinarySensor
            : Object
        
                , AllBinarySensorListener {
        
companion object {
            
    val NULL_ALLBINARY_SENSOR: AllBinarySensor = AllBinarySensor()

    private var max: Int = 100

    open fun setMax(max: Int)
        //nullable = true from not(false or (false and false)) = true
{
var max = max
AllBinarySensor.max= max
}


    open fun getMax()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return max
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
protected constructor ()
            : super()
        {
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    open fun update()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinarySensor.getMax()
}


    open fun shutdown()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(commonStrings!!.START, this, "shutdown")
}


    override fun onSensorChange()
        //nullable = true from not(false or (false and true)) = true
{
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)
}


}
                
            

