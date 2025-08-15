
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
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterfaceFactoryInterface
import org.allbinary.business.user.commerce.money.payment.gateway.modules.gateway.PaymentGatewayDomNodeFactoryInterface
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.string.CommonSeps

open public class BasicPaymentType
            : Object
         {
        

    private var name: String

    private var value: String

    private var paymentGatewayInterfaceFactoryInterface: PaymentGatewayInterfaceFactoryInterface

    private var paymentGatewayDomNodeFactoryInterface: PaymentGatewayDomNodeFactoryInterface
protected constructor        (paymentMethod: String)
            : super()
        {

                    var paymentMethod = paymentMethod
this.init(paymentMethod)
}

protected constructor        (paymentMethod: String, paymentGatewayInterfaceFactoryInterface: PaymentGatewayInterfaceFactoryInterface, paymentGatewayDomNodeFactoryInterface: PaymentGatewayDomNodeFactoryInterface)
            : super()
        {

                    var paymentMethod = paymentMethod


                    var paymentGatewayInterfaceFactoryInterface = paymentGatewayInterfaceFactoryInterface


                    var paymentGatewayDomNodeFactoryInterface = paymentGatewayDomNodeFactoryInterface
this.init(paymentMethod)
this.paymentGatewayInterfaceFactoryInterface= paymentGatewayInterfaceFactoryInterface
this.paymentGatewayDomNodeFactoryInterface= paymentGatewayDomNodeFactoryInterface
}


open fun init(paymentMethod: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var paymentMethod = paymentMethod

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var UNDERSCORE: String = "_"

hashMap!!.put(CommonSeps.getInstance()!!.SPACE, UNDERSCORE)
hashMap!!.put(AbPathData.getInstance()!!.EXTENSION_SEP, UNDERSCORE)
hashMap!!.put("-", UNDERSCORE)

    var replace: Replace = Replace(hashMap)

this.name= replace.all(paymentMethod)
this.value= paymentMethod
BasicPaymentTypeUtil.getInstance()!!.add(this)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.value
}


                @Throws(Exception::class)
            
open fun getPaymentGatewayInterfaceFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: PaymentGatewayInterfaceFactoryInterface{
    
                        if(this.paymentGatewayInterfaceFactoryInterface == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("PaymentGatewayInterfaceFactoryInterface is Null")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentGatewayInterfaceFactoryInterface
}


                @Throws(Exception::class)
            
open fun getPaymentGatewayDomNodeFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: PaymentGatewayDomNodeFactoryInterface{
    
                        if(this.paymentGatewayDomNodeFactoryInterface == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("PaymentGatewayDomNodeFactoryInterface is Null")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentGatewayDomNodeFactoryInterface
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getName()
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var vector: Vector = Vector()

vector.add(this.name)
vector.add(this.value)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(PaymentGatewayData.NAME.toString(), this.name)
hashMap!!.put(PaymentGatewayData.VALUE.toString(), this.value)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


}
                
            

