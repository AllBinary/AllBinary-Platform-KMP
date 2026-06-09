
        /* Generated Code Do Not Modify */
        package org.allbinary.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Feature
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class ApplicationConfiguration
            : Object
         {
        
companion object {
            
    private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ApplicationConfiguration{

    
                        if(ApplicationConfiguration.instance == NullUtil.getInstance()!!.NULL_OBJECT)
                        
                                    {
                                    ApplicationConfiguration.instance= ApplicationConfiguration()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ApplicationConfiguration.instance as ApplicationConfiguration
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var fullscreen: Boolean = true

    private var showTitleBar: Boolean = false

    private var progressBarView: Boolean = false
private constructor ()
            : super()
        {

        try {
            this.read()
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


                @Throws(Exception::class)
            
    open fun read()
        //nullable = true from not(false or (false and true)) = true
{
this.setFullscreen(true)
this.setProgressBarView(false)
this.setShowTitleBar(false)
this.logUtil!!.putF("Read Configuration: " +this.toString(), this, "read")
}


                @Throws(Exception::class)
            
    open fun write()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    open fun update(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameFeature = gameFeature

    
                        if(gameFeature == MainFeatureFactory.getInstance()!!.FULL_SCREEN)
                        
                                    {
                                    
    var features: Features = Features.getInstance()!!


    
                        if(features.isFeature(gameFeature))
                        
                                    {
                                    
    
                        if(!this.isFullscreen())
                        
                                    {
                                    this.setFullscreen(true)
this.write()

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(this.isFullscreen())
                        
                                    {
                                    this.setFullscreen(false)
this.write()

                                    }
                                

                        }
                            

                                    }
                                
}


    open fun setFullscreen(fullscreen: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var fullscreen = fullscreen
this.fullscreen= fullscreen
}


    open fun isFullscreen()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fullscreen
}


    open fun setShowTitleBar(showTitleBar: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var showTitleBar = showTitleBar
this.showTitleBar= showTitleBar
}


    open fun isShowTitleBar()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.showTitleBar
}


    open fun setProgressBarView(progressBarView: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var progressBarView = progressBarView
this.progressBarView= progressBarView
}


    open fun isProgressBarView()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.progressBarView
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("isFullscreen: ")
stringBuffer!!.appendboolean(this.isFullscreen())
stringBuffer!!.append(" isProgressBarView: ")
stringBuffer!!.appendboolean(this.isProgressBarView())
stringBuffer!!.append(" isShowTitleBar: ")
stringBuffer!!.appendboolean(this.isShowTitleBar())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

