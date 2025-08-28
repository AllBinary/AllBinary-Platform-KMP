
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
        package org.allbinary.data.tables.advertisement.areas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.advertisement.area.AdvertisementAreaInterface
import org.allbinary.data.tables.BasicDataTableInterface
interface AdvertisementAreasEntityInterface : BasicDataTableInterface {
        

                @Throws(Exception::class)
            
open fun get(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun get(storeName: String, advertisementAreaName: String)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementAreaInterface

        Updates for KMP build        
        

open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

