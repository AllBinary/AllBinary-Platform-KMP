
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
        
import java.util.HashMap
import java.util.Hashtable
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class TransactionResult
            : Object
        
                , TransactionResultInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var keyValuePairs: HashMap<Any, Any>

    private var result: String
public constructor        (result: String)
            : super()
        {

                    var result = result

        try {
            this.result= result

    var tokenizer: Tokenizer = Tokenizer(CommonSeps.getInstance()!!.AMP)


    var tokens: BasicArrayList = tokenizer.getTokens(result, BasicArrayList())!!
            


    var tokenizer2: Tokenizer = Tokenizer(CommonSeps.getInstance()!!.EQUALS)


    var hashtable: Hashtable<Any, Any> = tokenizer2.getTokens(tokens)!!
            

keyValuePairs!!.putAll(hashtable)
} catch(e: Exception)
            {
    var exceptionMessage: String = "TransactionResult Constructor Failed"

logUtil!!.put(exceptionMessage, this, this.commonStrings!!.CONSTRUCTOR)
}

}

public constructor        (keyValuePairs: HashMap<Any, Any>)
            : super()
        {

                    var keyValuePairs = keyValuePairs
keyValuePairs= keyValuePairs
this.result= "Needs to have the hashmap converted to string for other constructor"
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs
}


open fun getAllPossibleKeys()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var paymentTransactionKeysFactory: PaymentTransactionKeysFactory = PaymentTransactionKeysFactory.getInstance()!!
            


    var verisignResponseKeys: Vector = Vector()

verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.RESULT.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.PNREF.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.RESPMSG.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.AUTHCODE.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.AVSADDR.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.AVSZIP.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.ORIGRESULT.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.STATUS.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.FRAUDCODE.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.FRAUDMSG.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.ERRCODE.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.SCORE.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.REASON1.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.REASON2.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.REASON3.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.EXCEPTION1.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.EXCEPTION2.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.EXCEPTION3.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.EXCEPTION4.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.EXCEPTION5.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.EXCEPTION6.toString())
verisignResponseKeys!!.add(paymentTransactionKeysFactory!!.EXCEPTION7.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return verisignResponseKeys
}


open fun getValues()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var keyVector: Vector = this.getAllPossibleKeys()!!
            


    var valueVector: Vector = Vector()


    var size: Int = keyVector!!.size!!
            





                        for (i in 0 until size)


        {
    var key: String = keyVector!!.get(i) as String


    
                        if(keyValuePairs!!.containsKey(key))
                        
                                    {
                                    valueVector!!.add(keyValuePairs!!.get(key))

                                    }
                                
                        else {
                            
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            

valueVector!!.add(stringUtil!!.EMPTY_STRING)

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valueVector
}


open fun getPnRef()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.PNREF.toString()) as String
}


open fun getRespMsg()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.RESPMSG.toString()) as String
}


open fun getResult()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.RESULT.toString()) as String
}


open fun getScore()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.SCORE.toString()) as String
}


open fun getStatus()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.STATUS.toString()) as String
}


open fun getFraudCode()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.FRAUDCODE.toString()) as String
}


open fun getFraudMsg()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.FRAUDMSG.toString()) as String
}


open fun getOrigResult()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.ORIGRESULT.toString()) as String
}


open fun getAvsAddr()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.AVSADDR.toString()) as String
}


open fun getAvsZip()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.AVSZIP.toString()) as String
}


open fun getErrCode()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.ERRCODE.toString()) as String
}


open fun getException1()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.EXCEPTION1.toString()) as String
}


open fun getException2()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.EXCEPTION2.toString()) as String
}


open fun getException3()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.EXCEPTION3.toString()) as String
}


open fun getException4()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.EXCEPTION4.toString()) as String
}


open fun getException5()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.EXCEPTION5.toString()) as String
}


open fun getException6()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.EXCEPTION6.toString()) as String
}


open fun getException7()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.EXCEPTION7.toString()) as String
}


open fun getReason1()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.REASON1.toString()) as String
}


open fun getReason2()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.REASON2.toString()) as String
}


open fun getReason3()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyValuePairs!!.get(PaymentTransactionKeysFactory.getInstance()!!.REASON3.toString()) as String
}


}
                
            

