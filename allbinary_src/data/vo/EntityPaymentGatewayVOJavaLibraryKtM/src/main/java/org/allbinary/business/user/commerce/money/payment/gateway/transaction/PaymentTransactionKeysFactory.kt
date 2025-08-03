
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
        package org.allbinary.business.user.commerce.money.payment.gateway.transaction



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PaymentTransactionKeysFactory
            : Object
         {
        

        companion object {


    private val instance: PaymentTransactionKeysFactory = PaymentTransactionKeysFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PaymentTransactionKeysFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val TRXTYPE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "TRXTYPE")

    val TENDER: PaymentTransactionKeys = PaymentTransactionKeys(
                            "TENDER")

    val ACCT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ACCT")

    val EXPDATE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXPDATE")

    val AMT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "AMT")

    val AUTHCODE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "AUTHCODE")

    val MICR: PaymentTransactionKeys = PaymentTransactionKeys(
                            "MICR")

    val CHECKNUM: PaymentTransactionKeys = PaymentTransactionKeys(
                            "CHECKNUM")

    val NAME: PaymentTransactionKeys = PaymentTransactionKeys(
                            "NAME")

    val STREET: PaymentTransactionKeys = PaymentTransactionKeys(
                            "STREET")

    val CITY: PaymentTransactionKeys = PaymentTransactionKeys(
                            "CITY")

    val STATE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "STATE")

    val ZIP: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ZIP")

    val DL: PaymentTransactionKeys = PaymentTransactionKeys(
                            "DL")

    val EMAIL: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EMAIL")

    val COMMENT1: PaymentTransactionKeys = PaymentTransactionKeys(
                            "COMMENT1")

    val COMMENT2: PaymentTransactionKeys = PaymentTransactionKeys(
                            "COMMENT2")

    val ORIGID: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ORIGID")

    val PONUM: PaymentTransactionKeys = PaymentTransactionKeys(
                            "PONUM")

    val DESC: PaymentTransactionKeys = PaymentTransactionKeys(
                            "PaymentTransactionDESC")

    val DESC1TO4: PaymentTransactionKeys = PaymentTransactionKeys(
                            "DESC1TO4")

    val INVNUM: PaymentTransactionKeys = PaymentTransactionKeys(
                            "INVNUM")

    val SHIPTOZIP: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SHIPTOZIP")

    val SWIPE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SWIPE")

    val TAXAMT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "TAXAMT")

    val COMMCARD: PaymentTransactionKeys = PaymentTransactionKeys(
                            "COMMCARD")

    val DUTYAMT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "DUTYAMT")

    val FRIEGHTAMT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "FRIEGHTAMT")

    val ORDERDATE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ORDERDATE")

    val TAXEXEMPT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "TAXEXEMPT")

    val COUNTRYCODE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "COUNTRYCODE")

    val CUSTCODE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "CUSTCODE")

    val CVV2: PaymentTransactionKeys = PaymentTransactionKeys(
                            "CVV2")

    val ABA: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ABA")

    val ACCTTYPE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ACCTTYPE")

    val DISCOUNT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "DISCOUNT")

    val FIRSTNAME: PaymentTransactionKeys = PaymentTransactionKeys(
                            "FIRSTNAME")

    val LASTNAME: PaymentTransactionKeys = PaymentTransactionKeys(
                            "LASNAME")

    val SHIPFROMZIP: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SHIPFROMZIP")

    val PRENOTE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "PRENOTE")

    val CHKTYPE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "CHKTYPE")

    val DOB: PaymentTransactionKeys = PaymentTransactionKeys(
                            "DOB")

    val PHONENUM: PaymentTransactionKeys = PaymentTransactionKeys(
                            "PHONENUM")

    val SS: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SS")

    val COMPANYNAME: PaymentTransactionKeys = PaymentTransactionKeys(
                            "COMPANYNAME")

    val COUNTRY: PaymentTransactionKeys = PaymentTransactionKeys(
                            "COUNTRY")

    val FREIGHTAMT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "FREIGHTAMT")

    val SHIPTOCITY: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SHIPTOCITY")

    val SHIPTOFIRSTNAME: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SHIPTOFIRSTNAME")

    val SHIPTOLASTNAME: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SHIPTOLASTNAME")

    val SHIPTOSTATE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SHIPTOSTATE")

    val SHIPTOSTREET: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SHIPTOSTREET")

    val SPECIAL1: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SPECIAL1")

    val SPECIAL2: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SPECIAL2")

    val SPECIAL3: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SPECIAL3")

    val PARTNER: PaymentTransactionKeys = PaymentTransactionKeys(
                            "PARTNER")

    val VENDOR: PaymentTransactionKeys = PaymentTransactionKeys(
                            "VENDOR")

    val USER: PaymentTransactionKeys = PaymentTransactionKeys(
                            "USER")

    val PWD: PaymentTransactionKeys = PaymentTransactionKeys(
                            "PWD")

    val CHKNUM: PaymentTransactionKeys = PaymentTransactionKeys(
                            "CHKNUM")

    val AVSADDR: PaymentTransactionKeys = PaymentTransactionKeys(
                            "AVSADDR")

    val AVSZIP: PaymentTransactionKeys = PaymentTransactionKeys(
                            "AVSZIP")

    val PNREF: PaymentTransactionKeys = PaymentTransactionKeys(
                            "PNREF")

    val RESPMSG: PaymentTransactionKeys = PaymentTransactionKeys(
                            "RESPMSG")

    val RESULT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "RESULT")

    val ORIGRESULT: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ORIGRESULT")

    val STATUS: PaymentTransactionKeys = PaymentTransactionKeys(
                            "STATUS")

    val FRAUDCODE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "FRAUDCODE")

    val FRAUDMSG: PaymentTransactionKeys = PaymentTransactionKeys(
                            "FRAUDMSG")

    val ERRCODE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "ERRCODE")

    val SCORE: PaymentTransactionKeys = PaymentTransactionKeys(
                            "SCORE")

    val REASON1: PaymentTransactionKeys = PaymentTransactionKeys(
                            "REASON1")

    val REASON2: PaymentTransactionKeys = PaymentTransactionKeys(
                            "REASON2")

    val REASON3: PaymentTransactionKeys = PaymentTransactionKeys(
                            "REASON3")

    val EXCEPTION1: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXCEPTION1")

    val EXCEPTION2: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXCEPTION2")

    val EXCEPTION3: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXCEPTION3")

    val EXCEPTION4: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXCEPTION4")

    val EXCEPTION5: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXCEPTION5")

    val EXCEPTION6: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXCEPTION6")

    val EXCEPTION7: PaymentTransactionKeys = PaymentTransactionKeys(
                            "EXCEPTION7")

}
                
            

