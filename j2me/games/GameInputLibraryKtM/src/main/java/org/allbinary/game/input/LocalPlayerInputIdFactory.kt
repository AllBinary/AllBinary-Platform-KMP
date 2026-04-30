
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.analog.AnalogLocationInputFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker

open public class LocalPlayerInputIdFactory
            : Object
         {
        
companion object {
            
    private val instance: LocalPlayerInputIdFactory = LocalPlayerInputIdFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LocalPlayerInputIdFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LocalPlayerInputIdFactory.instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val MAX_NUMBER_OF_PLAYERS: Int = 6

    private val MAX_FAST_DEVICEID: Int = 65

    private val deviceIdToplayerId: IntArray = IntArray(this.MAX_FAST_DEVICEID)

    private val playerIdToDeviceId: IntArray = IntArray(this.MAX_NUMBER_OF_PLAYERS)

    private val playersInPlay: BooleanArray = BooleanArray(this.MAX_NUMBER_OF_PLAYERS)

    private var totalDevicesMapped: Int = 0
private constructor ()
            : super()
        {




                        for (index in deviceIdToplayerId!!.size -1 downTo 0)

        {
deviceIdToplayerId[index]=  -1
}

}


    open fun getDeviceId(playerInputId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var playerInputId = playerInputId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.playerIdToDeviceId[playerInputId]!!
}


    open fun getPlayerForDevice(deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var deviceId = deviceId

    var index: Int= 0


    
                        if(deviceId < this.MAX_FAST_DEVICEID)
                        
                                    {
                                    
    var playerInputId: Int = this.deviceIdToplayerId[deviceId]!!


    
                        if(playerInputId !=  -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return playerInputId

                                    }
                                

                                    }
                                
                        else {
                            



                        for (index in this.totalDevicesMapped -1 downTo 0)

        {

    
                        if(this.playerIdToDeviceId[index] == deviceId)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                
}


                        }
                            
index= this.totalDevicesMapped

    
                        if(deviceId < this.MAX_FAST_DEVICEID)
                        
                                    {
                                    this.deviceIdToplayerId[deviceId]= index

                                    }
                                
                        else {
                            this.logUtil!!.putF(StringMaker().
                            append("Added DeviceId: ")!!.appendint(deviceId)!!.append(" beyond fast Id list")!!.toString(), this, "getPlayerForDevice")

                        }
                            
this.playerIdToDeviceId[index]= deviceId
AnalogLocationInputFactory.getInstance()!!.addPlayer(this.totalDevicesMapped)
totalDevicesMapped++
this.logUtil!!.putF(StringMaker().
                            append("Added DeviceId: ")!!.appendint(deviceId)!!.append(" at: ")!!.appendint(index)!!.append(" Total: ")!!.appendint(this.totalDevicesMapped)!!.toString(), this, "getPlayerForDevice")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index
}


    open fun getTotalDevicesInPlay()
        //nullable = true from not(false or (false and true)) = true
: Int{

    var total: Int = 0





                        for (index in this.totalDevicesMapped -1 downTo 0)

        {

    
                        if(this.playersInPlay[index] == true)
                        
                                    {
                                    total++

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


    open fun isPlayerInPlay(playerInputId: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var playerInputId = playerInputId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.playersInPlay[playerInputId]!!
}


    open fun setPlayerInPlay(playerInputId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var playerInputId = playerInputId
this.logUtil!!.putF(StringMaker().
                            append("Setting PlayerInPlay with playerInputId: ")!!.appendint(playerInputId)!!.toString(), this, "setPlayerInPlay")
this.playersInPlay[playerInputId]= true
}


    open fun setPlayerOutOfPlay(playerInputId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var playerInputId = playerInputId
this.logUtil!!.putF(StringMaker().
                            append("Setting PlayerOutOfPlay with playerInputId: ")!!.appendint(playerInputId)!!.toString(), this, "setPlayerOutOfPlay")
this.playersInPlay[playerInputId]= false
}


    open fun getPlayersInPlay()
        //nullable = true from not(false or (false and true)) = true
: BooleanArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.playersInPlay
}


}
                
            

