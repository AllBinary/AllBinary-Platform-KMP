
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
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.cache.BaseCircularPool
import org.allbinary.util.CircularIndexUtil

open public class GPointCircularPool : BaseCircularPool {
        
public constructor        (size: Int){
var size = size
this.circularIndexUtil= CircularIndexUtil.getInstance(size)
this.OBJECT_ARRAY= arrayOfNulls(size)




                        for (index in size -1 downTo 0)

        {
this.OBJECT_ARRAY[index]= CustomGPoint(0, 0)
}

}


}
                
            

