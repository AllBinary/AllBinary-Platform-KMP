
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
        package org.allbinary.business.time




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class Time
            : Object
         {
        

    private var timeLong: Long
public constructor        (time: String)
            : super()
        {
var time = time
this.timeLong= time as Long
}

public constructor        (time: Long)
            : super()
        {
var time = time
this.timeLong= time as Long
}


open fun getLong()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeLong
}


open fun getlong()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeLong!!.longValue()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getLong()!!.toString()
}


}
                
            

