
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
        package org.allbinary.data.tables.user.address




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.user.UserData
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.address.StreetAddressData
import org.allbinary.data.tables.TableDataFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class StreetAddressesEntity : AbSqlBean
                , StreetAddressesEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var userName: String
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (userName: String)                        

                            : super(UserDbInitInfo()){

                    var userName = userName


                            //For kotlin this is before the body of the constructor.
                    
this.userName= userName
}


open fun remove(index: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index

        try {
            
    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(UserData.USERNAME, userName)
whereHashMap!!.put(StreetAddressData.ID, index.toString() as String)
super.deleteWhere(whereHashMap)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "remove")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "remove", e)

                                    }
                                
}

}


open fun add(address: StreetAddress)
        //nullable = true from not(false or (false and false)) = true
{

                    var address = address
this.add(address, TableDataFactory.getInstance()!!.INTEGER_MAX_VALUE_STRING)
}


open fun add(address: StreetAddress, index: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var address = address


                    var index = index

        try {
            
    var values: Vector = Vector()

values.add(index)
values.add(userName)
values.add(StringUtil.getInstance()!!.EMPTY_STRING)
values.add(address.getName())
values.add(address.getStreet())
values.add(address.getCity())
values.add(address.getState())
values.add(address.getCode())
values.add(address.getCountry())

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.add(time)
super.insert(values)
this.setDefault(getLastId())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "add")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "add", e)

                                    }
                                
}

}


open fun update(address: StreetAddress)
        //nullable = true from not(false or (false and false)) = true
{

                    var address = address

        try {
            
    var addressHashMap: HashMap<Any, Any> = address.toHashMap()!!
            


    var whereKeyValuePairs: HashMap<Any, Any> = HashMap<Any, Any>()

whereKeyValuePairs!!.put(StreetAddressData.ID, address.getId())
whereKeyValuePairs!!.put(UserData.USERNAME, this.userName)
super.updateWhere(whereKeyValuePairs, addressHashMap)
this.setDefault(address.getId())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "update")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "add", e)

                                    }
                                
}

}


open fun getLastId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getLargestIntegerInColumnWhere(StreetAddressData.ID, UserData.USERNAME, userName)
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Vector{
        try {
            
    var streetAddressVector: Vector = Vector()


    var keyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

keyAndValue!!.put(UserData.USERNAME, userName)

    var addressList: Vector = super.getRows(keyAndValue)!!
            


    var size: Int = addressList!!.size!!
            





                        for (index in 0 until size)


        {
    var addressHashMap: HashMap<Any, Any> = addressList!!.get(index) as HashMap<Any, Any>


    var streetAddress: StreetAddress = StreetAddress(addressHashMap)


    
                        if(streetAddress != 
                                    null
                                )
                        
                                    {
                                    streetAddressVector!!.add(streetAddress)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return streetAddressVector
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun get(index: Integer)
        //nullable = true from not(false or (false and false)) = true
: StreetAddress{

                    var index = index

        try {
            
    var keyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

keyAndValue!!.put(UserData.USERNAME, userName)
keyAndValue!!.put(StreetAddressData.ID, index.toString())

    var addressHashMap: HashMap<Any, Any> = super.getRow(keyAndValue)!!
            


    
                        if(addressHashMap != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StreetAddress(addressHashMap)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getDefault()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress{
        try {
            
    var addressHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var updateKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

updateKeyAndValue!!.put(StreetAddressData.DEFAULT, StreetAddressData.DEFAULT)
updateKeyAndValue!!.put(UserData.USERNAME, userName)
addressHashMap= super.getRow(updateKeyAndValue)

    
                        if(addressHashMap != 
                                    null
                                )
                        
                                    {
                                    
    var streetAddress: StreetAddress = StreetAddress(addressHashMap)


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "getDefault")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return streetAddress

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(
                            "No Default Address Found", this, 
                            "getDefault")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "getDefault", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun setDefault(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

        try {
            
    var updateKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()


    var whereKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

whereKeyAndValue!!.put(UserData.USERNAME, userName)

    var streetAddress: StreetAddress = getDefault()!!
            


    
                        if(streetAddress != 
                                    null
                                )
                        
                                    {
                                    updateKeyAndValue!!.put(StreetAddressData.DEFAULT, StringUtil.getInstance()!!.EMPTY_STRING)
whereKeyAndValue!!.put(StreetAddressData.ID, streetAddress!!.getId())
super.updateWhere(whereKeyAndValue, updateKeyAndValue)

                                    }
                                
whereKeyAndValue!!.put(StreetAddressData.ID, value)
updateKeyAndValue!!.put(StreetAddressData.DEFAULT, StreetAddressData.DEFAULT)
super.updateWhere(whereKeyAndValue, updateKeyAndValue)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "setDefault")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "setShippingAddress", e)

                                    }
                                
}

}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(this.getTableName())!!.append(this.sqlStrings!!.START)!!.append(StreetAddressData.ID)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_AUTO_INCREMENT_NOT_NULL)!!.append(UserData.USERNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(StreetAddressData.DEFAULT)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(StreetAddressData.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(StreetAddressData.STREET)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(StreetAddressData.CITY)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(StreetAddressData.STATE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(StreetAddressData.CODE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(StreetAddressData.COUNTRY)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(EntryData.getInstance()!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(StreetAddressData.ID)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            

