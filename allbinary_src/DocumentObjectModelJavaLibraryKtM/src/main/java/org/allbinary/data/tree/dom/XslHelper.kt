
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.OutputStream
import java.io.StringBufferInputStream
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.URIResolver
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.stream.StreamSource
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.w3c.dom.Document

open public class XslHelper
            : Object
         {
        

        companion object {
            
    private val instance: XslHelper = XslHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: XslHelper

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun translate(xsltStreamSource: StreamSource, xmlStreamSource: StreamSource, streamResult: StreamResult)
        //nullable = true from not(false or (false and false)) = true
: OutputStream

        Updates for KMP build        
        {
    //var xsltStreamSource = xsltStreamSource
    //var xmlStreamSource = xmlStreamSource
    //var streamResult = streamResult

        try {
            
    var transformerFactory: TransformerFactory = TransformerFactory.newInstance()!!


    var transformer: Transformer = transformerFactory!!.newTransformer(xsltStreamSource)!!

transformer.transform(xmlStreamSource, streamResult)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return streamResult!!.getOutputStream()
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


                @Throws(Exception::class)
            
open fun translate(resolver: URIResolver, xsltStreamSource: StreamSource, xmlStreamSource: StreamSource, streamResult: StreamResult)
        //nullable = true from not(false or (false and false)) = true
: OutputStream

        Updates for KMP build        
        {
    //var resolver = resolver
    //var xsltStreamSource = xsltStreamSource
    //var xmlStreamSource = xmlStreamSource
    //var streamResult = streamResult

        try {
            
    var tFactory: TransformerFactory = TransformerFactory.newInstance()!!

tFactory!!.setURIResolver(resolver)

    var transformer: Transformer = tFactory!!.newTransformer(xsltStreamSource)!!

transformer.transform(xmlStreamSource, streamResult)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return streamResult!!.getOutputStream()
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


                @Throws(Exception::class)
            
open fun translate(xsltStreamSource: StreamSource, xmlDocument: Document)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var xsltStreamSource = xsltStreamSource
    //var xmlDocument = xmlDocument

        try {
            
    var outputStream: ByteArrayOutputStream = ByteArrayOutputStream()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.translate(xsltStreamSource, StreamSource(StringBufferInputStream(DomDocumentHelper.toString(xmlDocument))), StreamResult(outputStream))!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


                @Throws(Exception::class)
            
open fun translate(xsltStreamSource: StreamSource, xmlStreamSource: StreamSource)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var xsltStreamSource = xsltStreamSource
    //var xmlStreamSource = xmlStreamSource

        try {
            
    var outputStream: ByteArrayOutputStream = ByteArrayOutputStream()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.translate(xsltStreamSource, xmlStreamSource, StreamResult(outputStream))!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


                @Throws(Exception::class)
            
open fun translate(resolver: URIResolver, xsltStreamSource: StreamSource, xmlStreamSource: StreamSource)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var resolver = resolver
    //var xsltStreamSource = xsltStreamSource
    //var xmlStreamSource = xmlStreamSource

        try {
            
    var outputStream: ByteArrayOutputStream = ByteArrayOutputStream()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.translate(resolver, xsltStreamSource, xmlStreamSource, StreamResult(outputStream))!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


                @Throws(Exception::class)
            
open fun export(outputFile: File, xsltFilePath: String, xmlDocument: Document)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var outputFile = outputFile
    //var xsltFilePath = xsltFilePath
    //var xmlDocument = xmlDocument

        try {
            outputFile!!.createNewFile()
this.translate(StreamSource(xsltFilePath), StreamSource(StringBufferInputStream(DomDocumentHelper.toString(xmlDocument))), StreamResult(outputFile))
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


}
                
            

