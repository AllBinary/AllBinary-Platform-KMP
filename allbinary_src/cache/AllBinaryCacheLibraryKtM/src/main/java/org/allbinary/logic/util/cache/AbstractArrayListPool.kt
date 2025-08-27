
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
import org.allbinary.util.BasicArrayList

open public class AbstractArrayListPool
            : Object
        
                , PoolInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    var buffers: BasicArrayList = BasicArrayList()

    var cacheableInterfaceFactoryInterface: CacheableInterfaceFactoryInterface
public constructor        (cacheableInterfaceFactoryInterface: CacheableInterfaceFactoryInterface)
            : super()
        {

                    var cacheableInterfaceFactoryInterface = cacheableInterfaceFactoryInterface
this.cacheableInterfaceFactoryInterface= cacheableInterfaceFactoryInterface
}


                @Throws(Exception::class)
            
open fun clear()
        //nullable = true from not(false or (false and true)) = true
{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun remove(key: Any)
        //nullable = true from not(false or (false and false)) = true
: CacheableInterface{

                    var key = key



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun add(cacheableInterface: CacheableInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var cacheableInterface = cacheableInterface
buffers.add(cacheableInterface)
}


                @Throws(Exception::class)
            
open fun add(cacheableInterfaces: Array<CacheableInterface?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var cacheableInterfaces = cacheableInterfaces




                        for (index in 0 until cacheableInterfaces!!.size)

        {buffers.add(cacheableInterfaces[index]!!)
}

}


}
                
            

