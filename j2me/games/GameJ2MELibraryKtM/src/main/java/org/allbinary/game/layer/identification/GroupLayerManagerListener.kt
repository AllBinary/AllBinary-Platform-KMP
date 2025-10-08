
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
        package org.allbinary.game.layer.identification




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.identification.Group
import org.allbinary.game.identification.GroupInterfaceCompositeInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.event.LayerManagerEvent
import org.allbinary.layer.event.LayerManagerEventHandler
import org.allbinary.layer.event.LayerManagerEventListener
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class GroupLayerManagerListener : LayerManagerEventListener {
        
companion object {
            
    private var SINGLETON: GroupLayerManagerListener = GroupLayerManagerListener()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GroupLayerManagerListener{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val list: BasicArrayList = BasicArrayList()
private constructor (){
LayerManagerEventHandler.getInstance()!!.addListener(this)
}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{

    var groupList: BasicArrayList


    var size: Int = list.size()!!





                        for (index in size -1 downTo 0)

        {
groupList= this.list.objectArray[index]!! as BasicArrayList
groupList!!.clear()
}

}


    open fun getGroupSize(groupInterfaceCompositeInterface: GroupInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var groupInterfaceCompositeInterface = groupInterfaceCompositeInterface

    var groupInterfaceArray: Array<Group?> = groupInterfaceCompositeInterface!!.getGroupInterface()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getGroupSize(groupInterfaceArray[0]!!)
}


    open fun getGroupSize(groupInterface: Group)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var groupInterface = groupInterface

    var id: Int = groupInterface!!.getGroupId().toInt()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getGroupSize(id)
}


    open fun getList(groupInterface: Group)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var groupInterface = groupInterface

    var id: Int = groupInterface!!.getGroupId().toInt()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getList(id)
}


    open fun getList(groupId: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var groupId = groupId

    var groupList: BasicArrayList = this.list.objectArray[groupId]!! as BasicArrayList




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return groupList
}


    open fun getGroupSize(groupId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var groupId = groupId

    var groupList: BasicArrayList = this.list.objectArray[groupId]!! as BasicArrayList


    var size: Int = groupList!!.size()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return size
}


    open fun areAllOtherGroupsEmpty(groupInterface: Group)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var groupInterface = groupInterface

    var id: Int = groupInterface!!.getGroupId().toInt()


    var size: Int = list.size()!!





                        for (index in size -1 downTo 0)

        {

    
                        if(id != index)
                        
                                    {
                                    
    var groupSize: Int = this.getGroupSize(index)!!


    
                        if(groupSize != 0)
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("Group Size: ")!!.append(groupSize)!!.toString(), this, "areAllOtherGroupsEmpty")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun isIdInList(id: Int, excludeGroupList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var id = id
    //var excludeGroupList = excludeGroupList

    var size: Int = excludeGroupList!!.size()!!


    var groupInterfaceArray: Array<Group?>


    var groupInterface: Group


    var groupId: Int= 0





                        for (index in size -1 downTo 0)

        {
groupInterfaceArray= excludeGroupList!!.objectArray[index]!! as Array<Group?>

    var size2: Int = groupInterfaceArray!!.size
                





                        for (index2 in 0 until size2)

        {
groupInterface= groupInterfaceArray[index2]!!
groupId= groupInterface!!.getGroupId().toInt()

    
                        if(groupId == id)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun areAllOtherGroupsLessThan(excludeGroupList: BasicArrayList, maxSize: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var excludeGroupList = excludeGroupList
    //var maxSize = maxSize

    var size: Int = list.size()!!





                        for (index in size -1 downTo 0)

        {

    
                        if(!this.isIdInList(index, excludeGroupList))
                        
                                    {
                                    
    var groupSize: Int = this.getGroupSize(index)!!


    
                        if(groupSize >= maxSize)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun init(total: Int)
        //nullable = true from not(false or (false and false)) = true
{
var total = total

        while(this.list.size() <= total +1)
        {
this.list.add(BasicArrayList())
}

}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
    override fun onCreateLayerManagerEvent(layerManagerEvent: LayerManagerEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManagerEvent = layerManagerEvent

    var layerInterface: AllBinaryLayer = layerManagerEvent!!.getLayerInterface()!!


    var groupInterfaceArray: Array<Group?> = layerInterface!!.getGroupInterface()!!


    var size: Int = groupInterfaceArray!!.size
                


    var id: Int= 0


    var groupList: BasicArrayList





                        for (index in 0 until size)

        {
id= groupInterfaceArray[index]!!.getGroupId().toInt()
groupList= this.list.objectArray[id]!! as BasicArrayList

    
                        if(groupList == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("id: ")!!.append(id)!!.toString(), this, "onCreateLayerManagerEvent")

                                    }
                                

    
                        if(!groupList!!.contains(layerInterface))
                        
                                    {
                                    groupList!!.add(layerInterface)

                                    }
                                
                        else {
                            
                        }
                            
}

}


                @Throws(Exception::class)
            
    override fun onDeleteLayerManagerEvent(layerManagerEvent: LayerManagerEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManagerEvent = layerManagerEvent

    var layerInterface: AllBinaryLayer = layerManagerEvent!!.getLayerInterface()!!


    var groupInterfaceArray: Array<Group?> = layerInterface!!.getGroupInterface()!!


    var size: Int = groupInterfaceArray!!.size
                


    var id: Int= 0


    var groupList: BasicArrayList





                        for (index in 0 until size)

        {
id= groupInterfaceArray[index]!!.getGroupId().toInt()
groupList= this.list.objectArray[id]!! as BasicArrayList
groupList!!.remove(layerInterface)
}

}


    open fun log()
        //nullable = true from not(false or (false and true)) = true
{

    var stringBuffer: StringMaker = StringMaker()


    var GROUP: String = "Group: "


    var SPACE: String = CommonSeps.getInstance()!!.SPACE


    var TOTAL_LABEL: String = CommonLabels.getInstance()!!.TOTAL_LABEL


    var size: Int = list.size()!!





                        for (index in size -1 downTo 0)

        {

    var groupList: BasicArrayList = this.list.objectArray[index]!! as BasicArrayList

stringBuffer!!.append(GROUP)
stringBuffer!!.append(index)
stringBuffer!!.append(SPACE)
stringBuffer!!.append(TOTAL_LABEL)
stringBuffer!!.append(groupList!!.size())
stringBuffer!!.append(SPACE)
}

logUtil!!.put(stringBuffer!!.toString(), this, "log")
}


}
                
            

