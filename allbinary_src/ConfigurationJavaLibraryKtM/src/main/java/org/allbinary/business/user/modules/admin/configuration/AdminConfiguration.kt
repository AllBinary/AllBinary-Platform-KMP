
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
        package org.allbinary.business.user.modules.admin.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.context.configuration.ContextConfiguration
import org.allbinary.business.context.configuration.ContextConfigurationData
import org.allbinary.business.context.configuration.ContextConfigurationDomDocumentMapping
import org.allbinary.business.context.configuration.ContextConfigurationInterface
import org.allbinary.business.context.configuration.ContextConfigurationInterfaceFactory
import org.allbinary.business.context.configuration.ContextConfigurationPathUtil
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileWriter
import org.allbinary.string.CommonStrings

open public class AdminConfiguration
            : Object
        
                , AdminConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var contextConfigurationInterface: ContextConfigurationInterface
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.contextConfigurationInterface= ContextConfigurationInterfaceFactory.getInstance()!!.getInstance(AdminConfigurationData.CONTEXTNAME)
}

public constructor        (request: HttpServletRequest)
            : super()
        

        Updates for KMP build        
        {
var request = request
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.getFormData(RequestParams(request).
                            toHashMap())
}

public constructor        (storeHashMap: HashMap<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
var storeHashMap = storeHashMap
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.getFormData(storeHashMap)
}


                @Throws(Exception::class)
            
open fun getFormData(storeHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var storeHashMap = storeHashMap
logUtil!!.put(commonStrings!!.START, this, "getFormData")
this.setContextConfigurationInterface(ContextConfiguration(storeHashMap) as ContextConfigurationInterface)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun write()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var contextConfigurationDomDocumentMapping: ContextConfigurationDomDocumentMapping = ContextConfigurationDomDocumentMapping(this.getContextConfigurationInterface())


    var cryptFileWriter: CryptFileWriter = CryptFileWriter(ContextConfigurationData.getInstance()!!.UNCRYPTED_EXTENSION, ContextConfigurationData.getInstance()!!.ENCRYPTED_EXTENSION)

cryptFileWriter!!.write(ContextConfigurationPathUtil.getAbPath(AdminConfigurationData.CONTEXTNAME), contextConfigurationDomDocumentMapping!!.toXmlDoc())
}


open fun getContextConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: ContextConfigurationInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return contextConfigurationInterface
}


open fun setContextConfigurationInterface(contextConfigurationInterface: ContextConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var contextConfigurationInterface = contextConfigurationInterface
this.contextConfigurationInterface= contextConfigurationInterface
}


}
                
            

