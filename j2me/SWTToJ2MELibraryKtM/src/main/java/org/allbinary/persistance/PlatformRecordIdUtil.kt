
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
        package org.allbinary.persistance



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class PlatformRecordIdUtil
            : Object
         {
        

        companion object {


    private val instance: PlatformRecordIdUtil = PlatformRecordIdUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlatformRecordIdUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val PLATFORM_SHORT_NAME: String = "AVN"

open fun getRecordId(abeClientInformation: AbeClientInformationInterface, baseRecordId: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation


                    var baseRecordId = baseRecordId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(abeClientInformation!!.toShortString())!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append(PLATFORM_SHORT_NAME)!!.append(baseRecordId)!!.toString()
}


}
                
            

