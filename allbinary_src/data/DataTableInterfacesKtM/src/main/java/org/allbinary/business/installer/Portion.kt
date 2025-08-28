
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
        package org.allbinary.business.installer




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap

open public class Portion
            : Object
         {
        

    private val current: Integer

    private val total: Integer
public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {
var hashMap = hashMap
this.current= hashMap!!.get("current") as Integer
this.total= hashMap!!.get("total") as Integer
}


open fun getCurrent()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return current
}


open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


}
                
            

