
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
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.UserData
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.logic.control.crypt.SuperCrypt
import org.allbinary.logic.string.StringUtil

open public class PaymentGateway
            : Object
        
                , PaymentGatewayInterface {
        

    private var storeName: String

    private var name: String

    private var enable: String

    private var paymentMethod: String

    private var mode: String

    private var testProtocol: String

    private var testServer: String

    private var testPort: String

    private var testPath: String

    private var serverProtocol: String

    private var server: String

    private var serverPort: String

    private var serverPath: String

    private var timeout: String

    private var userName: String

    private var password: String

    private var proxyProtocol: String

    private var proxyServer: String

    private var proxyPort: String

    private var proxyPath: String

    private var proxyUserName: String

    private var proxyPassword: String

    private var proxyTimeout: String

    private var special1: String

    private var special2: String

    private var special3: String

    private var special4: String

    private var special5: String

    private var special6: String

    private var special7: String

    private var special8: String

    private var special9: String

    private var lastModified: String

    private var timeEntered: String
public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.getFormData(hashMap)
}


open fun getFormData(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var empty: String = stringUtil!!.EMPTY_STRING

this.storeName= hashMap!!.get(StoreFrontData.getInstance()!!.NAME.toString()) as String
this.name= hashMap!!.get(PaymentGatewayData.NAME.toString()) as String
this.enable= stringUtil!!.getInstance(hashMap!!.get(EntryData.getInstance()!!.ENABLE.toString()) as String)
this.paymentMethod= stringUtil!!.getInstance(hashMap!!.get(PaymentData.METHOD.toString()) as String)
this.mode= stringUtil!!.getInstance(hashMap!!.get(PaymentGatewayData.MODE.toString()) as String)
this.testProtocol= stringUtil!!.getInstance(hashMap!!.get(PaymentGatewayData.TESTPROTOCOL.toString()) as String)
this.testServer= stringUtil!!.getInstance(hashMap!!.get(PaymentGatewayData.TESTSERVER.toString()) as String)
this.testPort= stringUtil!!.getInstance(hashMap!!.get(PaymentGatewayData.TESTPORT.toString()) as String)
this.testPath= hashMap!!.get(PaymentGatewayData.TESTPATH.toString()) as String

    
                        if(this.testPath == 
                                    null
                                )
                        this.testPath= empty
this.serverProtocol= hashMap!!.get(PaymentGatewayData.SERVERPROTOCOL.toString()) as String

    
                        if(this.serverProtocol == 
                                    null
                                )
                        this.serverProtocol= empty
this.server= hashMap!!.get(PaymentGatewayData.SERVER.toString()) as String

    
                        if(this.server == 
                                    null
                                )
                        this.server= empty
this.serverPort= hashMap!!.get(PaymentGatewayData.SERVERPORT.toString()) as String

    
                        if(this.serverPort == 
                                    null
                                )
                        this.serverPort= empty
this.serverPath= hashMap!!.get(PaymentGatewayData.SERVERPATH.toString()) as String

    
                        if(this.serverPath == 
                                    null
                                )
                        this.serverPath= empty
this.userName= hashMap!!.get(UserData.USERNAME.toString()) as String

    
                        if(this.userName == 
                                    null
                                )
                        this.userName= empty
this.password= hashMap!!.get(UserData.PASSWORD.toString()) as String

    
                        if(this.password == 
                                    null
                                )
                        this.password= empty
this.timeout= hashMap!!.get(PaymentGatewayData.TIMEOUT.toString()) as String

    
                        if(this.timeout == 
                                    null
                                )
                        this.timeout= empty
this.proxyProtocol= hashMap!!.get(PaymentGatewayData.PROXYPROTOCOL.toString()) as String

    
                        if(this.proxyProtocol == 
                                    null
                                )
                        this.proxyProtocol= empty
this.proxyServer= hashMap!!.get(PaymentGatewayData.PROXYSERVER.toString()) as String

    
                        if(this.proxyServer == 
                                    null
                                )
                        this.proxyServer= empty
this.proxyPort= hashMap!!.get(PaymentGatewayData.PROXYPORT.toString()) as String

    
                        if(this.proxyPort == 
                                    null
                                )
                        this.proxyPort= empty
this.proxyPath= hashMap!!.get(PaymentGatewayData.PROXYPATH.toString()) as String

    
                        if(this.proxyPath == 
                                    null
                                )
                        this.proxyPath= empty
this.proxyUserName= hashMap!!.get(PaymentGatewayData.PROXYUSERNAME.toString()) as String

    
                        if(this.proxyUserName == 
                                    null
                                )
                        this.proxyUserName= empty
this.proxyPassword= hashMap!!.get(PaymentGatewayData.PROXYPASSWORD.toString()) as String

    
                        if(this.proxyPassword == 
                                    null
                                )
                        this.proxyPassword= empty
this.proxyTimeout= hashMap!!.get(PaymentGatewayData.PROXYTIMEOUT.toString()) as String

    
                        if(this.proxyTimeout == 
                                    null
                                )
                        this.proxyTimeout= empty
this.special1= hashMap!!.get(PaymentGatewayData.SPECIAL1.toString()) as String

    
                        if(this.special1 == 
                                    null
                                )
                        this.special1= empty
this.special2= hashMap!!.get(PaymentGatewayData.SPECIAL2.toString()) as String

    
                        if(this.special2 == 
                                    null
                                )
                        this.special2= empty
this.special3= hashMap!!.get(PaymentGatewayData.SPECIAL3.toString()) as String

    
                        if(this.special3 == 
                                    null
                                )
                        this.special3= empty
this.special4= hashMap!!.get(PaymentGatewayData.SPECIAL4.toString()) as String

    
                        if(this.special4 == 
                                    null
                                )
                        this.special4= empty
this.special5= hashMap!!.get(PaymentGatewayData.SPECIAL5.toString()) as String

    
                        if(this.special5 == 
                                    null
                                )
                        this.special5= empty
this.special6= hashMap!!.get(PaymentGatewayData.SPECIAL6.toString()) as String

    
                        if(this.special6 == 
                                    null
                                )
                        this.special6= empty
this.special7= hashMap!!.get(PaymentGatewayData.SPECIAL7.toString()) as String

    
                        if(this.special7 == 
                                    null
                                )
                        this.special7= empty
this.special8= hashMap!!.get(PaymentGatewayData.SPECIAL8.toString()) as String

    
                        if(this.special8 == 
                                    null
                                )
                        this.special8= empty
this.special9= hashMap!!.get(PaymentGatewayData.SPECIAL9.toString()) as String

    
                        if(this.special9 == 
                                    null
                                )
                        this.special9= empty
this.lastModified= hashMap!!.get(EntryData.getInstance()!!.LASTMODIFIED.toString()) as String

    
                        if(this.lastModified == 
                                    null
                                )
                        this.lastModified= empty
this.timeEntered= hashMap!!.get(EntryData.getInstance()!!.TIMECREATED.toString()) as String

    
                        if(this.timeEntered == 
                                    null
                                )
                        this.timeEntered= empty
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeName
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getEnable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.enable
}


open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentMethod
}


open fun getMode()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mode
}


open fun getTestProtocol()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testProtocol
}


open fun getTestServer()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testServer
}


open fun getTestPort()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testPort
}


open fun getTestPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testPath
}


open fun getServerProtocol()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.serverProtocol
}


open fun getServer()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.server
}


open fun getServerPort()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.serverPort
}


open fun getServerPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.serverPath
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.password
}


open fun getProxyProtocol()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.proxyProtocol
}


open fun getProxyServer()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.proxyServer
}


open fun getProxyPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.proxyPath
}


open fun getProxyPort()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.proxyPort
}


open fun getProxyUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.proxyUserName
}


open fun getProxyPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.proxyPassword
}


open fun getTimeout()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeout
}


open fun getProxyTimeout()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.proxyTimeout
}


open fun getSpecial1()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special1
}


open fun getSpecial2()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special2
}


open fun getSpecial3()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special3
}


open fun getSpecial4()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special4
}


open fun getSpecial5()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special5
}


open fun getSpecial6()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special6
}


open fun getSpecial7()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special7
}


open fun getSpecial8()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special8
}


open fun getSpecial9()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special9
}


open fun getLastModified()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastModified
}


open fun getTimeEntered()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeEntered
}


open fun setEnable(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.enable= value
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeName= value
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.name= value
}


open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.paymentMethod= value
}


open fun setMode(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.mode= value
}


open fun setTestProtocol(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testProtocol= value
}


open fun setTestServer(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testServer= value
}


open fun setTestPort(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testPort= value
}


open fun setTestPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testPath= value
}


open fun setServerProtocol(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.serverProtocol= value
}


open fun setServer(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.server= value
}


open fun setServerPort(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.serverPort= value
}


open fun setServerPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.serverPath= value
}


open fun setTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.timeout= value
}


open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.userName= value
}


open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.password= value
}


open fun setProxyProtocol(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.proxyProtocol= value
}


open fun setProxyServer(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.proxyServer= value
}


open fun setProxyPort(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.proxyPort= value
}


open fun setProxyPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.proxyPath= value
}


open fun setProxyUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.proxyUserName= value
}


open fun setProxyPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.proxyPassword= value
}


open fun setProxyTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.proxyTimeout= value
}


open fun setSpecial1(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special1= value
}


open fun setSpecial2(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special2= value
}


open fun setSpecial3(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special3= value
}


open fun setSpecial4(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special4= value
}


open fun setSpecial5(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special5= value
}


open fun setSpecial6(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special6= value
}


open fun setSpecial7(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special7= value
}


open fun setSpecial8(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special8= value
}


open fun setSpecial9(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.special9= value
}


open fun setLastModified(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.lastModified= value
}


open fun setTimeEntered(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.timeEntered= value
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toHashMap(true)
}


                @Throws(Exception::class)
            
open fun toHashMap(isEncrypted: Boolean)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var isEncrypted = isEncrypted

    var paymentGatewayHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

paymentGatewayHashMap!!.put(EntryData.getInstance()!!.ENABLE, this.enable)
paymentGatewayHashMap!!.put(StoreFrontData.getInstance()!!.NAME.toString(), this.storeName)
paymentGatewayHashMap!!.put(PaymentGatewayData.NAME.toString(), this.getName())
paymentGatewayHashMap!!.put(PaymentData.METHOD.toString(), this.paymentMethod)
paymentGatewayHashMap!!.put(PaymentGatewayData.MODE.toString(), this.mode)
paymentGatewayHashMap!!.put(PaymentGatewayData.TESTPROTOCOL.toString(), this.testProtocol)
paymentGatewayHashMap!!.put(PaymentGatewayData.TESTSERVER.toString(), this.testServer)
paymentGatewayHashMap!!.put(PaymentGatewayData.TESTPORT.toString(), this.testPort)
paymentGatewayHashMap!!.put(PaymentGatewayData.TESTPATH.toString(), this.testPath)
paymentGatewayHashMap!!.put(PaymentGatewayData.SERVERPROTOCOL.toString(), this.serverProtocol)
paymentGatewayHashMap!!.put(PaymentGatewayData.SERVER.toString(), this.server)
paymentGatewayHashMap!!.put(PaymentGatewayData.SERVERPORT.toString(), this.serverPort)
paymentGatewayHashMap!!.put(PaymentGatewayData.SERVERPATH.toString(), this.serverPath)

    
                        if(isEncrypted)
                        
                                    {
                                    
    var superCrypt: SuperCrypt = SuperCrypt(PaymentGatewayData.CRYPTNUM)

paymentGatewayHashMap!!.put(UserData.USERNAME.toString(), superCrypt!!.encrypt(this.userName))
paymentGatewayHashMap!!.put(UserData.PASSWORD.toString(), superCrypt!!.encrypt(this.password))

                                    }
                                
                        else {
                            paymentGatewayHashMap!!.put(UserData.USERNAME.toString(), this.userName)
paymentGatewayHashMap!!.put(UserData.PASSWORD.toString(), this.password)

                        }
                            
paymentGatewayHashMap!!.put(PaymentGatewayData.TIMEOUT.toString(), this.timeout)
paymentGatewayHashMap!!.put(PaymentGatewayData.PROXYPROTOCOL.toString(), this.proxyProtocol)
paymentGatewayHashMap!!.put(PaymentGatewayData.PROXYSERVER.toString(), this.proxyServer)
paymentGatewayHashMap!!.put(PaymentGatewayData.PROXYPORT.toString(), this.proxyPort)
paymentGatewayHashMap!!.put(PaymentGatewayData.PROXYPATH.toString(), this.proxyPath)
paymentGatewayHashMap!!.put(PaymentGatewayData.PROXYUSERNAME.toString(), this.proxyUserName)
paymentGatewayHashMap!!.put(PaymentGatewayData.PROXYPASSWORD.toString(), this.proxyPassword)
paymentGatewayHashMap!!.put(PaymentGatewayData.PROXYTIMEOUT.toString(), this.proxyTimeout)

    
                        if(isEncrypted)
                        
                                    {
                                    
    var superCrypt: SuperCrypt = SuperCrypt(PaymentGatewayData.CRYPTNUM)

paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL1.toString(), superCrypt!!.encrypt(this.special1))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL2.toString(), superCrypt!!.encrypt(this.special2))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL3.toString(), superCrypt!!.encrypt(this.special3))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL4.toString(), superCrypt!!.encrypt(this.special4))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL5.toString(), superCrypt!!.encrypt(this.special5))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL6.toString(), superCrypt!!.encrypt(this.special6))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL7.toString(), superCrypt!!.encrypt(this.special7))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL8.toString(), superCrypt!!.encrypt(this.special8))

                                    }
                                
                        else {
                            paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL1.toString(), this.special1)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL2.toString(), this.special2)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL3.toString(), this.special3)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL4.toString(), this.special4)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL5.toString(), this.special5)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL6.toString(), this.special6)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL7.toString(), this.special7)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL8.toString(), this.special8)
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL9.toString(), this.special9)

                        }
                            
paymentGatewayHashMap!!.put(EntryData.getInstance()!!.LASTMODIFIED.toString(), this.lastModified)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewayHashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toVector(true)
}


open fun toVector(isEncrypted: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var isEncrypted = isEncrypted

    var updateVector: Vector = Vector()

updateVector!!.add(this.enable)
updateVector!!.add(this.storeName)
updateVector!!.add(this.getName())
updateVector!!.add(this.paymentMethod)
updateVector!!.add(this.mode)
updateVector!!.add(this.testProtocol)
updateVector!!.add(this.testServer)
updateVector!!.add(this.testPort)
updateVector!!.add(this.testPath)
updateVector!!.add(this.serverProtocol)
updateVector!!.add(this.server)
updateVector!!.add(this.serverPort)
updateVector!!.add(this.serverPath)

    
                        if(isEncrypted)
                        
                                    {
                                    
    var superCrypt: SuperCrypt = SuperCrypt(PaymentGatewayData.CRYPTNUM)

updateVector!!.add(superCrypt!!.encrypt(this.userName))
updateVector!!.add(superCrypt!!.encrypt(this.password))

                                    }
                                
                        else {
                            updateVector!!.add(this.userName)
updateVector!!.add(this.password)

                        }
                            
updateVector!!.add(this.timeout)
updateVector!!.add(this.proxyProtocol)
updateVector!!.add(this.proxyServer)
updateVector!!.add(this.proxyPort)
updateVector!!.add(this.proxyPath)
updateVector!!.add(this.proxyUserName)
updateVector!!.add(this.proxyPassword)
updateVector!!.add(this.proxyTimeout)

    
                        if(isEncrypted)
                        
                                    {
                                    
    var superCrypt: SuperCrypt = SuperCrypt(PaymentGatewayData.CRYPTNUM)

updateVector!!.add(superCrypt!!.encrypt(this.special1))
updateVector!!.add(superCrypt!!.encrypt(this.special2))
updateVector!!.add(superCrypt!!.encrypt(this.special3))
updateVector!!.add(superCrypt!!.encrypt(this.special4))
updateVector!!.add(superCrypt!!.encrypt(this.special5))
updateVector!!.add(superCrypt!!.encrypt(this.special6))
updateVector!!.add(superCrypt!!.encrypt(this.special7))
updateVector!!.add(superCrypt!!.encrypt(this.special8))
updateVector!!.add(superCrypt!!.encrypt(this.special9))

                                    }
                                
                        else {
                            updateVector!!.add(this.special1)
updateVector!!.add(this.special2)
updateVector!!.add(this.special3)
updateVector!!.add(this.special4)
updateVector!!.add(this.special5)
updateVector!!.add(this.special6)
updateVector!!.add(this.special7)
updateVector!!.add(this.special8)
updateVector!!.add(this.special9)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return updateVector
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PaymentGatewayPrimaryKey(this.getStoreName(), this.getName()) as Object
}


}
                
            

