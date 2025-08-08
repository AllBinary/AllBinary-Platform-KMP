
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
        package org.allbinary.business.context



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AbContext
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var propertiesHashMap: HashMap<Any, Any>

    private var pageContext: PageContext
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
            : super()
        {

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Properties HashMap: " +propertiesHashMap!!.toString(), this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.propertiesHashMap= propertiesHashMap
this.pageContext= pageContext
}


open fun getWeblisketSession()
        //nullable = true from not(false or (false and true)) = true
: WeblisketSessionInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WeblisketSession(propertiesHashMap, pageContext)
}


open fun getPageContext()
        //nullable = true from not(false or (false and true)) = true
: PageContext{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pageContext
}


open fun getPropertiesHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return propertiesHashMap
}


}
                
            

