
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
        package views.admin.inventory.download



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.BasicItemValidation
import org.allbinary.business.user.commerce.inventory.item.download.DownloadItemData
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItem
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItemValidation
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.globals.GLOBALS2
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.file.upload.HttpFileUploadUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings
import org.apache.commons.fileupload.FileItem
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UpdateFileValidationView : DownloadableInventoryItemView
                , ValidationComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var command: String = this.getRequestHashMap()!!.get(GLOBALS2.ADMINCOMMAND) as String


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(command) || command!!.compareTo(this.commonStrings!!.UPDATE) != 0)
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Invalid AdminCommand=" +command, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

        try {
            
    var inventoryEntity: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            

this.itemInterface= inventoryEntity!!.getItem(id)
} catch(e: MoneyException)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "Existing Item With MoneyException", this, commonStrings!!.IS_VALID, e)

                                    }
                                
}


    
                        if(this.itemInterface == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "Item Does Not Exist", this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(BasicItemValidation(this.itemInterface).
                            isValid() == Boolean.FALSE)
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "BasicItem is not valid", this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!
            


    var fullCategory: String = StringMaker().
                            append(URLGLOBALS.getWebappPath())!!.append(storeFrontInterface!!.getCurrentHostNamePath())!!.append(this.itemInterface!!.getCategory())!!.toString()!!
            


    var categoryFile: AbFile = AbFile(fullCategory)


    
                        if(!categoryFile!!.isDirectory())
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Category Does Not Exist: " +fullCategory, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var downloadableFileObject: Any = this.getRequestHashMap()!!.get(DownloadItemData.FILE)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(downloadableFileObject))
                        
                                    {
                                    
    var fileItem: FileItem = downloadableFileObject as FileItem


    var fileName: String = fileItem!!.getName()!!
            


    var size: Long = fileItem!!.getSize()!!
            

HttpFileUploadUtil.log(fileItem)

    
                        if(this.isValid(fileName, size) == Boolean.FALSE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
                        else {
                            this.processFile(fileItem)
this.getRequestHashMap()!!.put(DownloadItemData.SIZE, (size).toString())

                        }
                            

                                    }
                                
                        else {
                            this.getRequestHashMap()!!.remove(DownloadItemData.FILE)

                        }
                            

    var licenseFileObject: Any = this.getRequestHashMap()!!.get(DownloadItemData.LICENSE_FILE)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(licenseFileObject))
                        
                                    {
                                    
    var fileItem: FileItem = licenseFileObject as FileItem


    var fileName: String = fileItem!!.getName()!!
            


    var size: Long = fileItem!!.getSize()!!
            

HttpFileUploadUtil.log(fileItem)

    
                        if(this.isValid(fileName, size) == Boolean.FALSE)
                        
                                    {
                                    
                                    }
                                
                        else {
                            this.processFile(fileItem)

                        }
                            

                                    }
                                
                        else {
                            this.getRequestHashMap()!!.remove(DownloadItemData.LICENSE_FILE)

                        }
                            

    var extraFilesObject: Any = this.getRequestHashMap()!!.get(DownloadItemData.EXTRA_FILES)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(extraFilesObject))
                        
                                    {
                                    
    var fileItem: FileItem = extraFilesObject as FileItem


    var fileName: String = fileItem!!.getName()!!
            


    var size: Long = fileItem!!.getSize()!!
            

HttpFileUploadUtil.log(fileItem)

    
                        if(this.isValid(fileName, size) == Boolean.FALSE)
                        
                                    {
                                    
                                    }
                                
                        else {
                            this.processFile(fileItem)
this.unzip(fileItem)

                        }
                            

                                    }
                                
                        else {
                            this.getRequestHashMap()!!.remove(DownloadItemData.EXTRA_FILES)

                        }
                            

    var hashMap: HashMap<Any, Any> = this.getRequestHashMap()!!
            

hashMap!!.put(BasicItemData.ID, this.itemInterface!!.getId())

    var licenseObject: Any = hashMap!!.get(DownloadItemData.LICENSE_FILE)!!
            


    
                        if(licenseObject != 
                                    null
                                )
                        
                                    {
                                    hashMap!!.put(DownloadItemData.LICENSE_FILE, licenseObject = licenseObjectlicenseObject as FileItem
licenseObject.
                                getName())

                                    }
                                
                        else {
                            hashMap!!.put(DownloadItemData.LICENSE_FILE, StringUtil.getInstance()!!.EMPTY_STRING)

                        }
                            

    var fileObject: Any = hashMap!!.get(DownloadItemData.FILE)!!
            


    
                        if(fileObject != 
                                    null
                                )
                        
                                    {
                                    hashMap!!.put(DownloadItemData.FILE, fileObject = fileObjectfileObject as FileItem
fileObject.
                                getName())

                                    }
                                
                        else {
                            hashMap!!.put(DownloadItemData.FILE, StringUtil.getInstance()!!.EMPTY_STRING)

                        }
                            
this.downloadableItem= DownloadableItem(hashMap)

    var downloadableItemValidation: DownloadableItemValidation = DownloadableItemValidation(this.downloadableItem)


    
                        if(downloadableItemValidation!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "DownloadableItem is not valid", this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Exception in validation", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringBuffer: StringMaker = StringMaker()


    var command: String = this.getRequestHashMap()!!.get(GLOBALS2.ADMINCOMMAND) as String


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(command) || command!!.compareTo(this.commonStrings!!.UPDATE) != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                                    }
                                

    
                        if(this.itemInterface == 
                                    null
                                )
                        
                                    {
                                    
    var ITEM_NOT_FOUND: String = "Item Does Not Exist"


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(ITEM_NOT_FOUND, this, 
                            "validationInfo()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ITEM_NOT_FOUND

                                    }
                                

    var basicItemValidation: BasicItemValidation = BasicItemValidation(this.itemInterface)


    
                        if(basicItemValidation!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    stringBuffer!!.append(basicItemValidation!!.validationInfo())
stringBuffer!!.append(
                            "<br/>")

                                    }
                                

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!
            


    var fullCategory: String = StringMaker().
                            append(URLGLOBALS.getWebappPath())!!.append(storeFrontInterface!!.getCurrentHostNamePath())!!.append(this.itemInterface!!.getCategory())!!.toString()!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Category: " +fullCategory, this, 
                            "validationInfo()")

                                    }
                                

    var categoryFile: AbFile = AbFile(fullCategory)


    
                        if(!categoryFile!!.isDirectory())
                        
                                    {
                                    stringBuffer!!.append(
                            "Category ")
stringBuffer!!.append(this.itemInterface!!.getCategory())
stringBuffer!!.append(
                            " does not exist.")
stringBuffer!!.append(
                            "<br />")

                                    }
                                

    var downloadableFileObject: Any = this.getRequestHashMap()!!.get(DownloadItemData.FILE)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(downloadableFileObject))
                        
                                    {
                                    
    var fileItem: FileItem = downloadableFileObject as FileItem


    var fileName: String = fileItem!!.getName()!!
            


    var size: Long = fileItem!!.getSize()!!
            

this.validationInfo(stringBuffer, fileName, size)

                                    }
                                
                        else {
                            stringBuffer!!.append(
                            "Download File Missing")
stringBuffer!!.append(
                            "<br/>")

                        }
                            

    var licenseFileObject: Any = this.getRequestHashMap()!!.get(DownloadItemData.LICENSE_FILE)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(licenseFileObject))
                        
                                    {
                                    
    var fileItem: FileItem = licenseFileObject as FileItem


    var fileName: String = fileItem!!.getName()!!
            


    var size: Long = fileItem!!.getSize()!!
            

this.validationInfo(stringBuffer, fileName, size)

                                    }
                                
                        else {
                            
                        }
                            

    var extraFilesObject: Any = this.getRequestHashMap()!!.get(DownloadItemData.EXTRA_FILES)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(extraFilesObject))
                        
                                    {
                                    
    var fileItem: FileItem = extraFilesObject as FileItem


    var fileName: String = fileItem!!.getName()!!
            


    var size: Long = fileItem!!.getSize()!!
            

this.validationInfo(stringBuffer, fileName, size)

                                    }
                                
                        else {
                            
                        }
                            

    
                        if(this.downloadableItem != 
                                    null
                                )
                        
                                    {
                                    
    var downloadableItemValidation: DownloadableItemValidation = DownloadableItemValidation(this.downloadableItem)


    
                        if(downloadableItemValidation!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    
    var log: String = downloadableItemValidation!!.validationInfo()!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(log, this, commonStrings!!.IS_VALID)

                                    }
                                
stringBuffer!!.append(log)
stringBuffer!!.append(
                            "<br/>")

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed to generate validation error info", this, 
                            "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Getting Validation Info"
}

}


                @Throws(Exception::class)
            
open fun isValid(fileName: String, size: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var fileName = fileName


                    var size = size

    var fileData: FileData = FileData.getInstance()!!
            


    
                        if(size > fileData!!.MINDOWNLOADABLEFILESIZE)
                        
                                    {
                                    
    
                        if(size < fileData!!.MAXDOWNLOADABLEFILESIZE)
                        
                                    {
                                    
    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(fileName, fileData!!.MINLEN, fileData!!.MAXLEN))
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "File name is not valid: ")
stringBuffer!!.append(fileName)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
                        else {
                            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "File Size To Large: ")
stringBuffer!!.append(size)
stringBuffer!!.append(
                            ">")
stringBuffer!!.append(fileData!!.MAXDOWNLOADABLEFILESIZE)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "File Size To Small: ")
stringBuffer!!.append(size)
stringBuffer!!.append(
                            ">")
stringBuffer!!.append(fileData!!.MINDOWNLOADABLEFILESIZE)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun validationInfo(stringBuffer: StringMaker, fileName: String, size: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var stringBuffer = stringBuffer


                    var fileName = fileName


                    var size = size

    var fileData: FileData = FileData.getInstance()!!
            


    
                        if(size > fileData!!.MINDOWNLOADABLEFILESIZE)
                        
                                    {
                                    
    
                        if(size < fileData!!.MAXDOWNLOADABLEFILESIZE)
                        
                                    {
                                    
    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(fileName, fileData!!.MINLEN, fileData!!.MAXLEN))
                        
                                    {
                                    stringBuffer!!.append(
                            "File Name must be more than ")
stringBuffer!!.append(fileData!!.MINLEN)
stringBuffer!!.append(
                            " and less than ")
stringBuffer!!.append(fileData!!.MAXLEN)
stringBuffer!!.append(
                            " characters in length: ")
stringBuffer!!.append(fileName)
stringBuffer!!.append(
                            "<br/>")

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
                        else {
                            stringBuffer!!.append(
                            "File Is Not The Right Size. ")
stringBuffer!!.append(fileData!!.MINDOWNLOADABLEFILESIZE)
stringBuffer!!.append(
                            "< >")
stringBuffer!!.append(fileData!!.MAXDOWNLOADABLEFILESIZE)
stringBuffer!!.append(
                            "<br/>")

                        }
                            

                                    }
                                
}


}
                
            

