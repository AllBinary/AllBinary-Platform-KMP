
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
        package org.allbinary.logic.visual.transform




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import java.io.StringBufferInputStream
import javax.xml.transform.URIResolver
import javax.xml.transform.stream.StreamSource
import org.allbinary.data.tree.dom.XslHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.generator.TransformInfoObjectConfigGenerator
import org.allbinary.logic.visual.transform.info.objectConfig.generator.TransformInfoObjectConfigGeneratorFactory

open public class AbTransformer
            : Object
        
                , BasicTransformerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var transformInfoInterface: TransformInfoInterface

    private var inputStream: InputStream

    private var uriResolver: URIResolver
public constructor        (transformInfoInterface: TransformInfoInterface)
            : super()
        

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface
this.transformInfoInterface= transformInfoInterface
}


open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformInfoInterface
}


open fun setInputStream(inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var inputStream = inputStream
this.inputStream= inputStream
}


open fun setURIResolver(uriResolver: URIResolver)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var uriResolver = uriResolver
this.uriResolver= uriResolver
}


open fun getInputStream()
        //nullable = true from not(false or (false and true)) = true
: InputStream

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.inputStream
}


open fun getURIResolver()
        //nullable = true from not(false or (false and true)) = true
: URIResolver

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.uriResolver
}


open fun getStreamSource()
        //nullable = true from not(false or (false and true)) = true
: StreamSource

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StreamSource(this.getInputStream())
}


                @Throws(Exception::class)
            
open fun translate(xmlDocumentStr: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var xmlDocumentStr = xmlDocumentStr

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XMLLOGGING))
                        
                                    {
                                    logUtil!!.put("xml: \n" +xmlDocumentStr, this, "translate(String xmlDocumentStr)")

                                    }
                                

    
                        if(this.getURIResolver() == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("No URIResolver")

                                    }
                                

    var result: String = XslHelper.getInstance()!!.translate(this.getURIResolver(), StreamSource(this.getInputStream()), StreamSource(StringBufferInputStream(xmlDocumentStr)))!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGING))
                        
                                    {
                                    logUtil!!.put("translated xml: " +result, this, "translate(String xmlDocumentStr)")

                                    }
                                

    var transformInfoObjectConfigGeneratorInterface: TransformInfoObjectConfigGenerator = TransformInfoObjectConfigGeneratorFactory.getInstance()!!.getInstance(this.getTransformInfoInterface())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformInfoObjectConfigGeneratorInterface!!.process(result)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(this.transformInfoInterface!!.log(), this, "translate(document)", e)

                                    }
                                



                            throw e
}

}


}
                
            

