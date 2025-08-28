
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import javax.servlet.http.HttpServletRequest
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.data.tree.dom.ToDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class SearchParams
            : Object
         {
        

    private var columnsAndSearchValues: HashMap<Any, Any>

    private var order: String

    private var sortBy: String

    private var listLength: String

    private var startPage: String

    private var endPage: String
public constructor        (request: HttpServletRequest)
            : super()
        

        Updates for KMP build        
        {
var request = request
this.columnsAndSearchValues= HashMap<Any, Any>()
this.setLength(request.getParameter(SearchData.LENGTH))
this.setOrder(request.getParameter(SearchData.ORDER))

    var page: String = request.getParameter(SearchData.PAGE)!!

this.setStartPage(page)
this.setEndPage(page)
this.setSortBy(request.getParameter(SearchData.SORTBY))

    var index: Int = 0


    var columnName: String = request.getParameter(SearchData.COLUMNNAME +"[0]")!!


    var columnValue: String = request.getParameter(SearchData.COLUMNVALUE +"[0]")!!


        while(columnName != 
                                    null
                                )
        

        Updates for KMP build        
        {
this.add(columnName, columnValue)
index++
columnName= request.getParameter(SearchData.COLUMNNAME +"[" +index +"]")
columnValue= request.getParameter(SearchData.COLUMNVALUE +"[" +index +"]")
}

}


open fun add(column: String, value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var column = column
var value = value
this.columnsAndSearchValues!!.put(column, value)
}


open fun setOrder(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.order= value
}


open fun setSortBy(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.sortBy= value
}


open fun setLength(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.listLength= value
}


open fun setStartPage(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.startPage= value
}


open fun setEndPage(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.endPage= value
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.columnsAndSearchValues
}


open fun getOrder()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.order
}


open fun getSortBy()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.sortBy
}


open fun getLength()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.listLength
}


open fun getLengthInt()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {

    
                        if(this.listLength != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(this.listLength)

                                    }
                                
                             else 
    
                        if()
                        
}


open fun getStartPage()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.startPage
}


open fun getEndPage()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.endPage
}


open fun getStartPageInt()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {

    
                        if(this.startPage != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(this.startPage)

                                    }
                                
                             else 
    
                        if()
                        
}


open fun getEndPageInt()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {

    
                        if(this.endPage != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(this.endPage)

                                    }
                                
                             else 
    
                        if()
                        
}


                @Throws(Exception::class)
            
open fun getParamsNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var paramsNode: Node = ModDomHelper.createNameValueNodes(document, SearchData.PARAMS, SearchData.PARAMS)!!

paramsNode!!.appendChild(this.getFieldsNode(document))
paramsNode!!.appendChild(this.getOrderNode(document))
paramsNode!!.appendChild(this.getSortByNode(document))
paramsNode!!.appendChild(this.getLengthNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paramsNode
}


                @Throws(Exception::class)
            
open fun getFieldsNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var fieldsNode: Node = ModDomHelper.createNameValueNodes(document, SearchData.FIELDS, Integer(columnsAndSearchValues!!.size()).
                            toString())!!


    var set: Set = this.columnsAndSearchValues!!.keySet()!!


    var searchValueArray: Array<Any?> = set.toArray()!!


    var size: Int = searchValueArray!!.size
                





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var key: String = searchValueArray[index]!! as String


    var searchValue: String = this.columnsAndSearchValues!!.get(key) as String

fieldsNode!!.appendChild(ModDomHelper.createNameValueNodes(document, SearchData.FIELD, key, ToDomHelper.convertNull(searchValue)))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fieldsNode
}


                @Throws(Exception::class)
            
open fun getOrderNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, SearchData.ORDER, ToDomHelper.convertNull(this.getOrder()))
}


                @Throws(Exception::class)
            
open fun getSortByNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, SearchData.SORTBY, ToDomHelper.convertNull(this.getSortBy()))
}


                @Throws(Exception::class)
            
open fun getLengthNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, SearchData.LENGTH, ToDomHelper.convertNull(this.getLength()))
}


}
                
            

