
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.business.advertisement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameType
import org.allbinary.game.state.GameState
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class GameAdStateBase
            : Object
         {
        

    val adConfiguration: AdConfiguration

    val advertisements: Advertisements = Advertisements()

    var okayToShowAds: Boolean= false
public constructor (adConfiguration: AdConfiguration)
            : super()
        {
    //var adConfiguration = adConfiguration
this.adConfiguration= adConfiguration
}


    open fun initViewArray(viewArray: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
{
var viewArray = viewArray
}


    open fun onStart(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{
var anyType = anyType
this.init()
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun isShowingAtLocation(location: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var location = location



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isShowingAt()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun show()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun hide()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    open fun processAdState(gameState: GameState, gameType: GameType)
        //nullable = true from not(false or (false and false)) = true
{
var gameState = gameState
var gameType = gameType
}


    open fun processPageAdState()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    open fun playingAdState()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    open fun playingAdState(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{
var width = width
var height = height
}


                @Throws(Exception::class)
            
    open fun notPlayingAdState()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun setGameIsReady(gameIsReady: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var gameIsReady = gameIsReady
}


    open fun isGameIsReady()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun getAdvertisements()
        //nullable = true from not(false or (false and true)) = true
: Advertisements{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return advertisements
}


    open fun getAdConfiguration()
        //nullable = true from not(false or (false and true)) = true
: AdConfiguration{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adConfiguration
}


    open fun isOkayToShowPageAd()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun setOkayToShowAds(okayToShowAds: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var okayToShowAds = okayToShowAds
this.okayToShowAds= okayToShowAds
}


    open fun isOkayToShowAds()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return okayToShowAds
}


    open fun isEnabled()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

