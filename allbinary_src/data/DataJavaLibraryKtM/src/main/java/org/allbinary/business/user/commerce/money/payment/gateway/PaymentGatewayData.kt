
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PaymentGatewayData
            : Object
         {
        

        companion object {


    val CRYPTNUM: Int = 5

    val ID: PaymentGatewayData = PaymentGatewayData(
                            "PAYMENTGATEWAY_ID")

    val NAME: PaymentGatewayData = PaymentGatewayData(
                            "PAYMENTGATEWAY_NAME")

    val VALUE: PaymentGatewayData = PaymentGatewayData(
                            "PAYMENTGATEWAY_VALUE")

    val PAYMENTTRANSACTIONINTERFACEFACTORYINTERFACE: PaymentGatewayData = PaymentGatewayData(
                            "PAYMENTGATEWAY_PAYMENTTRANSACTIONINTERFACEFACTORYINTERFACE")

    val PAYMENTPROCESSORINTERFACEFACTORYINTERFACE: PaymentGatewayData = PaymentGatewayData(
                            "PAYMENTGATEWAY_PAYMENTPROCESSORINTERFACEFACTORYINTERFACE")

    val MODE: PaymentGatewayData = PaymentGatewayData(
                            "MODE")

    val SERVERPROTOCOL: PaymentGatewayData = PaymentGatewayData(
                            "SERVERPROTOCOL")

    val SERVER: PaymentGatewayData = PaymentGatewayData(
                            "SERVER")

    val SERVERPORT: PaymentGatewayData = PaymentGatewayData(
                            "SERVERPORT")

    val SERVERPATH: PaymentGatewayData = PaymentGatewayData(
                            "SERVERPATH")

    val TESTPROTOCOL: PaymentGatewayData = PaymentGatewayData(
                            "TESTSERVERPROTOCOL")

    val TESTSERVER: PaymentGatewayData = PaymentGatewayData(
                            "TESTSERVER")

    val TESTPORT: PaymentGatewayData = PaymentGatewayData(
                            "TESTPORT")

    val TESTPATH: PaymentGatewayData = PaymentGatewayData(
                            "TESTSERVERPATH")

    val TIMEOUT: PaymentGatewayData = PaymentGatewayData(
                            "TIMEOUT")

    val PROXYPROTOCOL: PaymentGatewayData = PaymentGatewayData(
                            "PROXYPROTOCOL")

    val PROXYSERVER: PaymentGatewayData = PaymentGatewayData(
                            "PROXYSERVER")

    val PROXYPATH: PaymentGatewayData = PaymentGatewayData(
                            "PROXYPATH")

    val PROXYUSERNAME: PaymentGatewayData = PaymentGatewayData(
                            "PROXYUSERNAME")

    val PROXYPASSWORD: PaymentGatewayData = PaymentGatewayData(
                            "PROXYPASSWORD")

    val PROXYPORT: PaymentGatewayData = PaymentGatewayData(
                            "PROXYPORT")

    val PROXYTIMEOUT: PaymentGatewayData = PaymentGatewayData(
                            "PROXYTIMEOUT")

    val SPECIAL1: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL1")

    val SPECIAL2: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL2")

    val SPECIAL3: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL3")

    val SPECIAL4: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL4")

    val SPECIAL5: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL5")

    val SPECIAL6: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL6")

    val SPECIAL7: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL7")

    val SPECIAL8: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL8")

    val SPECIAL9: PaymentGatewayData = PaymentGatewayData(
                            "SPECIAL9")


        }
            
    private var key: String
private constructor        (value: String)
            : super()
        {

                    var value = value
this.key= value
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return key
}


}
                
            

