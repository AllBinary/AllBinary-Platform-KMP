
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import java.io.ByteArrayOutputStream
import java.io.StringReader
import java.io.StringWriter
import java.io.Writer
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerConfigurationException
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.java.characters.CharacterSetData
import org.w3c.dom.Document
import org.xml.sax.InputSource

open public class XmlDocumentHelper
            : Object
         {
        
companion object {
            
    private val instance: XmlDocumentHelper = XmlDocumentHelper()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: XmlDocumentHelper{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return XmlDocumentHelper.instance
}


                @Throws(Exception::class)
            
    open fun toString(document: Document)
        //nullable = true from not(false or (true and false)) = true
: String{
var document = document

        try {
            
    var domSource: DOMSource = DOMSource(document)


    var byteArrayOutputStream: ByteArrayOutputStream = ByteArrayOutputStream()


    var streamResult: StreamResult = StreamResult(byteArrayOutputStream)


    var copyTransformerFactory: TransformerFactory = TransformerFactory.newInstance()!!


    var copyTransformer: Transformer = copyTransformerFactory!!.newTransformer()!!

copyTransformer!!.transform(domSource, streamResult)

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return byteArrayOutputStream!!.toString()
} catch(e: Exception)
            {



                            throw e
}

}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val INDENT_NUMBER: String = "indent-number"

    private var indent: Int= 0

    private var ignoreDeclaration: Boolean= false
private constructor ()
            : super()
        {
this.init(4, true)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun init(indent: Int, ignoreDeclaration: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var indent = indent
    //var ignoreDeclaration = ignoreDeclaration
this.indent= indent
this.ignoreDeclaration= ignoreDeclaration
}


                @Throws(TransformerConfigurationException::class)
            
    open fun createTransformer(indent: Int, ignoreDeclaration: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Transformer{
    //var indent = indent
    //var ignoreDeclaration = ignoreDeclaration

    var booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!


    var transformerFactory: TransformerFactory = TransformerFactory.newInstance()!!

transformerFactory!!.setAttribute(this.INDENT_NUMBER, indent)

    var transformer: Transformer = transformerFactory!!.newTransformer()!!

transformer.setOutputProperty(OutputKeys.ENCODING, CharacterSetData.getInstance()!!.UTF_8)
transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, if(ignoreDeclaration) {
                            
                            booleanFactory!!.YES
                        
                            } else {
                            booleanFactory!!.NO
                            }
    )
transformer.setOutputProperty(OutputKeys.INDENT, booleanFactory!!.YES)

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformer
}


                @Throws(TransformerConfigurationException::class)
            
    open fun createTransformer()
        //nullable = true from not(false or (false and true)) = true
: Transformer{

    var currentIndent: Int= 0


    var currentIgnoreDeclaration: Boolean= false


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {
currentIndent= this.indent
currentIgnoreDeclaration= this.ignoreDeclaration
}


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createTransformer(currentIndent, currentIgnoreDeclaration)
}


                @Throws(Exception::class)
            
    open fun format(xmlString: String)
        //nullable = true from not(false or (false and false)) = true
: String{
    //var xmlString = xmlString

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.formatWithTransformer(xmlString, this.createTransformer())
}


                @Throws(Exception::class)
            
    open fun formatWithTransformer(xmlString: String, transformer: Transformer)
        //nullable = true from not(false or (false and false)) = true
: String{
    //var xmlString = xmlString
    //var transformer = transformer

    var src: InputSource = InputSource(StringReader(xmlString))


    var document: Document = DocumentBuilderFactory.newInstance()!!.newDocumentBuilder()!!.parse(src)!!


    var out: Writer = StringWriter()

transformer.transform(DOMSource(document), StreamResult(out))

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return out.toString()
}


}
                
            

