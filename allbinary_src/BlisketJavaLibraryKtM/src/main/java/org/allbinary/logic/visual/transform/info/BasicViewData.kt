
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
        package org.allbinary.logic.visual.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BasicViewData
            : Object
         {
        

        companion object {
            
    private val instance: BasicViewData = BasicViewData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicViewData

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


    val GENERICDIR: String = "generic/"

    val USERDIR: String = GENERICDIR +"user/"

    val ADDRESSDIR: String = USERDIR +"address/"

    val BILLINGADDRESSDIR: String = ADDRESSDIR +"billing/"

    val SHIPPINGADDRESSDIR: String = ADDRESSDIR +"shipping/"

    val COMMERCEDIR: String = USERDIR +"commerce/"

    val INVENTORYDIR: String = COMMERCEDIR +"inventory/"

    val BASKETDIR: String = INVENTORYDIR +"basket/"

    val ITEMDIR: String = INVENTORYDIR +"item/"

    val MONEYDIR: String = COMMERCEDIR +"money/"

    val SHIPPINGDIR: String = COMMERCEDIR +"shipping/"

    val ORDERDIR: String = INVENTORYDIR +"order/"

    val ORDEREMAILDIR: String = ORDERDIR +"email/"

    val ORDERHISTORYDIR: String = ORDERDIR +"history/"

    val ORDERREVIEWDIR: String = ORDERDIR +"review/"

    val PAYMENTDIR: String = MONEYDIR +"payment/"

    val GENERATIONDIR: String = GENERICDIR +"generation/"

    val PRODUCTSDIR: String = GENERICDIR +"products/"

    val IGNOREXMLXSL: String = GENERICDIR +"ignoreXmlView.xsl"

    val REVIEWORDERVIEWXSL: String = ORDERREVIEWDIR +"reviewOrderView.xsl"

    val ORDERVIEWXSL: String = REVIEWORDERVIEWXSL

    val INVENTORYXSL: String = INVENTORYDIR +"inventory.xsl"

    val BASKETXSL: String = BASKETDIR +"basket.xsl"

    val CHECKOUTBASKETXSL: String = BASKETDIR +"staticBasket.xsl"

    val MINIBASKETXSL: String = BASKETDIR +"miniBasket.xsl"

    val BILLINGADDRESSCHANGEFORMXSL: String = BILLINGADDRESSDIR +"billingAddressChangeForm.xsl"

    val BILLINGADDRESSINPUTFORMXSL: String = BILLINGADDRESSDIR +"billingAddressInputForm.xsl"

    val BILLINGADDRESSVIEWXSL: String = BILLINGADDRESSDIR +"billingAddressView.xsl"

    val SHIPPINGADDRESSCHANGEFORMXSL: String = SHIPPINGADDRESSDIR +"shippingAddressChangeForm.xsl"

    val SHIPPINGADDRESSINPUTFORMXSL: String = SHIPPINGADDRESSDIR +"shippingAddressInputForm.xsl"

    val SHIPPINGADDRESSVIEWXSL: String = SHIPPINGADDRESSDIR +"shippingAddressView.xsl"

    val NEWTAXADDRESSXSL: String = SHIPPINGADDRESSDIR +"newTaxAddressView.xsl"

    val EDITTAXADDRESSXSL: String = SHIPPINGADDRESSDIR +"editTaxAddressView.xsl"

    val SHIPPINGMETHODSXSL: String = SHIPPINGDIR +"shippingMethods.xsl"

    val ORDERCUSTOMEREMAILVIEWXSL: String = ORDEREMAILDIR +"orderCustomerEmailView.xsl"

    val ORDERMANAGEREMAILVIEWXSL: String = ORDEREMAILDIR +"orderManagerEmailView.xsl"

    val EDITCUSTOMERXSL: String = USERDIR +"editCustomerInputForm.xsl"

    val ORDERHISTORYXSL: String = ORDERHISTORYDIR +"orderHistory.xsl"

    val PAYMENTVIEWXSL: String = PAYMENTDIR +"paymentView.xsl"

    val SUMMARYXSL: String = ITEMDIR +"summary/summary.xsl"

    val PAYMENTGATEWAYOPTIONSXSL: String = PAYMENTDIR +"paymentGatewayOptions.xsl"

    val MAKEPAYMENTVIEWXSL: String = PAYMENTDIR +"invoice/" +"makePayment.xsl"

}
                
            

