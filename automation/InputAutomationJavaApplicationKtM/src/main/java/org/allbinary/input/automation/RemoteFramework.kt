
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
        package org.allbinary.input.automation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Map
import org.osgi.framework.BundleContext
interface RemoteFramework {
        

open fun connect(host: String)
        //nullable = true from not(false or (false and false)) = true
: BundleContext

open fun disconnect(bc: BundleContext)
        //nullable = true from not(false or (false and false)) = true


open fun getSystemProperties(bc: BundleContext)
        //nullable = true from not(false or (false and false)) = true
: Map

}
                
            

