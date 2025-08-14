
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
        package org.allbinary.business.user.commerce.shipping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.shipping.modules.ShippingInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class ShippingMethods
            : Object
        
                , ShippingMethodsInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var shippingVector: Vector

    private var defaultShippingMethodInterface: ShippingInterface
public constructor        (abeClientInformation: AbeClientInformationInterface, storeFrontInterface: StoreFrontInterface)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var storeFrontInterface = storeFrontInterface
this.defaultShippingMethodInterface= ShippingMethodsFactory(abeClientInformation, storeFrontInterface).
                            getDefaultInstance()
this.shippingVector= ShippingMethodsFactory(abeClientInformation, storeFrontInterface).
                            getInstance()
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return shippingVector
}


                @Throws(Exception::class)
            
open fun getShippingInterface(name: String)
        //nullable = true from not(false or (false and false)) = true
: ShippingInterface{

                    var name = name

    var shipping: ShippingInterface


    var size: Int = shippingVector!!.size!!
            





                        for (index in 0 until size)


        {shipping= shippingVector!!.get(index) as ShippingInterface

    
                        if(name.compareTo(shipping.getName()) == 0)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return shipping
}


    var error: String = "Error Finding Shipping: " +name


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SHIPPINGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getShippingInterface(String name)")

                                    }
                                



                            throw Exception(error)
}


                @Throws(Exception::class)
            
open fun getDefault()
        //nullable = true from not(false or (false and true)) = true
: ShippingInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultShippingMethodInterface
}


}
                
            

