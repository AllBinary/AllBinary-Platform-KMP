
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
        package org.allbinary.logic.communication.log.config




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

open public class LoggingInitInfo
            : Object
         {
        

        companion object {
            
    private var logConfigInfoList: BasicArrayList = 
                null
            

    private var hasRead: Boolean = false

                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun write()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            hasRead= false
} catch(e: Exception)
            {


                            throw e
}

}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun read()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            } catch(e: Exception)
            {


                            throw e
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setHasRead(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
LoggingInitInfo.hasRead= value
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun updateIfNeeded()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(!hasRead)
                        
                                    {
                                    LoggingInitInfo.read()
hasRead= true

    
                        if(LoggingInitInfo.logConfigInfoList == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Read Failed")

                                    }
                                

                                    }
                                
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun set(logConfigInfoList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var logConfigInfoList = logConfigInfoList
LoggingInitInfo.logConfigInfoList= logConfigInfoList
}


                @Throws(Exception::class)
            
open fun get()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{LoggingInitInfo.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LoggingInitInfo.logConfigInfoList
}


                @Throws(Exception::class)
            
open fun getTypeList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{LoggingInitInfo.updateIfNeeded()

    var allLogTypeVector: BasicArrayList = BasicArrayList()


    var size: Int = LoggingInitInfo.logConfigInfoList!!.size()!!





                        for (index in 0 until size)

        {
    var logConfigInfo: LogConfig = LoggingInitInfo.logConfigInfoList!!.objectArray[index]!! as LogConfig


    var logTypeVector: BasicArrayList = logConfigInfo!!.getTypeVector()!!


    
                        if(logConfigInfo!!.isEnabled())
                        
                                    {
                                    allLogTypeVector!!.addAll(logTypeVector)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allLogTypeVector
}


        }
            public constructor        ()
            : super()
        {}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(Exception::class)
            
open fun getNumberOfLogConfigs()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LoggingInitInfo.logConfigInfoList!!.size()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error"
}

}


}
                
            

