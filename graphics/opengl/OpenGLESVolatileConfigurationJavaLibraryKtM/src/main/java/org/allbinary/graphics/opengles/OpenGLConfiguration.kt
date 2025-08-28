
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.game.configuration.event.ChangedGameFeatureListener
import org.allbinary.game.configuration.feature.Feature
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.logic.string.StringUtil

open public class OpenGLConfiguration
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLConfiguration = OpenGLConfiguration()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLConfiguration

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var opengl: Boolean = false

    private var type: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.OPENGL_AS_GAME_THREAD

    private var imageColor: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.IMAGE_COLOR_DEPTH_4444

    private var color: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.IMAGE_COLOR_DEPTH_4444

    private var versionSelector: OpenGLFeature = OpenGLFeatureFactory.getInstance()!!.OPENGL_AUTO_SELECT
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun write()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var features: Features = Features.getInstance()!!


    
                        if(ChangedGameFeatureListener.getInstance()!!.isChanged(MainFeatureFactory.getInstance()!!.STATIC))
                        
                                    {
                                    
    
                        if(this.isOpenGL())
                        
                                    {
                                    
    
                        if(!features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    logUtil!!.put("Turning on OpenGL", this, commonStrings!!.INIT)
features.addDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL)
logUtil!!.put("Using OpenGL Type Feature: " +this.getType(), this, commonStrings!!.INIT)
features.addDefault(this.getType())
logUtil!!.put("Using OpenGL ImageColor Feature: " +this.getImageColor(), this, commonStrings!!.INIT)
features.addDefault(this.getImageColor())
logUtil!!.put("Using OpenGL Color Feature: " +this.getColor(), this, commonStrings!!.INIT)
features.addDefault(this.getColor())
logUtil!!.put("Using OpenGL Version Selector Feature: " +this.getVersionSelector(), this, commonStrings!!.INIT)
features.addDefault(this.getVersionSelector())

                                    }
                                

                                    }
                                
                        else {
                            logUtil!!.put("OpenGL is Off", this, commonStrings!!.INIT)

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(this.isOpenGL() && !features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    PreLogUtil.put("OpenGL is set but not Enabled since Statics where not cleared (Reboot or Complete exit is Required)", this, commonStrings!!.INIT)

                                    }
                                

                        }
                            
PreLogUtil.put(this.toString(), this, this.commonStrings!!.INIT)
}


                @Throws(Exception::class)
            
open fun update(gameFeature: Feature, colorLocked: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gameFeature = gameFeature
    //var colorLocked = colorLocked

    var features: Features = Features.getInstance()!!


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!


    var modified: Boolean = false


    
                        if(gameFeature == openGLFeatureFactory!!.OPENGL)
                        
                                    {
                                    
    
                        if(features.isFeature(gameFeature))
                        
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
                                    
    
                        if(features.isFeature(gameFeature))
                        
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
                                    
    
                        if(features.isFeature(gameFeature))
                        
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
                                    
    
                        if(features.isFeature(gameFeature))
                        
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
                                    
    
                        if(features.isFeature(gameFeature))
                        
                                    {
                                    this.setVersionSelector(gameFeature as OpenGLFeature)

                                    }
                                
modified= true

                                    }
                                
}


open fun setOpenGL(opengl: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var opengl = opengl
this.opengl= opengl
}


open fun isOpenGL()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return opengl
}


open fun setImageColor(imageColor: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var imageColor = imageColor
this.imageColor= imageColor
}


open fun getImageColor()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageColor
}


open fun setColor(color: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var color = color
this.color= color
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return color
}


open fun setVersionSelector(versionSelector: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var versionSelector = versionSelector
this.versionSelector= versionSelector
}


open fun getVersionSelector()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return versionSelector
}


open fun setType(type: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var type = type
this.type= type
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: OpenGLFeature

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return type
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!

stringBuffer!!.append(" isOpenGL: ")
stringBuffer!!.append(this.isOpenGL())
stringBuffer!!.append(" VersionSelector: ")
stringBuffer!!.append(stringUtil!!.toString(this.getVersionSelector()))
stringBuffer!!.append(" Type: ")
stringBuffer!!.append(stringUtil!!.toString(this.getType()))
stringBuffer!!.append(" Image Color: ")
stringBuffer!!.append(stringUtil!!.toString(this.getImageColor()))
stringBuffer!!.append(" Color: ")
stringBuffer!!.append(stringUtil!!.toString(this.getColor()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

