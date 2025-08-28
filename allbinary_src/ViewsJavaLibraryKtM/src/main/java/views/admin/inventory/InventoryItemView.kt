
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
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItem
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.BasicItemView
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItem
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItemView
import org.allbinary.logic.communication.http.file.upload.HttpFileUploadUtil
import org.allbinary.logic.communication.http.request.HttpRequestUtil
import org.allbinary.logic.communication.http.request.MultipartRequestParams
import org.allbinary.logic.communication.http.request.RequestMapInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.PathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.media.MediaData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.apache.commons.fileupload.FileItem
import views.business.context.modules.storefront.HttpStoreComponentView

open public class InventoryItemView : HttpStoreComponentView
                , RequestMapInterface {
        

        companion object {
            
    var TYPE_ID: Int = 10

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val request: HttpServletRequest

    private var imageFileName: String

    private var mediaData: MediaData

    var itemInterface: ItemInterface

    var downloadableItemVector: Vector

    private var requestHashMap: HashMap<Any, Any>
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
this.getFormData()
}

public constructor        (transformInfoInterface: TransformInfoInterface, empty: String)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface
var empty = empty


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
}


open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE_ID
}


                @Throws(Exception::class)
            
open fun getFormData()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.setRequestHashMap(MultipartRequestParams(request).
                            toHashMap())

    var imageFileItemObject: Any = this.getRequestHashMap()!!.get(BasicItemData.IMAGE)!!


    
                        if(HttpFileUploadUtil.getInstance()!!.isValid(imageFileItemObject))
                        
                                    {
                                    
    var fileItem: FileItem = imageFileItemObject as FileItem


    
                        if(fileItem != 
                                    null
                                 && fileItem!!.getSize() > 1)
                        
                                    {
                                    this.imageFileName= HttpRequestUtil.getInstance()!!.generateFileName(fileItem!!.getName())

    var pathUtil: PathUtil = PathUtil.getInstance()!!

this.mediaData= MediaData.get(pathUtil!!.getExtension(this.imageFileName))
this.imageFileName= pathUtil!!.getWithoutExtension(this.imageFileName)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Uploaded File Data: ")
stringBuffer!!.append(this.imageFileName)
stringBuffer!!.append(" Extension: ")
stringBuffer!!.append(this.mediaData!!.getName())
logUtil!!.put(stringBuffer!!.toString(), this, "getFormData()")

                                    }
                                

                                    }
                                

                                    }
                                
this.itemInterface= BasicItem(this.getRequestHashMap()) as ItemInterface
}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var vector: Vector = Vector()


    var downloadableItem: DownloadableItem


    var size: Int = this.downloadableItemVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
downloadableItem= this.downloadableItemVector!!.get(index) as DownloadableItem
vector.add(DownloadableItemView(downloadableItem))
}

this.addDomNodeInterface(BasicItemView(itemInterface, vector))
}


open fun getItemInterface()
        //nullable = true from not(false or (false and true)) = true
: ItemInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.itemInterface
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun processImageFiles()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var set: Set = this.getRequestHashMap()!!.keys!!


    var fieldNameArray: Array<Any?> = set.toArray()!!


    var size: Int = fieldNameArray!!.size
                





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var fieldName: String = fieldNameArray[index]!! as String


    
                        if(fieldName!!.compareTo(BasicItemData.IMAGE) == 0)
                        
                                    {
                                    
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getWeblisketSession()!!.getStoreName())!!


    var inventoryUploadMediaUtil: InventoryUploadMediaUtil = InventoryUploadMediaUtil(storeFrontInterface, this.itemInterface)


    var fileItem: FileItem = this.getRequestHashMap()!!.get(BasicItemData.IMAGE) as FileItem

this.itemInterface= inventoryUploadMediaUtil!!.saveFiles(fileItem!!.get(), this.imageFileName, this.mediaData)

                                    }
                                
}

}


open fun setRequestHashMap(requestHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var requestHashMap = requestHashMap
this.requestHashMap= requestHashMap
}


open fun getRequestHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return requestHashMap
}


}
                
            

