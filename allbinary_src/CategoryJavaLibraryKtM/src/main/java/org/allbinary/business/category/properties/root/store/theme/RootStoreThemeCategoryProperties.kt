
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
        package org.allbinary.business.category.properties.root.store.theme




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.category.properties.root.store.RootStoreCategoryProperties
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoHttpStoreInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Node

open public class RootStoreThemeCategoryProperties : RootStoreCategoryProperties {
        
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (transformInfoInterface: TransformInfoInterface, abPath: AbPath)                        

                            : super(transformInfoInterface, abPath){

                    var transformInfoInterface = transformInfoInterface


                    var abPath = abPath


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (transformInfoInterface: TransformInfoInterface, node: Node)                        

                            : super(transformInfoInterface, node){

                    var transformInfoInterface = transformInfoInterface


                    var node = node


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (transformInfoInterface: TransformInfoInterface, categoryPropertiesHashMap: HashMap<Any, Any>)                        

                            : super(transformInfoInterface, categoryPropertiesHashMap){

                    var transformInfoInterface = transformInfoInterface


                    var categoryPropertiesHashMap = categoryPropertiesHashMap


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun initPath()
        //nullable = true from not(false or (false and true)) = true
{
    var transformInfoHttpStoreInterface: TransformInfoHttpStoreInterface = this.transformInfoInterface as TransformInfoHttpStoreInterface


    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(transformInfoHttpStoreInterface!!.getStoreName())!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(storeFrontInterface!!.getName())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.THEMEPATH)

    var abPath: AbPath = AbPath(stringBuffer!!.toString())


    var httpServletRequest: HttpServletRequest = transformInfoHttpStoreInterface!!.getPageContext()!!.getRequest() as HttpServletRequest

this.webAppAbPath= AbPath(httpServletRequest!!.getContextPath() +abPath!!.toString())
this.setRootFilePath(AbPath(URLGLOBALS.getMainPath() +abPath!!.toString()))
}


}
                
            

