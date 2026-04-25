
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringMaker

open public class BasicArrayListS : BasicArrayList {
        
public constructor (size: Int)                        

                            : super(NullUtil.getInstance()!!.NULL_OBJECT_ARRAY){
    //var size = size


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(size < 0)
                        
                                    {
                                    


                            throw IllegalArgumentException(StringMaker().
                            append("Init Size Exception: ")!!.appendint(size)!!.toString())

                                    }
                                
this.objectArray= arrayOfNulls(size)
}


}
                
            

