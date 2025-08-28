
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
        package org.allbinary.logic.control.validate




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.NullUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class ValidatorBase
            : Object
        
                , ValidatorBaseInterface {
        

        companion object {
            
    private val instance: ValidatorBase = ValidatorBase()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ValidatorBase

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}

override fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.TRUE
}

override fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}

override fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_TABLE
}

override fun toList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()
}


}
                
            

