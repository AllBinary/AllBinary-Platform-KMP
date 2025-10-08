
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.w3c.dom.Document

open public class DomDocumentFileHelper
            : Object
         {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun create(xmlFile: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Document{
var xmlFile = xmlFile

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomDocumentHelper.create(AbFileInputStream(xmlFile))
} catch(e: Exception)
            {



                            throw e
}

}


                @Throws(Exception::class)
            
    open fun save(file: AbFile, document: Document)
        //nullable = true from not(false or (false and false)) = true
{
var file = file
var document = document

    var dataOutputStream: AbDataOutputStream = 
                null
            


        try {
            
    var copyTransformerFactory: TransformerFactory = TransformerFactory.newInstance()!!


    var copyTransformer: Transformer = copyTransformerFactory!!.newTransformer()!!


    var domSource: DOMSource = DOMSource(document)


    
                        if(file.isFile())
                        
                                    {
                                    file.delete()

                                    }
                                
file.createNewFile()
dataOutputStream= DataOutputStreamFactory.getInstance()!!.getInstance(file)

    var streamResult: StreamResult = StreamResult(dataOutputStream)

copyTransformer!!.transform(domSource, streamResult)
dataOutputStream!!.flush()
} catch(e: Exception)
            {



                            throw e
}

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)

         }
        
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

