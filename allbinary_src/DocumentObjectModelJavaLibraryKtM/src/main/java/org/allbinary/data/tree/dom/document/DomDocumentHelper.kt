
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
        package org.allbinary.data.tree.dom.document




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import java.io.StringBufferInputStream
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Document

open public class DomDocumentHelper
            : Object
         {
        
companion object {
            
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
System.setProperty("jdk.xml.maxElementDepth", "0")
System.setProperty("jdk.xml.xpathExprOpLimit", "0")
System.setProperty("jdk.xml.xpathTotalOpLimit", "0")

    var LIMIT: String = "500000"

System.setProperty("jdk.xml.maxGeneralEntitySizeLimit", LIMIT)
System.setProperty("jdk.xml.totalEntitySizeLimit", LIMIT)
}


    open fun create()
        //nullable = true from not(false or (false and true)) = true
: Document?{

        try {
            
    var factory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()!!


    var builder: DocumentBuilder = factory.newDocumentBuilder()!!


    var document: Document = builder.newDocument()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
} catch(e: Exception)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(Exception::class)
            
    open fun create(inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: Document{
var inputStream = inputStream

        try {
            
    var factory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()!!


    var builder: DocumentBuilder = factory.newDocumentBuilder()!!


    var document: Document = builder.parse(inputStream)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
} catch(e: Exception)
            {



                            throw e
}

}


                @Throws(Exception::class)
            
    open fun create(xmlString: String)
        //nullable = true from not(false or (false and false)) = true
: Document{
var xmlString = xmlString

        try {
            
    var factory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()!!


    var builder: DocumentBuilder = factory.newDocumentBuilder()!!


    var document: Document = builder.parse(StringBufferInputStream(xmlString))!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
} catch(e: Exception)
            {



                            throw e
}

}


        }
            private constructor ()
            : super()
        {
}


}
                
            

