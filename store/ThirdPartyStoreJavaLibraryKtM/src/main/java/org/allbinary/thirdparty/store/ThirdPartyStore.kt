
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class ThirdPartyStore
            : Object
         {
        

    private var authorized: Boolean= false

    private val name: String
public constructor        (name: String)
            : super()
        {

                    var name = name
this.name= name
}


open fun authorize(clientInformationInterface: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var clientInformationInterface = clientInformationInterface
}


open fun isAuthorized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return authorized
}


open fun setAuthorized(authorized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var authorized = authorized
this.authorized= authorized
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            

