
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
        package org.allbinary.logic.communication.http.request




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class AbeHttpRequestInfo
            : Object
         {
        

    private val NAME: String = "AbeHttpRequestInfo"

    private val abeHttpRequestInfoData: AbeHttpRequestInfoData = AbeHttpRequestInfoData.getInstance()!!

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private var httpUserAgent: String

    private var remoteAddress: String

    private var remoteHost: String

    private var remoteHostByAddr: String

    private var remotePort: String

    private var requestedFilePath: String
public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
var hashMap = hashMap

    var stringUtil: StringUtil = StringUtil.getInstance()!!

this.httpUserAgent= stringUtil!!.getInstance(hashMap!!.get(abeHttpRequestInfoData!!.HTTP_USER_AGENT) as String)
this.remoteAddress= stringUtil!!.getInstance(hashMap!!.get(abeHttpRequestInfoData!!.REMOTE_ADDRESS) as String)
this.remoteHost= stringUtil!!.getInstance(hashMap!!.get(abeHttpRequestInfoData!!.REMOTE_HOST) as String)
this.remoteHostByAddr= stringUtil!!.getInstance(hashMap!!.get(abeHttpRequestInfoData!!.REMOTE_HOST_BY_ADDRESS) as String)
this.remotePort= stringUtil!!.getInstance(hashMap!!.get(abeHttpRequestInfoData!!.REMOTE_PORT) as String)
this.requestedFilePath= stringUtil!!.getInstance(hashMap!!.get(abeHttpRequestInfoData!!.REQUEST_FILE_PATH) as String)
}

public constructor        (httpServletRequest: HttpServletRequest)
            : super()
        

        Updates for KMP build        
        {
var httpServletRequest = httpServletRequest

    var stringUtil: StringUtil = StringUtil.getInstance()!!

this.httpUserAgent= stringUtil!!.EMPTY_STRING

    var enumuration: Enumeration<Any?> = httpServletRequest!!.getHeaderNames()!!


        while(enumuration.hasMoreElements())
        

        Updates for KMP build        
        {

    var key: String = enumuration.nextElement()!! as String


    var value: String = httpServletRequest!!.getHeader(key)!!


    
                        if(key.indexOf("user") >= 0)
                        this.httpUserAgent= "key: " +key +" value: " +value
}

this.remoteHostByAddr= stringUtil!!.EMPTY_STRING
this.remoteAddress= httpServletRequest!!.getRemoteAddr()
this.remoteHost= httpServletRequest!!.getRemoteHost()
this.requestedFilePath= httpServletRequest!!.getServletPath()
this.remotePort= Integer.toString(httpServletRequest!!.getRemotePort())
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(abeHttpRequestInfoData!!.HTTP_USER_AGENT, this.httpUserAgent)
hashMap!!.put(abeHttpRequestInfoData!!.REMOTE_ADDRESS, this.remoteAddress)
hashMap!!.put(abeHttpRequestInfoData!!.REMOTE_HOST, this.remoteHost)
hashMap!!.put(abeHttpRequestInfoData!!.REMOTE_HOST_BY_ADDRESS, this.remoteHostByAddr)
hashMap!!.put(abeHttpRequestInfoData!!.REMOTE_PORT, this.remotePort)
hashMap!!.put(abeHttpRequestInfoData!!.REQUEST_FILE_PATH, this.requestedFilePath)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {

    var vector: Vector = Vector()

vector.add(this.httpUserAgent)
vector.add(this.remoteAddress)
vector.add(this.remoteHost)
vector.add(this.remoteHostByAddr)
vector.add(this.remotePort)
vector.add(this.requestedFilePath)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringBuilder().
                            append(this.NAME)!!.append(this.commonSeps!!.COLON_SEP)!!.append(abeHttpRequestInfoData!!.HTTP_USER_AGENT)!!.append(this.commonSeps!!.COLON_SEP)!!.append(this.httpUserAgent)!!.append(this.commonSeps!!.SPACE)!!.append(abeHttpRequestInfoData!!.REMOTE_ADDRESS)!!.append(this.commonSeps!!.COLON_SEP)!!.append(this.remoteAddress)!!.append(this.commonSeps!!.SPACE)!!.append(abeHttpRequestInfoData!!.REMOTE_HOST)!!.append(this.commonSeps!!.COLON_SEP)!!.append(this.remoteHost)!!.append(this.commonSeps!!.SPACE)!!.append(abeHttpRequestInfoData!!.REMOTE_HOST_BY_ADDRESS)!!.append(this.commonSeps!!.COLON_SEP)!!.append(this.remoteHostByAddr)!!.append(this.commonSeps!!.SPACE)!!.append(abeHttpRequestInfoData!!.REMOTE_PORT)!!.append(this.commonSeps!!.COLON_SEP)!!.append(this.remotePort)!!.append(this.commonSeps!!.SPACE)!!.append(abeHttpRequestInfoData!!.REQUEST_FILE_PATH)!!.append(this.commonSeps!!.COLON_SEP)!!.append(this.requestedFilePath)!!.toString()
}


}
                
            

