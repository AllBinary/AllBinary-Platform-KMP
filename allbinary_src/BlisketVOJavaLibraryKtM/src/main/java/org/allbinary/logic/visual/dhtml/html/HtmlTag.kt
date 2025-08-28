
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
        package org.allbinary.logic.visual.dhtml.html




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap

open public class HtmlTag
            : Object
         {
        

    var otherAttributes: HashMap<Any, Any>
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.otherAttributes= HashMap<Any, Any>()
}


open fun addAttribute(key: String, value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var key = key
var value = value
this.otherAttributes!!.put(key, value)
}


}
                
            

