
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.BasicItemValidation
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
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.apache.commons.fileupload.FileItem
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UpdateFileValidationView : InventoryItemView
                , ValidationComponentInterface {
        

        companion object {
            
    private val UPDATEPRODUCT: String = CommonStrings.getInstance()!!.UPDATE

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
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


    
                        if(command == 
                                    null
                                 || command.compareTo(UPDATEPRODUCT) != 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Invalid AdminCommand=" +command, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    
                        if(BasicItemValidation(this.itemInterface).
                            isValid() == Boolean.FALSE)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "BasicItem is not valid", this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(storeFrontInterface!!.getCurrentHostNamePath())
stringBuffer!!.append(this.itemInterface!!.getCategory())

    var fullCategory: String = stringBuffer!!.toString()!!
            


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
                                

    var inventoryEntity: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            


    
                        if(inventoryEntity!!.getItem(this.itemInterface!!.getId()) == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var anyType: Any = this.getRequestHashMap()!!.get(BasicItemData.IMAGE)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(anyType))
                        
                                    {
                                    
    var fileItem: FileItem = anyType as FileItem


    var size: Long = fileItem!!.getSize()!!
            


    var fileName: String = fileItem!!.getName()!!
            

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
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
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


                @Throws(Exception::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()


    var command: String = this.getRequestHashMap()!!.get(GLOBALS2.ADMINCOMMAND) as String


    
                        if(command == 
                                    null
                                 || command.compareTo(UPDATEPRODUCT) != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CommonSeps.getInstance()!!.SPACE

                                    }
                                
stringBuffer!!.append(BasicItemValidation(this.itemInterface).
                            validationInfo())

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!
            


    var fullCategory: String = URLGLOBALS.getWebappPath() as String +storeFrontInterface!!.getCurrentHostNamePath() +this.itemInterface!!.getCategory()


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Category: " +fullCategory, this, 
                            "validationInfo()")

                                    }
                                

        try {
            
    
                        if(InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(this.itemInterface!!.getId()) == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(
                            "Item does not exist.<br>")

                                    }
                                
} catch(e: MoneyException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "Existing Item With MoneyException", this, 
                            "validationInfo()")

                                    }
                                
}


    var anyType: Any = this.getRequestHashMap()!!.get(BasicItemData.IMAGE)!!
            


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(anyType))
                        
                                    {
                                    
    var fileItem: FileItem = anyType as FileItem


    var size: Long = fileItem!!.getSize()!!
            


    var fileName: String = fileItem!!.getName()!!
            


    var fileItemFieldName: String = fileItem!!.getFieldName()!!
            

this.validationInfo(stringBuffer, fileName, fileItemFieldName, size)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


                @Throws(Exception::class)
            
open fun isValid(fileName: String, size: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

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
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "File Size To Large: ")
stringBuffer!!.append(size)
stringBuffer!!.append(
                            ">")
stringBuffer!!.append(fileData!!.MAXIMAGEFILESIZE)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            
this.processImageFiles()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun validationInfo(stringBuffer: StringMaker, fileName: String, fileItemFieldName: String, size: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var stringBuffer = stringBuffer


                    var fileName = fileName


                    var fileItemFieldName = fileItemFieldName


                    var size = size

    var fileData: FileData = FileData.getInstance()!!
            


    
                        if(size > fileData!!.MINIMAGEFILESIZE)
                        
                                    {
                                    
    
                        if(fileItemFieldName!!.compareTo(BasicItemData.IMAGE) == 0)
                        
                                    {
                                    
    
                        if(size < fileData!!.MAXIMAGEFILESIZE)
                        
                                    {
                                    
    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(fileName, fileData!!.MINLEN, fileData!!.MAXLEN))
                        
                                    {
                                    stringBuffer!!.append(
                            "FileName must be >")
stringBuffer!!.append(fileData!!.MINLEN)
stringBuffer!!.append(
                            "and <")
stringBuffer!!.append(fileData!!.MAXLEN)
stringBuffer!!.append(
                            "<br />")

                                    }
                                

                                    }
                                
                        else {
                            stringBuffer!!.append(
                            "Image File Is Not The Right Size. ")
stringBuffer!!.append(fileData!!.MINIMAGEFILESIZE)
stringBuffer!!.append(
                            "< > ")
stringBuffer!!.append(fileData!!.MAXIMAGEFILESIZE)
stringBuffer!!.append(
                            "<br />")

                        }
                            

                                    }
                                

                                    }
                                
}


}
                
            

