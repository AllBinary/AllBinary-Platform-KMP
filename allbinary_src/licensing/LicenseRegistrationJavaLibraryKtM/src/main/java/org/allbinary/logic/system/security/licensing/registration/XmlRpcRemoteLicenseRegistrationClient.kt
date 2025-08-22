
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
        package org.allbinary.logic.system.security.licensing.registration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.util.Hashtable
import java.util.Vector
import org.allbinary.init.crypt.jcehelper.CryptInterface
import org.allbinary.string.CommonLabels
import org.apache.xmlrpc.XmlRpcClient
import org.apache.xmlrpc.XmlRpcException
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.xmlrpc.XmlRpcAbeClient
import org.allbinary.logic.java.exception.ExceptionUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class XmlRpcRemoteLicenseRegistrationClient : XmlRpcAbeClient {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val PAGE: String = "licenseregistrationserverssl.php"
public constructor        (clientInfo: AbeClientInformationInterface)                        

                            : super(clientInfo, "LicenseRegistrationServer.process"){

                    var clientInfo = clientInfo


                            //For kotlin this is before the body of the constructor.
                    
this.setServer(0)
}


                @Throws(Exception::class)
            
open fun get(anyType: Any, cryptInterface: CryptInterface)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType


                    var cryptInterface = cryptInterface

        try {
            
    var server: String = getClientInfo()!!.getLicenseServer(this.getServer())!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(TRYING)
stringBuffer!!.append(this.getServer())
stringBuffer!!.append(SEP)
stringBuffer!!.append(server)
logUtil!!.put(CommonLabels.getInstance()!!.START_LABEL +stringBuffer!!.toString(), this, commonStrings!!.GET)

    var param: Vector = Vector()


    var serverUrl: String = getClientInfo()!!.getLicenseServer(this.getServer())!!


    var index: Int = serverUrl!!.lastIndexOf("/")!!

serverUrl= serverUrl!!.substring(0, index +1) +PAGE

    var xmlRpcClient: XmlRpcClient = XmlRpcClient(serverUrl)

this.setClient(xmlRpcClient)
xmlRpcClient!!.setBasicAuthentication(
                            null, 
                            null)

    var hashtable: Hashtable<Any, Any> = anyType as Hashtable<Any, Any>

logUtil!!.put(CLIENT_INFO +hashtable.toString(), this, commonStrings!!.GET)
param.add(hashtable)

    var result: Any = xmlRpcClient!!.execute(this.getRemoteMethod(), param, cryptInterface)!!

logUtil!!.put(RESULT +result.toString(), this, commonStrings!!.GET)
isOnline= true



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: IOException)
            {logUtil!!.put(TRYING_OTHER_SERVERS +ExceptionUtil.getInstance()!!.getStackTrace(e), this, commonStrings!!.GET)

    
                        if(!e.getMessage()!!.startsWith(HOST_NOT_RESOLVED))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)

                                    }
                                
                        else {
                            


                            throw Exception(HOST_NOT_RESOLVED_MSG)

                        }
                            
}
 catch(e: XmlRpcException)
            {logUtil!!.put(SERVER_REPORTED_ERROR, this, commonStrings!!.GET, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)
}
 catch(e: Exception)
            {logUtil!!.put(UNKNOWN_ERROR, this, commonStrings!!.GET, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)
}

}


}
                
            

