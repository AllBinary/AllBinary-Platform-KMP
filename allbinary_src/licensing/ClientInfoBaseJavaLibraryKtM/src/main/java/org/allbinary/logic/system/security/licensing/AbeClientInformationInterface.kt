
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


open fun getOperatingSystemInterface()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getSpecialName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getLicenseId()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getLicenseServers()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

open fun getLicenseServer(index: Int)
        //nullable = true from not(false or (false and false)) = true
: String

open fun getNumberOfLicenseServers()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

open fun isSameId(alicenseId: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

open fun isLargerOrDifferentServerList(vector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean

open fun isHardSale()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun toShortString()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

