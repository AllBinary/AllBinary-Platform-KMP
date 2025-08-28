
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
        package org.allbinary.business.category.store.theme




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Comparator

open public class ThemeComparator
            : Object
        
                , Comparator {
        
public constructor        ()
            : super()
        {
}


open fun compare(anyType: Any, object2: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{
var anyType = anyType
var object2 = object2

    var string: String = anyType as String


    var string2: String = object2 as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return string.compareTo(string2)
}


}
                
            

