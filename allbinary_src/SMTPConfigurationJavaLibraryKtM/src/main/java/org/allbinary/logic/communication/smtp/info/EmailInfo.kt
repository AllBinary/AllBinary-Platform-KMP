
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
        package org.allbinary.logic.communication.smtp.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class EmailInfo
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var basicEmailInfo: BasicEmailInfo

    private var htmlAttachment: String

    private var contentBase: String
public constructor        (basicEmailInfo: BasicEmailInfo)
            : super()
        

        Updates for KMP build        
        {
var basicEmailInfo = basicEmailInfo

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.init(basicEmailInfo, 
                            null, 
                            null)
}

public constructor        (basicEmailInfo: BasicEmailInfo, htmlAttachment: String, contentBase: String)
            : super()
        

        Updates for KMP build        
        {
var basicEmailInfo = basicEmailInfo
var htmlAttachment = htmlAttachment
var contentBase = contentBase

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.init(basicEmailInfo, 
                            null, 
                            null)
}


open fun init(basicEmailInfo: BasicEmailInfo, htmlAttachment: String, contentBase: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var basicEmailInfo = basicEmailInfo
var htmlAttachment = htmlAttachment
var contentBase = contentBase
this.basicEmailInfo= basicEmailInfo
this.htmlAttachment= htmlAttachment
this.contentBase= contentBase
}


open fun getBasicEmailInfo()
        //nullable = true from not(false or (false and true)) = true
: BasicEmailInfo

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicEmailInfo
}


open fun getHtmlAttachment()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.htmlAttachment
}


open fun getContentBase()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.contentBase
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Email Info: \n " +this.getBasicEmailInfo()!!.toString()
}


}
                
            

