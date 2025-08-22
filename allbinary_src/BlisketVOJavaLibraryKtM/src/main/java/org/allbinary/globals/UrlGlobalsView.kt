
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
        package org.allbinary.globals




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UrlGlobalsView
            : Object
        
                , DomNodeInterface {
        
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(UrlGlobalsData.WEBAPPPATH, org.allbinary.globals.URLGLOBALS.getWebappPath())

    var node: Node = ModDomHelper.createNameValueNodes(document, UrlGlobalsData.NAME, hashMap)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

