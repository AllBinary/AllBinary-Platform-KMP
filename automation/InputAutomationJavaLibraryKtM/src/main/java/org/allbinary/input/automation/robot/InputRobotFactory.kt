
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
        package org.allbinary.input.automation.robot




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.util.Collection
import java.util.Hashtable
import java.util.Iterator
import java.util.Set
import javax.help.HelpSet
import javax.help.event.HelpSetEvent
import javax.help.event.HelpSetListener
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.help.JavaHelpSetNotifier
import org.allbinary.logic.java.anyType.InterfaceUtil
import org.allbinary.logic.system.loader.SecuredNativeLibraryInterface
import org.allbinary.string.CommonStrings

open public class InputRobotFactory
            : Object
         {
        
companion object {
            
    private val inputRobotFactory: InputRobotFactory = InputRobotFactory()

                @Throws(Exception::class)
            
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputRobotFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputRobotFactory
}


                @Throws(Exception::class)
            
    open fun loadLibraries(collection: Collection)
        //nullable = true from not(false or (false and false)) = true
{
var collection = collection

    var logUtil: LogUtil = LogUtil.getInstance()!!

logUtil!!.put("Loading Libraries", "InputRobotFactory", "loadLibraries")

    var iterator: Iterator = collection.iterator()!!


        while(iterator.hasNext())
        {
loadLibrary(iterator.next() as InputRobotInterface)
}

}


                @Throws(Exception::class)
            
    open fun loadLibrary(inputRobotInterface: InputRobotInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputRobotInterface = inputRobotInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!


    
                        if(InterfaceUtil.isImplemented(SecuredNativeLibraryInterface::class, inputRobotInterface))
                        
                                    {
                                    logUtil!!.put("Loading Library: " +inputRobotInterface!!.getName(), "InputRobotFactory", "loadLibraries")

    var securedNativeLibraryInterface: SecuredNativeLibraryInterface = inputRobotInterface as SecuredNativeLibraryInterface

securedNativeLibraryInterface!!.load()

                                    }
                                
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    private var helpSetListenerInterface: HelpSetListener
private constructor ()
            : super()
        {

        try {
            
    var graphenv: GraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment()!!


    var screens: Array<GraphicsDevice?> = graphenv.getScreenDevices()!!


    var inputRobotInterface: InputRobotInterface





                        for (i in 0 until screens.size)

        {
inputRobotInterface= InputRobot(screens[i]!!) as InputRobotInterface
logUtil!!.put("Adding Robot: " +inputRobotInterface!!.getName(), this, "getRobots")
this.get()!!.put(inputRobotInterface!!.getName(), inputRobotInterface)
}

logUtil!!.put("Number Of Robots: " +this.hashtable.size, this, "getRobots")
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.CONSTRUCTOR)
}

}


    open fun addListener(helpSetListenerInterface: HelpSetListener)
        //nullable = true from not(false or (false and false)) = true
{
    //var helpSetListenerInterface = helpSetListenerInterface
this.helpSetListenerInterface= helpSetListenerInterface
}


                @Throws(Exception::class)
            
    open fun add(inputRobotInterface: InputRobotInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputRobotInterface = inputRobotInterface
logUtil!!.put("Adding InputRobotInterface: " +inputRobotInterface!!.getName(), this, "add")
this.get()!!.put(inputRobotInterface!!.getName(), inputRobotInterface)

    var helpSet: HelpSet = inputRobotInterface!!.getHelpSet()!!


    
                        if(this.helpSetListenerInterface != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(helpSet != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(!JavaHelpSetNotifier.isNotified(helpSet))
                        
                                    {
                                    
    var helpSetEvent: HelpSetEvent = HelpSetEvent(this, helpSet, HelpSetEvent.HELPSET_ADDED)

this.helpSetListenerInterface!!.helpSetAdded(helpSetEvent)

                                    }
                                

                                    }
                                
                        else {
                            logUtil!!.put("Null HelpSet For: " +inputRobotInterface!!.getName(), this, "add")

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put("No HelpSet Listener", this, "add")

                        }
                            
}


                @Throws(Exception::class)
            
    open fun loadLibraries()
        //nullable = true from not(false or (false and true)) = true
{

    var set: Set = this.get()!!.keySet()!!

logUtil!!.put("Loading Libraries", this, "loadLibraries")

    var nameArray: Array<Any?> = set.toArray()!!


    var size: Int = nameArray!!.size
                





                        for (index in 0 until size)

        {

    var inputRobotInterface: InputRobotInterface = InputRobotFactory.getInstance()!!.get(nameArray[index]!! as String)!!

loadLibrary(inputRobotInterface)
}

}


                @Throws(Exception::class)
            
    open fun unloadLibraries()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put("Unloading Libraries", this, "unloadLibraries")

    var set: Set = this.get()!!.keySet()!!


    var inputRobotInterface: InputRobotInterface


    var inputRobotArray: Array<Any?> = set.toArray()!!


    var size: Int = inputRobotArray!!.size
                





                        for (index in 0 until size)

        {
inputRobotInterface= this.get(inputRobotArray[index]!! as String)

    
                        if(InterfaceUtil.isImplemented(SecuredNativeLibraryInterface::class, inputRobotInterface))
                        
                                    {
                                    logUtil!!.put("Unloading Library: " +inputRobotInterface!!.getName(), this, "unloadLibraries")

    var securedNativeLibraryInterface: SecuredNativeLibraryInterface = inputRobotInterface as SecuredNativeLibraryInterface

securedNativeLibraryInterface!!.unload()

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun get()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


    open fun get(name: String)
        //nullable = true from not(false or (false and false)) = true
: InputRobotInterface{
    //var name = name
logUtil!!.put("Getting Robot: " +name, this, "getRobots")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable.get(name as Object) as InputRobotInterface
}


}
                
            

