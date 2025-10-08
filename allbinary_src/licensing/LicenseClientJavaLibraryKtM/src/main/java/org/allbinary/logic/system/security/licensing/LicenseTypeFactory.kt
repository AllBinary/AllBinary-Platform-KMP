
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
        
import org.allbinary.string.CommonStrings

open public class LicenseTypeFactory
            : Object
         {
        
companion object {
            
    private val instance: LicenseTypeFactory = LicenseTypeFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LicenseTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val UNKNOWN: LicenseType = LicenseType(CommonStrings.getInstance()!!.UNKNOWN)

    val DEMO: LicenseType = LicenseType("Demo")

    val NORMAL: LicenseType = LicenseType("Normal")

    open fun getInstance(name: String)
        //nullable =  from not(true or (false and false)) = 
: LicenseType{
var name = name

    
                        if(DEMO.getName()!!.compareTo(name) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DEMO

                                    }
                                
                             else 
    
                        if(NORMAL.getName()!!.compareTo(name) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NORMAL

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UNKNOWN
}


}
                
            

