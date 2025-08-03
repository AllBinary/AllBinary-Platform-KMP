
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.thirdparty.store.LongArrayIdentifierInterface

open public class StoreAppClientInformation : AbeClientInformation
                , LongArrayIdentifierInterface {
        

    private val longArrayIdentifier: LongArray
public constructor        (name: String, version: String, specialName: String, shortName: String, longArrayIdentifier: LongArray)                        

                            : super(name, version, specialName, shortName){

                    var name = name


                    var version = version


                    var specialName = specialName


                    var shortName = shortName


                    var longArrayIdentifier = longArrayIdentifier


                            //For kotlin this is before the body of the constructor.
                    
this.longArrayIdentifier= longArrayIdentifier
}

override fun getLongArrayIdentifier()
        //nullable = true from not(false or (false and true)) = true
: LongArray{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return longArrayIdentifier
}


}
                
            

