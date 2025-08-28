
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
        
import java.io.StringReader
import java.io.StringWriter
import java.io.Writer
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.java.characters.CharacterSetData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.xml.sax.InputSource

open public class XmlDocumentHelper
            : Object
         {
        

        companion object {
            
    private val instance: XmlDocumentHelper = XmlDocumentHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: XmlDocumentHelper

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val INDENT_NUMBER: String = "indent-number"

    private var transformer: Transformer
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.init(4, true)
}


open fun init(indent: Int, ignoreDeclaration: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var indent = indent
    //var ignoreDeclaration = ignoreDeclaration

        try {
            
    var booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!


    var transformerFactory: TransformerFactory = TransformerFactory.newInstance()!!

transformerFactory!!.setAttribute(INDENT_NUMBER, indent)
transformer= transformerFactory!!.newTransformer()
transformer.setOutputProperty(OutputKeys.ENCODING, CharacterSetData.getInstance()!!.UTF_8)
transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, if(ignoreDeclaration) {
                            
                            booleanFactory!!.YES
                        
                            } else {
                            booleanFactory!!.NO
                            }
    )
transformer.setOutputProperty(OutputKeys.INDENT, booleanFactory!!.YES)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}

}


                @Throws(Exception::class)
            
open fun format(xmlString: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var xmlString = xmlString

    var src: InputSource = InputSource(StringReader(xmlString))


    var document: Document = DocumentBuilderFactory.newInstance()!!.newDocumentBuilder()!!.parse(src)!!


    var out: Writer = StringWriter()

transformer.transform(DOMSource(document), StreamResult(out))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return out.toString()
}


}
                
            

