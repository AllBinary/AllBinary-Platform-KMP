
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
        package org.allbinary




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.init.LicenseInitInfoUtil
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.system.security.licensing.PartnerIdentifierFileUtil

open public class AllBinaryAndroidGameInitializationUtil
            : Object
         {
        

        companion object {
            
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!


    var androidResources: AndroidResources = AndroidResources.getInstance()!!


    var licenseInitInfoUtil: LicenseInitInfoUtil = LicenseInitInfoUtil.getInstance()!!

resourceUtil!!.addResource(licenseInitInfoUtil!!.INITFILENAME, Integer(Integer.valueOf(androidResources!!.raw.licenseinitdata)))
resourceUtil!!.addResource(PartnerIdentifierFileUtil.getInstance()!!.FILE_NAME, Integer(Integer.valueOf(androidResources!!.raw.partner)))
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

