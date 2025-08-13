
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
        package org.allbinary.logic.system.os



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class OperatingSystemFactory
            : Object
         {
        

        companion object {
            
    private val instance: OperatingSystemFactory = OperatingSystemFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OperatingSystemFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var genericOperatingSystem: GenericOperatingSystem = NoOperatingSystem.NO_OPERATING_SYSTEM
private constructor        ()
            : super()
        {}


open fun getOperatingSystemInstance()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem{
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


        try {
            
    var osString: String = StringMaker().
                            append(
                            "OperatingSystem Info: ")!!.append(genericOperatingSystem!!.toString())!!.toString()!!
            

System.out.println(osString)
logUtil!!.put(osString, this, commonStrings!!.GET_INSTANCE)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericOperatingSystem
}


}
                
            

