
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
        package org.allbinary.data.tree.dom




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.stream.StreamSource
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath

open public class AbXslHelper
            : Object
         {
        

        companion object {
            
    private val instance: AbXslHelper = AbXslHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbXslHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun translate(xslFile: AbFile, xmlFile: AbFile)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var xslFile = xslFile


                    var xmlFile = xmlFile



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.translate(xslFile!!.getAbsolutePath(), xmlFile!!.getAbsolutePath())
}


                @Throws(Exception::class)
            
open fun translate(xslPath: AbPath, xmlPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var xslPath = xslPath


                    var xmlPath = xmlPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.translate(xslPath!!.getPath(), xmlPath!!.getPath())
}


                @Throws(Exception::class)
            
open fun translate(xsltFilePath: String, xmlFilePath: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var xsltFilePath = xsltFilePath


                    var xmlFilePath = xmlFilePath

        try {
            
    var outputStream: ByteArrayOutputStream = ByteArrayOutputStream()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return XslHelper.getInstance()!!.translate(StreamSource(xsltFilePath), StreamSource(xmlFilePath), StreamResult(outputStream))!!.toString()
} catch(e: Exception)
            {


                            throw e
}

}


}
                
            

