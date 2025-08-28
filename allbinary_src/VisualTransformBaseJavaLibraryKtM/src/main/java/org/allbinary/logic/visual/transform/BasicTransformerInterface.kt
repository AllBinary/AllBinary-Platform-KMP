
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
import javax.xml.transform.URIResolver
import javax.xml.transform.stream.StreamSource
import org.allbinary.logic.visual.transform.info.CompositeTransformInfoInterface
interface BasicTransformerInterface : CompositeTransformInfoInterface {
        

open fun setInputStream(inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setURIResolver(uriResolver: URIResolver)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getStreamSource()
        //nullable = true from not(false or (false and true)) = true
: StreamSource

        Updates for KMP build        
        

open fun getInputStream()
        //nullable = true from not(false or (false and true)) = true
: InputStream

        Updates for KMP build        
        

open fun getURIResolver()
        //nullable = true from not(false or (false and true)) = true
: URIResolver

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun translate(xmlDocumentStr: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        

}
                
            

