
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
        
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class AbeNoLicense
            : Object
        
                , AbeLicenseInterface {
        

        companion object {
            
    private var abeNoLicense: AbeNoLicense = AbeNoLicense()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbeNoLicense{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abeNoLicense
}


        }
            
    var serverVector: BasicArrayList = BasicArrayList()
private constructor        ()
            : super()
        {}


open fun hasKey()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getKey(keyName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var keyName = keyName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun getLicenseId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun getSpecial()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun getServers()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return serverVector
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getLicenseType()
        //nullable = true from not(false or (false and true)) = true
: LicenseType{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LicenseTypeFactory.getInstance()!!.UNKNOWN
}


}
                
            

