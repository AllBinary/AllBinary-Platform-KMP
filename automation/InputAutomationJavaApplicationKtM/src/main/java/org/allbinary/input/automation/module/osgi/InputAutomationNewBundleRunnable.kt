
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
        package org.allbinary.input.automation.module.osgi




        import java.lang.Object        
        
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileFilter
import java.io.FileInputStream
import java.net.URL
import java.util.HashMap
import java.util.Set
import java.util.jar.JarInputStream
import java.util.jar.Manifest
import org.osgi.framework.Bundle
import org.osgi.framework.BundleContext
import org.osgi.framework.Constants
import bundle.input.automation.InputAutomationBundleActivator
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.FileWrapperUtil
import org.allbinary.logic.io.file.directory.SubDirectory
import org.allbinary.logic.io.file.filter.BasicFileFilterUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.thread.RunnableInterface
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class InputAutomationNewBundleRunnable
            : Object
        
                , RunnableInterface {
        
companion object {
            
    private val FILE: String = "file:"

    private val JAR_DIR_PROP: String = "org.knopflerfish.gosg.jars"

    private val INPUT_AUTMATION_MODULE_BUNDLE_JAR_PATH: String = "ia/auto"

    private val MODULES_START_LEVEL: Int = 8

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val inputAutomationBundleActivator: InputAutomationBundleActivator

    private var running: Boolean= false

    private var fileBasicArrayList: BasicArrayList
public constructor (inputAutomationBundleActivator: InputAutomationBundleActivator)
            : super()
        {
var inputAutomationBundleActivator = inputAutomationBundleActivator
this.inputAutomationBundleActivator= inputAutomationBundleActivator
this.fileBasicArrayList= BasicArrayList()
}


                @Throws(Exception::class)
            
    open fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{
var thread = thread
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var running = running
this.running= running
}


                @Throws(Exception::class)
            
    open fun updateModules()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(this.commonStrings!!.START, this, "updateModules")

    var list: BasicArrayList = this.findNewModules()!!


    var size: Int = list.size()!!


    var bundle: Bundle





                        for (index in 0 until size)

        {
bundle= this.install(list.get(index) as URL)

    
                        if(bundle != 
                                    null
                                )
                        
                                    {
                                    bundle.start(MODULES_START_LEVEL)

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun getAllJarSymbolicNameHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
logUtil!!.put(this.commonStrings!!.START, this, "getAllJarSymbolicNameHashMap")

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var jarFileBasicArrayList: BasicArrayList = this.getJarModuleFileBasicArrayList()!!

logUtil!!.put("Jar Module Files: " +jarFileBasicArrayList, this, "getAllJarSymbolicNameHashMap")

    var size: Int = jarFileBasicArrayList!!.size()!!


    var file: File





                        for (index in 0 until size)

        {
file= jarFileBasicArrayList!!.get(index) as File

    
                        if(!file.isDirectory())
                        
                                    {
                                    
    var fileInputStream: FileInputStream = FileInputStream(file)


    var jarInputStream: JarInputStream = JarInputStream(fileInputStream)


    var manifest: Manifest = jarInputStream!!.getManifest()!!


    
                        if(manifest == 
                                    null
                                )
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    var symbolicName: String = manifest.getMainAttributes()!!.getValue(Constants.BUNDLE_SYMBOLICNAME)!!


    
                        if(symbolicName != 
                                    null
                                )
                        hashMap!!.put(symbolicName, URL(FILE +file.getAbsolutePath()))

                        }
                            

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


    open fun getJarModuleFileBasicArrayList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
logUtil!!.put(this.commonStrings!!.START, this, "getJarModuleFileBasicArrayList")

    var baseJarPath: String = System.getProperty(JAR_DIR_PROP)!!


    
                        if(baseJarPath!!.startsWith(FILE))
                        
                                    {
                                    baseJarPath= baseJarPath!!.substring(FILE.length)

                                    }
                                

    var jarFileFilter: FileFilter = BasicFileFilterUtil.getInstance(".jar")!!


    var path: String = baseJarPath +INPUT_AUTMATION_MODULE_BUNDLE_JAR_PATH

logUtil!!.put("Path: " +path, this, "getJarModuleFileBasicArrayList")

    var file: File = File(path)

logUtil!!.put("File: " +file.getAbsolutePath() +" isDirectory: " +file.isDirectory(), this, "getJarModuleFileBasicArrayList")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SubDirectory.getInstance()!!.search(jarFileFilter, FileWrapperUtil.wrapFile(file))
}


                @Throws(Exception::class)
            
    open fun getInstalledJarSymbolicNameBasicArrayList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
logUtil!!.put(this.commonStrings!!.START, this, "getInstalledJarSymbolicNameBasicArrayList")

    var vector: BasicArrayList = BasicArrayList()


    var bundleContext: BundleContext = InputAutomationBundleActivator.getBundleContext()!!


    var bundleArray: Array<Bundle?> = bundleContext!!.getBundles()!!


    
                        if(bundleArray != 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("bundleArray: " +bundleArray!!.size, this, "getInputAutomationModuleServices")




                        for (index in 0 until bundleArray!!.size)

        {

    var bundle: Bundle = bundleArray[index]!!

vector.add(bundle.getSymbolicName())
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


                @Throws(Exception::class)
            
    open fun isInstalled(symbolicName: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var symbolicName = symbolicName
logUtil!!.put(CommonLabels.getInstance()!!.START +symbolicName, this, "isInstalled")

    var list: BasicArrayList = this.getInstalledJarSymbolicNameBasicArrayList()!!


    var size: Int = list.size()!!


    var nextSymbolicName: String





                        for (index in 0 until size)

        {
nextSymbolicName= list.get(index) as String

    
                        if(nextSymbolicName!!.compareTo(symbolicName) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    open fun findNewModules()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
logUtil!!.put(this.commonStrings!!.START, this, "findNewModules")

    var vector: BasicArrayList = BasicArrayList()


    var hashMap: HashMap<Any, Any> = this.getAllJarSymbolicNameHashMap()!!

logUtil!!.put("All: " +hashMap, this, "findNewModules")

    var set: Set = hashMap!!.keys!!


    var symbolicNameArray: Array<Any?> = set.toArray()!!


    var size: Int = symbolicNameArray!!.size
                





                        for (index in 0 until size)

        {

    var symbolicName: String = symbolicNameArray[index]!! as String


    
                        if(!this.isInstalled(symbolicName))
                        
                                    {
                                    vector.add(hashMap!!.get(symbolicName as Object))

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


                @Throws(Exception::class)
            
    open fun install(url: URL)
        //nullable = true from not(false or (false and false)) = true
: Bundle{
var url = url
logUtil!!.put(CommonLabels.getInstance()!!.START +url, this, "install")

    var bundleContext: BundleContext = InputAutomationBundleActivator.getBundleContext()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bundleContext!!.installBundle(url.toString())
}


    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
this.setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)


        while(this.isRunning())
        {
timeHelper!!.setStartTime()
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
this.updateModules()
break;

                    
}

logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

