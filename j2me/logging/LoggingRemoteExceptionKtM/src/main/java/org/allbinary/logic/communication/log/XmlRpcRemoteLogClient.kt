
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
        package org.allbinary.logic.communication.log




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.util.Hashtable
import java.util.Vector
import org.apache.xmlrpc.XmlRpcClient
import org.apache.xmlrpc.XmlRpcException
import org.allbinary.logic.communication.xmlrpc.XmlRpcAbeClient
import org.allbinary.logic.system.security.crypt.jcehelper.NoCrypt
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class XmlRpcRemoteLogClient : XmlRpcAbeClient {
        

    private val noCrypt: NoCrypt = NoCrypt()
public constructor        (clientInfo: AbeClientInformationInterface)                        

                            : super(clientInfo, "SSLLogServ.logUtil"){
    //var clientInfo = clientInfo


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun get(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var anyType = anyType

        try {
            
    var param: Vector = Vector()


    var serverUrl: String = getClientInfo()!!.getLicenseServer(this.getServer())!!


    var index: Int = serverUrl!!.lastIndexOf("/")!!

serverUrl= serverUrl!!.substring(0, index +1) +"logservssl.php"

    var xmlRpcClient: XmlRpcClient = XmlRpcClient(serverUrl)

this.setClient(xmlRpcClient)
xmlRpcClient!!.setBasicAuthentication(
                            null, 
                            null)

    var hashtable: Hashtable<Any, Any> = anyType as Hashtable<Any, Any>

param.add(hashtable)

    var result: Any = xmlRpcClient!!.execute(this.getRemoteMethod(), param, noCrypt)!!

System.out.println("Result: \n" +result.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: IOException)
            {
System.out.println("IOException Trying Other Servers")

    
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
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)
}
 catch(e: Exception)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tryAnother(anyType)
}

}


}
                
            

