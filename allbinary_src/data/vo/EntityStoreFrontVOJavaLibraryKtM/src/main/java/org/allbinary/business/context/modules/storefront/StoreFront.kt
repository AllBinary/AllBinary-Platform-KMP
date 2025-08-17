
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
        package org.allbinary.business.context.modules.storefront




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.context.configuration.ContextConfiguration
import org.allbinary.business.context.configuration.ContextConfigurationDomDocumentMapping
import org.allbinary.business.context.configuration.ContextConfigurationInterface
import org.allbinary.business.context.configuration.ContextConfigurationInterfaceFactory
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.UserData
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.io.path.AbPathUtil
import org.allbinary.logic.string.SpecialCharacterUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.apache.commons.lang3.StringEscapeUtils
import org.w3c.dom.Document

open public class StoreFront
            : Object
        
                , StoreFrontInterface {
        

        companion object {
            
    private val RESOURCES: String = " Resources" +AbPathData.getInstance()!!.SEPARATOR

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val directory: Directory = Directory.getInstance()!!
            

    private val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    private val abPathUtil: AbPathUtil = AbPathUtil.getInstance()!!
            

    private var name: String = stringUtil!!.EMPTY_STRING

    private var basketName: String = stringUtil!!.EMPTY_STRING

    private var homeHostName: String = stringUtil!!.EMPTY_STRING

    private var homeHostNamePath: AbPath = abPathUtil!!.NO_ABPATH

    private var hostName: String = stringUtil!!.EMPTY_STRING

    private var hostNamePath: AbPath = abPathUtil!!.NO_ABPATH

    private var testHomeHostName: String = stringUtil!!.EMPTY_STRING

    private var testHomeHostNamePath: AbPath = abPathUtil!!.NO_ABPATH

    private var testHostName: String = stringUtil!!.EMPTY_STRING

    private var testHostNamePath: AbPath = abPathUtil!!.NO_ABPATH

    private var imagePath: AbPath = abPathUtil!!.NO_ABPATH

    private var staticPath: AbPath = abPathUtil!!.NO_ABPATH

    private var categoryPath: AbPath = abPathUtil!!.NO_ABPATH

    private var inventoryControl: String = stringUtil!!.EMPTY_STRING

    private var contextConfigurationInterface: ContextConfigurationInterface

    private var subStores: String = stringUtil!!.EMPTY_STRING

    private var tagLocation: String = stringUtil!!.EMPTY_STRING

    private var packageLocation: String = stringUtil!!.EMPTY_STRING

    private var ftp: String = stringUtil!!.EMPTY_STRING

    private var ftpPath: AbPath = abPathUtil!!.NO_ABPATH

    private var ftpUserName: String = stringUtil!!.EMPTY_STRING

    private var ftpPassword: String = stringUtil!!.EMPTY_STRING

    private var testFtp: String = stringUtil!!.EMPTY_STRING

    private var testFtpPath: AbPath = abPathUtil!!.NO_ABPATH

    private var testFtpUserName: String = stringUtil!!.EMPTY_STRING

    private var testFtpPassword: String = stringUtil!!.EMPTY_STRING

    private var timeCreated: String = stringUtil!!.EMPTY_STRING

    private var lastModified: String = stringUtil!!.EMPTY_STRING

    private val MINCHAR: Int = 0

    private val MINSTORENAMELENGTH: Int = 1

    private val MAXCHAR: Int = 255

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val ONE_EMPTY_STRING_ARRAY: Array<String?> = StringUtil.getInstance()!!.ONE_EMPTY_STRING_ARRAY
public constructor        ()
            : super()
        {this.contextConfigurationInterface= ContextConfiguration()
}

public constructor        (request: HttpServletRequest)
            : super()
        {

                    var request = request
this.getFormData(RequestParams(request).
                            toHashMap())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("TWB- needs update for adding and updating context configuration - currently defaults to admin context config", this, "StoreFront")

                                    }
                                
this.setContextConfigurationInterface(ContextConfigurationInterfaceFactory.getInstance()!!.getInstance("Admin"))
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.getFormData(hashMap)

    var domDocumentString: String = hashMap!!.get(StoreFrontData.getInstance()!!.CONFIGURATION) as String


    
                        if(domDocumentString == 
                                    null
                                )
                        
                                    {
                                    
    var document: Document = DomDocumentHelper.create(domDocumentString)!!
            

this.setContextConfigurationInterface(ContextConfigurationInterfaceFactory.getInstance()!!.getInstance(document))

                                    }
                                
}


open fun isColumn(columnName: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var columnName = columnName

    
                        if(columnName!!.compareTo(StoreFrontData.getInstance()!!.NAME) == 0 || columnName!!.compareTo(UserData.MAINEMAIL) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
open fun createPath(key: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: AbPath{

                    var key = key


                    var hashMap = hashMap



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.create(EMPTY_STRING, key, hashMap))
}


                @Throws(Exception::class)
            
open fun createPath(append: String, key: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: AbPath{

                    var append = append


                    var key = key


                    var hashMap = hashMap



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.create(append, key, hashMap))
}


open fun get(key: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var key = key


                    var hashMap = hashMap



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.create(EMPTY_STRING, key, hashMap)
}


open fun create(append: String, key: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var append = append


                    var key = key


                    var hashMap = hashMap

    var path: String = hashMap!!.get(key as Object) as String


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(path))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EMPTY_STRING

                                    }
                                
                        else {
                            
    
                        if(this.isColumn(path))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap!!.get(path as Object) as String +append

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path

                        }
                            

                        }
                            
}


                @Throws(Exception::class)
            
open fun getFormData(storeHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var storeHashMap = storeHashMap

    var storeFrontData: StoreFrontData = StoreFrontData.getInstance()!!
            

this.name= storeHashMap!!.get(storeFrontData!!.NAME) as String
this.basketName= storeHashMap!!.get(storeFrontData!!.NAME) as String
this.homeHostName= storeHashMap!!.get(storeFrontData!!.HOMEHOSTNAME) as String
this.homeHostNamePath= this.createPath(storeFrontData!!.HOMEHOSTNAMEPATH, storeHashMap)
this.hostName= storeHashMap!!.get(storeFrontData!!.HOSTNAME) as String
this.hostNamePath= this.createPath(storeFrontData!!.HOSTNAMEPATH, storeHashMap)
this.testHomeHostName= storeHashMap!!.get(storeFrontData!!.TESTHOMEHOSTNAME) as String
this.testHomeHostNamePath= this.createPath(storeFrontData!!.TESTHOMEHOSTNAMEPATH, storeHashMap)
this.testHostName= storeHashMap!!.get(storeFrontData!!.TESTHOSTNAME) as String
this.testHostNamePath= this.createPath(storeFrontData!!.TESTHOSTNAMEPATH, storeHashMap)
this.imagePath= this.createPath(RESOURCES, storeFrontData!!.IMAGEPATH, storeHashMap)
this.staticPath= this.createPath(" Products" +AbPathData.getInstance()!!.SEPARATOR, storeFrontData!!.STATICPATH, storeHashMap)
this.categoryPath= this.createPath(RESOURCES, storeFrontData!!.CATEGORYPATH, storeHashMap)
this.inventoryControl= storeHashMap!!.get(storeFrontData!!.INVENTORYCONTROL) as String
this.subStores= storeHashMap!!.get(storeFrontData!!.SUBSTORES) as String
this.tagLocation= storeHashMap!!.get(storeFrontData!!.TAGLOCATION) as String
this.packageLocation= storeHashMap!!.get(storeFrontData!!.PACKAGELOCATION) as String
this.ftp= storeHashMap!!.get(storeFrontData!!.FTP) as String
this.ftpPath= this.createPath(storeFrontData!!.FTPPATH, storeHashMap)
this.ftpUserName= storeHashMap!!.get(storeFrontData!!.FTPUSERNAME) as String
this.ftpPassword= storeHashMap!!.get(storeFrontData!!.FTPPASSWORD) as String
this.testFtp= storeHashMap!!.get(storeFrontData!!.TESTFTP) as String
this.testFtpPath= this.createPath(storeFrontData!!.TESTFTPPATH, storeHashMap)
this.testFtpUserName= storeHashMap!!.get(storeFrontData!!.TESTFTPUSERNAME) as String
this.testFtpPassword= storeHashMap!!.get(storeFrontData!!.TESTFTPPASSWORD) as String
this.timeCreated= storeHashMap!!.get(EntryData.getInstance()!!.TIMECREATED) as String
this.lastModified= storeHashMap!!.get(EntryData.getInstance()!!.LASTMODIFIED) as String
}


open fun isNameValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.name, MINSTORENAMELENGTH, MAXCHAR))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
                        else {
                            
    var isEscapedCharactersContained: Boolean = false


    var storeNameEscaped: String = StringEscapeUtils.escapeHtml3(this.name)!!
            


    
                        if(this.name.compareTo(storeNameEscaped) != 0)
                        
                                    {
                                    isEscapedCharactersContained= true

                                    }
                                

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    var isSpacesContained: Boolean = false


    
                        if(stringValidationUtil!!.containsSpaces(this.name))
                        
                                    {
                                    isSpacesContained= true

                                    }
                                

    
                        if(isSpacesContained || isEscapedCharactersContained)
                        
                                    {
                                    
    var hashMap: HashMap<Any, Any> = SpecialCharacterUtil.getHashMap()!!
            

hashMap!!.put(arrayOf(CommonSeps.getInstance()!!.SPACE), ONE_EMPTY_STRING_ARRAY)
this.name= Replace(hashMap).
                            all(this.name)

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var valid: Boolean = Boolean.TRUE

valid= this.isNameValid()

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isValidRequired(this.basketName, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.homeHostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.homeHostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.hostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.hostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHomeHostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHomeHostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.imagePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.staticPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.categoryPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.inventoryControl, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.subStores, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.tagLocation, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.packageLocation, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftp, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftpPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftpUserName, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftpPassword, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtp, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtpPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtpUserName, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtpPassword, MINCHAR, MAXCHAR))
                        
                                    {
                                    valid= Boolean.FALSE

                                    }
                                

    
                        if(valid == true)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            
}


open fun nameValidationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isValidRequired(this.name, MINCHAR, MAXCHAR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Name is invalid. Must be < ")
stringBuffer!!.append(MAXCHAR)
stringBuffer!!.append(" and > 0 characters.<br>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EMPTY_STRING
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.nameValidationInfo())

    
                        if(!stringValidationUtil!!.isValidRequired(this.basketName, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Basket name is invalid. Must be < ")
stringBuffer!!.append(MAXCHAR)
stringBuffer!!.append(" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.homeHostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Home host name is invalid. Must be < ")
stringBuffer!!.append(MAXCHAR)
stringBuffer!!.append(" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.homeHostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Home host name path is invalid. Must be < ")
stringBuffer!!.append(MAXCHAR)
stringBuffer!!.append(" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.hostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Host name is invalid. Must be < ")
stringBuffer!!.append(MAXCHAR)
stringBuffer!!.append(" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.hostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Host name path is invalid. Must be < ")
stringBuffer!!.append(MAXCHAR)
stringBuffer!!.append(" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHomeHostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test home host name is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHomeHostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test home host name path is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHostName, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test host name is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testHostNamePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test host name path is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.imagePath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Image path is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.staticPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Static path is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.categoryPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Category path is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.inventoryControl, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Inventory control is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.subStores, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Sub stores is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.tagLocation, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Tag location is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.packageLocation, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Package location is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftp, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Ftp is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftpPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Ftp path is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftpUserName, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Ftp username is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.ftpPassword, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Ftp password is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtp, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test ftp is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtpPath!!.toString(), MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test ftp Path is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtpUserName, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test ftp username is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.testFtpPassword, MINCHAR, MAXCHAR))
                        
                                    {
                                    stringBuffer!!.append("Test ftp password is invalid. Must be < " +MAXCHAR +" and > 0 characters.<br>")

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


open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org.allbinary.globals.URLGLOBALS.getTestHtmlPath() +this.getCurrentHostNamePath()
}


open fun getCurrentHostName()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = EMPTY_STRING


    
                        if(org.allbinary.globals.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHostName()

                                    }
                                
                        else {
                            location= this.getHostName()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getCurrentHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = EMPTY_STRING


    
                        if(org.allbinary.globals.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHostNamePath()

                                    }
                                
                        else {
                            location= this.getHostNamePath()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getCurrentHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = EMPTY_STRING


    
                        if(org.allbinary.globals.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHomeHostName()

                                    }
                                
                        else {
                            location= this.getHomeHostName()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getCurrentHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = EMPTY_STRING


    
                        if(org.allbinary.globals.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHomeHostNamePath()

                                    }
                                
                        else {
                            location= this.getHomeHostNamePath()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getBasketName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basketName
}


open fun getHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.homeHostName
}


open fun getHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.homeHostNamePath!!.toString()
}


open fun getHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hostName
}


open fun getHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hostNamePath!!.toString()
}


open fun getTestHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHomeHostName
}


open fun getTestHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHomeHostNamePath!!.toString()
}


open fun getTestHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHostName
}


open fun getTestHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHostNamePath!!.toString()
}


open fun getStaticPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.staticPath!!.toString()
}


open fun getCategoryPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryPath!!.toString()
}


open fun getInventoryControl()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.inventoryControl
}


                @Throws(Exception::class)
            
open fun getSubStores()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
        try {
            
    var tokenizer: Tokenizer = Tokenizer(CommonSeps.getInstance()!!.SEMICOLON)


    var subStoreVector: BasicArrayList = tokenizer.getTokens(this.subStores, BasicArrayList())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return subStoreVector
} catch(e: Exception)
            {


                            throw e
}

}


open fun getTagLocation()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tagLocation
}


open fun getPackageLocation()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.packageLocation
}


open fun getFtp()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftp
}


open fun getFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpUserName
}


open fun getFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpPassword
}


open fun getTestFtp()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtp
}


open fun getTestFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtpUserName
}


open fun getTestFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtpPassword
}


open fun getFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpPath!!.toString()
}


open fun getTestFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtpPath!!.toString()
}


open fun getTimeCreated()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeCreated
}


open fun getLastModified()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastModified
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.name= value
}


open fun setBasketName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.basketName= value
}


open fun setHomeHostName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.homeHostName= value
}


                @Throws(Exception::class)
            
open fun setHomeHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.homeHostNamePath= AbPath(value)
}


open fun setHostName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.hostName= value
}


                @Throws(Exception::class)
            
open fun setHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.hostNamePath= AbPath(value)
}


open fun setTestHomeHostName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testHomeHostName= value
}


                @Throws(Exception::class)
            
open fun setTestHomeHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testHomeHostNamePath= AbPath(value)
}


open fun setTestHostName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testHostName= value
}


                @Throws(Exception::class)
            
open fun setTestHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testHostNamePath= AbPath(value)
}


                @Throws(Exception::class)
            
open fun setImagePath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.imagePath= AbPath(value)
}


                @Throws(Exception::class)
            
open fun setStaticPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.staticPath= AbPath(value)
}


                @Throws(Exception::class)
            
open fun setCategoryPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.categoryPath= AbPath(value)
}


open fun setSubStores(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.subStores= value
}


open fun setTagLocation(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.tagLocation= value
}


open fun setPackageLocation(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.packageLocation= value
}


open fun setInventoryControl(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.inventoryControl= value
}


open fun getPackageLocation(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.packageLocation= value
}


open fun setFtp(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.ftp= value
}


open fun setFtpUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.ftpUserName= value
}


open fun setFtpPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.ftpPassword= value
}


open fun setTestFtp(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testFtp= value
}


open fun setTestFtpUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testFtpUserName= value
}


open fun setTestFtpPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testFtpPassword= value
}


open fun setTimeCreated(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.timeCreated= value
}


open fun setLastModified(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.lastModified= value
}


                @Throws(Exception::class)
            
open fun setFtpPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.ftpPath= AbPath(value)
}


                @Throws(Exception::class)
            
open fun setTestFtpPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testFtpPath= AbPath(value)
}


                @Throws(Exception::class)
            
open fun createDirectories()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var storeAbPath: AbPath = AbPath(URLGLOBALS.getWebappPath() +this.getCurrentHomeHostNamePath())


    
                        if(!this.directory.create(storeAbPath))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(!this.directory.create(AbPath(storeAbPath +this.getCategoryPath())))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(!this.directory.create(AbPath(storeAbPath +this.getStaticPath())))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
open fun install(current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var current = current


                    var total = total

        try {
            
    
                        if(!this.createDirectories())
                        
                                    {
                                    


                            throw Exception("Unable to create store directories")

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)

    var viewPath: String = stringBuffer!!.toString()!!
            

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(viewPath)
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.INSTALLPATH)

    var fromDirectoryAbPath: AbPath = AbPath(stringBuffer!!.toString())

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(viewPath)
stringBuffer!!.append("special")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)

    var fromSpecialDirectoryAbPath: AbPath = AbPath(stringBuffer!!.toString())

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(viewPath)
stringBuffer!!.append(this.getName())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)

    var toDirectoryAbPath: AbPath = AbPath(stringBuffer!!.toString())


    
                        if(current == 0)
                        
                                    {
                                    
    
                        if(!this.directory.create(toDirectoryAbPath))
                        
                                    {
                                    


                            throw Exception("Unable to create store view directory: " +toDirectoryAbPath!!.toString())

                                    }
                                

                                    }
                                

    var viewTotal: Int = (total *85) /100


    var installTotal: Int = (total *93) /100


    
                        if(current < viewTotal)
                        
                                    {
                                    
    var file: AbFile = AbFile(fromSpecialDirectoryAbPath)


    
                        if(file.isDirectory())
                        
                                    {
                                    
    var halfViewTotal: Int = viewTotal /2


    
                        if(current < halfViewTotal)
                        
                                    {
                                    this.installViews(fromSpecialDirectoryAbPath, toDirectoryAbPath, current, halfViewTotal)

                                    }
                                
                             else 
    
                        if(current < viewTotal)
                        
                                    {
                                    this.installViews(fromDirectoryAbPath, toDirectoryAbPath, current -halfViewTotal, viewTotal -halfViewTotal)

                                    }
                                

                                    }
                                
                        else {
                            this.installViews(fromDirectoryAbPath, toDirectoryAbPath, current, viewTotal)

                        }
                            

                                    }
                                
                             else 
    
                        if(current < installTotal)
                        
                                    {
                                    this.installResources(fromDirectoryAbPath, current -viewTotal, installTotal -viewTotal)

                                    }
                                
                        else {
                            this.installMedia(fromDirectoryAbPath, current -installTotal, total -installTotal)

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "install()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun installViews(fromDirectoryAbPath: AbPath, toDirectoryAbPath: AbPath, current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromDirectoryAbPath = fromDirectoryAbPath


                    var toDirectoryAbPath = toDirectoryAbPath


                    var current = current


                    var total = total
FileUtil.getInstance()!!.copyDirectoryPortion(fromDirectoryAbPath, toDirectoryAbPath, true, false, current, total)
}


                @Throws(Exception::class)
            
open fun installResources(fromDirectoryAbPath: AbPath, current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromDirectoryAbPath = fromDirectoryAbPath


                    var current = current


                    var total = total

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(fromDirectoryAbPath!!.toString())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append("Resources")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)

    var installCategoryAbPath: AbPath = AbPath(stringBuffer!!.toString())

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(this.getCurrentHomeHostNamePath())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATORCHAR)
stringBuffer!!.append(this.getCategoryPath())

    var categoryAbPath: AbPath = AbPath(stringBuffer!!.toString())

FileUtil.getInstance()!!.copyDirectoryPortion(installCategoryAbPath, categoryAbPath, true, false, current, total)
}


                @Throws(Exception::class)
            
open fun installMedia(fromDirectoryAbPath: AbPath, current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromDirectoryAbPath = fromDirectoryAbPath


                    var current = current


                    var total = total

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(fromDirectoryAbPath!!.toString())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.TEMPLATEPATH)
stringBuffer!!.append("images")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)

    var viewStoreImagesDirectoryAbPath: AbPath = AbPath(stringBuffer!!.toString())


    var storeAbPath: AbPath = AbPath(URLGLOBALS.getWebappPath() +this.getCurrentHomeHostNamePath())

FileUtil.getInstance()!!.copyDirectoryPortion(viewStoreImagesDirectoryAbPath, storeAbPath, true, false, current, total)
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var dataVector: Vector = Vector()

dataVector!!.add(this.name)
dataVector!!.add(this.homeHostName)
dataVector!!.add(this.homeHostNamePath!!.toString())
dataVector!!.add(this.hostName)
dataVector!!.add(this.hostNamePath!!.toString())
dataVector!!.add(this.testHomeHostName)
dataVector!!.add(this.testHomeHostNamePath!!.toString())
dataVector!!.add(this.testHostName)
dataVector!!.add(this.testHostNamePath!!.toString())
dataVector!!.add(this.imagePath!!.toString())
dataVector!!.add(this.staticPath!!.toString())
dataVector!!.add(this.categoryPath!!.toString())
dataVector!!.add(this.inventoryControl)

    var contextConfigurationDomDocumentMapping: ContextConfigurationDomDocumentMapping = ContextConfigurationDomDocumentMapping(this.getContextConfigurationInterface())

dataVector!!.add(contextConfigurationDomDocumentMapping!!.toDomDocumentString())
dataVector!!.add(this.subStores)
dataVector!!.add(this.tagLocation)
dataVector!!.add(this.packageLocation)
dataVector!!.add(this.ftp)
dataVector!!.add(this.ftpPath!!.toString())
dataVector!!.add(this.ftpUserName)
dataVector!!.add(this.ftpPassword)
dataVector!!.add(this.testFtp)
dataVector!!.add(this.testFtpPath!!.toString())
dataVector!!.add(this.testFtpUserName)
dataVector!!.add(this.testFtpPassword)

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

dataVector!!.add(time)
dataVector!!.add(time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dataVector
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var storeFrontData: StoreFrontData = StoreFrontData.getInstance()!!
            


    var dataHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

dataHashMap!!.put(storeFrontData!!.NAME, this.name)
dataHashMap!!.put(storeFrontData!!.HOMEHOSTNAME, this.homeHostName)
dataHashMap!!.put(storeFrontData!!.HOMEHOSTNAMEPATH, this.homeHostNamePath!!.toString())
dataHashMap!!.put(storeFrontData!!.HOSTNAME, this.hostName)
dataHashMap!!.put(storeFrontData!!.HOSTNAMEPATH, this.hostNamePath!!.toString())
dataHashMap!!.put(storeFrontData!!.TESTHOMEHOSTNAME, this.testHomeHostName)
dataHashMap!!.put(storeFrontData!!.TESTHOMEHOSTNAMEPATH, this.testHomeHostNamePath!!.toString())
dataHashMap!!.put(storeFrontData!!.TESTHOSTNAME, this.testHostName)
dataHashMap!!.put(storeFrontData!!.TESTHOSTNAMEPATH, this.testHostNamePath!!.toString())
dataHashMap!!.put(storeFrontData!!.IMAGEPATH, this.imagePath!!.toString())
dataHashMap!!.put(storeFrontData!!.STATICPATH, this.staticPath!!.toString())
dataHashMap!!.put(storeFrontData!!.CATEGORYPATH, this.categoryPath!!.toString())
dataHashMap!!.put(storeFrontData!!.INVENTORYCONTROL, this.inventoryControl)

    var contextConfigurationDomDocumentMapping: ContextConfigurationDomDocumentMapping = ContextConfigurationDomDocumentMapping(this.getContextConfigurationInterface())

dataHashMap!!.put(storeFrontData!!.CONFIGURATION, contextConfigurationDomDocumentMapping!!.toDomDocumentString())
dataHashMap!!.put(storeFrontData!!.SUBSTORES, this.subStores)
dataHashMap!!.put(storeFrontData!!.TAGLOCATION, this.tagLocation)
dataHashMap!!.put(storeFrontData!!.PACKAGELOCATION, this.packageLocation)
dataHashMap!!.put(storeFrontData!!.FTP, this.ftp)
dataHashMap!!.put(storeFrontData!!.FTPPATH, this.ftpPath!!.toString())
dataHashMap!!.put(storeFrontData!!.FTPUSERNAME, this.ftpUserName)
dataHashMap!!.put(storeFrontData!!.FTPPASSWORD, this.ftpPassword)
dataHashMap!!.put(storeFrontData!!.TESTFTP, this.testFtp)
dataHashMap!!.put(storeFrontData!!.TESTFTPPATH, this.testFtpPath!!.toString())
dataHashMap!!.put(storeFrontData!!.TESTFTPUSERNAME, this.testFtpUserName)
dataHashMap!!.put(storeFrontData!!.TESTFTPPASSWORD, this.testFtpPassword)

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

dataHashMap!!.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dataHashMap
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getName() as Object
}


open fun getContextConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: ContextConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return contextConfigurationInterface
}


open fun setContextConfigurationInterface(contextConfigurationInterface: ContextConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var contextConfigurationInterface = contextConfigurationInterface
this.contextConfigurationInterface= contextConfigurationInterface
}


}
                
            

