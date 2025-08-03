
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
        package org.allbinary.data.tree.dom



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.error.ErrorData
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicErrorNodeUtil
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun get(document: Document, errorText: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var errorText = errorText

        try {
            
    var node: Node = document!!.createElement(ErrorData.getInstance()!!.NAME)!!
            

node!!.appendChild(ModDomHelper.createNameValueNodes(document, ErrorData.getInstance()!!.TEXT, errorText))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            {


                            throw Exception(
                            "Error Node Creation Failure")
}

}



        }
            private constructor        ()
            : super()
        {}


}
                
            

