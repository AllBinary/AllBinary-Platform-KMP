
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.jsp.PageContext
import admin.tags.AbTagData
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import tags.HelperTag
import views.admin.inventory.InventoryItemView

open public class InventoryRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val itemInterface: ItemInterface
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext

    var inventoryTag: HelperTag = propertiesHashMap!!.get(AbTagData.PARENT) as HelperTag


    var itemView: InventoryItemView = InventoryItemViewParentTagHelper.getInstance()!!.getInventoryItemView(inventoryTag)!!
            

this.itemInterface= itemView!!.getItemInterface()
}


                @Throws(Exception::class)
            
open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var dataMappingInterface: TableMappingInterface = this.getItemInterface() as TableMappingInterface


    var values: Vector = dataMappingInterface!!.toVector()!!
            

InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.insert(values)

    var success: String = "Successfully Added Product"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "insert()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to add item to Inventory"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "insert()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var dataMappingInterface: TableMappingInterface = this.getItemInterface() as TableMappingInterface


    var id: String = dataMappingInterface!!.getKey() as String

InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.deleteWhere(BasicItemData.ID, id)

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Successfully Removed the item with ")
stringBuffer!!.append(BasicItemData.ID)
stringBuffer!!.append(
                            "=")
stringBuffer!!.append(id)
stringBuffer!!.append(
                            " from to the Inventory table")

    var success: String = stringBuffer!!.toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "doStartTag()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to remove item with from Inventory"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "doStartTag()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.delete()
this.insert()

    var success: String = "Item Successfully Updated"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed To Update Item"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun getItemInterface()
        //nullable = true from not(false or (false and true)) = true
: ItemInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return itemInterface
}


}
                
            

