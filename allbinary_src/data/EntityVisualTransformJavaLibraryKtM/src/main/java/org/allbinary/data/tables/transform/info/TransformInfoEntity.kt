
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
        package org.allbinary.data.tables.transform.info



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.control.crypt.Encoder
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoFactoryInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigAndManipulatorFactoryBase
import org.allbinary.logic.visual.transform.info.objectConfig.generator.TransformInfoObjectConfigGeneratorFactoryInterface

open public class TransformInfoEntity : AbSqlBean
                , TransformInfoEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val tableName: String = "transforminfo"

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            

    private val transformInfoFactoryInterface: TransformInfoFactoryInterface

    private val transformInfoObjectConfigAndManipulatorFactoryInterface: TransformInfoObjectConfigAndManipulatorFactoryBase

    private val transformInfoObjectConfigGeneratorFactoryInterface: TransformInfoObjectConfigGeneratorFactoryInterface
public constructor        (transformInfoObjectConfigGeneratorFactoryInterface: TransformInfoObjectConfigGeneratorFactoryInterface, transformInfoObjectConfigAndManipulatorFactoryInterface: TransformInfoObjectConfigAndManipulatorFactoryBase, transformInfoFactoryInterface: TransformInfoFactoryInterface)                        

                            : super(UserDbInitInfo()){

                    var transformInfoObjectConfigGeneratorFactoryInterface = transformInfoObjectConfigGeneratorFactoryInterface


                    var transformInfoObjectConfigAndManipulatorFactoryInterface = transformInfoObjectConfigAndManipulatorFactoryInterface


                    var transformInfoFactoryInterface = transformInfoFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
this.transformInfoObjectConfigGeneratorFactoryInterface= transformInfoObjectConfigGeneratorFactoryInterface
this.transformInfoObjectConfigAndManipulatorFactoryInterface= transformInfoObjectConfigAndManipulatorFactoryInterface
this.transformInfoFactoryInterface= transformInfoFactoryInterface
}


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var values = values

        try {
            super.insert(values)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, INSERT)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, INSERT, e)

                                    }
                                
}

}


open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

        try {
            super.deleteWhere(TransformInfoData.getInstance()!!.NAME, value)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, commonStrings!!.delete)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.delete, e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun get(name: String, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable = true from not(false or (false and false)) = true
: TransformInfoInterface{

                    var name = name


                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext

    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!
            


    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(transformInfoData!!.NAME, name)

    var hashMap: HashMap<Any, Any> = super.getRow(keysAndValues)!!
            


    
                        if(hashMap != 
                                    null
                                )
                        
                                    {
                                    
    var anyType: Any = hashMap!!.get(transformInfoData!!.OBJECTCONFIG)!!
            


    
                        if(anyType != 
                                    null
                                )
                        
                                    {
                                    
    var string: String = anyType as String

hashMap!!.put(transformInfoData!!.OBJECTCONFIG, decode.toCharArray().concatToString())

                                    }
                                

    var objectData: Any = hashMap!!.get(transformInfoData!!.DATA)!!
            


    
                        if(objectData != 
                                    null
                                )
                        
                                    {
                                    
    var string: String = objectData as String

hashMap!!.put(transformInfoData!!.DATA, decode.toCharArray().concatToString())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformInfoFactoryInterface!!.getInstance(hashMap, propertiesHashMap, pageContext)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


                @Throws(Exception::class)
            
open fun getObjectConfigs(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var storeName = storeName

    var objectConfigVector: Vector = Vector()


    var objectConfigColumnVector: Vector = this.getColumnWhere(TransformInfoData.getInstance()!!.OBJECTCONFIG, StoreFrontData.getInstance()!!.NAME, storeName)!!
            


    var size: Int = objectConfigColumnVector!!.size!!
            





                        for (i in 0 until size)


        {
    var objectConfigString: String = objectConfigColumnVector!!.get(i) as String

objectConfigString= decode.toCharArray().concatToString()
objectConfigVector!!.add(this.transformInfoObjectConfigAndManipulatorFactoryInterface!!.getInstance(abeClientInformation, this as TransformInfoInterface, DomDocumentHelper.create(objectConfigString)))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return objectConfigVector
}


                @Throws(Exception::class)
            
open fun getNames(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var storeName = storeName

    var viewNameVector: Vector = Vector()


    var columnVector: Vector = this.getColumnWhere(TransformInfoData.getInstance()!!.NAME, StoreFrontData.getInstance()!!.NAME, storeName)!!
            


    var size: Int = columnVector!!.size!!
            





                        for (i in 0 until size)


        {
    var viewNameString: String = columnVector!!.get(i) as String

viewNameVector!!.add(viewNameString)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewNameVector
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(tableName)
stringBuffer!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(transformInfoData!!.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(StoreFrontData.getInstance()!!.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.OBJECTFILENAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.OBJECT)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.OBJECTCONFIGFILENAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.OBJECTCONFIG)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.TEMPLATEFILENAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.TEMPLATE)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.DATAFILENAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(transformInfoData!!.DATA)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.LASTMODIFIED)
stringBuffer!!.append(EntryData.getInstance()!!.TIMECREATED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(this.sqlStrings!!.PRIMARY_KEY)
stringBuffer!!.append(transformInfoData!!.NAME)
stringBuffer!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var updatedValues = updatedValues
super.updateWhere(TransformInfoData.getInstance()!!.NAME, updatedValues!!.get(TransformInfoData.getInstance()!!.NAME) as String, updatedValues)
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            

