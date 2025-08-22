
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
        package org.allbinary.logic.control.workflow




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.ServletConfig
import javax.servlet.ServletContext
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.data.tables.workflow.WorkFlowEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.system.security.licensing.LicensingException

open public class RequestWorkFlowFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class, LicensingException::class)
            
open fun getInstance(request: ServletRequest, response: ServletResponse, servletConfig: ServletConfig, servletContext: ServletContext)
        //nullable =  from not(true or (false and false)) = 
: WorkFlowInterface{

                    var request = request


                    var response = response


                    var servletConfig = servletConfig


                    var servletContext = servletContext

    var httpRequest: HttpServletRequest = request as HttpServletRequest


    var requestCommand: String = httpRequest!!.getPathInfo()!!


    var index: Int = requestCommand!!.indexOf(AbPathData.getInstance()!!.SEPARATOR)!!


    var storeName: String = requestCommand!!.substring(0, index)!!


    var requestName: String = requestCommand!!.substring(index, requestCommand!!.length)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WorkFlowEntityFactory.getInstance()!!.create2()!!.get(requestName, storeName)
}


                @Throws(Exception::class, LicensingException::class)
            
open fun getInstance(hashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: WorkFlowInterface{

                    var hashMap = hashMap


                    var pageContext = pageContext

    var workFlowName: String = pageContext!!.getRequest()!!.getParameter(WorkFlowData.getInstance()!!.NAME) as String


    var weblisketSession: WeblisketSession = WeblisketSession(hashMap, pageContext)


    var storeName: String = weblisketSession!!.getStoreName()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WorkFlowEntityFactory.getInstance()!!.create2()!!.get(workFlowName, storeName)
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

