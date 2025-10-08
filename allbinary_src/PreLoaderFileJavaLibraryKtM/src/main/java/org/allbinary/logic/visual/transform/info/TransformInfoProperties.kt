
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class TransformInfoProperties
            : Object
         {
        

    private var name: String

    private var label: String

    private var description: String

    private var objectFileName: String

    private var objectConfigFileName: String

    private var templateFileName: String
public constructor (name: String, label: String, description: String, objectFileName: String, objectConfigFileName: String, templateFileName: String)
            : super()
        {
var name = name
var label = label
var description = description
var objectFileName = objectFileName
var objectConfigFileName = objectConfigFileName
var templateFileName = templateFileName
this.name= name
this.label= label
this.description= description
this.objectFileName= objectFileName
this.templateFileName= templateFileName
this.objectConfigFileName= objectConfigFileName
}


    open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.name= value
}


    open fun setDescription(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.description= value
}


    open fun setViewFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.objectFileName= value
}


    open fun setTemplateFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.templateFileName= value
}


    open fun setObjectConfigFile(value: Object)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.objectConfigFileName= value
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


    open fun getLabel()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.label
}


    open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.description
}


    open fun getViewFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.objectFileName
}


    open fun getTemplateFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.templateFileName
}


    open fun getObjectConfigFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.objectConfigFileName
}


}
                
            

