
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
: BasicViewData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicViewData.instance
}


        }
            private constructor ()
            : super()
        {
}


    val GENERICDIR: String = "generic/"

    val USERDIR: String = this.GENERICDIR +"user/"

    val ADDRESSDIR: String = this.USERDIR +"address/"

    val BILLINGADDRESSDIR: String = this.ADDRESSDIR +"billing/"

    val SHIPPINGADDRESSDIR: String = this.ADDRESSDIR +"shipping/"

    val COMMERCEDIR: String = this.USERDIR +"commerce/"

    val INVENTORYDIR: String = this.COMMERCEDIR +"inventory/"

    val BASKETDIR: String = this.INVENTORYDIR +"basket/"

    val ITEMDIR: String = this.INVENTORYDIR +"item/"

    val MONEYDIR: String = this.COMMERCEDIR +"money/"

    val SHIPPINGDIR: String = this.COMMERCEDIR +"shipping/"

    val ORDERDIR: String = this.INVENTORYDIR +"order/"

    val ORDEREMAILDIR: String = this.ORDERDIR +"email/"

    val ORDERHISTORYDIR: String = this.ORDERDIR +"history/"

    val ORDERREVIEWDIR: String = this.ORDERDIR +"review/"

    val PAYMENTDIR: String = this.MONEYDIR +"payment/"

    val GENERATIONDIR: String = this.GENERICDIR +"generation/"

    val PRODUCTSDIR: String = this.GENERICDIR +"products/"

    val IGNOREXMLXSL: String = this.GENERICDIR +"ignoreXmlView.xsl"

    val REVIEWORDERVIEWXSL: String = this.ORDERREVIEWDIR +"reviewOrderView.xsl"

    val ORDERVIEWXSL: String = this.REVIEWORDERVIEWXSL

    val INVENTORYXSL: String = this.INVENTORYDIR +"inventory.xsl"

    val BASKETXSL: String = this.BASKETDIR +"basket.xsl"

    val CHECKOUTBASKETXSL: String = this.BASKETDIR +"staticBasket.xsl"

    val MINIBASKETXSL: String = this.BASKETDIR +"miniBasket.xsl"

    val BILLINGADDRESSCHANGEFORMXSL: String = this.BILLINGADDRESSDIR +"billingAddressChangeForm.xsl"

    val BILLINGADDRESSINPUTFORMXSL: String = this.BILLINGADDRESSDIR +"billingAddressInputForm.xsl"

    val BILLINGADDRESSVIEWXSL: String = this.BILLINGADDRESSDIR +"billingAddressView.xsl"

    val SHIPPINGADDRESSCHANGEFORMXSL: String = this.SHIPPINGADDRESSDIR +"shippingAddressChangeForm.xsl"

    val SHIPPINGADDRESSINPUTFORMXSL: String = this.SHIPPINGADDRESSDIR +"shippingAddressInputForm.xsl"

    val SHIPPINGADDRESSVIEWXSL: String = this.SHIPPINGADDRESSDIR +"shippingAddressView.xsl"

    val NEWTAXADDRESSXSL: String = this.SHIPPINGADDRESSDIR +"newTaxAddressView.xsl"

    val EDITTAXADDRESSXSL: String = this.SHIPPINGADDRESSDIR +"editTaxAddressView.xsl"

    val SHIPPINGMETHODSXSL: String = this.SHIPPINGDIR +"shippingMethods.xsl"

    val ORDERCUSTOMEREMAILVIEWXSL: String = this.ORDEREMAILDIR +"orderCustomerEmailView.xsl"

    val ORDERMANAGEREMAILVIEWXSL: String = this.ORDEREMAILDIR +"orderManagerEmailView.xsl"

    val EDITCUSTOMERXSL: String = this.USERDIR +"editCustomerInputForm.xsl"

    val ORDERHISTORYXSL: String = this.ORDERHISTORYDIR +"orderHistory.xsl"

    val PAYMENTVIEWXSL: String = this.PAYMENTDIR +"paymentView.xsl"

    val SUMMARYXSL: String = this.ITEMDIR +"summary/summary.xsl"

    val PAYMENTGATEWAYOPTIONSXSL: String = this.PAYMENTDIR +"paymentGatewayOptions.xsl"

    val MAKEPAYMENTVIEWXSL: String = this.PAYMENTDIR +"invoice/" +"makePayment.xsl"

}
                
            

