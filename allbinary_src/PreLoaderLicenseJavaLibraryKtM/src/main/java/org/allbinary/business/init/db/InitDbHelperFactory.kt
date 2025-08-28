
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
        package org.allbinary.business.init.db




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException

open public class InitDbHelperFactory
            : Object
         {
        

        companion object {
            
    private val CLASSNAME: String = "org.allbinary.business.installer.InitDbCrypted"

                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, databaseConnectionInfoInterface: DatabaseConnectionInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: Any

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
var databaseConnectionInfoInterface = databaseConnectionInfoInterface

    var params: Array<Any?> = arrayOfNulls(1)


    var classes: Array<KClass<*>?> = arrayOfNulls(1)

classes[0]= 
                                    //Otherwise - expression - AssignExpr - value - ClassExpr

params[0]= databaseConnectionInfoInterface as Object

    var anyType: Any = AbeFactory.getInstance()!!.getInstance(abeClientInformation, CLASSNAME, classes, params)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
}


                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface)
        //nullable =  from not(true or (false and false)) = 
: Any

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation

    var anyType: Any = AbeFactory.getInstance()!!.getInstance(abeClientInformation, CLASSNAME, 
                            null, 
                            null)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            

