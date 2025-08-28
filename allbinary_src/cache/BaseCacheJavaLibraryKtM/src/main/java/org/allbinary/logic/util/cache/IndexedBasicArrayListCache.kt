
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
        
import org.allbinary.string.CommonStrings

open public class IndexedBasicArrayListCache : BaseBasicArrayListCache
                , CacheInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var size: Int = 0

    var index: Int = 0
public constructor        ()

        Updates for KMP build        
        {
}

public constructor        (size: Int)

        Updates for KMP build        
        {
var size = size
this.init(size)
}


                @Throws(Exception::class)
            
open fun init(size: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var size = size

    
                        if(this.size < size)
                        
                                    {
                                    this.list.ensureCapacity(size)




                        for (index in size -1 downTo this.size)

        

        Updates for KMP build        
        {
this.add()
}

this.size= size

                                    }
                                
}


open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Any

        Updates for KMP build        
        {
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.objectArray[index]!!
}


                @Throws(Exception::class)
            
open fun add()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun add(anyType: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var anyType = anyType
this.list.add(anyType)
}


                @Throws(Exception::class)
            override fun add(cacheableInterface: CacheableInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var cacheableInterface = cacheableInterface
this.list.add(cacheableInterface)
}


                @Throws(Exception::class)
            override fun add(cacheableInterfaces: Array<CacheableInterface?>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var cacheableInterfaces = cacheableInterfaces



                            throw Exception("No Imple")
}

override fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
index= 0
}


}
                
            

