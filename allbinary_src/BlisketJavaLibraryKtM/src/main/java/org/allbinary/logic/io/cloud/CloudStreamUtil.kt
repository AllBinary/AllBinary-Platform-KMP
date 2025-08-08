
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
        package org.allbinary.logic.io



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile

open public class CloudStreamUtil
            : Object
         {
        

        companion object {


    private val instance: CloudStreamUtil = CloudStreamUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CloudStreamUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

                @Throws(Exception::class)
            
open fun getFile(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var file = file

    var inputStream: InputStream = AbFileInputStream(file)


    var available: Int = inputStream!!.available()!!
            


    
                        if(available > 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Cloud File Bytes: " +available, this, 
                            "processRequest()")

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream
}


                @Throws(Exception::class)
            
open fun getFileAnyWhere(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var file = file

    var inputStream: InputStream = AbFileLocalInputStream(file)


    var available: Int = inputStream!!.available()!!
            


    
                        if(available > 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Local File Bytes: " +available, this, 
                            "processRequest()")

                                    }
                                

                                    }
                                
                        else {
                            inputStream= AbFileInputStream(file)
available= inputStream!!.available()

    
                        if(available > 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Cloud File Bytes: " +available, this, 
                            "processRequest()")

                                    }
                                

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream
}


                @Throws(Exception::class)
            
open fun getFileLocal(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var file = file

    var inputStream: InputStream = AbFileLocalInputStream(file)


    var available: Int = inputStream!!.available()!!
            


    
                        if(available > 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Local File Bytes: " +available, this, 
                            "processRequest()")

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream
}


}
                
            

