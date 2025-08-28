
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
        
import org.allbinary.util.BasicArrayList

open public class BasicArrayListPool : AbstractArrayListPool {
        
public constructor        (cacheableInterfaceFactoryInterface: CacheableInterfaceFactoryInterface)                        

                            : super(cacheableInterfaceFactoryInterface)

        Updates for KMP build        
        {
var cacheableInterfaceFactoryInterface = cacheableInterfaceFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.buffers.clear()
}


                @Throws(Exception::class)
            
open fun remove(key: Any)
        //nullable = true from not(false or (false and false)) = true
: CacheableInterface

        Updates for KMP build        
        {
var key = key

    var size: Int = this.buffers.size()!!


    
                        if(size > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buffers.remove(size -1) as CacheableInterface

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.cacheableInterfaceFactoryInterface!!.getInstance(key)

                        }
                            
}


                @Throws(Exception::class)
            
open fun addAll(usedList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var usedList = usedList




                        for (index in usedList!!.size()!!  - 1  downTo 0)

        

        Updates for KMP build        
        {

    var anyType: CacheableInterface = usedList!!.objectArray[index]!! as CacheableInterface

this.add(anyType)
}

usedList!!.clear()
}


                @Throws(Exception::class)
            
open fun releaseUsedBackToPool(usedList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var usedList = usedList




                        for (index in usedList!!.size()!!  - 1  downTo 0)

        

        Updates for KMP build        
        {

    var list: BasicArrayListCacheable = usedList!!.objectArray[index]!! as BasicArrayListCacheable


    
                        if(list.size() == 0)
                        
                                    {
                                    usedList!!.remove(index)
this.add(list)

                                    }
                                
}

}


}
                
            

