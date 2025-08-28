
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
        package org.allbinary.logic.system




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import org.allbinary.data.resource.ResourceUtil

open public class PlatformAssetManager
            : Object
         {
        

        companion object {
            
    private val instance: PlatformAssetManager = PlatformAssetManager()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlatformAssetManager{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getResourceAsStream(resource: String)
        //nullable = true from not(false or (false and false)) = true
: InputStream{
    //var resource = resource

    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!


    var inputStream: InputStream = resourceUtil!!.getResourceAsStream(resource)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream
}


}
                
            

