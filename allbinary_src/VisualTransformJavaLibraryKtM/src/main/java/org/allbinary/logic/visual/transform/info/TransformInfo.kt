
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
        package org.allbinary.logic.visual.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.Encoder
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.OutputTypeData
import org.allbinary.logic.io.path.AbFilePath
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.info.data.TransformInfoDataData
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfig
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigAndManipulatorFactory
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface
import org.allbinary.logic.visual.transform.info.template.TransformInfoTemplateData
import org.allbinary.logic.visual.transform.info.viewObject.TransformInfoObjectData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document

open public class TransformInfo
            : Object
        
                , TransformInfoInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    private var isChild: Boolean = false

    private var name: String

    private var storeName: String

    private var objectFileName: String

    private var anyType: Any

    private var objectConfigFileName: String

    private var objectConfigInterface: TransformInfoObjectConfigInterface

    private var template: String

    private var templateFileName: String

    private var dataFileName: String

    private var data: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        ()
            : super()
        {}

public constructor        (name: String)
            : super()
        {

                    var name = name
this.setName(name)
}

public constructor        (name: String, objectFileName: String, objectConfigFileName: String, templateFileName: String, dataFileName: String)
            : super()
        {

                    var name = name


                    var objectFileName = objectFileName


                    var objectConfigFileName = objectConfigFileName


                    var templateFileName = templateFileName


                    var dataFileName = dataFileName
this.setName(name)
this.setObjectFile(objectFileName)
this.setObjectConfigFile(objectConfigFileName)
this.setTemplateFile(templateFileName)
this.setDataFile(dataFileName)
}


                @Throws(Exception::class)
            
open fun override(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap

    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    var aName: String = hashMap!!.get(transformInfoData!!.NAME) as String


    
                        if(!stringValidationUtil!!.isEmpty(aName))
                        
                                    {
                                    this.name= aName

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TransformInfo properties overridden for: ")
stringBuffer!!.append(this.getName())
stringBuffer!!.append("\n properties: ")
stringBuffer!!.append(hashMap!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "override(HashMap hashMap)")

                                    }
                                

    var aStoreName: String = hashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    
                        if(!stringValidationUtil!!.isEmpty(aStoreName))
                        
                                    {
                                    this.storeName= aStoreName

                                    }
                                

    var aObjectFileName: String = hashMap!!.get(transformInfoData!!.OBJECTFILENAME) as String


    
                        if(!stringValidationUtil!!.isEmpty(aObjectFileName))
                        
                                    {
                                    this.objectFileName= aObjectFileName

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(this.storeName)
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)

    var fileAbPath: AbPath = AbPath(stringBuffer!!.toString())


    var aObject: String = hashMap!!.get(transformInfoData!!.OBJECT) as String


    
                        if(!stringValidationUtil!!.isEmpty(aObject))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TransformInfo override view Object for: " +this.getName(), this, "override(HashMap hashMap)")

                                    }
                                

    var fileDataString: String = CryptFileReader(TransformInfoObjectData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoObjectData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(AbPath(fileAbPath!!.toString(), aObject))!!


    
                        if(fileDataString != 
                                    null
                                )
                        
                                    {
                                    this.anyType= fileDataString

                                    }
                                

                                    }
                                

    
                        if(!stringValidationUtil!!.isEmpty(hashMap!!.get(transformInfoData!!.OBJECTCONFIG) as String))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TransformInfo override ObjectConfig for: " +this.getName(), this, "override(HashMap hashMap)")

                                    }
                                
this.setObjectConfig(hashMap!!.get(transformInfoData!!.OBJECTCONFIG) as String)

                                    }
                                

    var objectConfigFileName: String = hashMap!!.get(transformInfoData!!.OBJECTCONFIGFILENAME) as String


    
                        if(!stringValidationUtil!!.isEmpty(objectConfigFileName))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TransformInfo override ObjectConfig File for: " +this.getName(), this, "override(HashMap hashMap)")

                                    }
                                
this.setObjectConfigFile(objectConfigFileName)

                                    }
                                

    var type: String = hashMap!!.get(OutputTypeData.getInstance()!!.NAME) as String


    
                        if(!stringValidationUtil!!.isEmpty(type))
                        
                                    {
                                    
    
                        if(this.getObjectConfigInterface() == 
                                    null
                                )
                        
                                    {
                                    this.setObjectConfigInterface(TransformInfoObjectConfig(this))

                                    }
                                
this.getObjectConfigInterface()!!.setOutputTypeName(type)

                                    }
                                

    var aTemplateFileName: String = hashMap!!.get(transformInfoData!!.TEMPLATEFILENAME) as String


    
                        if(!stringValidationUtil!!.isEmpty(aTemplateFileName))
                        
                                    {
                                    this.templateFileName= aTemplateFileName

                                    }
                                

    var aTemplate: String = hashMap!!.get(transformInfoData!!.TEMPLATE) as String


    
                        if(!stringValidationUtil!!.isEmpty(aTemplate))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TransformInfo override Template for: " +this.getName(), this, "override(HashMap hashMap)")

                                    }
                                

    var fileDataString: String = CryptFileReader(TransformInfoTemplateData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoTemplateData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(AbPath(fileAbPath!!.toString(), aTemplate))!!


    
                        if(!stringValidationUtil!!.isEmpty(fileDataString))
                        
                                    {
                                    this.template= fileDataString

                                    }
                                

                                    }
                                

    var aDataFileName: String = hashMap!!.get(transformInfoData!!.DATAFILENAME) as String


    
                        if(!stringValidationUtil!!.isEmpty(aDataFileName))
                        
                                    {
                                    this.dataFileName= aDataFileName

                                    }
                                

    var aData: String = hashMap!!.get(transformInfoData!!.DATA) as String


    
                        if(!stringValidationUtil!!.isEmpty(aData))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TransformInfo override Data for: " +this.getName(), this, "override(HashMap hashMap)")

                                    }
                                

    var fileDataString: String = CryptFileReader(TransformInfoDataData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoDataData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(AbPath(fileAbPath!!.toString(), aData))!!


    
                        if(!stringValidationUtil!!.isEmpty(fileDataString))
                        
                                    {
                                    this.data= fileDataString

                                    }
                                

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    stringBuffer= StringMaker()
stringBuffer!!.append("Name: ")
stringBuffer!!.append(aName)
stringBuffer!!.append("\nTemp Object File: ")
stringBuffer!!.append(aObject)
stringBuffer!!.append("\nTemp Object Config File: ")
stringBuffer!!.append(this.getObjectConfigFilePath()!!.toString())
stringBuffer!!.append("\nTemp Template File: ")
stringBuffer!!.append(aTemplate)
stringBuffer!!.append("\nTemp Data File: ")
stringBuffer!!.append(aData)
stringBuffer!!.append("\nStore Name: ")
stringBuffer!!.append(aStoreName)
stringBuffer!!.append("\nObjectFile: ")
stringBuffer!!.append(this.getObjectFile())
stringBuffer!!.append("->TransformInfo")
logUtil!!.put(stringBuffer!!.toString(), this, "TransformInfoInterface(HashMap)")

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put(this.log(), this, "override")

                                    }
                                
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Name: ")
stringBuffer!!.append(this.name)
stringBuffer!!.append("\nObject File: ")
stringBuffer!!.append(this.objectFileName)
stringBuffer!!.append("\nObject Config File Path: ")
stringBuffer!!.append(this.getObjectConfigFile())
stringBuffer!!.append("\nTemplate File: ")
stringBuffer!!.append(this.templateFileName)
stringBuffer!!.append("\nData File: ")
stringBuffer!!.append(this.dataFileName)
stringBuffer!!.append("\nStore Name: ")
stringBuffer!!.append(this.storeName)
stringBuffer!!.append("\n")
stringBuffer!!.append(this.getObjectFile())
stringBuffer!!.append("->TransformInfo")
stringBuffer!!.append("TransformInfoInterface(HashMap)")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.name= value
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeName= value
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeName
}


open fun setObject(anyType: Object)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
this.anyType= anyType
}


open fun setObjectFile(value: Object)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.objectFileName= value
}


open fun setTemplate(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.template= value
}


open fun setTemplateFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.templateFileName= value
}


                @Throws(Exception::class)
            
open fun setObjectConfigFileName(value: Object)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.objectConfigFileName= value
}


                @Throws(Exception::class)
            
open fun setObjectConfigFile(value: Object)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.objectConfigFileName= value
this.setObjectConfigInterface(TransformInfoObjectConfigAndManipulatorFactory.getInstance()!!.getInstance(abeClientInformation, this, this.getObjectConfigFilePath()))
}


                @Throws(Exception::class)
            
open fun setObjectConfig(value: Object)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

    var document: Document = DomDocumentHelper.create(value)!!

this.setObjectConfigInterface(TransformInfoObjectConfigAndManipulatorFactory.getInstance()!!.getInstance(abeClientInformation, this, document))
}


open fun setDataFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.dataFileName= value
}


open fun setData(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.data= value
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getObject()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.anyType
}


open fun getObjectFile()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.objectFileName
}


open fun getTemplate()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.template
}


open fun getTemplateFile()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.templateFileName
}


                @Throws(Exception::class)
            
open fun getTemplateFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFilePath(this.getTemplateFile())
}


                @Throws(Exception::class)
            
open fun getObjectConfigFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFilePath(this.getObjectConfigFile())
}


                @Throws(Exception::class)
            
open fun getDataFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFilePath(this.getDataFile())
}


open fun getObjectConfigFile()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.objectConfigFileName
}


open fun getData()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    var dataFileString: String = this.getDataFile()!!


    
                        if(!stringValidationUtil!!.isEmpty(dataFileString))
                        
                                    {
                                    
        try {
            
    var fileData: String = CryptFileReader(TransformInfoDataData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoDataData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(this.getDataFilePath())!!


    
                        if(!stringValidationUtil!!.isEmpty(this.data))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Data File overriding existing data: " +this.getDataFilePath(), this, "getData()")

                                    }
                                

                                    }
                                
this.data= fileData
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Could Not Load Data from: " +this.getDataFile(), this, "getData()", e)

                                    }
                                
}


                                    }
                                

        try {
            
    
                        if(!stringValidationUtil!!.isEmpty(this.data))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Data: " +DomDocumentHelper.toString(DomDocumentHelper.create(data)), this, "getData()")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Name: ")
stringBuffer!!.append(this.name)
stringBuffer!!.append("\nEmpty Data For: ")
stringBuffer!!.append(dataFileString)
stringBuffer!!.append("\nPath: ")
stringBuffer!!.append(this.getDataFilePath()!!.toFileSystemString())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(stringBuffer!!.toString(), this, "getData()")

                                    }
                                

                                    }
                                

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Could Not Preview Data: " +this.data, this, "getData()", e)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.data
}


                @Throws(Exception::class)
            
open fun getDataDocument()
        //nullable = true from not(false or (false and true)) = true
: Document{
    var localData: String = this.getData()!!


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    
                        if(stringValidationUtil!!.isEmpty(localData))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("No Data So Creating New Document", this, "getDataDocument()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomDocumentHelper.create()

                                    }
                                
                        else {
                            
    var document: Document = DomDocumentHelper.create(localData)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document

                        }
                            
}


open fun getDataFile()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.dataFileName
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(transformInfoData!!.NAME, this.name)
hashMap!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)
hashMap!!.put(transformInfoData!!.OBJECTFILENAME, this.objectFileName)
hashMap!!.put(transformInfoData!!.OBJECT, this.anyType)
hashMap!!.put(transformInfoData!!.OBJECTCONFIGFILENAME, this.getObjectConfigFile())
hashMap!!.put(transformInfoData!!.OBJECTCONFIG, Encoder.encode(this.getObjectConfigInterface()!!.toString()!!.encodeToByteArray()))
hashMap!!.put(transformInfoData!!.TEMPLATEFILENAME, this.templateFileName)
hashMap!!.put(transformInfoData!!.TEMPLATE, this.template)
hashMap!!.put(transformInfoData!!.DATAFILENAME, this.dataFileName)
hashMap!!.put(transformInfoData!!.DATA, Encoder.encode(this.data.encodeToByteArray()))

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

hashMap!!.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: java.util.Vector{
    var vector: Vector = Vector()

vector.add(this.name)
vector.add(this.storeName)
vector.add(this.objectFileName)
vector.add(this.anyType)
vector.add(this.getObjectConfigFile())
vector.add(Encoder.encode(this.getObjectConfigInterface()!!.toString()!!.encodeToByteArray()))
vector.add(this.templateFileName)
vector.add(this.template)
vector.add(this.dataFileName)
vector.add(Encoder.encode(this.data.encodeToByteArray()))

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

vector.add(time)
vector.add(time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getName() as Object
}


open fun setChild()
        //nullable = true from not(false or (false and true)) = true
{this.isChild= true
}


open fun isChild()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isChild
}


open fun getObjectConfigInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoObjectConfigInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return objectConfigInterface
}


open fun setObjectConfigInterface(objectConfigInterface: Object)
        //nullable = true from not(false or (false and false)) = true
{

                    var objectConfigInterface = objectConfigInterface
this.objectConfigInterface= objectConfigInterface
}


}
                
            

