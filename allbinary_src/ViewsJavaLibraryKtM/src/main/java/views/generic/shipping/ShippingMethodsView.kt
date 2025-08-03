
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
        package views.generic.shipping



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.business.user.commerce.money.tax.TaxFactory
import org.allbinary.business.user.commerce.shipping.ShippingMethods
import org.allbinary.business.user.commerce.shipping.ShippingMethodsData
import org.allbinary.business.user.commerce.shipping.modules.ShippingInterface
import org.allbinary.data.tables.user.address.StreetAddressesEntityInterface
import org.allbinary.data.tables.user.address.shipping.ShippingAddressesEntityFactory
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class ShippingMethodsView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var shippingMethods: ShippingMethods

    private var storeFrontInterface: StoreFrontInterface
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.storeFrontInterface= StoreFrontFactory.getInstance(this.getTransformInfoInterface()!!.getStoreName())
this.shippingMethods= ShippingMethods(this.abeClientInformation, storeFrontInterface)
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    var shippingMethodsNode: Node = document!!.createElement(ShippingMethodsData.SHIPPINGMETHODSORDERSUMMARIES)!!
            


    var order: OrderInterface = this.getWeblisketSession()!!.getOrder()!!
            


    var basket: BasketInterface = this.getWeblisketSession()!!.getOrder()!!.getBasket()!!
            


    var shippingAddressesEntityInterface: StreetAddressesEntityInterface = ShippingAddressesEntityFactory.getInstance()!!.getInstance(this.getWeblisketSession()!!.getUserName())!!
            


    var streetAddress: StreetAddress = shippingAddressesEntityInterface!!.getDefault()!!
            


    var shippingVector: Vector = this.shippingMethods!!.get()!!
            


    var size: Int = shippingVector!!.size!!
            





                        for (index in 0 until size)


        {
    var shippingMethodNode: Node = document!!.createElement(ShippingMethodsData.SHIPPINGMETHODORDERSUMMARY)!!
            


    var shipping: ShippingInterface = shippingVector!!.get(index) as ShippingInterface


    var shippingView: DomNodeInterface = shipping as DomNodeInterface

shippingMethodNode!!.appendChild(shippingView!!.toXmlNode(document))

    var shippingCost: Money = shipping!!.getCost(order)!!
            


    var subTotal: Money = basket!!.getSubTotal()!!
            


    var taxRate: Float = TaxFactory.getInstance()!!.getInstance(this.abeClientInformation, storeFrontInterface)!!.getTaxRate(streetAddress, storeFrontInterface)!!
            


    var tax: Money = Money()


    var total: Money = Money()

total!!.add(shippingCost!!.toString())
total!!.add(subTotal!!.toString())
tax!!.add(total!!.toString())
tax!!.multiply(taxRate)
total!!.add(tax!!.toString())
shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, ShippingMethodsData.SHIPPINGCOST, shippingCost!!.toString()))
shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, ShippingMethodsData.TAXRATE, taxRate!!.toString()))
shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, ShippingMethodsData.SUBTOTAL, subTotal!!.toString()))
shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, ShippingMethodsData.TAX, tax!!.toString()))
shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, ShippingMethodsData.TOTAL, total!!.toString()))
shippingMethodNode!!.appendChild(ModDomHelper.createNameValueNodes(document, EntryData.getInstance()!!.DEFAULT, this.shippingMethods!!.getDefault()!!.getName()))
shippingMethodsNode!!.appendChild(shippingMethodNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return shippingMethodsNode
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "toXmlNode", e)

                                    }
                                



                            throw e
}

}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{this.addDomNodeInterface(this as DomNodeInterface)
}


open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            {
    var error: String = "Failed to view ShippingMethods"


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

