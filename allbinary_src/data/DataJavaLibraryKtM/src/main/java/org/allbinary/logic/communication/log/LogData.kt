
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
        package org.allbinary.logic.communication.log



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPathData

open public class LogData
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val MAX: Long = 5000000

    val extension: String = "log"

    val backupFileExt: String = AbPathData.getInstance()!!.EXTENSION_SEP +"bak" +AbPathData.getInstance()!!.EXTENSION_SEP +"txt"

    val ALLBINARY: String = "allbinary"

    val NAME: String = "LOG_NAME"

    val DESCRIPTION: String = "LOG_DESCRIPTION"

}
                
            

