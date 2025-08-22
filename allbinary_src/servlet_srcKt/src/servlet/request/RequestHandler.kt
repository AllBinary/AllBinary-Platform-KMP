
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
        package servlet.request




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io
import java.net
import javax.servlet
import javax.servlet.http
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.workflow.WorkFlowInterface
import org.allbinary.logic.control.workflow.RequestWorkFlowFactory

open public class RequestHandler : HttpServlet {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(ServletException::class)
            
open fun init(config: ServletConfig)
        //nullable = true from not(false or (false and false)) = true
{

                    var config = config
super.init(config)
}


open fun destroy()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(ServletException::class, IOException::class)
            
open fun processRequest(request: HttpServletRequest, response: HttpServletResponse)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request


                    var response = response

        try {
            response.setContentType("text/html")

    var out: PrintWriter = response.getWriter()!!


    var workflowInterface: WorkFlowInterface = RequestWorkFlowFactory.getInstance(request as ServletRequest, response as ServletResponse, this.getServletConfig(), this.getServletContext())!!


    
                        if(workflowInterface != 
                                    null
                                )
                        
                                    {
                                    out.print(workflowInterface!!.process())

                                    }
                                
out.flush()
out.close()
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SERVLETERROR))
                        
                                    {
                                    logUtil!!.put("Servlet LicensingException", this, "processRequest()", e)

                                    }
                                
response.sendRedirect(abcs.globals.URLGLOBALS.LICENSEERRORPAGE)
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SERVLETERROR))
                        
                                    {
                                    logUtil!!.put("Servlet Exception", this, "processRequest()", e)

                                    }
                                
response.sendRedirect(abcs.globals.URLGLOBALS.ERRORPAGE)
}

}


                @Throws(ServletException::class, IOException::class)
            
open fun doGet(request: HttpServletRequest, response: HttpServletResponse)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request


                    var response = response
processRequest(request, response)
}


                @Throws(ServletException::class, IOException::class)
            
open fun doPost(request: HttpServletRequest, response: HttpServletResponse)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request


                    var response = response
processRequest(request, response)
}


open fun getServletInfo()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "WorkFlow Request Handler"
}


}
                
            

