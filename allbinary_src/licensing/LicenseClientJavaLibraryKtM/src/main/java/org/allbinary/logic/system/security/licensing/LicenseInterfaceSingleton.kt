
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
        

open public class LicenseInterfaceSingleton
            : Object
         {
        

        companion object {
            
    private var licenseInterface: AbeLicenseInterface = AbeNoLicense.getInstance()!!

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbeLicenseInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return licenseInterface
}


open fun init(licenseInterface: AbeLicenseInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var licenseInterface = licenseInterface

    
                        if(licenseInterface != 
                                    null
                                )
                        
                                    {
                                    LicenseInterfaceSingleton.licenseInterface= licenseInterface

                                    }
                                
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

