
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
        package org.allbinary.business.user.commerce.money.payment




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.ServletRequest
import org.allbinary.business.entry.EntryData
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.control.crypt.SuperCrypt
import org.allbinary.logic.string.StringUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class Payment
            : Object
        
                , PaymentInterface
                , DomNodeInterface {
        

    private var name: String

    private var expiration: String

    private var encryption: String

    private var number: String

    private var id: String

    private var type: String

    private var tenderType: String

    private var transactionType: String

    private var aba: String

    private var account: String

    private var accountType: String

    private var authorizationCode: String

    private var checkNumber: String

    private var checkType: String

    private var driversLicense: String

    private var magneticInkCheckReader: String

    private var isDefault: Boolean = false
public constructor        (payment: HashMap<Any, Any>)
            : super()
        {

                    var payment = payment
this.name= payment.get(PaymentData.NAME) as String
this.type= payment.get(PaymentData.TYPE) as String
this.expiration= payment.get(PaymentData.EXPIRATION) as String
this.encryption= payment.get(EntryData.getInstance()!!.ENCRYPTION) as String
this.number= SuperCrypt(Integer(encryption).
                            toInt()).
                            decrypt(payment.get(PaymentData.NUMBER) as String) as String
this.id= payment.get(PaymentData.ID) as String

    var def: String = payment.get(EntryData.getInstance()!!.DEFAULT) as String


    
                        if(def != 
                                    null
                                 && def.compareTo(EntryData.getInstance()!!.DEFAULT) == 0)
                        
                                    {
                                    this.isDefault= true

                                    }
                                
                        else {
                            this.isDefault= false

                        }
                            
this.tenderType= payment.get(PaymentData.TENDERTYPE) as String
this.transactionType= payment.get(PaymentData.TRANSACTIONTYPE) as String
this.aba= payment.get(PaymentData.ABA) as String
this.account= payment.get(PaymentData.ACCOUNT) as String
this.accountType= payment.get(PaymentData.ACCOUNTTYPE) as String
this.authorizationCode= payment.get(PaymentData.AUTHORIZATIONCODE) as String
this.checkNumber= payment.get(PaymentData.CHECKNUMBER) as String
this.checkType= payment.get(PaymentData.CHECKTYPE) as String
this.driversLicense= payment.get(PaymentData.DRIVERSLICENSE) as String
this.magneticInkCheckReader= payment.get(PaymentData.MAGNETICINKCHECKREADER) as String
}

public constructor        (request: ServletRequest)
            : super()
        {

                    var request = request
this.name= request.getParameter(PaymentData.NAME)
this.type= request.getParameter(PaymentData.TYPE)
this.expiration= request.getParameter(PaymentData.EXPIRATION)
this.number= request.getParameter(PaymentData.NUMBER)
this.tenderType= request.getParameter(PaymentData.TENDERTYPE)
this.transactionType= request.getParameter(PaymentData.TRANSACTIONTYPE)
this.aba= request.getParameter(PaymentData.ABA)
this.account= request.getParameter(PaymentData.ACCOUNT)
this.accountType= request.getParameter(PaymentData.ACCOUNTTYPE)
this.authorizationCode= request.getParameter(PaymentData.AUTHORIZATIONCODE)
this.checkNumber= request.getParameter(PaymentData.CHECKNUMBER)
this.checkType= request.getParameter(PaymentData.CHECKTYPE)
this.driversLicense= request.getParameter(PaymentData.DRIVERSLICENSE)
this.magneticInkCheckReader= request.getParameter(PaymentData.MAGNETICINKCHECKREADER)
}

public constructor        ()
            : super()
        {}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var aFalse: Boolean = Boolean.FALSE


    
                        if(this.name == 
                                    null
                                 || this.name.compareTo(stringUtil!!.EMPTY_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return aFalse

                                    }
                                

    
                        if(this.type == 
                                    null
                                 || this.type.compareTo(stringUtil!!.EMPTY_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return aFalse

                                    }
                                

    
                        if(this.expiration == 
                                    null
                                 || this.expiration.compareTo(stringUtil!!.EMPTY_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return aFalse

                                    }
                                

    
                        if(this.number == 
                                    null
                                 || this.number.compareTo(stringUtil!!.EMPTY_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return aFalse

                                    }
                                

    
                        if(this.number.length > org.allbinary.business.user.commerce.money.payment.types.CreditCardType.MAXLEN)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return aFalse

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun setTenderType(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.tenderType= value
}


open fun setTransactionType(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.transactionType= value
}


open fun setAuthorizationCode(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.authorizationCode= value
}


open fun setCheckType(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.checkType= value
}


open fun setCheckNumber(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.checkNumber= value
}


open fun setDriversLicense(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.driversLicense= value
}


open fun setMagneticInkCheckReader(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.magneticInkCheckReader= value
}


open fun setAba(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.aba= value
}


open fun setAccountType(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.accountType= value
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.name= value
}


open fun setType(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.type= value
}


open fun setExpiration(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.expiration= value
}


open fun setNumber(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.number= value
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.id
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.type
}


open fun getExpiration()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.expiration
}


open fun getEncryption()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.encryption
}


open fun getNumber()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.number
}


open fun getTenderType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tenderType
}


open fun getTransactionType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transactionType
}


open fun getAba()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.aba
}


open fun getAccount()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.account
}


open fun getAccountType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.accountType
}


open fun getAuthorizationCode()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.authorizationCode
}


open fun getCheckNumber()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.checkNumber
}


open fun getCheckType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.checkType
}


open fun getDriversLicense()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.driversLicense
}


open fun getMagneticInkCheckReader()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.magneticInkCheckReader
}


open fun getLastFour()
        //nullable = true from not(false or (false and true)) = true
: String{
    
                        if(this.number.length > PaymentData.MIN && this.number.length <= PaymentData.MAX)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.number.substring(this.number.length -4)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Invalid #"

                        }
                            
}


open fun isDefault()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isDefault
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(PaymentData.NAME, this.name)
hashMap!!.put(PaymentData.TYPE, this.type)
hashMap!!.put(PaymentData.EXPIRATION, this.expiration)
hashMap!!.put(PaymentData.NUMBER, this.getLastFour())
hashMap!!.put(PaymentData.TENDERTYPE, this.tenderType)
hashMap!!.put(PaymentData.TRANSACTIONTYPE, this.transactionType)
hashMap!!.put(PaymentData.ABA, this.aba)
hashMap!!.put(PaymentData.ACCOUNT, this.account)
hashMap!!.put(PaymentData.ACCOUNTTYPE, this.accountType)
hashMap!!.put(PaymentData.AUTHORIZATIONCODE, this.authorizationCode)
hashMap!!.put(PaymentData.CHECKNUMBER, this.checkNumber)
hashMap!!.put(PaymentData.DRIVERSLICENSE, this.driversLicense)
hashMap!!.put(PaymentData.MAGNETICINKCHECKREADER, this.magneticInkCheckReader)

    
                        if(this.isDefault)
                        
                                    {
                                    hashMap!!.put(EntryData.getInstance()!!.DEFAULT, EntryData.getInstance()!!.DEFAULT)

                                    }
                                
                        else {
                            hashMap!!.put(EntryData.getInstance()!!.DEFAULT, StringUtil.getInstance()!!.EMPTY_STRING)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var hashMap: HashMap<Any, Any> = this.toHashMap()!!
            


    var node: Node = ModDomHelper.createNameValueNodes(document, PaymentData.PAYMENT, hashMap)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

