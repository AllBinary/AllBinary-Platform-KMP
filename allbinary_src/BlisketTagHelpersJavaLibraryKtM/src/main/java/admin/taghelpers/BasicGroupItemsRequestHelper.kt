
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
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.group.BasicGroupItemData
import org.allbinary.data.tables.user.commerce.inventory.item.groups.BasicGroupItemsEntityFactory
import org.allbinary.logic.communication.log.LogUtil

open public class BasicGroupItemsRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var request: HttpServletRequest

    private var id: String

    private var itemOne: String

    private var itemTwo: String

    private var itemThree: String

    private var itemFour: String

    private var itemFive: String

    private var itemSix: String

    private var itemSeven: String

    private var itemEight: String

    private var itemNine: String

    private var itemTen: String

    private var timeEntered: String

    private var lastModified: String
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var hashMap = hashMap


                    var pageContext = pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.id= request.getParameter(BasicItemData.ID)
this.itemOne= request.getParameter(BasicGroupItemData.ITEM_ONE)
this.itemTwo= request.getParameter(BasicGroupItemData.ITEM_TWO)
this.itemThree= request.getParameter(BasicGroupItemData.ITEM_THREE)
this.itemFour= request.getParameter(BasicGroupItemData.ITEM_FOUR)
this.itemFive= request.getParameter(BasicGroupItemData.ITEM_FIVE)
this.itemSix= request.getParameter(BasicGroupItemData.ITEM_SIX)
this.itemSeven= request.getParameter(BasicGroupItemData.ITEM_SEVEN)
this.itemEight= request.getParameter(BasicGroupItemData.ITEM_EIGHT)
this.itemNine= request.getParameter(BasicGroupItemData.ITEM_NINE)
this.itemTen= request.getParameter(BasicGroupItemData.ITEM_TEN)
this.timeEntered= request.getParameter(EntryData.getInstance()!!.TIMECREATED)
this.lastModified= request.getParameter(EntryData.getInstance()!!.LASTMODIFIED)
}


open fun getHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var values: HashMap<Any, Any> = HashMap<Any, Any>()

values.put(BasicItemData.ID, id)
values.put(BasicGroupItemData.ITEM_ONE, this.itemOne)
values.put(BasicGroupItemData.ITEM_TWO, this.itemTwo)
values.put(BasicGroupItemData.ITEM_THREE, this.itemThree)
values.put(BasicGroupItemData.ITEM_FOUR, this.itemFour)
values.put(BasicGroupItemData.ITEM_FIVE, this.itemFive)
values.put(BasicGroupItemData.ITEM_SIX, this.itemSix)
values.put(BasicGroupItemData.ITEM_SEVEN, this.itemSeven)
values.put(BasicGroupItemData.ITEM_EIGHT, this.itemEight)
values.put(BasicGroupItemData.ITEM_NINE, this.itemNine)
values.put(BasicGroupItemData.ITEM_TEN, this.itemTen)

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                


    var values: Vector = Vector()

values.add(this.id)
values.add(this.itemOne)
values.add(this.itemTwo)
values.add(this.itemThree)
values.add(this.itemFour)
values.add(this.itemFive)
values.add(this.itemSix)
values.add(this.itemSeven)
values.add(this.itemEight)
values.add(this.itemNine)
values.add(this.itemTen)
values.add(time)
values.add(time)
BasicGroupItemsEntityFactory.getInstance()!!.getBasicGroupItemsEntityInstance()!!.insert(values)

    var success: String = "Successfully inserted " +id +" into items table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "insert()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to insert " +id +" into items table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "inserts()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            BasicGroupItemsEntityFactory.getInstance()!!.getBasicGroupItemsEntityInstance()!!.delete(id)

    var success: String = "Successfully deleted"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to delete"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "delete()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = "Update Pricing Successful"


    var values: HashMap<Any, Any> = this.getHashMap()!!
            

BasicGroupItemsEntityFactory.getInstance()!!.getBasicGroupItemsEntityInstance()!!.update(values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(id +" " +success, this, "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to update: " +id


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

