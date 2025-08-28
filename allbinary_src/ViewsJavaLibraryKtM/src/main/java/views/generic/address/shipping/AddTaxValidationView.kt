
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
import org.allbinary.business.user.commerce.money.tax.modules.TaxModuleInterface
import org.allbinary.data.tables.user.address.shipping.ShippingAddressesEntity
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class AddTaxValidationView : ShippingAddressView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

        try {
            this.streetAddress= StreetAddress(this.getRequest())

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getTransformInfoInterface()!!.getStoreName())!!


    var taxInterface: TaxModuleInterface = TaxFactory.getInstance()!!.getInstance(this.abeClientInformation, storeFrontInterface)!!


    
                        if(taxInterface == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(taxInterface!!.isValid(this.streetAddress, storeFrontInterface) == Boolean.FALSE)
                        
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
                                

    var size: Int = streetAddressList!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var aStreetAddress: StreetAddress = streetAddressList!!.get(index) as StreetAddress


    
                        if(aStreetAddress!!.getName()!!.compareTo(ShippingAddressData.TAX) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


                @Throws(Exception::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getTransformInfoInterface()!!.getStoreName())!!


    var taxInterface: TaxModuleInterface = TaxFactory.getInstance()!!.getInstance(this.abeClientInformation, storeFrontInterface)!!


    
                        if(taxInterface == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append("Unable to Load Tax Component<br/>")

                                    }
                                
                        else {
                            
    
                        if(taxInterface!!.isValid(this.streetAddress, storeFrontInterface) == Boolean.FALSE)
                        
                                    {
                                    stringBuffer!!.append("Unable to validate address with Tax Component<br/>")

                                    }
                                

                        }
                            

    var billingAddressesEntity: ShippingAddressesEntity = ShippingAddressesEntity(this.getWeblisketSession()!!.getUserName())


    var streetAddressList: Vector = billingAddressesEntity!!.get()!!


    var size: Int = streetAddressList!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var aStreetAddress: StreetAddress = streetAddressList!!.get(index) as StreetAddress


    
                        if(aStreetAddress!!.getName()!!.compareTo(ShippingAddressData.TAX) == 0)
                        
                                    {
                                    stringBuffer!!.append("Not a valid tax location<br/>")

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to create validateInfo", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Creating ValidationInfo"
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

