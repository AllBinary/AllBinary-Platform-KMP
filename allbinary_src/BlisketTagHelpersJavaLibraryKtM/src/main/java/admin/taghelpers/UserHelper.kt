
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
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.entry.EntryData
import org.allbinary.business.installer.Portion
import org.allbinary.business.user.NewUserFactory
import org.allbinary.business.user.UserData
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.username.UserName
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlTableUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil

open public class UserHelper : Table {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val hashMap: HashMap<Any, Any>

    private val pageContext: PageContext

    private val request: HttpServletRequest

    private val path: String

    private val portion: Portion
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)

        Updates for KMP build        
        {
var hashMap = hashMap
var pageContext = pageContext
this.hashMap= hashMap
this.pageContext= pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest
this.path= URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH
this.portion= Portion(hashMap)
}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var requestHashMap: HashMap<Any, Any> = RequestParams(this.request).
                            toHashMap()!!


    var userName: UserName = UserName(requestHashMap)

UserEntityFactory.getInstance()!!.deleteWhere(UserData.USERNAME, userName!!.get())

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Successfully Removed the user with ")
stringBuffer!!.append(UserData.USERNAME)
stringBuffer!!.append("=")
stringBuffer!!.append(userName!!.get())
stringBuffer!!.append(" from to the user table")

    var success: String = stringBuffer!!.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to remove user with " +UserData.USERNAME +" from User table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "delete()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(Exception::class)
            
open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var userInterface: UserInterface = NewUserFactory.getInstance(this.request, hashMap)!!


    var enable: String = this.hashMap!!.get(EntryData.getInstance()!!.ENABLE) as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(enable))
                        
                                    {
                                    userInterface!!.setEnable(enable)

                                    }
                                

    var values: Vector = userInterface!!.toVector()!!

UserEntityFactory.getInstance()!!.insert(values)

    var success: String = "New User Successfully added to the Users Table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "add()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to add User"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "add()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var user: UserInterface = NewUserFactory.getInstance(this.request, hashMap)!!


    var values: HashMap<Any, Any> = user.toHashMap()!!

UserEntityFactory.getInstance()!!.update(user.getUserName(), values)

    var success: String = "New User Successfully added to the Users Table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to add User"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = UserEntityFactory.getInstance()!!.dropTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(success, this, commonStrings!!.DROP)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to drop user table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.DROP, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun create()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = UserEntityFactory.getInstance()!!.createTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(success, this, "create()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to create user table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "create()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun restore()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Restore Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.restoreTable(UserEntityFactory.getInstance(), this.portion)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "restore()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to restore backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "restore()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun backup()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Restore Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.backupTable(UserEntityFactory.getInstance())!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(success, this, "backup()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to make backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "backup()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

