
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
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.special.SpecialItemData
import org.allbinary.data.tables.user.commerce.inventory.item.special.SpecialItemsEntityFactory
import org.allbinary.logic.communication.log.LogUtil

open public class SpecialItemsRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var request: HttpServletRequest

    private var id: String

    private var enabled: String

    private var number: String

    private var startTime: String

    private var endTime: String

    private var price: String

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
{this.id= request!!.getParameter(BasicItemData.ID)
this.number= request!!.getParameter(BasicItemData.NUMBER)
this.enabled= request!!.getParameter(EntryData.getInstance()!!.ENABLE)
this.startTime= request!!.getParameter(SpecialItemData.START_TIME)
this.endTime= request!!.getParameter(SpecialItemData.END_TIME)
this.price= request!!.getParameter(BasicItemData.PRICE)
this.timeEntered= request!!.getParameter(EntryData.getInstance()!!.TIMECREATED)
this.lastModified= request!!.getParameter(EntryData.getInstance()!!.LASTMODIFIED)
}


open fun getHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var values: HashMap<Any, Any> = HashMap<Any, Any>()

values!!.put(BasicItemData.ID, this.id)
values!!.put(BasicItemData.NUMBER, this.number)
values!!.put(EntryData.getInstance()!!.ENABLE, this.enabled)
values!!.put(SpecialItemData.START_TIME, this.startTime)
values!!.put(SpecialItemData.END_TIME, this.endTime)
values!!.put(BasicItemData.PRICE, this.price)

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString().toCharArray().concatToString()
                                

values!!.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString().toCharArray().concatToString()
                                


    var values: Vector = Vector()

values!!.add(this.id)
values!!.add(this.number)
values!!.add(this.enabled)
values!!.add(this.startTime)
values!!.add(this.endTime)
values!!.add(this.price)
values!!.add(time)
values!!.add(time)
SpecialItemsEntityFactory.getInstance()!!.getSpecialItemsEntityInstance()!!.insert(values)

    var success: String = "Successfully inserted " +id +" into items table"


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "insert()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to insert " +id +" into items table"


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
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
            SpecialItemsEntityFactory.getInstance()!!.getSpecialItemsEntityInstance()!!.delete(id)

    var success: String = "Successfully deleted"


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to delete"


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
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


    var values: HashMap<Any, Any> = this.getHashMap()!!
            

SpecialItemsEntityFactory.getInstance()!!.getSpecialItemsEntityInstance()!!.update(values)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(id +" " +success, this, 
                            "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to update: " +id


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

