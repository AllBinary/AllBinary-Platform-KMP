
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
import java.util.Vector
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.download.DownloadItemData
import org.allbinary.business.user.commerce.inventory.item.download.DownloadableItem
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.item.downloads.DownloadItemsEntity
import org.allbinary.data.tables.user.commerce.inventory.item.downloads.DownloadItemsEntityFactory
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class EditValidationView : DownloadableInventoryItemView
                , ValidationComponentInterface {
        

    private var downloadItemId: String
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface, StringUtil.getInstance()!!.EMPTY_STRING){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.getFormData()
}


                @Throws(Exception::class)
            
open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{
    var hashMap: HashMap<Any, Any> = RequestParams(request).
                            toHashMap()!!
            


    
                        if(hashMap == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(
                            "No Request Params Found")

                                    }
                                
this.id= hashMap!!.get(BasicItemData.ID) as String
this.downloadItemId= hashMap!!.get(DownloadItemData.ID) as String
}


                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(id == 
                                    null
                                 || !StringValidationUtil.getInstance()!!.isNumber(this.id))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
this.itemInterface= InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(this.id)

    
                        if(this.itemInterface == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var downloadable: Int = Integer.parseInt(this.itemInterface!!.getDownloads())!!
            


    
                        if(downloadable != 0)
                        
                                    {
                                    
    var downloadItemsEntity: DownloadItemsEntity = DownloadItemsEntityFactory.getInstance()!!.getDownloadItemsEntityInstance()!!
            


    var vector: Vector = downloadItemsEntity!!.getForItem(this.id, this.downloadItemId)!!
            


    
                        if(vector.size != 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
this.downloadableItem= vector.get(0) as DownloadableItem

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
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


                @Throws(MoneyException::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()


    
                        if(id == 
                                    null
                                 || !StringValidationUtil.getInstance()!!.isNumber(this.id))
                        
                                    {
                                    stringBuffer!!.append(
                            "Id is not valid.<br />")

                                    }
                                

    
                        if(InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(this.id) == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(
                            "Item does not exist.<br />")

                                    }
                                

    var downloadable: Int = Integer.parseInt(this.itemInterface!!.getDownloads())!!
            


    
                        if(downloadable != 0)
                        
                                    {
                                    
    
                        if(this.downloadableItem == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(
                            "DownloadableItem does not exist for item.<br />")

                                    }
                                

                                    }
                                
                        else {
                            stringBuffer!!.append(
                            "Item should not have DownloadableItem.<br />")

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

