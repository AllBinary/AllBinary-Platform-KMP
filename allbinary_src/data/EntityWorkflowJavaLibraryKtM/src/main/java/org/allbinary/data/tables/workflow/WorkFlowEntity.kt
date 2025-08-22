
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
        package org.allbinary.data.tables.workflow




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.DynamicObjectData
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.control.workflow.DbWorkFlowFactory
import org.allbinary.logic.control.workflow.WorkFlowData
import org.allbinary.logic.control.workflow.WorkFlowInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class WorkFlowEntity : AbSqlBean
                , WorkFlowEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    val tableName: String = "workflows"

    private val METHOD_GET: String = "get()"

    private val METHOD_UPDATE: String = "update"
public constructor        ()                        

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


open fun delete(name: String, storeName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name


                    var storeName = storeName

        try {
            
    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(WorkFlowData.getInstance()!!.NAME, name)
keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeName)
super.deleteWhere(keysAndValues)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, commonStrings!!.delete)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.delete, e)

                                    }
                                
}

}


                @Throws(Exception::class, LicensingException::class)
            
open fun get(name: String, storeName: String)
        //nullable = true from not(false or (false and false)) = true
: WorkFlowInterface{

                    var name = name


                    var storeName = storeName

        try {
            
    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(WorkFlowData.getInstance()!!.NAME, name)
keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeName)

    var hashMap: HashMap<Any, Any> = super.getRow(keysAndValues)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DbWorkFlowFactory.getInstance()!!.getInstance(abeClientInformation, hashMap) as WorkFlowInterface
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, METHOD_GET, e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, METHOD_GET, e)

                                    }
                                



                            throw e
}

}


open fun get(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var storeName = storeName

        try {
            
    var workFlowsVector: Vector = Vector()


    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeName)

    var hashMapVector: Vector = super.getRows(keysAndValues)!!


    var size: Int = hashMapVector!!.size!!





                        for (i in 0 until size)


        {
    var workFlowHashMap: HashMap<Any, Any> = hashMapVector!!.get(i as Object) as HashMap<Any, Any>


    
                        if(workFlowHashMap != 
                                    null
                                )
                        
                                    {
                                    workFlowsVector!!.add(DbWorkFlowFactory.getInstance()!!.getInstance(abeClientInformation, workFlowHashMap))

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return workFlowsVector
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, this.METHOD_GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var updatedValues = updatedValues

        try {
            
    var wherekeysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

wherekeysAndValues!!.put(WorkFlowData.getInstance()!!.NAME, updatedValues!!.get(WorkFlowData.getInstance()!!.NAME) as String)
wherekeysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, updatedValues!!.get(StoreFrontData.getInstance()!!.NAME) as String)
super.updateWhere(wherekeysAndValues, updatedValues)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, METHOD_UPDATE, e)

                                    }
                                
}

}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var workFlowData: WorkFlowData = WorkFlowData.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)!!.append(workFlowData!!.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(StoreFrontData.getInstance()!!.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(DynamicObjectData.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(workFlowData!!.DATA)!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)!!.append(EntryData.getInstance()!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(EntryData.getInstance()!!.LASTMODIFIED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(workFlowData!!.NAME)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            

