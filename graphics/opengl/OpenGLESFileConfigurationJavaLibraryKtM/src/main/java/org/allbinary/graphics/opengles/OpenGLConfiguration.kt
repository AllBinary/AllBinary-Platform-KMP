
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
        package org.allbinary.graphics.opengles



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.DataInputStream
import java.io.InputStream
import java.io.OutputStream
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.FileStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.FileFactory
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.game.configuration.event.ChangedGameFeatureListener
import org.allbinary.game.configuration.feature.Feature
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.MainFeatureFactory

open public class OpenGLConfiguration
            : Object
         {
        

        companion object {


    private val instance: OpenGLConfiguration = OpenGLConfiguration()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLConfiguration{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val FILE: String = "OpenGLConfiguration.dat"

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var opengl: Boolean = false

    private var type: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.OPENGL_AS_GAME_THREAD

    private var imageColor: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.IMAGE_COLOR_DEPTH_4444

    private var color: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.IMAGE_COLOR_DEPTH_4444

    private var versionSelector: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.OPENGL_AUTO_SELECT
private constructor        ()
            : super()
        {
        try {
            
    
                        if(FileFactory.getInstance()!!.isFile(FILE))
                        
                                    {
                                    this.read()

                                    }
                                
                        else {
                            this.write()

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


                @Throws(Exception::class)
            
open fun read()
        //nullable = true from not(false or (false and true)) = true
{
    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!
            


    var fileInputStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!
            


    var fileInputStream: InputStream = fileInputStreamFactory!!.getFileInputStreamInstance(StringUtil.getInstance()!!.EMPTY_STRING, FILE)!!
            


    var dataInputStream: DataInputStream = DataInputStream(fileInputStream)


    var openGLValue: Int = dataInputStream!!.readInt()!!
            


    
                        if(openGLValue == 0)
                        
                                    {
                                    this.setOpenGL(false)

                                    }
                                
                             else 
    
                        if(openGLValue == 1)
                        
                                    {
                                    this.setOpenGL(true)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Invalid OpenGL Setting")

                        }
                            

    var version: String = dataInputStream!!.readUTF()!!
            


    
                        if(version!!.compareTo(openGLFeatureFactory!!.OPENGL_AUTO_SELECT.getName()) == 0)
                        
                                    {
                                    this.setVersionSelector(openGLFeatureFactory!!.OPENGL_AUTO_SELECT)

                                    }
                                
                             else 
    
                        if(version!!.compareTo(openGLFeatureFactory!!.OPENGL_MINIMUM.getName()) == 0)
                        
                                    {
                                    this.setVersionSelector(openGLFeatureFactory!!.OPENGL_MINIMUM)

                                    }
                                
                        else {
                            


                            throw Exception("OpenGLConfiguration: Error reading version selector: " +version)

                        }
                            

    var type: String = dataInputStream!!.readUTF()!!
            


    
                        if(type!!.compareTo(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD.getName()) == 0)
                        
                                    {
                                    this.setType(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD)

                                    }
                                
                             else 
    
                        if(type!!.compareTo(openGLFeatureFactory!!.OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS.getName()) == 0)
                        
                                    {
                                    this.setType(openGLFeatureFactory!!.OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "OpenGLConfiguration: Error reading image color")

                        }
                            

    var imageColor: String = dataInputStream!!.readUTF()!!
            


    
                        if(imageColor!!.compareTo(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444.getName()) == 0)
                        
                                    {
                                    this.setImageColor(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444)

                                    }
                                
                             else 
    
                        if(imageColor!!.compareTo(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444.getName()) == 0)
                        
                                    {
                                    this.setImageColor(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444)

                                    }
                                
                             else 
    
                        if(imageColor!!.compareTo(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444.getName()) == 0)
                        
                                    {
                                    this.setImageColor(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444)

                                    }
                                
                        else {
                            


                            throw Exception("OpenGLConfiguration: Error reading image color: " +imageColor)

                        }
                            

    var color: String = dataInputStream!!.readUTF()!!
            


    
                        if(color!!.compareTo(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_4444.getName()) == 0)
                        
                                    {
                                    this.setColor(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_4444)

                                    }
                                
                             else 
    
                        if(color!!.compareTo(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_565.getName()) == 0)
                        
                                    {
                                    this.setColor(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_565)

                                    }
                                
                             else 
    
                        if(color!!.compareTo(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_8888.getName()) == 0)
                        
                                    {
                                    this.setColor(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_8888)

                                    }
                                
                        else {
                            


                            throw Exception("OpenGLConfiguration: Error reading color: " +color)

                        }
                            
PreLogUtil.put("Read Configuration: " +this.toString(), this, 
                            "read")
}


                @Throws(Exception::class)
            
open fun write()
        //nullable = true from not(false or (false and true)) = true
{
    var dataOutputStream: AbDataOutputStream = 
                null
            


        try {
            PreLogUtil.put("Write Configuration: " +this.toString(), this, 
                            "write")

    var fileInputStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!
            


    var fileOutputStream: OutputStream = fileInputStreamFactory!!.getFileOutputStreamInstance(StringUtil.getInstance()!!.EMPTY_STRING, FILE)!!
            

dataOutputStream= AbDataOutputStream(fileOutputStream)

    
                        if(this.isOpenGL())
                        
                                    {
                                    dataOutputStream!!.writeInt(1)

                                    }
                                
                        else {
                            dataOutputStream!!.writeInt(0)

                        }
                            
dataOutputStream!!.writeUTF(this.getVersionSelector()!!.getName())
dataOutputStream!!.writeUTF(this.getType()!!.getName())
dataOutputStream!!.writeUTF(this.getImageColor()!!.getName())
dataOutputStream!!.writeUTF(this.getColor()!!.getName())
dataOutputStream!!.flush()

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{
    var features: Features = Features.getInstance()!!
            


    
                        if(ChangedGameFeatureListener.getInstance()!!.isChanged(MainFeatureFactory.getInstance()!!.STATIC))
                        
                                    {
                                    
    
                        if(this.isOpenGL())
                        
                                    {
                                    
    
                        if(!features!!.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    logUtil!!.put(
                            "Turning on OpenGL", this, commonStrings!!.INIT)
features!!.addDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL)
logUtil!!.put("Using OpenGL Type Feature: " +this.getType(), this, commonStrings!!.INIT)
features!!.addDefault(this.getType())
logUtil!!.put("Using OpenGL ImageColor Feature: " +this.getImageColor(), this, commonStrings!!.INIT)
features!!.addDefault(this.getImageColor())
logUtil!!.put("Using OpenGL Color Feature: " +this.getColor(), this, commonStrings!!.INIT)
features!!.addDefault(this.getColor())
logUtil!!.put("Using OpenGL Version Selector Feature: " +this.getVersionSelector(), this, commonStrings!!.INIT)
features!!.addDefault(this.getVersionSelector())

                                    }
                                

                                    }
                                
                        else {
                            logUtil!!.put(
                            "OpenGL is Off", this, commonStrings!!.INIT)

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(this.isOpenGL() && !features!!.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    PreLogUtil.put(
                            "OpenGL is set but not Enabled since Statics where not cleared (Reboot or Complete exit is Required)", this, commonStrings!!.INIT)

                                    }
                                

                        }
                            
PreLogUtil.put(this.toString(), this, this.commonStrings!!.INIT)
}


                @Throws(Exception::class)
            
open fun update(gameFeature: Feature, colorLocked: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameFeature = gameFeature


                    var colorLocked = colorLocked

    var features: Features = Features.getInstance()!!
            


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!
            


    var modified: Boolean = false


    
                        if(gameFeature == openGLFeatureFactory!!.OPENGL)
                        
                                    {
                                    
    
                        if(features!!.isFeature(gameFeature))
                        
                                    {
                                    
    
                        if(!this.isOpenGL())
                        
                                    {
                                    this.setOpenGL(true)
modified= true

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(this.isOpenGL())
                        
                                    {
                                    this.setOpenGL(false)
modified= true

                                    }
                                

                        }
                            

                                    }
                                

    
                        if(gameFeature == openGLFeatureFactory!!.OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS || gameFeature == openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD)
                        
                                    {
                                    
    
                        if(features!!.isFeature(gameFeature))
                        
                                    {
                                    
    
                        if(gameFeature != this.getType())
                        
                                    {
                                    this.setType(gameFeature as OpenGLFeature)
modified= true

                                    }
                                

                                    }
                                

                                    }
                                

    
                        if(gameFeature == openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444 || gameFeature == openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_565 || gameFeature == openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_8888)
                        
                                    {
                                    
    
                        if(features!!.isFeature(gameFeature))
                        
                                    {
                                    
    
                        if(this.getImageColor() != gameFeature)
                        
                                    {
                                    this.setImageColor(gameFeature as OpenGLFeature)

    
                        if(colorLocked)
                        
                                    {
                                    
    
                        if(gameFeature == openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444)
                        
                                    {
                                    this.setColor(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_4444)

                                    }
                                
                             else 
    
                        if(gameFeature == openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_565)
                        
                                    {
                                    this.setColor(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_565)

                                    }
                                
                             else 
    
                        if(gameFeature == openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_8888)
                        
                                    {
                                    this.setColor(openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_8888)

                                    }
                                

                                    }
                                
modified= true

                                    }
                                

                                    }
                                

                                    }
                                

    
                        if(gameFeature == openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_4444 || gameFeature == openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_565 || gameFeature == openGLFeatureFactory!!.OPENGL_COLOR_DEPTH_8888)
                        
                                    {
                                    
    
                        if(features!!.isFeature(gameFeature))
                        
                                    {
                                    
    
                        if(this.getColor() != gameFeature)
                        
                                    {
                                    this.setColor(gameFeature as OpenGLFeature)
modified= true

                                    }
                                

                                    }
                                

                                    }
                                

    
                        if(gameFeature == openGLFeatureFactory!!.OPENGL_AUTO_SELECT || gameFeature == openGLFeatureFactory!!.OPENGL_MINIMUM)
                        
                                    {
                                    
    
                        if(features!!.isFeature(gameFeature))
                        
                                    {
                                    this.setVersionSelector(gameFeature as OpenGLFeature)

                                    }
                                
modified= true

                                    }
                                

    
                        if(modified)
                        
                                    {
                                    this.write()

                                    }
                                
}


open fun setOpenGL(opengl: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var opengl = opengl
this.opengl= opengl
}


open fun isOpenGL()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return opengl
}


open fun setImageColor(imageColor: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageColor = imageColor
this.imageColor= imageColor
}


open fun getImageColor()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageColor
}


open fun setColor(color: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true
{

                    var color = color
this.color= color
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return color
}


open fun setVersionSelector(versionSelector: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true
{

                    var versionSelector = versionSelector
this.versionSelector= versionSelector
}


open fun getVersionSelector()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return versionSelector
}


open fun setType(type: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true
{

                    var type = type
this.type= type
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return type
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!
            

stringBuffer!!.append(
                            " isOpenGL: ")
stringBuffer!!.append(this.isOpenGL())
stringBuffer!!.append(
                            " VersionSelector: ")
stringBuffer!!.append(stringUtil!!.toString(this.getVersionSelector()))
stringBuffer!!.append(
                            " Type: ")
stringBuffer!!.append(stringUtil!!.toString(this.getType()))
stringBuffer!!.append(
                            " Image Color: ")
stringBuffer!!.append(stringUtil!!.toString(this.getImageColor()))
stringBuffer!!.append(
                            " Color: ")
stringBuffer!!.append(stringUtil!!.toString(this.getColor()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

