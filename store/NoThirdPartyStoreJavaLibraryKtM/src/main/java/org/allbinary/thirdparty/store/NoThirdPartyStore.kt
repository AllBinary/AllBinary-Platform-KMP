
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
        package org.allbinary.thirdparty.store




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class NoThirdPartyStore : ThirdPartyStore {
        
 constructor        ()                        

                            : super(StringUtil.getInstance()!!.EMPTY_STRING){

                            //For kotlin this is before the body of the constructor.
                    
}

override fun authorize(clientInformationInterface: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var clientInformationInterface = clientInformationInterface
this.setAuthorized(true)
}


}
                
            

