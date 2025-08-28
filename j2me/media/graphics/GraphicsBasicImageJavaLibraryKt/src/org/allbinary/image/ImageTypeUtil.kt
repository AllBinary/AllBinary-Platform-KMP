
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
        package org.allbinary.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

open public class ImageTypeUtil
            : Object
         {
        

        companion object {
            
    private var SINGLETON: ImageTypeUtil = ImageTypeUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageTypeUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val PNG: String = "png"

    val JPG: String = "jpg"

    val GIF: String = "gif"

    private val list: BasicArrayList = BasicArrayList()
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
list.add(JPG)
list.add(GIF)
list.add(PNG)
}


open fun isSupported(mediaFileType: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var mediaFileType = mediaFileType
mediaFileType= mediaFileType!!.lowercase()




                        for (index in list.size() -1 downTo 0)

        

        Updates for KMP build        
        {

    var name: String = list.objectArray[index]!! as String


    
                        if(mediaFileType!!.compareTo(name) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

