
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
        package org.allbinary.logic.visual.transform.template.util




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.visual.transform.info.CustomizerTransformInfoData
import org.allbinary.logic.visual.transform.template.customizer.bodies.BodyData
import org.allbinary.logic.visual.transform.template.customizer.widgets.title.TitleData
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class TransformTemplateCustomizerUtil
            : Object
         {
        

        companion object {
            
    private val instance: TransformTemplateCustomizerUtil = TransformTemplateCustomizerUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformTemplateCustomizerUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val CUSTOMIZER_NAME: String

    private val BODY_VIEWNAMEKEY: String

    private val TITLE_VIEWNAMEKEY: String

    private val GLOBALS_NEW: String

    private val GLOBALS_INSERT: String

    private val GLOBALS_DELETE: String

    private val GLOBALS_EDIT: String

    private val GLOBALS_UPDATE: String
private constructor        ()
            : super()
        {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var SPACE: String = CommonSeps.getInstance()!!.SPACE

CUSTOMIZER_NAME= SPACE +CustomizerTransformInfoData.NAME
BODY_VIEWNAMEKEY= SPACE +BodyData.getInstance()!!.VIEWNAMEKEY
TITLE_VIEWNAMEKEY= SPACE +TitleData.getInstance()!!.VIEWNAMEKEY
GLOBALS_NEW= GLOBALS2.NEW +SPACE
GLOBALS_INSERT= commonStrings!!.INSERT +SPACE
GLOBALS_DELETE= commonStrings!!.DELETE +SPACE
GLOBALS_EDIT= GLOBALS2.EDIT +SPACE
GLOBALS_UPDATE= commonStrings!!.UPDATE +SPACE
}


open fun getPageNameHack(viewName: String, storeName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var viewName = viewName


                    var storeName = storeName

    var SPACE: String = CommonSeps.getInstance()!!.SPACE


    var ONE_EMPTY_STRING_ARRAY: Array<String?> = StringUtil.getInstance()!!.ONE_EMPTY_STRING_ARRAY


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(arrayOf(viewName +SPACE), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(storeName +SPACE), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(CUSTOMIZER_NAME), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(BODY_VIEWNAMEKEY), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(TITLE_VIEWNAMEKEY), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(GLOBALS_NEW), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(GLOBALS_INSERT), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(GLOBALS_DELETE), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(GLOBALS_EDIT), ONE_EMPTY_STRING_ARRAY)
hashMap!!.put(arrayOf(GLOBALS_UPDATE), ONE_EMPTY_STRING_ARRAY)

    var replace: Replace = 
                null
            


    var rootViewName: String = replace.all(viewName)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("RootViewName for ObjectConfig: " +rootViewName, this, "getPageNameHack")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rootViewName
}


}
                
            

