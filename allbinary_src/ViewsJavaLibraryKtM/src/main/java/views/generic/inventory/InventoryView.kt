
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
        package views.generic.inventory




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.user.commerce.inventory.InventoryData
import org.allbinary.business.user.commerce.inventory.item.BasicItemView
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
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

open public class InventoryView : HttpStoreComponentView
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
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Starting", this, "toXmlNode")

                                    }
                                

    var inventoryEntityInterface: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!


    var inventoryNode: Node = document.createElement(InventoryData.INVENTORY)!!


    var itemVector: Vector = inventoryEntityInterface!!.getItems(StoreFrontFactory.getInstance(this.getTransformInfoInterface()!!.getStoreName()))!!

inventoryNode!!.appendChild(ModDomHelper.createNameValueNodes(document, SearchData.TOTAL_NUMBER_ITEMS_ON_THIS_PAGE, Integer(itemVector!!.size).
                            toString()))

    var size: Int = itemVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var itemInterface: ItemInterface = itemVector!!.get(index) as ItemInterface


    
                        if(itemInterface != 
                                    null
                                )
                        
                                    {
                                    
    var node: Node = BasicItemView(itemInterface, Vector()).
                            toXmlNode(document)!!

inventoryNode!!.appendChild(node)

                                    }
                                
                        else {
                            logUtil!!.put("Inventory", this, "toXmlNode")

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inventoryNode
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
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

    var error: String = "Failed to view Inventory"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

