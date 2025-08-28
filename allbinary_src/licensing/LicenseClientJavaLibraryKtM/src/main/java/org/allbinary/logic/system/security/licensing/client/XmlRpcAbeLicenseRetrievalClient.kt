
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
        package org.allbinary.logic.system.security.licensing.client




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.util.Hashtable
import java.util.Vector
import org.allbinary.init.crypt.jcehelper.CryptInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.xmlrpc.XmlRpcAbeClient
import org.allbinary.logic.java.exception.ExceptionUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.AbeClientLicense
import org.allbinary.logic.system.security.licensing.AbeLicenseInterface
import org.allbinary.string.CommonLabels
import org.apache.xmlrpc.XmlRpcClient
import org.apache.xmlrpc.XmlRpcException

open public class XmlRpcAbeLicenseRetrievalClient : XmlRpcAbeClient {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (clientInfo: AbeClientInformationInterface)                        

                            : super(clientInfo, "LicServ.getLicense"){
var clientInfo = clientInfo


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun get(anyType: Any, cryptInterface: CryptInterface)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var anyType = anyType
    //var cryptInterface = cryptInterface

        try {
            
    var server: String = getClientInfo()!!.getLicenseServer(this.getServer())!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(TRYING)
stringBuffer!!.append(this.getServer())
stringBuffer!!.append(SEP)
stringBuffer!!.append(server)
logUtil!!.put(CommonLabels.getInstance()!!.START_LABEL +stringBuffer!!.toString(), this, commonStrings!!.GET)

    var param: Vector = Vector()


    var xmlRpcClient: XmlRpcClient = XmlRpcClient(server)

this.setClient(xmlRpcClient)
xmlRpcClient!!.setBasicAuthentication(
                            null, 
                            null)

    var hashtable: Hashtable<Any, Any> = this.getClientInfo()!!.toHashtable()!!

logUtil!!.put(CLIENT_INFO +hashtable.toString(), this, commonStrings!!.GET)
param.add(hashtable)

    var result: Any = xmlRpcClient!!.execute(this.getRemoteMethod(), param, cryptInterface)!!

logUtil!!.put(RESULT +result.toString(), this, commonStrings!!.GET)

    var resultHashtable: Hashtable<Any, Any> = result as Hashtable<Any, Any>


    
                        if(!AbeClientLicense.hasRequiredKeys(resultHashtable))
                        
                                    {
                                    logUtil!!.put(INVALID, this, commonStrings!!.GET)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)

                                    }
                                

    var abeLicenseInterface: AbeLicenseInterface = AbeClientLicense(resultHashtable)

logUtil!!.put(commonStrings!!.END +stringBuffer!!.toString(), this, commonStrings!!.GET)
isOnline= true



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abeLicenseInterface
} catch(e: IOException)
            {
logUtil!!.put(EXCEPTION_IN_CLIENT, this, commonStrings!!.GET, e)
logUtil!!.put(TRYING_OTHER_SERVERS +ExceptionUtil.getInstance()!!.getStackTrace(e), this, commonStrings!!.GET)

    
                        if(!e.getMessage()!!.startsWith(HOST_NOT_RESOLVED))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)

                                    }
                                
                        else {
                            isOnline= false



                            throw Exception(HOST_NOT_RESOLVED_MSG)

                        }
                            
}
 catch(e: XmlRpcException)
            {
logUtil!!.put(SERVER_REPORTED_ERROR, this, commonStrings!!.GET, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)
}
 catch(e: Exception)
            {
logUtil!!.put(UNKNOWN_ERROR, this, commonStrings!!.GET, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)
}

}


}
                
            

