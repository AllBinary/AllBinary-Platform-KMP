
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
        package org.allbinary.logic.util.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.cache.BaseCircularPool
import org.allbinary.util.CircularIndexUtil

open public class AllBinaryEventCircularPool : BaseCircularPool {
        
public constructor        (max: Int)

        Updates for KMP build        
        {
var max = max
this.OBJECT_ARRAY= arrayOfNulls(max)
this.circularIndexUtil= CircularIndexUtil.getInstance(max)
}


open fun init(allBinaryEventObjectFactoryInterface: AllBinaryEventObjectFactoryInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryEventObjectFactoryInterface = allBinaryEventObjectFactoryInterface
this.circularIndexUtil!!.setIndex(0)

    var size: Int = this.circularIndexUtil!!.getSize()!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
OBJECT_ARRAY[index]= allBinaryEventObjectFactoryInterface!!.getInstance()
}

}


}
                
            

