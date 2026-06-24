
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.graphics.threed




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.midlet.MIDlet
//OpenGLNone
open public class SWTJOGLProcessor
            : Object
        
                , Runnable {
        
companion object {
            
    private val instance: SWTJOGLProcessor = SWTJOGLProcessor()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SWTJOGLProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SWTJOGLProcessor.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun init(display: Any, comp: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var display = display
    //var comp = comp
}


    open fun isHolderCreated()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun setRenderer(renderer: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var renderer = renderer
}


    open fun isJOGL()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun createSurface()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun onSurfaceCreated()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun onSurfaceChangedForEvent(event: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var event = event
}


    open fun onSurfaceChanged()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun onSurfaceChangedWH(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var width = width
    //var height = height
}


    open fun addListener()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun addListeners(midlet: MIDlet)
        //nullable = true from not(false or (false and false)) = true
{
    //var midlet = midlet
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun setCustom(width: Int, height: Int, ratio: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var width = width
    //var height = height
    //var ratio = ratio
}


    open fun setRatioProcessor()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun isPortraitRatioProcessor()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun charWidth(font: Font, ch: Char)
        //nullable = true from not(false or (false and false)) = true
: Int{
var font = font
var ch = ch



                            throw RuntimeException()
}


    open fun charsWidth(font: Font, ch: CharArray, offset: Int, length: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var font = font
var ch = ch
var offset = offset
var length = length



                            throw RuntimeException()
}


    open fun stringWidth(font: Font, str: String)
        //nullable = true from not(false or (false and false)) = true
: Int{
var font = font
var str = str



                            throw RuntimeException()
}


    open fun substringWidth(font: Font, str: String, offset: Int, len: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var font = font
var str = str
var offset = offset
var len = len



                            throw RuntimeException()
}


}
                
            

