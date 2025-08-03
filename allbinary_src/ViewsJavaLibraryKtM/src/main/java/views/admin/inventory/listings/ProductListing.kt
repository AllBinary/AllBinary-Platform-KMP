
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
        package views.admin.inventory.listings



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.HashSet
import java.util.Set
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.data.tables.context.module.storefronts.StoreFrontsEntity
import org.allbinary.data.tables.staticpages.StaticPagesEntity
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.globals.GLOBALS2
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchParams
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.InputOutputTypeData
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.SpecialCharacterUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.string.tokens.UniqueTokens
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList
import views.generic.inventory.InventoryColumnUtil
import views.generic.inventory.InventorySearchUtil

open public class ProductListing
            : Object
        
                , ProductListingInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val directory: Directory = Directory.getInstance()!!
            

    private val storeFronts: StoreFrontsEntity

    private val staticPages: StaticPagesEntity

    private val inventory: InventoryEntity

    private val searchRequest: SearchRequest

    private val INVENTORY: String = ".InventoryView"
public constructor        (searchRequest: SearchRequest)
            : super()
        {

                    var searchRequest = searchRequest
this.searchRequest= searchRequest
this.storeFronts= StoreFrontsEntity()
this.staticPages= StaticPagesEntity()
this.inventory= InventoryEntity()
}


                @Throws(Exception::class)
            
open fun getHashSet(storeFront: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: HashSet{

                    var storeFront = storeFront

    var inventoryColumnUtil: InventoryColumnUtil = InventoryColumnUtil.getInstance()!!
            


    var keywords: Vector = inventoryColumnUtil!!.getColumnWhereLike(this.inventory, storeFront!!.getCategoryPath(), BasicItemData.KEYWORDS)!!
            


    var subStoreVector: BasicArrayList = storeFront!!.getSubStores()!!
            


    var size: Int = subStoreVector!!.size()!!
            





                        for (index in 0 until size)


        {
    var subStore: String = subStoreVector!!.get(index) as String


    var substoreKeywords: Vector = inventoryColumnUtil!!.getColumnWhereLike(this.inventory, AbPathData.getInstance()!!.SEPARATOR +subStore, BasicItemData.CATEGORY)!!
            

keywords!!.addAll(substoreKeywords)
}


    var uniqueTokens: UniqueTokens = UniqueTokens()


    var keywordHashSet: HashSet = uniqueTokens!!.getWhithoutDashesAndSkipNumberOnlyTokens(keywords)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keywordHashSet
}


                @Throws(Exception::class)
            
open fun savePage(file: String, data: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var data = data

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.STATICPAGEGENERATIONLOGGING))
                        
                                    {
                                    logUtil!!.put("Creating File: " +file, this, 
                            "generateAll()")

                                    }
                                

    var newFile: AbFile = AbFile(file)


    
                        if(newFile!!.exists())
                        
                                    {
                                    newFile!!.delete()

                                    }
                                
newFile!!.createNewFile()

    
                        if(newFile!!.exists())
                        
                                    {
                                    
    var idOutData: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(newFile)!!
            

idOutData!!.writeBytes(data)
idOutData!!.flush()
StreamUtil.getInstance()!!.close(idOutData)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.STATICPAGEGENERATIONLOGGING))
                        
                                    {
                                    logUtil!!.put("Wrote Total Bytes: " +newFile!!.length, this, 
                            "generateAll()")

                                    }
                                

                                    }
                                
                        else {
                            


                            throw Exception("Could Not Create: " +file)

                        }
                            
}


                @Throws(Exception::class)
            
open fun create(keywordData: String, keywordFilenameHashMap: HashMap<Any, Any>, vector: Vector, staticPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
{

                    var keywordData = keywordData


                    var keywordFilenameHashMap = keywordFilenameHashMap


                    var vector = vector


                    var staticPath = staticPath

    var stringBuffer: StringMaker = StringMaker()


    var hashMap: HashMap<Any, Any> = SpecialCharacterUtil.getHashMap()!!
            

hashMap!!.put(CommonSeps.getInstance()!!.SPACE, StringUtil.getInstance()!!.EMPTY_STRING)

    var pageName: String = Replace(hashMap).
                            all(keywordData)!!
            


    var searchParams: SearchParams = this.searchRequest!!.getParams()!!
            

searchParams!!.add(BasicItemData.KEYWORDS, keywordData)
searchParams!!.setStartPage(CommonPhoneStrings.getInstance()!!.ZERO)
this.searchRequest!!.setParams(searchParams)
this.searchRequest!!.setFileBaseName(pageName)

    var abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            


    var inventorySearchUtil: InventorySearchUtil = InventorySearchUtil.getInstance()!!
            


    var productListingPages: Array<String?> = inventorySearchUtil!!.search(abeClientInformation, searchRequest, vector)!!
            





                        for (index in 0 until productListingPages!!.size)


        {
    
                        if(productListingPages[index] == 
                                    null
                                )
                        
                                    {
                                    break;

                    

                                    }
                                

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.STATICPAGEGENERATIONLOGGING))
                        
                                    {
                                    logUtil!!.put("Saving Listing: " +index, this, 
                            "generateAll()")

                                    }
                                

    var indexStr: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(index > 0)
                        
                                    {
                                    indexStr= Integer(index).
                            toString()

                                    }
                                
keywordFilenameHashMap!!.put(keywordData, pageName +indexStr)
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(staticPath!!.toString())
stringBuffer!!.append(pageName)
stringBuffer!!.append(indexStr)
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)
stringBuffer!!.append(InputOutputTypeData.getInstance()!!.DEFAULT)

    var file: String = stringBuffer!!.toString()!!
            


    
                        if(!this.directory!!.create(staticPath))
                        
                                    {
                                    


                            throw Exception("Could Not Create Directory: " +staticPath)

                                    }
                                
this.savePage(file, productListingPages[index]!!)
}

}


open fun addStaticPageInfoToDatabase(storeFront: StoreFrontInterface, keywordFilenameHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var storeFront = storeFront


                    var keywordFilenameHashMap = keywordFilenameHashMap

    var keywordHashSet: Set = keywordFilenameHashMap!!.keySet()!!
            


    var keywordArray: Array<Any?> = keywordHashSet!!.toArray()!!
            


    var size: Int = keywordArray!!.size
                





                        for (index in 0 until size)


        {
    var insertVector: Vector = Vector()


    var keywordData: String = keywordArray[index]!! as String


    var fileName: String = keywordFilenameHashMap!!.get(keywordData as Object?) as String

insertVector!!.add(storeFront!!.getName())
insertVector!!.add(keywordData)
insertVector!!.add(fileName)
this.staticPages!!.insert(insertVector)
}

}


                @Throws(Exception::class)
            
open fun generateAll()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var storeFront: StoreFrontInterface = this.searchRequest!!.getStoreFront()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(storeFront!!.getName())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append(storeFront!!.getStaticPath())

    var staticPath: AbPath = AbPath(stringBuffer!!.toString())


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.STATICPAGEGENERATIONLOGGING))
                        
                                    {
                                    logUtil!!.put("Store Static Pages Path: " +staticPath, this, 
                            "generateAll()")

                                    }
                                

    var keywordHashSet: HashSet = this.getHashSet(storeFront)!!
            


    var keywordArray: Array<Any?> = keywordHashSet!!.toArray()!!
            


    var size: Int = keywordArray!!.size
                


    var keywordFilenameHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    
                        if(size == 0)
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(
                            "Products For ")
stringBuffer!!.append(storeFront!!.getName())
stringBuffer!!.append(
                            " Store Not Found")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                

    var inventorySearchUtil: InventorySearchUtil = InventorySearchUtil.getInstance()!!
            


    var vector: Vector = inventorySearchUtil!!.getBasicItemIdColumn(searchRequest)!!
            





                        for (index in 0 until size)


        {
    var keywordData: String = keywordArray[index]!! as String


    
                        if(keywordData!!.length > 1)
                        
                                    {
                                    this.create(keywordData, keywordFilenameHashMap, vector, staticPath)

                                    }
                                
}

this.addStaticPageInfoToDatabase(storeFront, keywordFilenameHashMap)
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(
                            "Static Files Generated Successfully For ")
stringBuffer!!.append(storeFront!!.getName())
stringBuffer!!.append(
                            " it used packages ")
stringBuffer!!.append(storeFront!!.getPackageLocation())
stringBuffer!!.append(INVENTORY)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {


                            throw e
}

}


                @Throws(Exception::class)
            
open fun generateAll(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var storeName = storeName

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(storeName!!.compareTo(GLOBALS2.GENERATEALLSTORES) != 0)
                        
                                    {
                                    this.searchRequest!!.setStoreFront(this.storeFronts!!.getStoreFrontInterface(storeName))
stringBuffer!!.append(this.generateAll())
stringBuffer!!.append(
                            "<br />")

                                    }
                                
                        else {
                            
    var storeFrontVector: Vector = this.storeFronts!!.getStoreFrontNames()!!
            


    var size: Int = storeFrontVector!!.size!!
            





                        for (index in 0 until size)


        {storeName= storeFrontVector!!.get(index) as String
this.searchRequest!!.setStoreFront(this.storeFronts!!.getStoreFrontInterface(storeName))
stringBuffer!!.append(this.generateAll())
stringBuffer!!.append(
                            "<br />")
}


                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Generation Failed No Store Specified<br/>"

                        }
                            
stringBuffer!!.append(
                            "All Static Pages Generated<br/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {


                            throw e
}

}


}
                
            

