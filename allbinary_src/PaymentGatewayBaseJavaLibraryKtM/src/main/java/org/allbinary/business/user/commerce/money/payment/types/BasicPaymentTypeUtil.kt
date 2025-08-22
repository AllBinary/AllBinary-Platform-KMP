
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

open public class BasicPaymentTypeUtil
            : Object
         {
        

        companion object {
            
    private val instance: BasicPaymentTypeUtil = BasicPaymentTypeUtil()

                init{}

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicPaymentTypeUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


    private var paymentTypeVector: Vector = Vector()

open fun add(paymentType: BasicPaymentType)
        //nullable = true from not(false or (false and false)) = true
{

                    var paymentType = paymentType
this.paymentTypeVector!!.add(paymentType)
}


                @Throws(Exception::class)
            
open fun get(paymentTypeString: String)
        //nullable = true from not(false or (false and false)) = true
: BasicPaymentType{

                    var paymentTypeString = paymentTypeString

    var size: Int = paymentTypeVector!!.size!!





                        for (i in 0 until size)


        {
    var paymentType: BasicPaymentType = paymentTypeVector!!.get(i) as BasicPaymentType


    
                        if(paymentType!!.getName()!!.compareTo(paymentTypeString) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentType

                                    }
                                
}




                            throw Exception("Unknown PaymentType: " +paymentTypeString)
}


open fun isContain(paymentType: BasicPaymentType)
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


    var size: Int = paymentTypeVector!!.size!!





                        for (i in 0 until size)


        {
    var paymentType: BasicPaymentType = paymentTypeVector!!.get(i) as BasicPaymentType


    
                        if(!a_PaymentTypeVector!!.contains(paymentType))
                        diff.add(paymentType)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return diff
}


}
                
            

