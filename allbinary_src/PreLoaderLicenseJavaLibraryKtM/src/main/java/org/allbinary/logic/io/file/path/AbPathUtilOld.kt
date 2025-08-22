
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
        package org.allbinary.logic.io.file.path




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.FilePathData
import org.allbinary.logic.io.path.AbFilePath
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringValidationUtil

open public class AbPathUtilOld
            : Object
         {
        

        companion object {
            
    private val instance: AbPathUtilOld = AbPathUtilOld()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbPathUtilOld{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private val MIN: Int = 4

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abPathData: AbPathData = AbPathData.getInstance()!!

    private val filePathData: FilePathData = FilePathData.getInstance()!!
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getExtension(abFilePath: AbFilePath)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abFilePath = abFilePath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getExtension(abFilePath!!.toString())
}


                @Throws(Exception::class)
            
open fun getExtension(abPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abPath = abPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getExtension(abPath!!.toString())
}


                @Throws(Exception::class)
            
open fun getExtension(filePath: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var filePath = filePath

    
                        if(filePath!!.length < MIN)
                        
                                    {
                                    


                            throw Exception("Could not be a file path since its less that 4 characters")

                                    }
                                

    var beginIndex: Int = filePath!!.length -MIN


    var extension: String = filePath!!.substring(beginIndex +1)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("FileExtension: " +extension, this, "getExtension()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return extension
}


                @Throws(Exception::class)
            
open fun getWithoutExtension(abFilePath: AbFilePath)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abFilePath = abFilePath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getWithoutExtension(abFilePath!!.toString())
}


                @Throws(Exception::class)
            
open fun getWithoutExtension(abPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abPath = abPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getWithoutExtension(abPath!!.toString())
}


                @Throws(Exception::class)
            
open fun getWithoutExtension(filePath: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var filePath = filePath

    
                        if(filePath!!.length < MIN)
                        
                                    {
                                    


                            throw Exception("Could not be a file path since its less that 4 characters")

                                    }
                                

    var endIndex: Int = filePath!!.length -MIN


    var pathWithoutExtension: String = filePath!!.substring(0, endIndex)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("FileWithoutExtension: " +pathWithoutExtension, this, "getWithoutExtension()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathWithoutExtension
}


open fun isValid(path: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var path = path

    
                        if(this.isValidStart(path))
                        
                                    {
                                    
    
                        if(this.isValidEnd(path))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isValidStart(path: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var path = path

    
                        if(path[0] == abPathData!!.SEPARATORCHAR)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun isValidEnd(path: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var path = path

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(path))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(path[path.length -1] == abPathData!!.SEPARATORCHAR)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun adjustStart(path: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var path = path

    
                        if(!this.isValidStart(path))
                        
                                    {
                                    path= abPathData!!.SEPARATOR +path

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


open fun adjustEnd(path: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var path = path

    
                        if(!this.isValidEnd(path))
                        
                                    {
                                    path= path +abPathData!!.SEPARATOR

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


open fun adjust(path: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var path = path

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(path))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abPathData!!.SEPARATOR

                                    }
                                

    
                        if(path.indexOf("\\") >= 0)
                        
                                    {
                                    path= path.replace('\\', abPathData!!.SEPARATORCHAR)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


open fun getNameFromPath(categoryPath: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var categoryPath = categoryPath

    var endIndex: Int = categoryPath!!.lastIndexOf(abPathData!!.SEPARATOR)!!


    
                        if(endIndex < 0)
                        
                                    {
                                    endIndex= categoryPath!!.lastIndexOf(filePathData!!.SEPARATORCHAR)

                                    }
                                

    
                        if(endIndex < 0)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryPath

    
                        if(categoryPath!!.length == endIndex +1)
                        
                                    {
                                    
    var categoryName: String = categoryPath!!.substring(0, endIndex)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getNameFromPath(categoryName)

                                    }
                                
                        else {
                            
    var categoryName: String = categoryPath!!.substring(endIndex +1)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryName

                        }
                            
}


                @Throws(Exception::class)
            
open fun removeNameFromPath(categoryPath: String)
        //nullable = true from not(false or (false and false)) = true
: AbPath{

                    var categoryPath = categoryPath

    var endIndex: Int = categoryPath!!.lastIndexOf(abPathData!!.SEPARATOR)!!


    
                        if(endIndex < 0)
                        
                                    {
                                    endIndex= categoryPath!!.lastIndexOf(filePathData!!.SEPARATORCHAR)

                                    }
                                

    
                        if(endIndex < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath()

                                    }
                                

    
                        if(categoryPath!!.length == endIndex +1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.removeNameFromPath(categoryPath!!.substring(0, endIndex -1))

                                    }
                                
                        else {
                            
    var categoryName: String = categoryPath!!.substring(0, endIndex)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(categoryName)

                        }
                            
}


}
                
            

