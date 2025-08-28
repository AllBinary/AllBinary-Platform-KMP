
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
        package views.admin.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.BasicItemValidation
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.globals.GLOBALS2
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.file.upload.HttpFileUploadUtil
import org.allbinary.logic.communication.http.file.upload.media.UploadMediaSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileData
import org.allbinary.logic.io.path.PathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.apache.commons.fileupload.FileItem
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class AddFileValidationView : InventoryItemView
                , ValidationComponentInterface {
        

        companion object {
            
    private val ADDPRODUCT: String = "Add Product"

    private val NEXTSTEP: String = "Next Step"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

        try {
            
    var command: String = this.getRequestHashMap()!!.get(GLOBALS2.ADMINCOMMAND) as String


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(command) || (command.compareTo(ADDPRODUCT) != 0 && command.compareTo(NEXTSTEP) != 0))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Invalid AdminCommand: ")
stringBuffer!!.append(command)
stringBuffer!!.append(" must be: ")
stringBuffer!!.append(ADDPRODUCT)
stringBuffer!!.append(" or ")
stringBuffer!!.append(NEXTSTEP)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var basicItemValidation: BasicItemValidation = BasicItemValidation(this.itemInterface)


    
                        if(basicItemValidation!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(basicItemValidation!!.validationInfo(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!

this.itemInterface!!.setCategory(storeFrontInterface!!.getCategoryPath() +this.itemInterface!!.getCategory())

    var fullCategory: String = StringMaker().
                            append(URLGLOBALS.getWebappPath())!!.append(storeFrontInterface!!.getCurrentHostNamePath())!!.append(this.itemInterface!!.getCategory())!!.toString()!!


    var categoryFile: AbFile = AbFile(fullCategory)


    
                        if(!categoryFile!!.isDirectory())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Category Does Not Exist: " +fullCategory, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(this.itemInterface!!.getId()) != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Item Already Exists", this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var imageFileItemObject: Any = this.getRequestHashMap()!!.get(BasicItemData.IMAGE)!!


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(imageFileItemObject))
                        
                                    {
                                    
    var fileItem: FileItem = imageFileItemObject as FileItem


    var fileName: String = fileItem!!.getName()!!


    var size: Long = fileItem!!.getSize()!!

HttpFileUploadUtil.log(fileItem)

    
                        if(this.isValid(fileName, size) == Boolean.FALSE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Exception in validation", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    var command: String = this.getRequestHashMap()!!.get(GLOBALS2.ADMINCOMMAND) as String


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(command) || (command.compareTo(ADDPRODUCT) != 0 && command.compareTo(NEXTSTEP) != 0))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                                    }
                                

    var basicItemValidation: BasicItemValidation = BasicItemValidation(this.itemInterface)


    
                        if(basicItemValidation!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    stringBuffer!!.append(basicItemValidation!!.validationInfo())
stringBuffer!!.append("<br/>")

                                    }
                                

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!


    var fullCategory: String = StringMaker().
                            append(URLGLOBALS.getWebappPath())!!.append(storeFrontInterface!!.getCurrentHostNamePath())!!.append(this.itemInterface!!.getCategory())!!.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Category: " +fullCategory, this, "validationInfo()")

                                    }
                                

    var categoryFile: AbFile = AbFile(fullCategory)


    
                        if(!categoryFile!!.isDirectory())
                        
                                    {
                                    stringBuffer!!.append("Category ")
stringBuffer!!.append(this.itemInterface!!.getCategory())
stringBuffer!!.append(" does not exist.<br />")

                                    }
                                

        try {
            
    
                        if(InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(this.itemInterface!!.getId()) != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append("Id is already in use. Refresh the page for a valid id.<br/>")

                                    }
                                
} catch(e: MoneyException)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Existing Item With MoneyException", this, "validationInfo()")

                                    }
                                
}


    var anyType: Any = this.getRequestHashMap()!!.get(BasicItemData.IMAGE)!!


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(anyType))
                        
                                    {
                                    
    var fileItem: FileItem = anyType as FileItem


    var fileName: String = fileItem!!.getName()!!


    var fileItemFieldName: String = fileItem!!.getFieldName()!!


    var size: Long = fileItem!!.getSize()!!

this.validationInfo(stringBuffer, fileName, fileItemFieldName, size)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Getting Validation Info"
}

}


                @Throws(Exception::class)
            
open fun isValid(fileName: String, size: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var fileName = fileName
var size = size

    var fileData: FileData = FileData.getInstance()!!


    
                        if(size > fileData!!.MINIMAGEFILESIZE)
                        
                                    {
                                    
    
                        if(size < fileData!!.MAXIMAGEFILESIZE)
                        
                                    {
                                    
    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(fileName, fileData!!.MINLEN, fileData!!.MAXLEN))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
                        else {
                            
    var pathUtil: PathUtil = PathUtil.getInstance()!!


    var extension: String = pathUtil!!.getExtension(fileName)!!


    var uploadMedia: UploadMediaSingleton = UploadMediaSingleton.getInstance()!!


    
                        if(!uploadMedia!!.isWriterSupported(extension) && !uploadMedia!!.isReaderSupported(extension))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("File Size To Large: ")
stringBuffer!!.append(size)
stringBuffer!!.append(">")
stringBuffer!!.append(fileData!!.MAXIMAGEFILESIZE)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            
this.processImageFiles()

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("File Size To Small: ")
stringBuffer!!.append(size)
stringBuffer!!.append(">")
stringBuffer!!.append(fileData!!.MINIMAGEFILESIZE)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun validationInfo(stringBuffer: StringMaker, fileName: String, fileItemFieldName: String, size: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var stringBuffer = stringBuffer
    //var fileName = fileName
    //var fileItemFieldName = fileItemFieldName
    //var size = size

    var fileData: FileData = FileData.getInstance()!!


    
                        if(size > fileData!!.MINIMAGEFILESIZE)
                        
                                    {
                                    
    
                        if(fileItemFieldName!!.compareTo(BasicItemData.IMAGE) == 0)
                        
                                    {
                                    
    
                        if(size < fileData!!.MAXIMAGEFILESIZE)
                        
                                    {
                                    
    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(fileName, fileData!!.MINLEN, fileData!!.MAXLEN))
                        
                                    {
                                    stringBuffer!!.append("FileName must be >")
stringBuffer!!.append(fileData!!.MINLEN)
stringBuffer!!.append(" and <")
stringBuffer!!.append(fileData!!.MAXLEN)
stringBuffer!!.append("<br/>")

                                    }
                                
                        else {
                            
    var pathUtil: PathUtil = PathUtil.getInstance()!!


    var extension: String = pathUtil!!.getExtension(fileName)!!


    var uploadMedia: UploadMediaSingleton = UploadMediaSingleton.getInstance()!!


    
                        if(!uploadMedia!!.isWriterSupported(extension) && !uploadMedia!!.isReaderSupported(extension))
                        
                                    {
                                    stringBuffer!!.append("Image type: ")
stringBuffer!!.append(extension)
stringBuffer!!.append(" not supported.<br />")

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            stringBuffer!!.append("Image File Is To Large. ")
stringBuffer!!.append(fileData!!.MINIMAGEFILESIZE)
stringBuffer!!.append(" < > ")
stringBuffer!!.append(fileData!!.MAXIMAGEFILESIZE)
stringBuffer!!.append("<br/>")

                        }
                            

                                    }
                                

                                    }
                                
                        else {
                            stringBuffer!!.append("Image File Is To Small. ")
stringBuffer!!.append(fileData!!.MINIMAGEFILESIZE)
stringBuffer!!.append(" < > ")
stringBuffer!!.append(fileData!!.MAXIMAGEFILESIZE)
stringBuffer!!.append("<br/>")

                        }
                            
}


}
                
            

