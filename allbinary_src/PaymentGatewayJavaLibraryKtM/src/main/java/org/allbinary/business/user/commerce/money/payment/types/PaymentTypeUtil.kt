
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
        package org.allbinary.business.user.commerce.money.payment.types




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewaysData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class PaymentTypeUtil
            : Object
         {
        
companion object {
            
    private val instance: PaymentTypeUtil = PaymentTypeUtil()

                init{
}

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PaymentTypeUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val PAYMENTGATEWAYFILEPATHSTRING: String

    private val SHIPPINGMETHODSFILENAME: String = "paymentGatewayTypes.xml"

    private var defaultName: String = 
                null
            

    private var paymentTypeVector: Vector = Vector()
private constructor ()
            : super()
        {

    var stringBuffer: StringMaker = StringMaker()


    var sep: String = AbPathData.getInstance()!!.SEPARATOR

stringBuffer!!.append(sep)
stringBuffer!!.append("generic")
stringBuffer!!.append(sep)
stringBuffer!!.append("user")
stringBuffer!!.append(sep)
stringBuffer!!.append("commerce")
stringBuffer!!.append(sep)
stringBuffer!!.append("money")
stringBuffer!!.append(sep)
stringBuffer!!.append("payment")
stringBuffer!!.append(sep)
stringBuffer!!.append("gateway")
stringBuffer!!.append(sep)
PAYMENTGATEWAYFILEPATHSTRING= stringBuffer!!.toString()
}


    open fun add(paymentType: PaymentType)
        //nullable = true from not(false or (false and false)) = true
{
var paymentType = paymentType
this.paymentTypeVector!!.add(paymentType)
}


                @Throws(Exception::class)
            
    open fun get(paymentTypeString: String)
        //nullable = true from not(false or (false and false)) = true
: PaymentType{
var paymentTypeString = paymentTypeString

    var size: Int = this.paymentTypeVector!!.size!!





                        for (i in 0 until size)

        {

    var paymentType: PaymentType = this.paymentTypeVector!!.get(i) as PaymentType


    
                        if(paymentType!!.getBasicPaymentType()!!.getName()!!.compareTo(paymentTypeString) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentType

                                    }
                                
}




                            throw Exception("Unknown PaymentType: " +paymentTypeString)
}


                @Throws(Exception::class)
            
    open fun initDefault(storeName: String)
        //nullable = true from not(false or (false and false)) = true
{
var storeName = storeName

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENT))
                        
                                    {
                                    logUtil!!.put("initDefault Payment: " +this.defaultName, this, "initDefault")

                                    }
                                

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.defaultName))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(storeName)
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append(PAYMENTGATEWAYFILEPATHSTRING)

    var abPath: AbPath = AbPath(stringBuffer!!.toString(), SHIPPINGMETHODSFILENAME) as AbPath


    var data: String = CryptFileReader(TransformInfoObjectConfigData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoObjectConfigData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(abPath)!!


    var document: Document = DomDocumentHelper.create(data)!!


    var nodeList: NodeList = document.getElementsByTagName(PaymentGatewaysData.NAME)!!





                        for (index in 0 until nodeList!!.getLength()!!)

        {

    var node: Node = nodeList!!.item(index)!!


    var defaultPaymentGatewayNode: Node = DomSearchHelper.getNode(EntryData.getInstance()!!.DEFAULT, node.getChildNodes())!!


    var defaultPaymentGatewayNodeValue: String = DomNodeHelper.getTextNodeValue(defaultPaymentGatewayNode)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENT))
                        
                                    {
                                    logUtil!!.put("DefaultPaymentGatewayNodeValue: " +defaultPaymentGatewayNodeValue, this, "initDefault")

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(defaultPaymentGatewayNodeValue))
                        
                                    {
                                    this.defaultName= defaultPaymentGatewayNodeValue

                                    }
                                
}


                                    }
                                
}


                @Throws(Exception::class)
            
    open fun getDefault(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: PaymentType{
var storeName = storeName

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENT))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, "getDefault")

                                    }
                                
this.initDefault(storeName)

    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(this.defaultName))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.get(this.defaultName)

                                    }
                                



                            throw Exception("No Default: " +this.defaultName)
}


    open fun isContain(paymentType: PaymentType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var paymentType = paymentType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentTypeVector!!.contains(paymentType)
}


    open fun difference(a_PaymentTypeVector: Vector)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var a_PaymentTypeVector = a_PaymentTypeVector

    var diff: Vector = Vector()


    var size: Int = this.paymentTypeVector!!.size!!





                        for (i in 0 until size)

        {

    var paymentType: PaymentType = this.paymentTypeVector!!.get(i) as PaymentType


    
                        if(!a_PaymentTypeVector!!.contains(paymentType))
                        diff.add(paymentType)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return diff
}


}
                
            

