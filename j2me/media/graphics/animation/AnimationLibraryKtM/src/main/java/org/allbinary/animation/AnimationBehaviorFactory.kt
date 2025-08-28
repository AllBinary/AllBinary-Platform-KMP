
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class AnimationBehaviorFactory
            : Object
         {
        

        companion object {
            
    private val instance: AnimationBehaviorFactory = AnimationBehaviorFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnimationBehaviorFactory

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
        
open fun getOrCreateInstance()
        //nullable = true from not(false or (false and true)) = true
: AnimationBehavior

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AnimationBehavior.getInstance()
}


}
                
            

