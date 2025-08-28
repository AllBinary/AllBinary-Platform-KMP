
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
        
import java.io.StringBufferInputStream
import javax.xml.transform.stream.StreamSource
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.io.AbFileLocalInputStream
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath
import org.w3c.dom.Document

open public class SimpleTransform
            : Object
         {
        

    private val xsltFilePath: AbPath

    private val dataFilePath: AbPath
public constructor        (xsltFilePath: AbPath, dataFilePath: AbPath)
            : super()
        

        Updates for KMP build        
        {
var xsltFilePath = xsltFilePath
var dataFilePath = dataFilePath
this.xsltFilePath= xsltFilePath
this.dataFilePath= dataFilePath
}


                @Throws(Exception::class)
            
open fun transform()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var inputStream: AbFileLocalInputStream = AbFileLocalInputStream(AbFile(xsltFilePath))


    var document: Document = DomDocumentHelper.create(AbFileLocalInputStream(AbFile(dataFilePath)))!!


    var result: String = XslHelper.getInstance()!!.translate(StreamSource(inputStream), StreamSource(StringBufferInputStream(DomDocumentHelper.toString(document))))!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


}
                
            

