
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
        package org.allbinary.business.init.db




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil

open public class DbInitInfo : DbConnectionInfo {
        
public constructor (initFileName: String, read: Boolean)                        

                            : super(){
var initFileName = initFileName
var read = read


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun getUrl()
        //nullable = true from not(false or (false and true)) = true
: String{

    var url: String = super.getUrl()!!

PreLogUtil.put("Url: " +url, this, "getUrl")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return url
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun write()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun load()
        //nullable = true from not(false or (false and true)) = true
{
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun setHasRead(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


}
                
            

