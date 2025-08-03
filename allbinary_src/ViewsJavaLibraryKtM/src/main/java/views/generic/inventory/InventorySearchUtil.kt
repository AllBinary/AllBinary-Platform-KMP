
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
        package views.generic.inventory



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.ListIterator
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.InventoryData
import org.allbinary.business.user.commerce.inventory.basket.BasketData
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.BasicItemView
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchData
import org.allbinary.logic.control.search.SearchParams
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.StoreTransformer
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.data.TransformStoreDocumentFactory
import org.allbinary.logic.visual.transform.info.TransformInfoHttpSearch
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class InventorySearchUtil
            : Object
         {
        

        companion object {


    private val instance: InventorySearchUtil = InventorySearchUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InventorySearchUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!
            

                @Throws(Exception::class)
            
open fun getBasicItemIdColumn(searchRequest: SearchRequest)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var searchRequest = searchRequest

    var inventoryEntityInterface: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            


    var storeFrontInterface: StoreFrontInterface = searchRequest!!.getStoreFront()!!
            


    var inventorySearchUtil: InventoryColumnUtil = InventoryColumnUtil.getInstance()!!
            


    var column: Vector = inventorySearchUtil!!.getColumnWhereLike(inventoryEntityInterface, storeFrontInterface!!.getCategoryPath(), BasicItemData.ID)!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    logUtil!!.put("Number Of Items Found: " +column!!.size, this, 
                            "search")

                                    }
                                

    var subStoreVector: BasicArrayList = storeFrontInterface!!.getSubStores()!!
            


    var size: Int = subStoreVector!!.size()!!
            





                        for (index in 0 until size)


        {
    var subStore: String = subStoreVector!!.get(index) as String


    var substoreIdColumn: Vector = inventorySearchUtil!!.getColumnWhereLike(inventoryEntityInterface, subStore, BasicItemData.ID)!!
            

column!!.addAll(substoreIdColumn)
}


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    logUtil!!.put("Number Of Items Found Including SubStores: " +column!!.size, this, 
                            "search")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return column
}


                @Throws(Exception::class)
            
open fun getNoResults(viewDocumentInterface: TransformDocumentInterface, inventoryNode: Node)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var viewDocumentInterface = viewDocumentInterface


                    var inventoryNode = inventoryNode
inventoryNode!!.appendChild(ModDomHelper.createNameValueNodes(viewDocumentInterface!!.getDoc(), SearchData.TOTAL_NUMBER_PAGES, commonPhoneStrings!!.ZERO))
inventoryNode!!.appendChild(ModDomHelper.createNameValueNodes(viewDocumentInterface!!.getDoc(), SearchData.TOTAL_NUMBER_ITEMS, commonPhoneStrings!!.ZERO))

    var success: String = DomDocumentHelper.toString(viewDocumentInterface!!.getDoc())!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    logUtil!!.put("No Results Xml: " +success, this, 
                            "search")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
}


open fun search(abeClientInformation: AbeClientInformationInterface, searchRequest: SearchRequest, column: Vector)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>{

                    var abeClientInformation = abeClientInformation


                    var searchRequest = searchRequest


                    var column = column

        try {
            
    var inventoryEntityInterface: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            


    var searchParams: SearchParams = searchRequest!!.getParams()!!
            


    var startPage: Int = searchParams!!.getStartPageInt()!!.toInt()!!
            


    var endPage: Int = searchParams!!.getEndPageInt()!!.toInt()!!
            


    var pageLength: Int = searchParams!!.getLengthInt()!!.toInt()!!
            


    var savedPagesInRange: Int = 0


    var columnValueHashMap: HashMap<Any, Any> = searchParams!!.get()!!
            


    var keyword: String = Replace(
                            "-", CommonSeps.getInstance()!!.SPACE).
                            all(columnValueHashMap!!.get(BasicItemData.KEYWORDS) as String)!!
            


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(keyword))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()


    
                        if(startPage >= 0)
                        
                                    {
                                    
    
                        if(pageLength == 0)
                        
                                    {
                                    pageLength= SearchData.DEFAULT_PAGE_LENGTH

                                    }
                                

    var MAXPAGES: Int = 100


    var productListingPages: Array<String?> = arrayOfNulls(MAXPAGES)


    var documents: Array<Document?> = arrayOfNulls(MAXPAGES)


    var inventoryNodes: Array<Node?> = arrayOfNulls(MAXPAGES)


    var iter: ListIterator = column!!.listIterator()!!
            

keyword= keyword!!.toUpperCase()

    var lastPage: Int =  -1


    var numberOfResultsOnCurrentPage: Int = 0


    var numberOfResults: Int = 0


    var viewDocumentInterface: TransformDocumentInterface = TransformStoreDocumentFactory.getInstance(searchRequest)!!
            


    var inventoryNode: Node = viewDocumentInterface!!.getDoc()!!.createElement(InventoryData.INVENTORY)!!
            

viewDocumentInterface!!.getBaseNode()!!.appendChild(inventoryNode)
inventoryNode!!.appendChild(ModDomHelper.createNameValueNodes(viewDocumentInterface!!.getDoc(), SearchData.PAGE, Integer(startPage).
                            toString()))

    
                        if(searchRequest!!.getFileBaseName() != 
                                    null
                                )
                        
                                    {
                                    inventoryNode!!.appendChild(searchRequest!!.getFileBaseNameNode(viewDocumentInterface!!.getDoc()))

                                    }
                                

    var currentPage: Int =  -1


        while(iter!!.hasNext())
        {
    var product: String = .concatToString()


    var itemInterface: ItemInterface = inventoryEntityInterface!!.getItem(product)!!
            


    var keywords: String = itemInterface!!.getKeywords()!!
            

keywords= keywords!!.toUpperCase()

    
                        if(keywords!!.indexOf(keyword) !=  -1)
                        
                                    {
                                    
    
                        if(currentPage +1 >= startPage && currentPage +1 <= endPage)
                        
                                    {
                                    
    var itemNode: Node = BasicItemView(itemInterface, Vector()).
                            toXmlNode(viewDocumentInterface!!.getDoc())!!
            

itemNode!!.appendChild(ModDomHelper.createNameValueNodes(viewDocumentInterface!!.getDoc(), BasketData.ITEMTOTALINBASKET, commonPhoneStrings!!.ONE))
inventoryNode!!.appendChild(itemNode!!.cloneNode(true))

                                    }
                                
currentPage= ((numberOfResults +1) /pageLength) -1
numberOfResultsOnCurrentPage++

    
                        if(lastPage < currentPage)
                        
                                    {
                                    
    
                        if(currentPage >= startPage && currentPage <= endPage)
                        
                                    {
                                    inventoryNode!!.appendChild(ModDomHelper.createNameValueNodes(viewDocumentInterface!!.getDoc(), SearchData.TOTAL_NUMBER_ITEMS_ON_THIS_PAGE, Integer(numberOfResultsOnCurrentPage).
                            toString()))
documents[currentPage]= viewDocumentInterface!!.getDoc()
inventoryNodes[currentPage]= inventoryNode
savedPagesInRange++
viewDocumentInterface= TransformStoreDocumentFactory.getInstance(searchRequest)
inventoryNode= viewDocumentInterface!!.getDoc()!!.createElement(InventoryData.INVENTORY)
viewDocumentInterface!!.getBaseNode()!!.appendChild(inventoryNode)
inventoryNode!!.appendChild(ModDomHelper.createNameValueNodes(viewDocumentInterface!!.getDoc(), SearchData.PAGE, Integer(currentPage +1).
                            toString()))

    
                        if(searchRequest!!.getFileBaseName() != 
                                    null
                                )
                        
                                    {
                                    inventoryNode!!.appendChild(searchRequest!!.getFileBaseNameNode(viewDocumentInterface!!.getDoc()))

                                    }
                                

                                    }
                                
lastPage= currentPage
numberOfResultsOnCurrentPage= 0

                                    }
                                
numberOfResults++

    
                        if(lastPage >= MAXPAGES -1)
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                
}


    
                        if(numberOfResultsOnCurrentPage > 0 && (currentPage +1 >= startPage && currentPage +1 <= endPage))
                        
                                    {
                                    inventoryNode!!.appendChild(ModDomHelper.createNameValueNodes(viewDocumentInterface!!.getDoc(), SearchData.TOTAL_NUMBER_ITEMS_ON_THIS_PAGE, Integer(numberOfResultsOnCurrentPage -1).
                            toString()))
documents[lastPage +1]= viewDocumentInterface!!.getDoc()
inventoryNodes[lastPage +1]= inventoryNode
savedPagesInRange++

                                    }
                                

    
                        if(numberOfResultsOnCurrentPage > 0)
                        
                                    {
                                    lastPage++

                                    }
                                

    
                        if(endPage > MAXPAGES -1)
                        
                                    {
                                    endPage= MAXPAGES -1

                                    }
                                




                        for (index in startPage until endPage)


        {
    
                        if(index <= lastPage)
                        
                                    {
                                    
    var tempDocument: Document = documents[index]!!

inventoryNodes[index]!!.appendChild(ModDomHelper.createNameValueNodes(tempDocument, SearchData.TOTAL_NUMBER_PAGES, Integer(lastPage +1).
                            toString()))
inventoryNodes[index]!!.appendChild(ModDomHelper.createNameValueNodes(tempDocument, SearchData.TOTAL_NUMBER_ITEMS, Integer(numberOfResults).
                            toString()))




                        for (pageIndex in 0 until lastPage)


        {stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(searchRequest!!.getFileBaseName())

    
                        if(stringBuffer!!.length() > 0)
                        
                                    {
                                    
    
                        if(pageIndex != 0)
                        
                                    {
                                    stringBuffer!!.append(pageIndex.toString())

                                    }
                                
inventoryNodes[index]!!.appendChild(ModDomHelper.createNameValueNodes(tempDocument, SearchData.PAGE_INFO, Integer.toString(pageIndex), stringBuffer!!.toString()))

                                    }
                                
                        else {
                            inventoryNodes[index]!!.appendChild(ModDomHelper.createNameValueNodes(tempDocument, SearchData.PAGE_INFO, Integer.toString(pageIndex), SearchData.SEARCH))

                        }
                            
}


    var success: String = DomDocumentHelper.toString(tempDocument)!!
            

productListingPages[index]= StoreTransformer(abeClientInformation, TransformInfoHttpSearch(searchRequest) as TransformInfoInterface).
                            translate(success)

                                    }
                                
}


    
                        if(savedPagesInRange == 0)
                        
                                    {
                                    
    var result: String = this.getNoResults(viewDocumentInterface, inventoryNode)!!
            

productListingPages[0]= StoreTransformer(abeClientInformation, TransformInfoHttpSearch(searchRequest)).
                            translate(result)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return productListingPages

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "search", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

