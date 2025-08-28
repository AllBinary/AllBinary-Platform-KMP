
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
import org.allbinary.business.user.commerce.inventory.item.option.BasicOptionItemData
import org.allbinary.data.tables.user.commerce.inventory.item.options.BasicOptionItemsEntityFactory
import org.allbinary.logic.communication.log.LogUtil

open public class BasicOptionItemsRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var request: HttpServletRequest

    private var id: String

    private var optionOneTitle: String

    private var defaultOptionItem: String

    private var defaultOptionValue: String

    private var optionItem: Vector

    private var optionValue: Vector

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
{
this.optionItem= Vector()
this.optionValue= Vector()
this.id= request.getParameter(BasicItemData.ID)
this.optionOneTitle= request.getParameter(BasicOptionItemData.OPTION_ONE_TITLE)
this.defaultOptionItem= request.getParameter(BasicOptionItemData.DEFAULT_OPTION_ITEM)
this.defaultOptionValue= request.getParameter(BasicOptionItemData.DEFAULT_OPTION_VALUE)
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_ONE_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_ONE_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_TWO_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_TWO_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_THREE_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_THREE_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_FOUR_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_FOUR_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_FIVE_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_FIVE_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_SIX_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_SIX_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_SEVEN_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_SEVEN_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_EIGHT_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_EIGHT_VALUE))
this.optionItem!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_NINE_ITEM))
this.optionValue!!.add(request.getParameter(BasicOptionItemData.OPTION_ONE_NINE_VALUE))
this.timeEntered= request.getParameter(EntryData.getInstance()!!.TIMECREATED)
this.lastModified= request.getParameter(EntryData.getInstance()!!.LASTMODIFIED)
}


open fun getHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var values: HashMap<Any, Any> = HashMap<Any, Any>()

values.put(BasicItemData.ID, id)
values.put(BasicOptionItemData.OPTION_ONE_ONE_ITEM, this.optionItem!!.get(0))
values.put(BasicOptionItemData.OPTION_ONE_ONE_VALUE, this.optionValue!!.get(0))
values.put(BasicOptionItemData.OPTION_ONE_TWO_ITEM, this.optionItem!!.get(1))
values.put(BasicOptionItemData.OPTION_ONE_TWO_VALUE, this.optionValue!!.get(1))
values.put(BasicOptionItemData.OPTION_ONE_THREE_ITEM, this.optionItem!!.get(2))
values.put(BasicOptionItemData.OPTION_ONE_THREE_VALUE, this.optionValue!!.get(2))
values.put(BasicOptionItemData.OPTION_ONE_FOUR_ITEM, this.optionItem!!.get(3))
values.put(BasicOptionItemData.OPTION_ONE_FOUR_VALUE, this.optionValue!!.get(3))
values.put(BasicOptionItemData.OPTION_ONE_FIVE_ITEM, this.optionItem!!.get(4))
values.put(BasicOptionItemData.OPTION_ONE_FIVE_VALUE, this.optionValue!!.get(4))
values.put(BasicOptionItemData.OPTION_ONE_SIX_ITEM, this.optionItem!!.get(5))
values.put(BasicOptionItemData.OPTION_ONE_SIX_VALUE, this.optionValue!!.get(5))
values.put(BasicOptionItemData.OPTION_ONE_SEVEN_ITEM, this.optionItem!!.get(6))
values.put(BasicOptionItemData.OPTION_ONE_SEVEN_VALUE, this.optionValue!!.get(6))
values.put(BasicOptionItemData.OPTION_ONE_EIGHT_ITEM, this.optionItem!!.get(7))
values.put(BasicOptionItemData.OPTION_ONE_EIGHT_VALUE, this.optionValue!!.get(7))
values.put(BasicOptionItemData.OPTION_ONE_NINE_ITEM, this.optionItem!!.get(8))
values.put(BasicOptionItemData.OPTION_ONE_NINE_VALUE, this.optionValue!!.get(8))

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

values.add(id)

    var size: Int = this.optionValue!!.size!!





                        for (index in 0 until size)

        {
values.add(this.optionValue!!.get(index))
values.add(this.optionItem!!.get(index))
}

values.add(time)
values.add(time)
BasicOptionItemsEntityFactory.getInstance()!!.getBasicOptionItemsEntityInstance()!!.insert(values)

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
            BasicOptionItemsEntityFactory.getInstance()!!.getBasicOptionItemsEntityInstance()!!.delete(id)

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

BasicOptionItemsEntityFactory.getInstance()!!.getBasicOptionItemsEntityInstance()!!.update(values)

    
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
                
            

