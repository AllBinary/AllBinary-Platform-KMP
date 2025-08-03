
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
        package org.allbinary.logic.visual.transform.info



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class TransformInfoHttpSearch : TransformInfoHttp {
        
public constructor        (searchRequest: SearchRequest)                        

                            : super(searchRequest!!.getPropertiesHashMap(), searchRequest!!.getPageContext()){

                    var searchRequest = searchRequest


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(searchRequest!!.getStoreFront()!!.getName() != 
                                    null
                                )
                        
                                    {
                                    this.setStoreName(searchRequest!!.getStoreFront()!!.getName())

                                    }
                                
                        else {
                            this.setStoreName(StringUtil.getInstance()!!.EMPTY_STRING)

                        }
                            

    var dataFileName: String = searchRequest!!.getXslFile()!!
            

this.setTemplateFile(dataFileName)
}


                @Throws(Exception::class)
            
open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(this.getStoreName())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


                @Throws(Exception::class)
            
open fun getTemplateFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.getPath(), this.getTemplateFile())
}


                @Throws(Exception::class)
            
open fun getObjectConfigFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.getPath(), this.getObjectConfigFile())
}


                @Throws(Exception::class)
            
open fun getDataFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.getPath(), this.getDataFile())
}


}
                
            

