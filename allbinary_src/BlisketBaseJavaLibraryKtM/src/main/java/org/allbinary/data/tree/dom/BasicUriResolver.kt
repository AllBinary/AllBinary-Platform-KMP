
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
        
import javax.xml.transform.Source
import javax.xml.transform.TransformerException
import javax.xml.transform.URIResolver
import javax.xml.transform.stream.StreamSource
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbFilePath
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.template.TransformInfoTemplateData

open public class BasicUriResolver
            : Object
        
                , URIResolver {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val IMPORT_URL: String = "/{import url}"

    private val ATTEMPT: String = "attempt to use xsl:import: href="

    private val BASE: String = "\nBase= "

    private val NEW_PATH: String = "\nNew path= "

    private val NOTE: String = "\nNote: "

    private val URL_GLOBAL: String = " is a urlglobal"

    private val REQUIRED_EXTENSION: String = "\nRequired Extension: "

    private val RESOLVE: String = "resolve"

    private var extension: String
public constructor (extension: String)
            : super()
        {
var extension = extension
this.extension= extension
}


    open fun getExtension()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.extension
}


                @Throws(TransformerException::class)
            
    open fun resolve(href: String, base: String)
        //nullable = true from not(false or (false and false)) = true
: Source{
var href = href
var base = base

        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(href)

    var abPath: AbPath = AbFilePath(stringBuffer!!.toString()) as AbPath


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XMLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(ATTEMPT)
stringBuffer!!.append(href)
stringBuffer!!.append(BASE)
stringBuffer!!.append(base)
stringBuffer!!.append(NEW_PATH)
stringBuffer!!.append(abPath!!.toString())
stringBuffer!!.append(NOTE)
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(URL_GLOBAL)
stringBuffer!!.append(REQUIRED_EXTENSION)
stringBuffer!!.append(extension)
logUtil!!.put(stringBuffer!!.toString(), this, RESOLVE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StreamSource(CryptFileReader(TransformInfoTemplateData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoTemplateData.getInstance()!!.ENCRYPTED_EXTENSION).
                            getInputStream(abPath))
} catch(e: TransformerException)
            {



                            throw e
}
 catch(e: Exception)
            {



                            throw TransformerException(e)
}

}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(IMPORT_URL)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "BasicUriResolver - Does not work without webapp path should be changed"
}

}


}
                
            

