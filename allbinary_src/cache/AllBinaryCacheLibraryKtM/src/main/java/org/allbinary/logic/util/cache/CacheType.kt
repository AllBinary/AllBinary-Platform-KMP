
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2007 AllBinary 
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
        package org.allbinary.logic.util.cache




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class CacheType
            : Object
         {
        

    private var vendor: String

    private var type: String
public constructor        (vendor: String, type: String)
            : super()
        

        Updates for KMP build        
        {
var vendor = vendor
var type = type
this.setVendor(vendor)
this.setType(type)
}


open fun getVendor()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vendor
}


open fun setVendor(vendor: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var vendor = vendor
this.vendor= vendor
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return type
}


open fun setType(type: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var type = type
this.type= type
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("CacheType: Vendor: ")
stringBuffer!!.append(this.getVendor())
stringBuffer!!.append(" Type: ")
stringBuffer!!.append(this.getType())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

