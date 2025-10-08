
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
        package org.allbinary.logic.control.search




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.AbContext
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class SearchRequest : AbContext {
        

    private var xslFile: String

    private var pageName: String

    private var contentType: String

    private var searchParams: SearchParams

    private var storeFront: StoreFrontInterface
public constructor (storeFront: StoreFrontInterface, searchParams: SearchParams, xslFile: String, contentType: String, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(propertiesHashMap, pageContext){
var storeFront = storeFront
var searchParams = searchParams
var xslFile = xslFile
var contentType = contentType
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
this.storeFront= storeFront
this.searchParams= searchParams
this.xslFile= xslFile
this.pageName= pageName
this.contentType= contentType
}


    open fun setStoreFront(storeFront: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
{
var storeFront = storeFront
this.storeFront= storeFront
}


    open fun setParams(searchParams: SearchParams)
        //nullable = true from not(false or (false and false)) = true
{
var searchParams = searchParams
this.searchParams= searchParams
}


    open fun setXslFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.xslFile= value
}


    open fun setFileBaseName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.pageName= value
}


    open fun setContentType(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.contentType= value
}


    open fun getStoreFront()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeFront
}


    open fun getParams()
        //nullable = true from not(false or (false and true)) = true
: SearchParams{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.searchParams
}


    open fun getXslFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.xslFile
}


    open fun getFileBaseName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pageName
}


    open fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.contentType
}


                @Throws(Exception::class)
            
    open fun getFileBaseNameNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, SearchData.FILENAME, this.getFileBaseName())
}


}
                
            

