
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
        
import org.allbinary.logic.NullUtil
import org.allbinary.util.CircularIndexUtil

open public class BaseCircularPool
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var circularIndexUtil: CircularIndexUtil = CircularIndexUtil.NULL_CIRCULAR_INDEX_UTIL

    var OBJECT_ARRAY: Array<Any?> = NullUtil.getInstance()!!.NULL_OBJECT_ARRAY

                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getNextInstance()
        //nullable = true from not(false or (false and true)) = true
: Any{
    var anyType: Any = OBJECT_ARRAY[this.circularIndexUtil!!.getIndex()]!!

this.circularIndexUtil!!.next()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
}


open fun init(allBinaryObjectFactoryInterface: AllBinaryObjectFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryObjectFactoryInterface = allBinaryObjectFactoryInterface
this.circularIndexUtil!!.setIndex(0)

    var size: Int = this.circularIndexUtil!!.getSize()!!





                        for (index in 0 until size)

        {OBJECT_ARRAY[index]= allBinaryObjectFactoryInterface!!.getInstance()
}

}


                @Throws(Exception::class)
            
open fun getInstance(index: Int)
        //nullable =  from not(true or (false and false)) = 
: Any{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OBJECT_ARRAY[index]!!
}


}
                
            

