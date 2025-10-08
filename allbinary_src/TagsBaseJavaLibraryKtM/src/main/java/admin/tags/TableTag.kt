
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
        package admin.tags




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.JspTagException
import admin.taghelpers.TagHelperFactoryInterface
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.SqlStrings
import org.allbinary.logic.java.bool.BooleanUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.PropertiesTag

open public class TableTag : PropertiesTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var enabled: String

    private var tagHelperFactoryInterface: TagHelperFactoryInterface

    private var tagRequestHelperFactoryInterface: TagHelperFactoryInterface

    private var requestObject: Any

    private var current: Integer

    private var total: Integer
public constructor (){

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


    open fun setIsSelected(enabled: String)
        //nullable = true from not(false or (false and false)) = true
{
var enabled = enabled
this.enabled= enabled
}


                @Throws(Exception::class)
            
    open fun isEnabled()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(this.enabled))
                        
                                    {
                                    
    
                        if(BooleanUtil.getInstance()!!.getFromString(this.enabled) || this.enabled.compareTo("on") == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun setTagHelperFactory(tagHelperFactoryInterface: TagHelperFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{
var tagHelperFactoryInterface = tagHelperFactoryInterface
this.tagHelperFactoryInterface= tagHelperFactoryInterface
}


    open fun getTagHelperFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: TagHelperFactoryInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tagHelperFactoryInterface
}


    open fun setTagRequestHelperFactory(tagHelperFactoryInterface: TagHelperFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{
var tagHelperFactoryInterface = tagHelperFactoryInterface
this.tagRequestHelperFactoryInterface= tagHelperFactoryInterface
}


    open fun getTagRequestHelperFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: TagHelperFactoryInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tagRequestHelperFactoryInterface
}


    open fun setCurrent(current: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var current = current
this.current= current
}


    open fun getCurrent()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return current
}


    open fun setTotal(total: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var total = total
this.total= total
}


    open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


                @Throws(LicensingException::class)
            
    open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var anyType: Any = getTagHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)!!


    var addressHelperClass: KClass<*> = anyType!!::class!!


    var method: Method = addressHelperClass!!.getMethod("drop", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to drop table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.DROP, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
    open fun create()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var anyType: Any = getTagHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)!!


    var addressHelperClass: KClass<*> = anyType!!::class!!


    var method: Method = addressHelperClass!!.getMethod("create", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to create table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "create()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
    open fun restore()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var anyType: Any = getTagHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)!!


    var addressHelperClass: KClass<*> = anyType!!::class!!


    var method: Method = addressHelperClass!!.getMethod("restore", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to restore backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "restore()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
    open fun backup()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var anyType: Any = getTagHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)!!


    var addressHelperClass: KClass<*> = anyType!!::class!!


    var method: Method = addressHelperClass!!.getMethod("backup", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to make backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "backup()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
    open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var helperClass: KClass<*> = requestObject!!::class!!


    var method: Method = helperClass!!.getMethod("insert", 
                            null)!!


    var result: String = method.invoke(requestObject, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to insert"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "insert()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
    open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var helperClass: KClass<*> = requestObject!!::class!!


    var method: Method = helperClass!!.getMethod(commonStrings!!.delete, 
                            null)!!


    var result: String = method.invoke(requestObject, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
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


                @Throws(LicensingException::class)
            
    open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var helperClass: KClass<*> = requestObject!!::class!!


    var method: Method = helperClass!!.getMethod("update", 
                            null)!!


    var result: String = method.invoke(requestObject, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to update"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(JspTagException::class)
            
    open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var request: HttpServletRequest = this.pageContext!!.getRequest() as HttpServletRequest


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TableTag Helper: ")
stringBuffer!!.append(this.getTagHelperFactoryInterface()!!.::class.toString()!!)
stringBuffer!!.append(" Request URI: ")
stringBuffer!!.append(request.getRequestURI())
logUtil!!.put(stringBuffer!!.toString(), this, "doStartTag()")

                                    }
                                

    
                        if(this.getTagRequestHelperFactoryInterface() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("TableTag RequestHelper: " +this.getTagRequestHelperFactoryInterface()!!.::class.toString()!!, this, "doStartTag()")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("TableTag RequestHelper: null", this, "doStartTag()")

                                    }
                                

                        }
                            

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("TableTag this.getCommand(): " +this.getCommand(), this, "doStartTag()")

                                    }
                                

    
                        if(this.isEnabled())
                        
                                    {
                                    
    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.INSERT) == 0 || this.getCommand()!!.compareTo(SqlStrings.getInstance()!!.INSERT_INTO) == 0 || this.getCommand()!!.compareTo(commonStrings!!.DELETE) == 0 || this.getCommand()!!.compareTo(commonStrings!!.UPDATE) == 0 || this.getCommand()!!.compareTo(SqlStrings.getInstance()!!.UPDATE) == 0)
                        
                                    {
                                    this.requestObject= getTagRequestHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)

                                    }
                                

    
                        if(this.getCommand()!!.compareTo(commonStrings!!.INSERT) == 0 || this.getCommand()!!.compareTo(SqlStrings.getInstance()!!.INSERT_INTO) == 0)
                        
                                    {
                                    this.insert()

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.DELETE) == 0)
                        
                                    {
                                    this.delete()

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.UPDATE) == 0 || this.getCommand()!!.compareTo(SqlStrings.getInstance()!!.UPDATE) == 0)
                        
                                    {
                                    this.update()

                                    }
                                

    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.BACKUP) == 0)
                        
                                    {
                                    
    var output: String = this.backup()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.RESTORE) == 0)
                        
                                    {
                                    this.getPropertiesHashMap()!!.put("current", this.getCurrent())
this.getPropertiesHashMap()!!.put("total", this.getTotal())

    var output: String = this.restore()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.DROP) == 0)
                        
                                    {
                                    
    var output: String = this.drop()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.CREATE) == 0)
                        
                                    {
                                    
    var output: String = this.create()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.INSERT) == 0)
                        
                                    {
                                    
    var output: String = this.insert()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.DELETE) == 0)
                        
                                    {
                                    
    var output: String = this.delete()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.UPDATE) == 0)
                        
                                    {
                                    
    var output: String = this.update()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE
} catch(e: LicensingException)
            {
AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

