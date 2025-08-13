
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
        package org.allbinary.logic.system.hardware



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.string.CommonStrings

open public class SystemHardwareFactory
            : Object
         {
        

        companion object {
            
    private val instance: SystemHardwareFactory = SystemHardwareFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SystemHardwareFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private var hardwareInterface: HardwareInterface = NoHardware.getInstance()!!
            

open fun static_toString()
        //nullable = true from not(false or (false and true)) = true
: String{
    var osBuffer: StringMaker = StringMaker()

osBuffer!!.append(
                            "Hardware Info: \n")

    
                        if(hardwareInterface != 
                                    null
                                )
                        
                                    {
                                    osBuffer!!.append(hardwareInterface!!.toString())

                                    }
                                
                        else {
                            osBuffer!!.append(StringUtil.getInstance()!!.NULL_STRING)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return osBuffer!!.toString()
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun getInstance(operatingSystemInterface: GenericOperatingSystem)
        //nullable =  from not(true or (false and false)) = 
: HardwareInterface{

                    var operatingSystemInterface = operatingSystemInterface

        try {
            
    
                        if(hardwareInterface == NoHardware.getInstance())
                        
                                    {
                                    hardwareInterface= HardwareFactory.getInstance()!!.getInstance(operatingSystemInterface)

                                    }
                                
logUtil!!.put(
                            "Found Hardware", this, commonStrings!!.CONSTRUCTOR)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hardwareInterface
}


}
                
            

