
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
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import java.io.InputStreamReader
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class PartnerIdentifierFileUtil
            : Object
         {
        

        companion object {
            
    private val instance: PartnerIdentifierFileUtil = PartnerIdentifierFileUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PartnerIdentifierFileUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val FILE_NAME: String = "partner.txt"

open fun get()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!


    var inputStream: InputStream = resourceUtil!!.getResourceAsStream(this.FILE_NAME)!!


    var inputStreamReader: InputStreamReader = InputStreamReader(inputStream)


    var chars: CharArray = 
                                                        
                                                        CharArray(30)
                                                    


    var size: Int = inputStreamReader!!.read(chars)!!


    var partnerString: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(size > 0)
                        
                                    {
                                    partnerString= chars.concatToString(0, size)

                                    

                                    }
                                
inputStreamReader!!.close()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return partnerString
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.NULL_STRING
}

}


}
                
            

