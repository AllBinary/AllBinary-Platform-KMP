
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
        package org.allbinary.business.user.commerce.money.payment.gateway




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.TableMappingInterface

interface PaymentGatewayInterface : TableMappingInterface {
        

    open fun getEnable()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getMode()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestProtocol()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestServer()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestPort()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getServerProtocol()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getServer()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getServerPort()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getServerPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getProxyProtocol()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getProxyServer()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getProxyPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getProxyPort()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getProxyUserName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getProxyPassword()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTimeout()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getProxyTimeout()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial1()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial2()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial3()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial4()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial5()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial6()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial7()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial8()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getSpecial9()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getLastModified()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTimeEntered()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun setEnable(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setMode(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestProtocol(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestServer(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestPort(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestPath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setServerProtocol(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setServer(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setServerPort(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setServerPath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setProxyProtocol(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setProxyServer(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setProxyPath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setProxyPort(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setProxyUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setProxyPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setProxyTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial1(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial2(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial3(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial4(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial5(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial6(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial7(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial8(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setSpecial9(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setLastModified(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTimeEntered(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun toHashMap(isEncrypted: Boolean)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>

    open fun toVector(isEncrypted: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Vector

}
                
            

