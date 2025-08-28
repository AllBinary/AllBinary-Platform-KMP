
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
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil

open public class InventoryColumnUtil
            : Object
         {
        

        companion object {
            
    private val instance: InventoryColumnUtil = InventoryColumnUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InventoryColumnUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun getColumnWhereLike(inventoryEntity: InventoryEntity, category: String, column: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

        Updates for KMP build        
        {
var inventoryEntity = inventoryEntity
var category = category
var column = column
logUtil!!.put("Start Category: " +category, this, "getKeywords")

    var keywords: Vector = Vector()


    var vectorOfHashMaps: Vector = inventoryEntity!!.getAllRows()!!


    var size: Int = vectorOfHashMaps!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = vectorOfHashMaps!!.get(index as Object) as HashMap<Any, Any>


    var categoryName: String = hashMap!!.get(BasicItemData.CATEGORY) as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(categoryName) && categoryName!!.startsWith(category))
                        
                                    {
                                    keywords.add(hashMap!!.get(column as Object))

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keywords
}


}
                
            

