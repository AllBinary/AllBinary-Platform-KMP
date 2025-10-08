
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
        package org.allbinary.logic.util.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil

open public class AllBinaryEventObject
            : Object
         {
        
companion object {
            
    val NULL_EVENT: AllBinaryEventObject = AllBinaryEventObject(NullUtil.getInstance()!!.NULL_OBJECT)

        }
            
    private var source: Any
public constructor (anyType: Any)
            : super()
        {
var anyType = anyType
this.source= anyType
}


    open fun getSource()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return source
}


    open fun setSource(source: Any)
        //nullable = true from not(false or (false and false)) = true
{
var source = source
this.source= source
}


}
                
            

