
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
        package org.allbinary.logic.visual.transform.data



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontViewFactory
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchRequest

open public class TransformStoreDocument : TransformHttpRequestDocument {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (pageContext: PageContext, weblisketSession: WeblisketSession)                        

                            : super(pageContext, weblisketSession){

                    var pageContext = pageContext


                    var weblisketSession = weblisketSession


                            //For kotlin this is before the body of the constructor.
                    

        try {
            
    var storeName: String = weblisketSession!!.getStoreName()!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Using Session StoreName: " +storeName, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.getBaseNode()!!.appendChild(StoreFrontViewFactory.getInstance(storeName)!!.toXmlNode(this.getDoc()))
this.getBaseNode()!!.appendChild(RequestParams(pageContext!!.getRequest() as HttpServletRequest).
                            toXmlNode(this.getDoc()))
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.CONSTRUCTOR, e)

                                    }
                                



                            throw e
}

}

public constructor        (searchRequest: SearchRequest)                        

                            : super(searchRequest){

                    var searchRequest = searchRequest


                            //For kotlin this is before the body of the constructor.
                    

        try {
            this.getBaseNode()!!.appendChild(StoreFrontViewFactory.getInstance(searchRequest!!.getStoreFront()!!.getName())!!.toXmlNode(this.getDoc()))
this.getBaseNode()!!.appendChild(searchRequest!!.getParams()!!.getParamsNode(this.getDoc()))
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.CONSTRUCTOR, e)

                                    }
                                



                            throw e
}

}


}
                
            

