
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
        package org.allbinary.data.tables.user




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.user.CreateUserFactory
import org.allbinary.business.user.UserData
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.modules.User
import org.allbinary.business.user.role.UserRole
import org.allbinary.business.user.role.UserRoleData
import org.allbinary.business.user.role.UserRoleFactory
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.control.crypt.SuperCrypt
import org.allbinary.logic.string.StringMaker

open public class UserEntity : AbSqlBean
                , UserEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val tableName: String = "user"

    private val COMMAND_SUCCESS_FOR_USER: String = "Command Success for user: "

    private val PASSWORD_LABEL: String = " Password: "

    private val EQUALS: String = "=="

    private val COMMAND_SUCCESS_BUT_LOGIN_FAILED: String = "Command Success but login failed for user: "

    private val INVALID_PASSWORD_LABEL: String = " Password: \n\""

    private val NOT_EQUAL: String = "\"!=\""

    private val END_QUOTES: String = "\""
public constructor ()                        

                            : super(UserDbInitInfo()){


                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


    open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{
var values = values

        try {
            super.insert(values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, INSERT)

                                    }
                                
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, INSERT, e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun getAdministrators()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getUsersWithRole(UserRoleFactory.getInstance()!!.ADMINISTRATOR)
}


                @Throws(Exception::class)
            
    open fun getStoreManagers(storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var storeFrontInterface = storeFrontInterface

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()


    var usersVector: Vector = Vector()

keysAndValues!!.put(UserRoleData.NAME.toString(), UserRoleFactory.getInstance()!!.STOREMANAGER.toString())
keysAndValues!!.put(UserData.PERMISSIONS, storeFrontInterface!!.getName())

    var usersHashMapVector: Vector = super.getRows(keysAndValues)!!


    var size: Int = usersHashMapVector!!.size!!





                        for (i in 0 until size)

        {

    var userHashMap: HashMap<Any, Any> = usersHashMapVector!!.get(i as Object) as HashMap<Any, Any>


    
                        if(userHashMap != 
                                    null
                                )
                        usersVector!!.add(User(userHashMap))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return usersVector
}


                @Throws(Exception::class)
            
    open fun getCustomers()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getUsersWithRole(UserRoleFactory.getInstance()!!.CUSTOMER)
}


                @Throws(Exception::class)
            
    open fun getUsersWithRole(userRole: UserRole)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var userRole = userRole

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()


    var usersVector: Vector = Vector()

keysAndValues!!.put(UserRoleData.NAME.toString(), userRole!!.toString())

    var usersHashMapVector: Vector = super.getRows(keysAndValues)!!


    var size: Int = usersHashMapVector!!.size!!





                        for (index in 0 until size)

        {

    var userHashMap: HashMap<Any, Any> = usersHashMapVector!!.get(index as Object) as HashMap<Any, Any>


    
                        if(userHashMap != 
                                    null
                                )
                        usersVector!!.add(User(userHashMap))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return usersVector
}


                @Throws(Exception::class)
            
    open fun getUsers(storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var storeFrontInterface = storeFrontInterface

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()


    var usersVector: Vector = Vector()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeFrontInterface!!.getName())

    var usersHashMapVector: Vector = super.getRows(keysAndValues)!!


    var size: Int = usersHashMapVector!!.size!!





                        for (index in 0 until size)

        {

    var userHashMap: HashMap<Any, Any> = usersHashMapVector!!.get(index as Object) as HashMap<Any, Any>


    
                        if(userHashMap != 
                                    null
                                )
                        usersVector!!.add(User(userHashMap))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return usersVector
}


                @Throws(Exception::class)
            
    open fun getUser(userName: String)
        //nullable = true from not(false or (false and false)) = true
: UserInterface{
var userName = userName

    var row: HashMap<Any, Any> = HashMap<Any, Any>()

row.put(UserData.USERNAME, userName)

    var userHashMap: HashMap<Any, Any> = super.getRow(row)!!


    
                        if(userHashMap != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CreateUserFactory.getInstance(userHashMap)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


    open fun deleteWhere(key: String, value: String)
        //nullable = true from not(false or (false and false)) = true
{
var key = key
var value = value

        try {
            super.deleteWhere(key, value)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "deleteWhere")

                                    }
                                
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "deleteWhere", e)

                                    }
                                
}

}


    open fun login(userName: String, password: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var userName = userName
var password = password

        try {
            
    var isUserNameAndPasswordCorrect: Int = 0


    var result: String = super.getField(UserData.USERNAME, userName, UserData.PASSWORD)!!


    var encryption: String = super.getField(UserData.USERNAME, userName, EntryData.getInstance()!!.ENCRYPTION)!!


    
                        if(encryption != 
                                    null
                                 && encryption.compareTo(this.stringUtil!!.EMPTY_STRING) != 0)
                        isUserNameAndPasswordCorrect= result.compareTo(SuperCrypt(Integer(encryption).
                            toInt()).
                            encrypt(password))
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Command Success but login failed for user: " +userName +" because user did not exist", this, "login")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GLOBALS2.LOGINFAILED

                        }
                            

    
                        if(isUserNameAndPasswordCorrect == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(COMMAND_SUCCESS_FOR_USER)
stringBuffer!!.append(userName)
stringBuffer!!.append(PASSWORD_LABEL)
stringBuffer!!.append(password)
stringBuffer!!.append(EQUALS)
stringBuffer!!.append(result)
logUtil!!.put(stringBuffer!!.toString(), this, "login")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GLOBALS2.LOGINSUCCESS

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(COMMAND_SUCCESS_BUT_LOGIN_FAILED)
stringBuffer!!.append(userName)
stringBuffer!!.append(INVALID_PASSWORD_LABEL)
stringBuffer!!.append(SuperCrypt(Integer(encryption).
                            toInt()).
                            encrypt(password))
stringBuffer!!.append(NOT_EQUAL)
stringBuffer!!.append(result)
stringBuffer!!.append(END_QUOTES)
logUtil!!.put(stringBuffer!!.toString(), this, "login")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GLOBALS2.LOGINFAILED

                        }
                            
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "login", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error"
}

}


    open fun update(userName: String, updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
var userName = userName
var updatedValues = updatedValues
super.updateWhere(UserData.USERNAME, userName, updatedValues)
}


    open fun dropTables()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


    open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{

    var entryData: EntryData = EntryData.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)!!.append(UserData.USERNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(UserData.PREFIXNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.FIRSTNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.LASTNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.MIDDLENAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.SUFFIXNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.COMPANY)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.POSITIONATCOMPANY)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.MAINEMAIL)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(UserData.SECONDARYEMAIL)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.HOMEPHONE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.CELLPHONE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.WORKPHONE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.OTHERCONTACT)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.ELECTRONICDEVICE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.FAX)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserRoleData.NAME.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(UserData.CONFIGURATION)!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)!!.append(UserData.PERMISSIONS)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(entryData!!.ENCRYPTION)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(UserData.SECRET)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(UserData.PASSWORD)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(entryData!!.ENABLE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(entryData!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(entryData!!.LASTMODIFIED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(UserData.USERNAME)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


}
                
            

