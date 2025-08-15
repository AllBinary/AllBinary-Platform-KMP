
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
        package org.allbinary.logic.communication.xmlrpc




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.apache.xmlrpc.NullXmlRpcHandler
import org.apache.xmlrpc.XmlRpcClient
import org.apache.xmlrpc.XmlRpcHandler

open public class XmlRpcAbeClient
            : Object
         {
        

        companion object {
            
    var isOnline: Boolean = true

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val remoteMethod: String

    private val clientInfo: AbeClientInformationInterface

    private var client: XmlRpcHandler = NullXmlRpcHandler.NULL_XML_RPC_HANDLER

    private var server: Int

    private var start: Int= 0

    private var maxServers: Int= 0

    private var isDone: Boolean

    private val START_SERVER: String = "Start With Server #"

    val TRYING: String = "Trying Server #"

    val SEP: String = CommonLabels.getInstance()!!.COLON_SEP

    val CLIENT_INFO: String = "Client Info: \n"

    val RESULT: String = "Result: \n"

    val INVALID: String = "License data is Invalid Trying Other Servers"

    val EXCEPTION_IN_CLIENT: String = "Exception in client"

    val SERVER_REPORTED_ERROR: String = "Server reported error"

    val UNKNOWN_ERROR: String = "Unknown License Retrieval Failure"

    val TRYING_OTHER_SERVERS: String = "IOException Trying Other Servers"

    val HOST_NOT_RESOLVED_MSG: String = "Not Trying Again Since Host Unresolved"

    val HOST_NOT_RESOLVED: String = "Host is unresolved"

    private val myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!
            
public constructor        (clientInfo: AbeClientInformationInterface, remoteMethod: String)
            : super()
        {

                    var clientInfo = clientInfo


                    var remoteMethod = remoteMethod
this.remoteMethod= remoteMethod
this.clientInfo= clientInfo

    
                        if(clientInfo!!.getNumberOfLicenseServers() > 1)
                        
                                    {
                                    this.maxServers= clientInfo!!.getNumberOfLicenseServers() -2
this.start= myRandomFactory!!.getAbsoluteNextInt(maxServers) +1

                                    }
                                
                             else 
    
                        if(clientInfo!!.getNumberOfLicenseServers() == 1)
                        
                                    {
                                    this.maxServers= 0
this.start= 0

                                    }
                                
isDone= false
this.server= this.start

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(START_SERVER)
stringBuffer!!.append(this.getServer())
stringBuffer!!.append(SEP)
stringBuffer!!.append(clientInfo!!.getLicenseServer(this.getServer()))
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.CONSTRUCTOR)
}


                @Throws(Exception::class)
            
open fun get(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
}


                @Throws(Exception::class)
            
open fun tryAnother(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType

    
                        if(getServer() < getMaxServers())
                        
                                    {
                                    setServer(getServer() +1)

                                    }
                                
                        else {
                            setServer(0)

                        }
                            

    
                        if(getServer() != getStart() && !isIsDone())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.get(anyType)

                                    }
                                
                        else {
                            setIsDone(true)

                        }
                            



                            throw Exception("Tried All Servers But Still Failed")
}


open fun getClientInfo()
        //nullable = true from not(false or (false and true)) = true
: AbeClientInformationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return clientInfo
}


open fun getClient()
        //nullable = true from not(false or (false and true)) = true
: XmlRpcHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return client
}


open fun setClient(client: XmlRpcClient)
        //nullable = true from not(false or (false and false)) = true
{

                    var client = client
this.client= client
}


open fun getServer()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return server
}


open fun setServer(server: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var server = server
this.server= server
}


open fun getStart()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return start
}


open fun setStart(start: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var start = start
this.start= start
}


open fun getMaxServers()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxServers
}


open fun setMaxServers(maxServers: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxServers = maxServers
this.maxServers= maxServers
}


open fun isIsDone()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isDone
}


open fun setIsDone(isDone: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isDone = isDone
this.isDone= isDone
}


open fun getRemoteMethod()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return remoteMethod
}


}
                
            

