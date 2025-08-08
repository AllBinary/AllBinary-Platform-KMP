
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
        package admin.taghelpers



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.jsp.PageContext
import admin.tags.AbTagData
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItem
import org.allbinary.data.tables.user.commerce.inventory.item.downloads.DownloadItemsEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonSeps
import tags.HelperTag
import views.admin.inventory.download.DownloadableInventoryItemView

open public class DownloadItemsRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val downloadableItem: DownloadableItem
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var hashMap = hashMap


                    var pageContext = pageContext

    var inventoryTag: HelperTag = hashMap!!.get(AbTagData.PARENT) as HelperTag


    var inventoryItemViewParentTagHelper: InventoryItemViewParentTagHelper = InventoryItemViewParentTagHelper.getInstance()!!
            


    var downloadableInventoryItemView: DownloadableInventoryItemView = inventoryItemViewParentTagHelper!!.getDownloadableInventoryItemView(inventoryTag)!!
            

this.downloadableItem= downloadableInventoryItemView!!.getDownloadableItem()
}


open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var vector: Vector = this.downloadableItem!!.toVector()!!
            

DownloadItemsEntityFactory.getInstance()!!.getDownloadItemsEntityInstance()!!.insert(vector)

    var success: String = "Successfully inserted " +this.downloadableItem!!.getId() +" into downloaditems table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "insert()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to insert " +this.downloadableItem!!.getId() +" into downloaditems table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "inserts()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            DownloadItemsEntityFactory.getInstance()!!.getDownloadItemsEntityInstance()!!.delete(this.downloadableItem!!.getId())

    var success: String = "Successfully deleted"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to delete"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "delete()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = "Update Successful"


    var values: HashMap<Any, Any> = this.downloadableItem!!.toHashMap()!!
            

DownloadItemsEntityFactory.getInstance()!!.getDownloadItemsEntityInstance()!!.update(values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(this.downloadableItem!!.getId() +CommonSeps.getInstance()!!.SPACE +success, this, 
                            "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to update: " +this.downloadableItem!!.getId()


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

