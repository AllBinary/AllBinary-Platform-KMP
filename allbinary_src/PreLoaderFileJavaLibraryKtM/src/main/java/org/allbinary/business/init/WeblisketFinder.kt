
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.directory.SubDirectory
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class WeblisketFinder
            : Object
         {
        

        companion object {


    private val instance: WeblisketFinder = WeblisketFinder()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WeblisketFinder{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private val KEY: String = "installerdata.dat"

                @Throws(Exception::class)
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var vector: BasicArrayList = WeblisketFinder.getInstance()!!.findAll(stringUtil!!.EMPTY_STRING)!!
            

System.out!!.println(vector!!.size())
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val subDirectory: SubDirectory = SubDirectory.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun findAll(path: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var path = path

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "findAll")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return subDirectory!!.search(KEY, AbFile(path))
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "findAll", e)

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "findAll", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getInstallationPath(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var file = file

        try {
            
    var filePath: String = file!!.getPath()!!
            


    var end: Int = filePath!!.indexOf(KEY)!!
            


    
                        if(end < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return filePath!!.substring(0, end)
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstallationPath", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

