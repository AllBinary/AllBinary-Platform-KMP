
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
        package org.allbinary.game.layer.hud.basic




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.business.advertisement.GameAdStateFactory
import org.allbinary.game.GameAdState
import org.allbinary.game.layer.hud.basic.notification.GameNotification
import org.allbinary.game.layer.hud.basic.notification.GameNotificationHud
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.CustomGPoint
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.CircularIndexUtil

open public class PlayerGameNotificationHud : GameNotificationHud {
        

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var string: String = this.EMPTY_STRING

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val circularIndexUtil: CircularIndexUtil

    private val gameNotification: GameNotification = GameNotification()

    private val permanentGameNotification: GameNotification = GameNotification()

    private var point: CustomGPoint = CustomGPoint.NULL_CUSTOM_POINT

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
public constructor        (location: Int, direction: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int, basicColor: BasicColor)                        

                            : super(location, direction, maxHeight, maxWidth, bufferZone, basicColor)

        Updates for KMP build        
        {
var location = location
var direction = direction
var maxHeight = maxHeight
var maxWidth = maxWidth
var bufferZone = bufferZone
var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.circularIndexUtil= CircularIndexUtil.getInstance(0)

    var gameNotificationEventHandler: GameNotificationEventHandler = GameNotificationEventHandler.getInstance()!!

gameNotificationEventHandler!!.removeAllListeners()
gameNotificationEventHandler!!.addListener(this)
}

override fun getPoint(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GPoint

        Updates for KMP build        
        {
var x = x
var y = y
point= CustomGPoint(0, 0)
this.point.setX(x)
this.point.setY(y)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


    private val PERMANENT_GAME_NOTIFICATION: String = "Permanent Game Notification: "

    private var lastString: String = StringUtil.getInstance()!!.EMPTY_STRING
override fun add(string: String, seconds: Integer, basicColor: BasicColor, permanent: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var string = string
    //var seconds = seconds
    //var basicColor = basicColor
    //var permanent = permanent

    
                        if(permanent)
                        
                                    {
                                    
    
                        if(lastString != string)
                        
                                    {
                                    this.lastString= string
logUtil!!.put(StringMaker().
                            append(PERMANENT_GAME_NOTIFICATION)!!.append(string)!!.toString(), this, commonStrings!!.ADD)

                                    }
                                
this.permanentGameNotification!!.add(string, seconds, basicColor)
this.circularIndexUtil!!.setSize(this.permanentGameNotification!!.getSize())

                                    }
                                
                        else {
                            this.gameNotification!!.add(string, seconds, basicColor)

                        }
                            
}


                @Throws(Exception::class)
            override fun processTick()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(this.timeDelayHelper!!.isTime(gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    
    var gameAdState: GameAdState = GameAdStateFactory.getInstance()!!.getCurrentInstance()!!


    
                        if(gameAdState!!.isShowingAt(this.getLocation()))
                        
                                    {
                                    this.offsetY=  -54

                                    }
                                
                        else {
                            this.offsetY= 0

                        }
                            

    
                        if(this.gameNotification!!.getSize() > 0)
                        
                                    {
                                    this.setAndRemove()

                                    }
                                
                             else 
    
                        if(this.permanentGameNotification!!.getSize() > 0)
                        
                                    {
                                    this.setNextUnremoveable()

                                    }
                                
                        else {
                            this.string= this.EMPTY_STRING

                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            
open fun setAndRemove()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.string= this.gameNotification!!.stringList!!.remove(0) as String

    var width: Int = MyFont.getInstance()!!.stringWidth2(this.string)!!

this.setX((displayInfo!!.getLastWidth() -width) shr 1)
this.point.setX(this.getX())
this.point.setY(this.getY())

    var time: Integer = this.gameNotification!!.timeList!!.remove(0) as Integer


    var iTime: Int = time.toInt() *1000


    
                        if(iTime == 0)
                        
                                    {
                                    iTime= 500

                                    }
                                
this.timeDelayHelper!!.delay= iTime
this.setBasicColorP(this.gameNotification!!.colorList!!.remove(0) as BasicColor)
}


                @Throws(Exception::class)
            
open fun setNextUnremoveable()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var index: Int = this.circularIndexUtil!!.getIndex()!!

this.string= this.permanentGameNotification!!.stringList!!.objectArray[index]!! as String

    var width: Int = MyFont.getInstance()!!.stringWidth2(this.string)!!

this.setX((displayInfo!!.getLastWidth() -width) shr 1)
this.point.setX(this.getX())
this.point.setY(this.getY())

    var time: Integer = this.permanentGameNotification!!.timeList!!.objectArray[index]!! as Integer

this.timeDelayHelper!!.delay= time.toInt() *1000
this.setBasicColorP(this.permanentGameNotification!!.colorList!!.objectArray[index]!! as BasicColor)
this.circularIndexUtil!!.next()
}

override fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.gameNotification!!.clear()
this.permanentGameNotification!!.clear()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
super.paint(graphics, this.string)
}


}
                
            

