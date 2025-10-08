
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
        package org.allbinary.media.image.cache




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.string.StringMaker

open public class BufferedImageInfoFactory
            : Object
         {
        
companion object {
            
    private var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

    open fun getInstance(width: Int, height: Int, type: Int)
        //nullable =  from not(true or (false and false)) = 
: BufferedImageInfo{
var width = width
var height = height
var type = type

    var stringbuffer: StringMaker = StringMaker()

stringbuffer.append(width)
stringbuffer.append(height)
stringbuffer.append(type)

    var key: String = stringbuffer.toString()!!


    var bufferedImageInfo: BufferedImageInfo = hashMap!!.get(key as Object) as BufferedImageInfo


    
                        if(bufferedImageInfo == 
                                    null
                                )
                        
                                    {
                                    bufferedImageInfo= BufferedImageInfo(width, height, type)
hashMap!!.put(key, bufferedImageInfo)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImageInfo
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

