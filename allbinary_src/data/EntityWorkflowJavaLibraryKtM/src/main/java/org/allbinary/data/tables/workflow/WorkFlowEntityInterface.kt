
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
        package org.allbinary.data.tables.workflow




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.BasicDataTableInterface
import org.allbinary.logic.control.workflow.WorkFlowInterface
import org.allbinary.logic.system.security.licensing.LicensingException
interface WorkFlowEntityInterface : BasicDataTableInterface {
        

open fun get(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

        Updates for KMP build        
        

                @Throws(Exception::class, LicensingException::class)
            
open fun get(name: String, storeName: String)
        //nullable = true from not(false or (false and false)) = true
: WorkFlowInterface

        Updates for KMP build        
        

open fun delete(name: String, storeName: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

