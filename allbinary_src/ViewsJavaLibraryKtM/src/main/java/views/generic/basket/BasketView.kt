
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
        package views.generic.basket



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.commerce.inventory.basket.BasketData
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemView
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class BasketView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val request: HttpServletRequest
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    var inventoryEntity: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            


    var basketInterface: BasketInterface = this.getWeblisketSession()!!.getOrder()!!.getBasket()!!
            


    var basketNode: Node = document!!.createElement(BasketData.BASKET)!!
            


    var itemsAndNumberInBasket: HashMap<Any, Any> = basketInterface!!.getItems()!!
            


    var numberOfResults: Int = 1


    var items: Set = itemsAndNumberInBasket!!.keySet()!!
            


    var productArray: Array<Any?> = items!!.toArray()!!
            


    var size: Int = productArray!!.size
                





                        for (index in 0 until size)


        {
    var product: String = .concatToString()


    var itemInterface: ItemInterface = inventoryEntity!!.getItem(product)!!
            


    
                        if(itemInterface != 
                                    null
                                )
                        
                                    {
                                    
    var basicItemView: BasicItemView = BasicItemView(itemInterface, Vector())


    var node: Node = basicItemView!!.toXmlNode(document)!!
            


    var numberInBasket: String = basketInterface!!.getNumberOf(product)!!.toString()!!
            

node!!.appendChild(ModDomHelper.createNameValueNodes(document, BasketData.ITEMTOTALINBASKET, numberInBasket))

    var itemPrice: Money = itemInterface!!.getPrice()!!
            


    var itemTotal: Money = Money(itemPrice)

itemTotal!!.multiply(basketInterface!!.getNumberOf(product)!!.toInt())
node!!.appendChild(ModDomHelper.createNameValueNodes(document, BasketData.ITEMTOTAL, itemTotal!!.toString()))
basketNode!!.appendChild(node)

                                    }
                                
                        else {
                            logUtil!!.put("Product Failed: " +product, this, 
                            "toXmlNode")

                        }
                            
numberOfResults++
}


    var totalNumberNode: Node = document!!.createElement(SearchData.TOTAL_NUMBER_ITEMS)!!
            


    var totalNumberTextNode: Node = document!!.createTextNode(basketInterface!!.getNumberOfItems()!!.toString())!!
            

totalNumberNode!!.appendChild(totalNumberTextNode)

    var totalWeightNode: Node = document!!.createElement(BasketData.TOTALWEIGHT)!!
            


    var totalWeightTextNode: Node = document!!.createTextNode(basketInterface!!.getTotalWeight()!!.toString())!!
            

totalWeightNode!!.appendChild(totalWeightTextNode)

    var subTotalNode: Node = document!!.createElement(BasketData.SUBTOTAL)!!
            


    var subTotalTextNode: Node = document!!.createTextNode(basketInterface!!.getSubTotal()!!.toString())!!
            

subTotalNode!!.appendChild(subTotalTextNode)
basketNode!!.appendChild(totalNumberNode)
basketNode!!.appendChild(totalWeightNode)
basketNode!!.appendChild(subTotalNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basketNode
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


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

