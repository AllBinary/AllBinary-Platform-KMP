
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
        package org.allbinary.logic.util.queue




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class BasicQueue
            : Object
         {
        

    val queueVector: Vector = Vector()
protected constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun offer(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var anyType = anyType
this.queueVector!!.add(anyType)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun remove(anyType: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var anyType = anyType
this.queueVector!!.remove(anyType)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun removeLast()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {

    var anyType: Any = this.queueVector!!.lastElement()!!

this.queueVector!!.remove(anyType)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
}


}
                
            

