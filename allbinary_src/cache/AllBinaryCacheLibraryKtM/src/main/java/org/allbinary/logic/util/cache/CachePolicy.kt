
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
        package org.allbinary.logic.util.cache




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CachePolicy
            : Object
         {
        

    private val name: String

    private var maxTime: Long= 0

    private var maxSize: Long= 0
public constructor        (name: String, maxTime: Long, maxSize: Long)
            : super()
        

        Updates for KMP build        
        {
var name = name
var maxTime = maxTime
var maxSize = maxSize
this.name= name
this.setMaxTime(maxTime)
this.setMaxSize(maxSize)
}


open fun getMaxTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxTime
}


open fun setMaxTime(maxTime: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var maxTime = maxTime
this.maxTime= maxTime
}


open fun getMaxSize()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxSize
}


open fun setMaxSize(maxSize: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var maxSize = maxSize
this.maxSize= maxSize
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            

