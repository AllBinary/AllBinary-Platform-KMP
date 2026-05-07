
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
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoHttpStoreInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.template.TransformInfoTemplateData

open public class StoreUriResolver
            : Object
        
                , URIResolver {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val uriResolverStrings: URIResolverStrings = URIResolverStrings.getInstance()!!

    private var basicURIResolver: BasicUriResolver

    private var parentTransformInfoInterface: TransformInfoInterface
public constructor (parentTransformInfoInterface: TransformInfoInterface, basicURIResolver: BasicUriResolver)
            : super()
        {
var parentTransformInfoInterface = parentTransformInfoInterface
var basicURIResolver = basicURIResolver
this.parentTransformInfoInterface= parentTransformInfoInterface
this.basicURIResolver= basicURIResolver
}


                @Throws(TransformerException::class)
            
    open fun resolve(href: String, base: String)
        //nullable = true from not(false or (false and false)) = true
: Source{
var href = href
var base = base

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    var transformInfoHttpStoreInterface: TransformInfoHttpStoreInterface = this.parentTransformInfoInterface as TransformInfoHttpStoreInterface

stringBuffer!!.append(URLGLOBALS.getMainPath())!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)!!.append(transformInfoHttpStoreInterface!!.getStoreName())!!.append(AbPathData.getInstance()!!.SEPARATOR)!!.append(href)

    var fileAbPath: AbPath = AbFilePath(stringBuffer!!.toString()) as AbPath


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XMLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(this.uriResolverStrings!!.ATTEMPT)
stringBuffer!!.append(href)
stringBuffer!!.append(this.uriResolverStrings!!.BASE)
stringBuffer!!.append(base)
stringBuffer!!.append(this.uriResolverStrings!!.NEW_PATH)
stringBuffer!!.append(fileAbPath!!.toString())
stringBuffer!!.append(this.uriResolverStrings!!.NOTE)
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(this.uriResolverStrings!!.URL_GLOBAL)
stringBuffer!!.append(this.uriResolverStrings!!.REQUIRED_EXTENSION)
stringBuffer!!.append(this.basicURIResolver!!.getExtension())
this.logUtil!!.putF(stringBuffer!!.toString(), this, this.uriResolverStrings!!.RESOLVE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StreamSource(CryptFileReader(TransformInfoTemplateData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoTemplateData.getInstance()!!.ENCRYPTED_EXTENSION).
                            getInputStream(fileAbPath))
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
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH +"{Store Name if Any}/{import url}"
} catch(e: Exception)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "StoreUriResolver - Does not work without webapp path should be changed"
}

}


}
                
            

