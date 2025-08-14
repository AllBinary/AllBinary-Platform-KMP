
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.BasicItemView
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItem
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItemView
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.request.MultipartRequestParams
import org.allbinary.logic.communication.http.request.RequestMapInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FilePathData
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.file.zip.ZipFileUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.apache.commons.fileupload.FileItem
import views.business.context.modules.storefront.HttpStoreComponentView

open public class DownloadableInventoryItemView : HttpStoreComponentView
                , RequestMapInterface {
        

        companion object {
            
    var TYPE_ID: Int = 11

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val request: HttpServletRequest

    var id: String

    var itemInterface: ItemInterface

    var downloadableItem: DownloadableItem

    private var requestHashMap: HashMap<Any, Any>
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
this.getFormData()
}

public constructor        (transformInfoInterface: TransformInfoInterface, empty: String)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                    var empty = empty


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
}


open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE_ID
}


                @Throws(Exception::class)
            
open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.setRequestHashMap(MultipartRequestParams(request).
                            toHashMap())
this.id= this.getRequestHashMap()!!.get(BasicItemData.ID) as String
}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{
    var vector: Vector = Vector()


    
                        if(this.downloadableItem != 
                                    null
                                )
                        
                                    {
                                    vector.add(DownloadableItemView(this.downloadableItem))

                                    }
                                
this.addDomNodeInterface(BasicItemView(itemInterface, vector))
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun processFile(fileItem: FileItem)
        //nullable = true from not(false or (false and false)) = true
{

                    var fileItem = fileItem

    var fileName: String = fileItem!!.getName()!!
            


    var fullPath: String = this.getItemFilePath()!!
            


    var itemResourceFile: AbFile = AbFile(fullPath)

itemResourceFile!!.mkdir()

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(fullPath)
stringBuffer!!.append(fileName)
logUtil!!.put("FileName: " +fileName, this, 
                            "processFile()")

    var file: AbFile = AbFile(stringBuffer!!.toString())

logUtil!!.put(file.getPath(), this, 
                            "processFiles()")
file.createNewFile()

    var byteArray: ByteArray = fileItem!!.get()!!
            

FileUtil.getInstance()!!.write(ByteArrayInputStream(byteArray), file)
}


                @Throws(Exception::class)
            
open fun unzip(fileItem: FileItem)
        //nullable = true from not(false or (false and false)) = true
{

                    var fileItem = fileItem

    var fileName: String = fileItem!!.getName()!!
            


    var fullPath: String = this.getItemFilePath()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(fullPath)
stringBuffer!!.append(fileName)
logUtil!!.put("FileName: " +fileName, this, 
                            "unzip()")

    var file: AbFile = AbFile(stringBuffer!!.toString())

logUtil!!.put(file.getPath(), this, 
                            "unzip()")
ZipFileUtil.getInstance()!!.unzip(fullPath, file, fileName)
}


open fun getItemFilePath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!
            


    var filePathData: FilePathData = FilePathData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(storeFrontInterface!!.getCurrentHostNamePath())
stringBuffer!!.append(this.itemInterface!!.getCategory())
stringBuffer!!.append(filePathData!!.SEPARATOR)
stringBuffer!!.append(this.itemInterface!!.getId())
stringBuffer!!.append(filePathData!!.SEPARATOR)
stringBuffer!!.append(this.downloadableItem!!.getId())
stringBuffer!!.append(filePathData!!.SEPARATOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun setRequestHashMap(requestHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var requestHashMap = requestHashMap
this.requestHashMap= requestHashMap
}


open fun getRequestHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return requestHashMap
}


open fun getDownloadableItem()
        //nullable = true from not(false or (false and true)) = true
: DownloadableItem{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return downloadableItem
}


}
                
            

