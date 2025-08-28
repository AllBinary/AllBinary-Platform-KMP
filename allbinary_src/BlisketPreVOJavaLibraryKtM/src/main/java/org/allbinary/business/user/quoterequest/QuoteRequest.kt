
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
        package org.allbinary.business.user.quoterequest




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.entry.EntryData
import org.allbinary.business.quoterequest.QuoteRequestData
import org.allbinary.business.user.UserData
import org.allbinary.data.generator.QuoteRequestIdGenerator
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class QuoteRequest
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var id: String

    private var userName: String

    private var projectInfo: String

    private var userComments: String

    private var budget: String

    private var timeFrame: String

    private var comments: String
public constructor        (userName: String, request: HttpServletRequest)
            : super()
        {
var userName = userName
var request = request

    var quoteRequestData: QuoteRequestData = QuoteRequestData.getInstance()!!

this.id= QuoteRequestIdGenerator().
                            getNext()
this.setUserName(userName)
this.setProjectInfo(request.getParameter(quoteRequestData!!.PROJECT_INFO) as String)
this.setUserComments(request.getParameter(quoteRequestData!!.CUSTOMER_COMMENTS) as String)
this.setBudget(request.getParameter(quoteRequestData!!.BUDGET) as String)
this.setTimeFrame(request.getParameter(quoteRequestData!!.TIMEFRAME) as String)
this.setComments(request.getParameter(quoteRequestData!!.COMMENTS) as String)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Created with: " +this.toHashMap(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {
var hashMap = hashMap

    var quoteRequestData: QuoteRequestData = QuoteRequestData.getInstance()!!

this.id= hashMap!!.get(quoteRequestData!!.ID) as String
this.setUserName(hashMap!!.get(UserData.USERNAME) as String)
this.setProjectInfo(hashMap!!.get(quoteRequestData!!.PROJECT_INFO) as String)
this.setUserComments(hashMap!!.get(quoteRequestData!!.CUSTOMER_COMMENTS) as String)
this.setBudget(hashMap!!.get(quoteRequestData!!.BUDGET) as String)
this.setTimeFrame(hashMap!!.get(quoteRequestData!!.TIMEFRAME) as String)
this.setComments(hashMap!!.get(quoteRequestData!!.COMMENTS) as String)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Created with: " +this.toHashMap(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    var valid: Boolean = Boolean.TRUE


    
                        if(userName == 
                                    null
                                 || userName!!.length < 4 || userName!!.length > 250)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(this.projectInfo == 
                                    null
                                 || this.projectInfo!!.length < 0 || this.projectInfo!!.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(this.userComments == 
                                    null
                                 || this.userComments!!.length < 0 || this.userComments!!.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(this.budget == 
                                    null
                                 || this.budget.length < 0 || this.budget.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(this.timeFrame == 
                                    null
                                 || this.timeFrame!!.length < 0 || this.timeFrame!!.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(this.comments == 
                                    null
                                 || this.comments.length < 0 || this.comments.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return valid
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate form", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    
                        if(userName == 
                                    null
                                 || userName!!.length < 4 || userName!!.length > 250)
                        
                                    {
                                    stringBuffer!!.append("Please enter a User Name with more than 4 characters.<br>")

                                    }
                                

    
                        if(this.projectInfo == 
                                    null
                                 || this.projectInfo!!.length < 0 || this.projectInfo!!.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    stringBuffer!!.append("Please enter Project Info with less than " +AbSqlData.MAXBLOB +" characters.<br>")

                                    }
                                

    
                        if(this.userComments == 
                                    null
                                 || this.userComments!!.length < 0 || this.userComments!!.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    stringBuffer!!.append("Please enter User Comments with less than " +AbSqlData.MAXBLOB +" characters.<br>")

                                    }
                                

    
                        if(this.budget == 
                                    null
                                 || this.budget.length < 0 || this.budget.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    stringBuffer!!.append("Please enter Budget with less than " +AbSqlData.MAXBLOB +" characters.<br>")

                                    }
                                

    
                        if(this.timeFrame == 
                                    null
                                 || this.timeFrame!!.length < 0 || this.timeFrame!!.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    stringBuffer!!.append("Please enter time frame with less than " +AbSqlData.MAXBLOB +" characters.<br>")

                                    }
                                

    
                        if(this.comments == 
                                    null
                                 || this.comments.length < 0 || this.comments.length > AbSqlData.MAXBLOB)
                        
                                    {
                                    stringBuffer!!.append("Please enter comments with less than " +AbSqlData.MAXBLOB +" characters.<br>")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Form"
}

}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{

    var values: Vector = Vector()

values.add(id)
values.add(userName)
values.add(this.projectInfo)
values.add(this.userComments)
values.add(this.budget)
values.add(this.timeFrame)
values.add(this.comments)

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.add(time)
values.add(time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var quoteRequestData: QuoteRequestData = QuoteRequestData.getInstance()!!


    var values: HashMap<Any, Any> = HashMap<Any, Any>()

values.put(UserData.USERNAME, userName)
values.put(quoteRequestData!!.PROJECT_INFO, this.projectInfo)
values.put(quoteRequestData!!.CUSTOMER_COMMENTS, this.userComments)
values.put(quoteRequestData!!.BUDGET, this.budget)
values.put(quoteRequestData!!.TIMEFRAME, this.timeFrame)
values.put(quoteRequestData!!.COMMENTS, this.comments)

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.userName= value
}


open fun setProjectInfo(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.projectInfo= value
}


open fun setUserComments(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.userComments= value
}


open fun setBudget(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.budget= value
}


open fun setTimeFrame(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.timeFrame= value
}


open fun setComments(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.comments= value

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    
                        if(this.comments == 
                                    null
                                )
                        this.comments= stringUtil!!.EMPTY_STRING
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


open fun getProjectInfo()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.projectInfo
}


open fun getUserComments()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userComments
}


open fun getBudget()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.budget
}


open fun getTimeFrame()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeFrame
}


open fun getComments()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.comments
}


}
                
            

