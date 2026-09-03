
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
        package org.allbinary.logic.io.file.directory




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil
import org.allbinary.logic.io.file.CommonDataFileStrings
import org.allbinary.logic.io.file.visitor.IncludeFileExtensionsBooleanFileVisitor
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class DirectoryOrIncludeFileExtensionAndTrackedBooleanFileVisitor : IncludeFileExtensionsBooleanFileVisitor {
        
companion object {
            
    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
var args = args

    var commonFileStrings: CommonDataFileStrings = CommonDataFileStrings.getInstance()!!


    var list: BasicArrayList = BasicArrayListD()

list.add(commonFileStrings!!.JAVA)

    var filePath: String = "G:\\mnt\\bc\\mydev\\games\\ZeptoRacer\\platform\\j2se\\ZeptoRacerStaticPathsJ2SEM\\target\\dependency\\org\\allbinary\\logic\\system\\security\\licensing\\ZeptoRacerPCClientInformation.java"


    var result: Boolean = DirectoryOrIncludeFileExtensionAndTrackedBooleanFileVisitor(list).
                            visit(AbFile.createAbFileFromRawPath(filePath))!!

System.out.println(filePath +" is Tracked: " +result)
}


        }
            
    private val trackedStrings: TrackedStrings = TrackedStrings.getInstance()!!

    private val includesString: String
public constructor (filterStringBasicArrayList: BasicArrayList)                        

                            : super(filterStringBasicArrayList){
    //var filterStringBasicArrayList = filterStringBasicArrayList


                            //For kotlin this is before the body of the constructor.
                    
this.includesString= 
                                        null
                                    
}

public constructor (filterStringBasicArrayList: BasicArrayList, includesString: String)                        

                            : super(filterStringBasicArrayList){
    //var filterStringBasicArrayList = filterStringBasicArrayList
    //var includesString = includesString


                            //For kotlin this is before the body of the constructor.
                    
this.includesString= includesString
}


    override fun visit(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var file = file

    
                        if(file.isDirectory())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                

    
                        if(this.includesString == 
                                    null
                                 || file.getAbsolutePath()!!.indexOf(this.includesString) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.visit(file)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            
}


    override fun visit(file: AbFile, fileNameString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var file = file
var fileNameString = fileNameString

    var filePath: String = file.getPath()!!


    
                        if(super.visit(file, fileNameString))
                        
                                    {
                                    
    
                        if(!(filePath!!.contains(this.trackedStrings!!.APPLICATION) || filePath!!.contains(this.trackedStrings!!.APP) || filePath!!.contains(this.trackedStrings!!.HTML_TEMP)))
                        
                                    {
                                    
    
                        if(!(filePath!!.contains(this.trackedStrings!!.TARGET_PATH_WINDOWS) || filePath!!.contains(this.trackedStrings!!.TARGET_PATH_UNIX)))
                        
                                    {
                                    
    
                        if(this.isGitTracked(file))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


    open fun isGitTracked(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var file = file

        try {
            
    var nativeFile: File = AbFileNativeUtil.get(file)!!


    var parentFile: File = nativeFile!!.getParentFile()!!


    var process: Process = ProcessBuilder(this.trackedStrings!!.GIT_COMMAND, this.trackedStrings!!.CHANGE_DIRECTORY_OPTION, parentFile!!.getPath(), this.trackedStrings!!.LIST_FILES_COMMAND, this.trackedStrings!!.ERROR_UNMATCH_OPTION, this.trackedStrings!!.PATHSPEC_SEPARATOR, nativeFile!!.getName()).
                            redirectErrorStream(true)!!.start()!!

process.getInputStream()!!.readAllBytes()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return process.waitFor() == 0
} catch(e: Exception)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


}
                
            

