
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.http.AcceptableResponseGenerator
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class TransformHttpRequestDocument
            : Object
        
                , TransformDocumentInterface {
        

        companion object {
            
    private val language: String = "en"

    private val local: String = "US"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var baseNode: Node

    private var document: Document
public constructor        (pageContext: PageContext, weblisketSession: WeblisketSession)
            : super()
        {

                    var pageContext = pageContext


                    var weblisketSession = weblisketSession

        try {
            
    var contentType: String = AcceptableResponseGenerator.getInstance()!!.get(pageContext!!.getRequest() as HttpServletRequest)!!

this.document= DomDocumentHelper.create()

    var contentTypeNode: Node = document.createElement(contentType)!!


    var languageTypeNode: Node = document.createElement(language)!!


    var localTypeNode: Node = document.createElement(local)!!

this.baseNode= localTypeNode
languageTypeNode!!.appendChild(localTypeNode)
contentTypeNode!!.appendChild(languageTypeNode)
document.appendChild(contentTypeNode)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(this.log(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.CONSTRUCTOR, e)

                                    }
                                



                            throw e
}

}

public constructor        (searchRequest: SearchRequest)
            : super()
        {

                    var searchRequest = searchRequest

        try {
            
    var contentType: String = searchRequest!!.getContentType()!!

this.document= DomDocumentHelper.create()

    var contentTypeNode: Node = document.createElement(contentType)!!


    var languageTypeNode: Node = document.createElement(language)!!


    var localTypeNode: Node = document.createElement(local)!!

this.baseNode= localTypeNode
languageTypeNode!!.appendChild(localTypeNode)
contentTypeNode!!.appendChild(languageTypeNode)
document.appendChild(contentTypeNode)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.CONSTRUCTOR, e)

                                    }
                                



                            throw e
}

}


open fun getBaseNode()
        //nullable = true from not(false or (false and true)) = true
: Node{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.baseNode
}


open fun getDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.document
}


                @Throws(Exception::class)
            
open fun log()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()


    
                        if(this.baseNode != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append("BaseNode: ")
stringBuffer!!.append(this.baseNode!!.getNodeName())

                                    }
                                
                        else {
                            stringBuffer!!.append("Log-Error: BaseNode is Null")

                        }
                            
stringBuffer!!.append("\nDocument: ")
stringBuffer!!.append(DomDocumentHelper.toString(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

