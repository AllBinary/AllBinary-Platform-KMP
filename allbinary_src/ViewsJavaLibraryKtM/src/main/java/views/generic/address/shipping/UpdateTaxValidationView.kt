
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
        package views.generic.address.shipping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.address.ShippingAddressData
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.commerce.money.tax.TaxFactory
import org.allbinary.data.tables.user.address.shipping.ShippingAddressesEntity
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UpdateTaxValidationView : ShippingAddressView
                , ValidationComponentInterface {
        
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
this.streetAddress= StreetAddress(this.getRequest())

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getTransformInfoInterface()!!.getStoreName())!!


    
                        if(TaxFactory.getInstance()!!.getInstance(this.abeClientInformation, storeFrontInterface)!!.isValid(this.streetAddress, storeFrontInterface) == Boolean.FALSE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var billingAddressesEntity: ShippingAddressesEntity = ShippingAddressesEntity(this.getWeblisketSession()!!.getUserName())


    var streetAddressList: Vector = billingAddressesEntity!!.get()!!


    
                        if(streetAddressList == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var count: Int = 0


    var size: Int = streetAddressList!!.size!!





                        for (index in 0 until size)

        {

    var aStreetAddress: StreetAddress = streetAddressList!!.get(index) as StreetAddress


    
                        if(aStreetAddress!!.getName()!!.compareTo(ShippingAddressData.TAX) == 0)
                        
                                    {
                                    count++

                                    }
                                
}


    
                        if(count != 1)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Unable to update tax location."
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


}
                
            

