
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
        package org.allbinary.business.user




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.entry.EntryData
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.string.StringUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UserDomNode
            : Object
        
                , DomNodeInterface {
        

    private var dataMappingInterface: TableMappingInterface
public constructor        (dataMappingInterface: TableMappingInterface)
            : super()
        

        Updates for KMP build        
        {
var dataMappingInterface = dataMappingInterface
this.dataMappingInterface= dataMappingInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    var hashMap: HashMap<Any, Any> = dataMappingInterface!!.toHashMap()!!

hashMap!!.put(EntryData.getInstance()!!.LASTMODIFIED, EMPTY_STRING)
hashMap!!.put(EntryData.getInstance()!!.ENCRYPTION, EMPTY_STRING)
hashMap!!.put(UserData.PASSWORD, EMPTY_STRING)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, UserData.NAME, hashMap)
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

