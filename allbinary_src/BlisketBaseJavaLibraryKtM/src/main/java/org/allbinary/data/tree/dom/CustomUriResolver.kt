
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.xml.transform.Source
import javax.xml.transform.TransformerException
import javax.xml.transform.URIResolver
import javax.xml.transform.stream.StreamSource
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbFilePath
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.visual.transform.info.template.TransformInfoTemplateData

open public class CustomUriResolver
            : Object
        
                , URIResolver {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var path: String

    private var basicURIResolver: BasicUriResolver
public constructor        (path: String, basicURIResolver: BasicUriResolver)
            : super()
        {

                    var path = path


                    var basicURIResolver = basicURIResolver
this.path= path
this.basicURIResolver= basicURIResolver
}


                @Throws(TransformerException::class)
            
open fun resolve(href: String, base: String)
        //nullable = true from not(false or (false and false)) = true
: Source{

                    var href = href


                    var base = base

        try {
            
    var fileAbPath: AbPath = AbFilePath(path +AbPathData.getInstance()!!.SEPARATOR +href) as AbPath


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.XMLLOGGING))
                        
                                    {
                                    logUtil!!.put("attempt to use xsl:import: href=" +href +"\nBase= " +base +"\nNew path= " +fileAbPath!!.toString() +"\nRequired Extension: " +this.basicURIResolver!!.getExtension(), this, 
                            "resolve")

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


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


}
                
            

