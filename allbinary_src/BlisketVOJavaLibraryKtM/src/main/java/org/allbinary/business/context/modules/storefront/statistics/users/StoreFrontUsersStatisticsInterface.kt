
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
        package org.allbinary.business.context.modules.storefront.statistics.users




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tables.TableMappingInterface
interface StoreFrontUsersStatisticsInterface : TableMappingInterface {
        

open fun getNumberOfUsers()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        

open fun getNumberOfUsersByRole(role: String)
        //nullable = true from not(false or (false and false)) = true
: Long

        Updates for KMP build        
        

}
                
            

