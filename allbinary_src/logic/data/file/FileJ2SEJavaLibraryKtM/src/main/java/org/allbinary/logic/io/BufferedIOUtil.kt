
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
        
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil
import org.allbinary.logic.string.StringUtil

open public class BufferedIOUtil
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun copy(backupFile: AbFile, backupFileBak: AbFile)
        //nullable = true from not(false or (false and false)) = true
{

                    var backupFile = backupFile


                    var backupFileBak = backupFileBak

    var line: String = StringUtil.getInstance()!!.EMPTY_STRING


    var tmpOut: BufferedWriter = BufferedWriter(FileWriter(AbFileNativeUtil.get(backupFileBak)))


    var tmpIn: BufferedReader = BufferedReader(FileReader(AbFileNativeUtil.get(backupFile)))


        while((line= tmpIn!!.readLine()) != 
                                    null
                                )
        {tmpOut!!.write(line, 0, line!!.length)
tmpOut!!.newLine()
}

tmpOut!!.flush()
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

