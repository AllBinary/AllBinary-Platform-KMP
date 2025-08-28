
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import org.allbinary.logic.util.cache.CacheableInterface

open public class ColorCacheable
            : Object
        
                , CacheableInterface {
        

    private var key: Any

    private var color: Color
public constructor        (key: Any)
            : super()
        {
var key = key
this.key= key
this.color= Color(key = keykey as Integer
key.
                    toInt())
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.key
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: Color{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.color
}


open fun setColor(color: Color)
        //nullable = true from not(false or (false and false)) = true
{
var color = color
this.color= color
}


}
                
            

