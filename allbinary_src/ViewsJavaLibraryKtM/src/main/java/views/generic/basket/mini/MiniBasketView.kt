
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
        package views.generic.basket.mini




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.inventory.basket.BasketData
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class MiniBasketView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

        try {
            
    var basketInterface: BasketInterface = this.getWeblisketSession()!!.getOrder()!!.getBasket()!!


    var basketNode: Node = document.createElement(BasketData.BASKET)!!


    var totalNumberNode: Node = document.createElement(SearchData.TOTAL_NUMBER_ITEMS)!!


    var totalNumberTextNode: Node = document.createTextNode(basketInterface!!.getNumberOfItems()!!.toString())!!

totalNumberNode!!.appendChild(totalNumberTextNode)

    var totalWeightNode: Node = document.createElement(BasketData.TOTALWEIGHT)!!


    var totalWeightTextNode: Node = document.createTextNode(basketInterface!!.getTotalWeight()!!.toString())!!

totalWeightNode!!.appendChild(totalWeightTextNode)

    var subTotalNode: Node = document.createElement(BasketData.SUBTOTAL)!!


    var subTotalTextNode: Node = document.createTextNode(basketInterface!!.getSubTotal()!!.toString())!!

subTotalNode!!.appendChild(subTotalTextNode)
basketNode!!.appendChild(totalNumberNode)
basketNode!!.appendChild(totalWeightNode)
basketNode!!.appendChild(subTotalNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basketNode
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "toXmlNode", e)

                                    }
                                



                            throw e
}

}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.addDomNodeInterface(this as DomNodeInterface)
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

