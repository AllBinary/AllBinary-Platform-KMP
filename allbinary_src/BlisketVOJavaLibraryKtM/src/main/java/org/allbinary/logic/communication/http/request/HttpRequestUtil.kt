
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
        package org.allbinary.logic.communication.http.request




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPathData

open public class HttpRequestUtil
            : Object
         {
        

        companion object {
            
    private val instance: HttpRequestUtil = HttpRequestUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HttpRequestUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


open fun getLastSeparatorIndex(requestPath: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var requestPath = requestPath

    var beginIndex: Int = requestPath!!.lastIndexOf(AbPathData.getInstance()!!.SEPARATOR)!!
            


    
                        if(beginIndex < 0)
                        
                                    {
                                    beginIndex= requestPath!!.lastIndexOf(
                            "\\")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return beginIndex
}


                @Throws(Exception::class)
            
open fun generateFileName(requestPath: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var requestPath = requestPath

    var beginIndex: Int = this.getLastSeparatorIndex(requestPath)!!
            


    
                        if(beginIndex < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return requestPath

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return requestPath!!.substring(beginIndex +1)

                        }
                            
}


}
                
            

