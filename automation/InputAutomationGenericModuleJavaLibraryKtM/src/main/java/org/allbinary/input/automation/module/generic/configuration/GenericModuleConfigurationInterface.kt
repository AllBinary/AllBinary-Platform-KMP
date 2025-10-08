
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
        package org.allbinary.input.automation.module.generic.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfile

interface GenericModuleConfigurationInterface {
        

    open fun getSelectedGenericProfile()
        //nullable = true from not(false or (false and true)) = true
: GenericProfile

    open fun setSelectedGenericProfile(selectedGenericProfile: GenericProfile)
        //nullable = true from not(false or (false and false)) = true


}
                
            

