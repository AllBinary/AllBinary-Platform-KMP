
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
        package admin.taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.jsp.PageContext
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.http.request.RequestMapInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import tags.HelperTag

open public class MultipartRequestParamForwardHelper
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val pageContext: PageContext

    private val requestMapInterface: RequestMapInterface

    private val page: String

    private val command: String

    private val paramVector: Vector
public constructor        (parentHelperTag: HelperTag, page: String, command: String, paramVector: Vector, pageContext: PageContext)
            : super()
        

        Updates for KMP build        
        {
var parentHelperTag = parentHelperTag
var page = page
var command = command
var paramVector = paramVector
var pageContext = pageContext
this.pageContext= pageContext
this.page= page
this.command= command
this.paramVector= paramVector
this.requestMapInterface= InventoryItemViewParentTagHelper.getInstance()!!.getRequestMapInterface(parentHelperTag)
}


                @Throws(Exception::class)
            
open fun forward()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            
    
                        if(this.shouldForward())
                        
                                    {
                                    
    var params: String = this.getParams()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(page)
stringBuffer!!.append(params)
this.pageContext!!.forward(stringBuffer!!.toString())

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "forward()", e)

                                    }
                                
}

}


open fun getParams()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var AMP: String = CommonSeps.getInstance()!!.AMP


    var QUESTION: String = CommonSeps.getInstance()!!.QUESTION


    var EQUALS: String = CommonSeps.getInstance()!!.EQUALS


    var hashMap: HashMap<Any, Any> = this.requestMapInterface!!.getRequestHashMap()!!


    var stringBuffer: StringMaker = StringMaker()


    var size: Int = this.paramVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var key: String = this.paramVector!!.get(index) as String


    var value: String = hashMap!!.get(key as Object) as String


    
                        if(index != 0)
                        
                                    {
                                    stringBuffer!!.append(AMP)

                                    }
                                
                        else {
                            stringBuffer!!.append(QUESTION)

                        }
                            
stringBuffer!!.append(key)
stringBuffer!!.append(EQUALS)
stringBuffer!!.append(value)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun shouldForward()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = this.requestMapInterface!!.getRequestHashMap()!!


    var requestCommand: String = hashMap!!.get(GLOBALS2.ADMINCOMMAND) as String


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(command) || (!StringValidationUtil.getInstance()!!.isEmpty(requestCommand) && command.compareTo(requestCommand) == 0))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

