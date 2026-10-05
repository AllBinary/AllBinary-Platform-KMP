
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2026 AllBinary 
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
        package org.allbinary.java.runtime.process.git




        import java.lang.Object        
        
        import java.lang.InterruptedException
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.util.ArrayList
import java.util.List
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil
import org.allbinary.logic.io.file.directory.TrackedStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
//Do not use this instead just skip target, build, Application paths.
open public class GitProcessHelper
            : Object
         {
        
companion object {
            
    private val instance: GitProcessHelper = GitProcessHelper()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GitProcessHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GitProcessHelper.instance
}


        }
            
    private val trackedStrings: TrackedStrings = TrackedStrings.getInstance()!!
private constructor ()
            : super()
        {

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var THIS_IS_SLOW: String = "This is slow consider path exclusion instead"

logUtil!!.putF(THIS_IS_SLOW, this, commonStrings!!.CONSTRUCTOR)
}


                @Throws(IOException::class, InterruptedException::class)
            
    open fun trackedFiles(rootAsString: String, pathspec: String)
        //nullable = true from not(false or (false and false)) = true
: List<String>{
    //var rootAsString = rootAsString
    //var pathspec = pathspec



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.trackedFiles(rootAsString, pathspec, ".java")
}


                @Throws(IOException::class, InterruptedException::class)
            
    open fun trackedFiles(rootAsString: String, pathspec: String, suffix: String)
        //nullable = true from not(false or (false and false)) = true
: List<String>{
    //var rootAsString = rootAsString
    //var pathspec = pathspec
    //var suffix = suffix

    var process: Process = ProcessBuilder(this.trackedStrings!!.GIT_COMMAND, this.trackedStrings!!.CHANGE_DIRECTORY_OPTION, rootAsString, this.trackedStrings!!.LIST_FILES_COMMAND, this.trackedStrings!!.SEP_BY_NULL_CHAR_INSTEAD_OF_NEW_LINE, this.trackedStrings!!.PATHSPEC_SEPARATOR, pathspec).
                            redirectError(ProcessBuilder.Redirect.INHERIT)!!.start()!!


    var output: ByteArray = process.getInputStream()!!.readAllBytes()!!


    var exitCode: Int = process.waitFor()!!


    
                        if(exitCode != 0)
                        
                                    {
                                    


                            throw IllegalStateException(StringMaker().
                            append("git ls-files failed for ")!!.append(rootAsString)!!.append(" with exit code ")!!.appendint(exitCode)!!.toString())

                                    }
                                

    var files: List<String> = ArrayList<>()


    var start: Int = 0


    var relativePath: String





                        for (index in 0 until output.size)

        {

    
                        if(output[index] == 0)
                        
                                    {
                                    relativePath= output.decodeToString()

    
                        if(relativePath!!.endsWith(suffix))
                        
                                    {
                                    files.add(relativePath)

                                    }
                                
start= index +1

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return files
}


    open fun isTracked(file: AbFile)
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
                
            

