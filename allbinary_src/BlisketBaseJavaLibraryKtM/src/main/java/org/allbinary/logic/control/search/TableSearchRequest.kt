
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
        
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class TableSearchRequest
            : Object
         {
        

    private var xslFile: String

    private var pageName: String

    private var contentType: String

    private var keywords: String

    private var searchParams: SearchParams
public constructor (keywords: String, searchParams: SearchParams, xslFile: String, contentType: String)
            : super()
        {
var keywords = keywords
var searchParams = searchParams
var xslFile = xslFile
var contentType = contentType
this.keywords= keywords
this.searchParams= searchParams
this.xslFile= xslFile
this.pageName= pageName
this.contentType= contentType
}


    open fun setKeywords(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.keywords= value
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


    open fun getKeywords()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.keywords
}


    open fun getParams()
        //nullable = true from not(false or (false and true)) = true
: SearchParams{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.searchParams
}


                @Throws(Exception::class)
            
    open fun getXslFile()
        //nullable = true from not(false or (false and true)) = true
: String{

    var path: String = URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH +this.xslFile




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
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
                
            

