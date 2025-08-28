
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
        package org.allbinary.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.cache.BaseCircularPool
import org.allbinary.util.CircularIndexUtil

open public class AllBinaryLayerCircularPool : BaseCircularPool {
        
protected constructor        ()

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun init(allbinaryLayerFactoryInterface: AllBinaryLayerFactoryInterface, total: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allbinaryLayerFactoryInterface = allbinaryLayerFactoryInterface
var total = total
this.circularIndexUtil= CircularIndexUtil.getInstance(total)
OBJECT_ARRAY= arrayOfNulls(total)




                        for (localIndex in 0 until total)

        

        Updates for KMP build        
        {
OBJECT_ARRAY[localIndex]= allbinaryLayerFactoryInterface!!.getInstance()
}

}


}
                
            

