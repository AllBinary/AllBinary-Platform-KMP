
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
        package org.allbinary.system




        import java.lang.Object        
        
        import java.lang.Runtime
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class Memory
            : Object
         {
        

        companion object {
            
open fun getInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()


    var maxUtilizedMemoryAvailable: Long = Runtime.getRuntime()!!.maxMemory()!!
            


    var memoryUsed: Long = Runtime.getRuntime()!!.totalMemory()!!
            

stringBuffer!!.append(
                            "APK Memory: Available: ")
stringBuffer!!.append(maxUtilizedMemoryAvailable)
stringBuffer!!.append(
                            "/")
stringBuffer!!.append(Runtime.getRuntime()!!.maxMemory())
stringBuffer!!.append(
                            " Used: ")
stringBuffer!!.append(memoryUsed)
stringBuffer!!.append(
                            " Free: ")
stringBuffer!!.append(maxUtilizedMemoryAvailable -memoryUsed)
stringBuffer!!.append(
                            "/")
stringBuffer!!.append(Runtime.getRuntime()!!.maxMemory() -memoryUsed)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

