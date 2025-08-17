
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
        package org.allbinary.logic.io.path




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.file.FilePathData
import org.allbinary.logic.io.file.FilePathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonSeps

open public class AbPath
            : Object
         {
        

        companion object {
            
    private val NETWORK_SEP: String = ":/"

        }
            
    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    private val abPathData: AbPathData = AbPathData.getInstance()!!
            

    var schema: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var path: String = StringUtil.getInstance()!!.EMPTY_STRING

    var nameP: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var hasSchema: Boolean = false

    private var numberOfSeps: Int = 0

    private val abPathUtil: PathUtil = PathUtil.getInstance()!!
            
public constructor        ()
            : super()
        {init()
}


    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (aPath: String)
            : super()
        {

                    var aPath = aPath

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isEmpty(aPath))
                        
                                    {
                                    this.schema= this.getSchema(aPath)
this.nameP= EMPTY_STRING
this.path= abPathUtil!!.adjustEnd(abPathUtil!!.adjust(this.getPath(aPath)))

                                    }
                                
                        else {
                            init()

                        }
                            
}

public constructor        (aPath: String, name: String)
            : super()
        {

                    var aPath = aPath


                    var name = name

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isEmpty(aPath))
                        
                                    {
                                    this.schema= this.getSchema(aPath)
this.nameP= name
this.path= abPathUtil!!.adjustEnd(abPathUtil!!.adjust(this.getPath(aPath)))

                                    }
                                
                        else {
                            init()

    
                        if(!stringValidationUtil!!.isEmpty(name))
                        
                                    {
                                    this.nameP= name

                                    }
                                

                        }
                            
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.schema= EMPTY_STRING
this.setPath(abPathData!!.SEPARATOR)
this.nameP= EMPTY_STRING
}


open fun getSchema(aPath: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var aPath = aPath

    var beginIndex: Int = aPath!!.indexOf(commonSeps!!.COLON)!!
            


    
                        if(beginIndex >= 0)
                        
                                    {
                                    this.hasSchema= true



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return aPath!!.substring(0, beginIndex)

                                    }
                                
this.hasSchema= false



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EMPTY_STRING
}


open fun hasSchema()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hasSchema
}


                @Throws(Exception::class)
            
open fun getPath(aPath: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var aPath = aPath

    var filePathData: FilePathData = FilePathData.getInstance()!!
            


    var tempPath: String = aPath


    
                        if(!this.hasSchema())
                        
                                    {
                                    tempPath= abPathUtil!!.adjustStart(tempPath)

                                    }
                                
                        else {
                            
    var beginIndex: Int = tempPath!!.indexOf(commonSeps!!.COLON)!!
            


    
                        if(beginIndex >= 0)
                        
                                    {
                                    beginIndex++

        while(tempPath[beginIndex] == abPathData!!.SEPARATORCHAR || tempPath[beginIndex] == filePathData!!.SEPARATORCHAR)
        {beginIndex++
numberOfSeps++

    
                        if(numberOfSeps > 2)
                        
                                    {
                                    


                            throw Exception("Should Not Have More Than Two Seps")

                                    }
                                
}

tempPath= tempPath!!.substring(beginIndex, tempPath!!.length)

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tempPath
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.nameP= name
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.nameP
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()


    
                        if(this.hasSchema())
                        
                                    {
                                    stringBuffer!!.append(this.schema)
stringBuffer!!.append(NETWORK_SEP)

                                    }
                                
stringBuffer!!.append(this.getPath())
stringBuffer!!.append(this.nameP)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun toFileSystemString()
        //nullable = true from not(false or (false and true)) = true
: String{
    
                        if(this.hasSchema())
                        
                                    {
                                    
    var filePathData: FilePathData = FilePathData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.schema)
stringBuffer!!.append(commonSeps!!.COLON)
stringBuffer!!.append(filePathData!!.SEPARATOR)
stringBuffer!!.append(FilePathUtil.adjust(this.getPath()))
stringBuffer!!.append(this.nameP)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FilePathUtil.adjust(this.getPath()) +this.nameP

                        }
                            
}


open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


open fun setPath(path: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var path = path
this.path= path
}


}
                
            

