
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
        package org.allbinary.device




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class OpenGLESGraphicsCompositeFactory
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLESGraphicsCompositeFactory = OpenGLESGraphicsCompositeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLESGraphicsCompositeFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var openGLESGraphicsFactory: OpenGLESGraphicsFactory = OpenGLESGraphicsFactory()

open fun set(openGLESGraphicsFactory: OpenGLESGraphicsFactory)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var openGLESGraphicsFactory = openGLESGraphicsFactory
this.openGLESGraphicsFactory= openGLESGraphicsFactory
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: OpenGLESGraphicsFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.openGLESGraphicsFactory
}


}
                
            

