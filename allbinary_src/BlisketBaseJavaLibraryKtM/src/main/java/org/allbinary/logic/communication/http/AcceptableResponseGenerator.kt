
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
        package org.allbinary.logic.communication.http



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AcceptableResponseGenerator
            : Object
         {
        

        companion object {
            
    private val instance: AcceptableResponseGenerator = AcceptableResponseGenerator()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AcceptableResponseGenerator{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun get(httpServletRequest: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var httpServletRequest = httpServletRequest

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


        try {
            
    var acceptableResponseUtil: AcceptableResponseUtil = AcceptableResponseUtil.getInstance()!!
            


    var acceptable: String = httpServletRequest!!.getHeader(
                            "accept")!!
            


    var result: String = acceptableResponseUtil!!.getTagName(0)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTP))
                        
                                    {
                                    logUtil!!.put("Request Type: " +acceptable, this, commonStrings!!.GET)

                                    }
                                

    
                        if(acceptable != 
                                    null
                                )
                        
                                    {
                                    
    var size: Int = acceptableResponseUtil!!.size()!!
            





                        for (index in 0 until size)


        {
    
                        if(acceptable.compareTo(acceptableResponseUtil!!.get(index)) == 0)
                        
                                    {
                                    result= acceptableResponseUtil!!.getTagName(index)

                                    }
                                
}


                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTP))
                        
                                    {
                                    logUtil!!.put("Response Type: " +result, this, commonStrings!!.GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET, e)

                                    }
                                



                            throw e
}

}


}
                
            

