
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
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.util.BasicArrayList
interface AbeClientInformationInterface {
        

open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun getOperatingSystemInterface()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem

        Updates for KMP build        
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getSpecialName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getLicenseId()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getLicenseServers()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        

open fun getLicenseServer(index: Int)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        

open fun getNumberOfLicenseServers()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

        Updates for KMP build        
        

open fun isSameId(alicenseId: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun isLargerOrDifferentServerList(vector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun isHardSale()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun toShortString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

}
                
            

