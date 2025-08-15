
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.user.commerce.inventory.item.BasicItemView
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.StoreTransformer
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.data.TransformStoreDocumentFactory
import org.allbinary.logic.visual.transform.info.TransformInfoHttpSearch
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings

open public class InventorySearchProductUtil
            : Object
         {
        

        companion object {
            
    private val instance: InventorySearchProductUtil = InventorySearchProductUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InventorySearchProductUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val ITEM_NOT_FOUND: String = "Item Not Found."

                @Throws(Exception::class)
            
open fun getProduct(abeClientInformation: AbeClientInformationInterface, searchRequest: SearchRequest, product: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation


                    var searchRequest = searchRequest


                    var product = product

        try {
            
    var inventoryEntityInterface: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            


    var itemInterface: ItemInterface = inventoryEntityInterface!!.getItem(product)!!
            


    
                        if(itemInterface != 
                                    null
                                )
                        
                                    {
                                    
    var viewDocumentInterface: TransformDocumentInterface = TransformStoreDocumentFactory.getInstance(searchRequest)!!
            

viewDocumentInterface!!.getBaseNode()!!.appendChild(BasicItemView(itemInterface, Vector()).
                            toXmlNode(viewDocumentInterface!!.getDoc()))

    var success: String = DomDocumentHelper.toString(viewDocumentInterface!!.getDoc())!!
            


    var outputStr: String = StoreTransformer(abeClientInformation, TransformInfoHttpSearch(searchRequest) as TransformInfoInterface).
                            translate(success)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return outputStr

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ITEM_NOT_FOUND

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "getProduct", e)

                                    }
                                



                            throw Exception("Failed to getProduct")
}

}


}
                
            

