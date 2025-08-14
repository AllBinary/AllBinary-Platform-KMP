
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
        package org.allbinary.util




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.ForcedLogUtil

open public class ImmutableBasicArrayList : BasicArrayList {
        

    private val IMMUTABLE: String = "Immutable"
public constructor        (size: Int)                        

                            : super(size){

                    var size = size


                            //For kotlin this is before the body of the constructor.
                    
}

override fun add(e: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var e = e
ForcedLogUtil.log(IMMUTABLE, this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun add(index: Int, element: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index


                    var element = element
ForcedLogUtil.log(IMMUTABLE, this)
}


}
                
            

