
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.input.form



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.RTSGameStrings
import org.allbinary.game.layer.RTSInterface
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.TechnologyRTSInterfaceImageItem
import org.allbinary.game.layer.capital.Capital
import org.allbinary.game.rts.technology.event.TechEventHandler
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.media.audio.BuildingSound
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface

open public class TechRTSFormInput : RTSFormInput {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val EVENT: AllBinaryEventObject = AllBinaryEventObject(this)

    val noMoneyGameNotificationEvent: GameNotificationEvent
public constructor        (groupInterface: Array<Group?>)                        

                            : super(groupInterface){

                    var groupInterface = groupInterface


                            //For kotlin this is before the body of the constructor.
                    

    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            

this.noMoneyGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NO_MONEY, SmallIntegerSingletonFactory.getInstance()!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.noMoneyGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
}


                @Throws(Exception::class)
            
open fun process(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, itemIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var item = item


                    var itemIndex = itemIndex
super.process(layerManager)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var technologyRTSInterfaceImageItem: TechnologyRTSInterfaceImageItem = item as TechnologyRTSInterfaceImageItem


    var rtsInterface: RTSInterface = technologyRTSInterfaceImageItem!!.getRtsInterface()!!
            

logUtil!!.put("isUpgradeable: " +rtsInterface!!.isUpgradeable(), this, commonStrings!!.PROCESS)

    
                        if(rtsInterface!!.isUpgradeable())
                        
                                    {
                                    
    var cost: Int = rtsInterface!!.getUpgradeCost()!!
            


    var capital: Capital = rtsPlayerLayerInterface!!.getCapital()!!
            

logUtil!!.put(cost +"<=" +capital!!.getTotalMoney(), this, commonStrings!!.PROCESS)

    
                        if(cost <= capital!!.getTotalMoney())
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(BuildingSound.getInstance())
capital!!.removeMoney(cost)
rtsInterface!!.upgrade()
technologyRTSInterfaceImageItem!!.update()
TechEventHandler.getInstance()!!.fireEvent(EVENT)

                                    }
                                
                        else {
                            rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(noMoneyGameNotificationEvent)

                                    }
                                

                        }
                            

                                    }
                                
}


}
                
            

