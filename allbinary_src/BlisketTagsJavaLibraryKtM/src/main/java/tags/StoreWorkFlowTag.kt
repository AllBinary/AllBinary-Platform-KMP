
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
        package tags



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import javax.servlet.jsp.JspTagException
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.logic.visual.transform.info.TransformInfoData
import taghelpers.StoreTagWorkFlowHelperFactory

open public class StoreWorkFlowTag : HelperTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var viewName: String

    private var viewFile: String
public constructor        ()                        

                            : super(StoreTagWorkFlowHelperFactory()){

                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.viewName= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.NAME, this.viewName)
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.PROCESS)

                                    }
                                

    var helperClass: KClass<*> = this.getHelper()!!.::class!!
            


    var method: Method = helperClass!!.getMethod(commonStrings!!.PROCESS, 
                            null)!!
            


    var result: Integer = method!!.invoke(this.getHelper(), 
                            null) as Integer




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result!!.toInt()
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)

                                    }
                                



                            throw e
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "doStartTag()")

                                    }
                                
this.setHelper()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.process()
} catch(e: LicensingException)
            {AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            {AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

