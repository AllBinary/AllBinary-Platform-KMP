
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
        
import org.allbinary.business.context.modules.storefront.StoreFront
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class PaymentGatewayPrimaryKey
            : Object
        
                , java.io.Serializable {
        

    private var storeName: String

    private var name: String
public constructor        (storeName: String, gatewayName: String)
            : super()
        {

                    var storeName = storeName


                    var gatewayName = gatewayName
this.setStoreName(storeName)
this.setName(gatewayName)
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return storeName
}


open fun setStoreName(storeName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var storeName = storeName
this.storeName= storeName
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(PaymentGatewayPrimaryKey::classgetName())
stringBuffer!!.append(StoreFront::classgetName())
stringBuffer!!.append(
                            " =")
stringBuffer!!.append(this.getStoreName())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(PaymentGateway::classgetName())
stringBuffer!!.append(
                            "=")
stringBuffer!!.append(this.getName())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

