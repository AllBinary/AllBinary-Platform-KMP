
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
        package org.allbinary.business.init.db




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class DbConnectionInfo
            : Object
        
                , DatabaseConnectionInfoInterface {
        

    private var jdbcDriver: String

    private var name: String

    private var userName: String

    private var password: String

    private var schema: String

    private var server: String

    private var port: String

    private var url: String

    private var host: String

    private val SCHEMA_SEP: String = "://"

    private val USER_NAME_KEY: String = "?user="

    private val PASSWORD_KEY: String = "&password="
public constructor ()
            : super()
        {
}


    open fun updateUrl()
        //nullable = true from not(false or (false and true)) = true
{
this.updateHost()

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getHost())
stringBuffer!!.append(this.getName())
stringBuffer!!.append(this.getUserNameKey())
stringBuffer!!.append(this.getUserName())
stringBuffer!!.append(this.getPasswordKey())
stringBuffer!!.append(this.getPassword())
this.url= stringBuffer!!.toString()
}


    open fun getUrl()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return url
}


    open fun getJdbcDriver()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.jdbcDriver
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


    open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


    open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.password
}


    open fun updateHost()
        //nullable = true from not(false or (false and true)) = true
{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getSchema())
stringBuffer!!.append(this.SCHEMA_SEP)
stringBuffer!!.append(this.getServer())

    
                        if(this.getPort() != 
                                    null
                                 && this.getPort()!!.length() > 1)
                        
                                    {
                                    stringBuffer!!.append(CommonSeps.getInstance()!!.COLON)
stringBuffer!!.append(this.getPort())

                                    }
                                
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
this.host= stringBuffer!!.toString()
}


    open fun getHost()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.host
}


    open fun getSchema()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.schema
}


    open fun getServer()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.server
}


    open fun getPort()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.port
}


    open fun setJdbcDriver(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.jdbcDriver= value
}


    open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.name= value
this.updateUrl()
}


    open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.userName= value
this.updateUrl()
}


    open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.password= value
this.updateUrl()
}


    open fun setSchema(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.schema= value
this.updateUrl()
}


    open fun setServer(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.server= value
this.updateUrl()
}


    open fun setPort(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.port= value
this.updateUrl()
}


    open fun getUserNameKey()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return USER_NAME_KEY
}


    open fun getPasswordKey()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PASSWORD_KEY
}


}
                
            

