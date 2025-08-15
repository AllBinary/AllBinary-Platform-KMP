
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
        package org.allbinary.business.init




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.java.bool.BooleanUtil

open public class InitInfo
            : Object
         {
        

        companion object {
            
    private val instance: InitInfo = InitInfo()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InitInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val TESTING: String = "TESTING"

    val MAINPATH: String = "MAINPATH"

    val TESTHTMLPATH: String = "TESTHTMLPATH"

    private var testing: String = 
                null
            

    private var mainPath: AbPath = 
                null
            

    private var testHtmlPath: AbPath = 
                null
            

    private var hasRead: Boolean = false
private constructor        ()
            : super()
        {}


                @Throws(InitException::class)
            
open fun set()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var initInfoEntity: InitInfoEntity = InitInfoEntity()


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put("created entity", "InitInfo", "set()")

                                    }
                                

    
                        if(!initInfoEntity!!.is())
                        
                                    {
                                    
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put("adding", "InitInfo", "set()")

                                    }
                                
initInfoEntity!!.add()

                                    }
                                
                        else {
                            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put("update", "InitInfo", "set()")

                                    }
                                
initInfoEntity!!.update()

                        }
                            
hasRead= false
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put("error", "InitInfo", "set()", e)

                                    }
                                
}

}


open fun set(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap

        try {
            testing= hashMap!!.get(TESTING as Object?) as String
mainPath= AbPath(hashMap!!.get(MAINPATH as Object?) as String)
testHtmlPath= AbPath(hashMap!!.get(TESTHTMLPATH as Object?) as String)
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put("error", "InitInfo", "set()", e)

                                    }
                                
}

}


open fun get()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            testing= 
                                        null
                                    
mainPath= 
                                        null
                                    
testHtmlPath= 
                                        null
                                    

    var initInfoEntity: InitInfoEntity = InitInfoEntity()

initInfoEntity!!.get()
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put("error", "InitInfo", "set()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 
}

}


open fun setHasRead(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
hasRead= value
}


open fun updateIfNeeded()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(!hasRead)
                        
                                    {
                                    hasRead= true
this.get()

                                    }
                                
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put("error", "InitInfo", "updateIfNeeded()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 
}

}


open fun isTesting()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanUtil.getInstance()!!.getFromString(testing)
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put("error", "InitInfo", "updateIfNeeded()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun getTesting()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return testing
}


open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()

    
                        if(testHtmlPath != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return testHtmlPath!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun getMainPath()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()

    
                        if(mainPath != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mainPath!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun setTesting(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
testing= value
}


open fun setTestHtmlPath(value: AbPath)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.testHtmlPath= value
}


open fun setMainPath(value: AbPath)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.mainPath= value
}


open fun isMainPathValid(abPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var abPath = abPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isTestHtmlPathValid(abPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var abPath = abPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
open fun isTestingValid(testing: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var testing = testing



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanUtil.getInstance()!!.isStringBoolean(testing)
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(TESTING, this.getTesting())
hashMap!!.put(MAINPATH, this.getMainPath())
hashMap!!.put(TESTHTMLPATH, this.getTestHtmlPath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


}
                
            

