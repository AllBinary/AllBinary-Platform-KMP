
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
        package org.allbinary.logic.system.loader




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.system.security.AbKeys
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException

open public class SecuredNativeLibraryHelperWrapper : NativeLibraryHelperWrapper {
        

    private var securedNativeLibraryInterface: SecuredNativeLibraryInterface
public constructor        (securedNativeLibraryInterface: SecuredNativeLibraryInterface)                        

                            : super(securedNativeLibraryInterface!!.getLibraryName())

        Updates for KMP build        
        {
    //var securedNativeLibraryInterface = securedNativeLibraryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.securedNativeLibraryInterface= securedNativeLibraryInterface
}


                @Throws(LicensingException::class)
            
open fun unlock(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return securedNativeLibraryInterface!!.unlock(AbKeys.getInstance()!!.getKey(abeClientInformation, securedNativeLibraryInterface!!.getName()))
}


}
                
            

