
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
        package org.allbinary.input.automation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.net.URI
import java.net.URL
import javax.help.HelpSet
import javax.help.event.HelpSetEvent
import javax.help.event.HelpSetListener
import javax.swing
import bundle.input.automation.InputAutomationBundleActivatorListenerInterface
import bundle.input.automation.module.configuration.InputAutomationConfigurationModuleChangeListener
import bundle.input.automation.robot.InputAutomationRobotChangeListener
import org.allbinary.globals.AppUrlGlobals
import org.allbinary.globals.URLGLOBALS
import org.allbinary.gui.dialog.BasicTextJDialog
import org.allbinary.gui.swing.workers.JListSwingWorker
import org.allbinary.input.automation.configuration.InputAutomationConfiguration
import org.allbinary.input.automation.configuration.InputAutomationConfigurationFactory
import org.allbinary.input.automation.configuration.InputAutomationConfigurationModuleChangeEvent
import org.allbinary.input.automation.module.InputAutomationModuleFactoryFactory
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfigurations
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfigurationsSingletonFactory
import org.allbinary.input.automation.osgi.DesktopBundle
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.osgi.InputAutomationRobotChangeEvent
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.java.help.JavaHelpUtil
import org.allbinary.logic.system.loader.WebappClassLoaderInfo
import org.allbinary.logic.system.security.licensing.InputAutomationClientInformationFactory
import org.allbinary.string.CommonStrings
import org.allbinary.thread.RunnableInterface

open public class InputAutomationJFrame : swing.JFrame
                , InputAutomationConfigurationModuleChangeListener
                , InputAutomationRobotChangeListener
                , HelpSetListener {
        

        companion object {


    private var INPUTAUTOMATION_JFRAME: InputAutomationJFrame

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputAutomationJFrame{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INPUTAUTOMATION_JFRAME
}


open fun destroy()
        //nullable = true from not(false or (false and true)) = true
{INPUTAUTOMATION_JFRAME.setVisible(false)
}


open fun create(inputAutomationBundleActivatorListenerInterface: InputAutomationBundleActivatorListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationBundleActivatorListenerInterface = inputAutomationBundleActivatorListenerInterface
LogConfigTypeFactory.getInstance()

    var appUrlGlobals: AppUrlGlobals = AppUrlGlobals()

appUrlGlobals!!.setWebappPath(
                            "G:/mnt/bc/mydev/work_automation/automation/run/")
URLGLOBALS.init(appUrlGlobals)
WebappClassLoaderInfo.setLoader(appUrlGlobals!!::class.getClassLoader())
java!!.awt!!.EventQueue.invokeLater(object: Runnable()
                                {
                                
open fun run()
        //nullable = true from not(false or (false and true)) = true
{
    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


        try {
            logUtil!!.put(
                            "Running", this, commonStrings!!.RUN)
INPUTAUTOMATION_JFRAME= InputAutomationJFrame()
InputRobotFactory.getInstance()!!.addListener(InputAutomationJFrame.getInstance())

    
                        if(inputAutomationBundleActivatorListenerInterface != 
                                    null
                                )
                        
                                    {
                                    inputAutomationBundleActivatorListenerInterface!!.registerAsService()
inputAutomationBundleActivatorListenerInterface!!.useServices()

                                    }
                                
INPUTAUTOMATION_JFRAME.setVisible(true)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            )
}


                @Throws(Exception::class)
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args
InputAutomationJFrame.create(
                            null)
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var inputAutomationModuleFactory: InputAutomationModuleFactoryFactory

    private var inputAutomationModuleInterface: InputAutomationModuleFactoryInterface

    private var runnableInterface: RunnableInterface

    private var thread: Thread

    private var helpSet: HelpSet

    private val uri: URI = URI(
                            "http://geocities.com/allbinary/")
public constructor        (){initComponents()

    var url: URL = this::class.getResource(
                            "/help/Help.hs")!!
            

logUtil!!.put("URL: " +url, this, this.commonStrings!!.CONSTRUCTOR)
helpSet= JavaHelpUtil.getInstance()!!.getHelpSet(url)
url= this::class.getResource(
                            "/resources/allbinaryicon8bit.jpg")

    var imageIcon: ImageIcon = ImageIcon(url)

this.setIconImage(imageIcon!!.getImage())
this.init()
}


open fun helpSetAdded(helpSetEvent: HelpSetEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var helpSetEvent = helpSetEvent
this.helpSet!!.add(helpSetEvent!!.getHelpSet())
}


open fun helpSetRemoved(helpSetEvent: HelpSetEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var helpSetEvent = helpSetEvent
this.helpSet!!.remove(helpSetEvent!!.getHelpSet())
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{InputAutomationConfigurationFactory.init(InputAutomationClientInformationFactory.getInstance())
this.inputAutomationModuleFactory= InputAutomationModuleFactoryFactory(this)
 = 
.
                                execute()
this.gameRobotJTabbedPane!!.setEnabledAt(1, false)
this.gameRobotJTabbedPane!!.setSelectedIndex(0)
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{noModuleSelectedJDialog= JDialog()
noModuleSelectedJLabel= JLabel()
gameRobotJTabbedPane= JTabbedPane()
inputAutomationModuleJPanel= JPanel()
jScrollPane1= JScrollPane()
inputAutomationModuleJList= JList()
automationModuleConfigurationJPanel= JPanel()
mainJMenuBar= JMenuBar()
processingJMenu= JMenu()
startJMenuItem= JMenuItem()
stopJMenuItem= JMenuItem()
optionsJMenu= JMenu()
stopOnFocusJCheckBoxMenuItem= JCheckBoxMenuItem()
toolsJMenu= JMenu()
helpJMenuItem= JMenuItem()
updatesJMenuItem= JMenuItem()
subscriptionJMenuItem= JMenuItem()
modulesJMenuItem= JMenuItem()
aboutJMenuItem= JMenuItem()
noModuleSelectedJDialog!!.setMinimumSize(Dimension(200, 100))
noModuleSelectedJLabel!!.setText(
                            "Please Select A Module")

    var noModuleSelectedJDialogLayout: GroupLayout = GroupLayout(noModuleSelectedJDialog!!.getContentPane())

noModuleSelectedJDialog!!.getContentPane()!!.setLayout(noModuleSelectedJDialogLayout)
noModuleSelectedJDialogLayout!!.setHorizontalGroup(noModuleSelectedJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(noModuleSelectedJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(noModuleSelectedJLabel)!!.addContainerGap(javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
noModuleSelectedJDialogLayout!!.setVerticalGroup(noModuleSelectedJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(noModuleSelectedJLabel, javax!!.swing!!.GroupLayout.Alignment.TRAILING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
setDefaultCloseOperation(javax!!.swing!!.WindowConstants.EXIT_ON_CLOSE)
setMinimumSize(Dimension(325, 215))
setResizable(false)
addWindowFocusListener(object: WindowFocusListener()
                                {
                                
open override fun windowGainedFocus(evt: WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
formWindowGainedFocus(evt)
}

open override fun windowLostFocus(evt: WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
formWindowLostFocus(evt)
}

                                }
                            )
addFocusListener(object: FocusAdapter()
                                {
                                
open override fun focusGained(evt: FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
formFocusGained(evt)
}

open override fun focusLost(evt: FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
formFocusLost(evt)
}

                                }
                            )
gameRobotJTabbedPane!!.setMinimumSize(Dimension(320, 200))
inputAutomationModuleJList!!.setMinimumSize(Dimension(200, 0))
inputAutomationModuleJList!!.addListSelectionListener(object: ListSelectionListener()
                                {
                                
open override fun valueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
inputAutomationModuleJListValueChanged(evt)
}

                                }
                            )
jScrollPane1!!.setViewportView(inputAutomationModuleJList)

    var inputAutomationModuleJPanelLayout: GroupLayout = GroupLayout(inputAutomationModuleJPanel)

inputAutomationModuleJPanel!!.setLayout(inputAutomationModuleJPanelLayout)
inputAutomationModuleJPanelLayout!!.setHorizontalGroup(inputAutomationModuleJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(inputAutomationModuleJPanelLayout!!.createSequentialGroup()!!.addComponent(jScrollPane1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 199, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(367, Short.MAX_VALUE)))
inputAutomationModuleJPanelLayout!!.setVerticalGroup(inputAutomationModuleJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(inputAutomationModuleJPanelLayout!!.createSequentialGroup()!!.addComponent(jScrollPane1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 330, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
gameRobotJTabbedPane!!.addTab(
                            "Modules", inputAutomationModuleJPanel)

    var automationModuleConfigurationJPanelLayout: GroupLayout = GroupLayout(automationModuleConfigurationJPanel)

automationModuleConfigurationJPanel!!.setLayout(automationModuleConfigurationJPanelLayout)
automationModuleConfigurationJPanelLayout!!.setHorizontalGroup(automationModuleConfigurationJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 566, Short.MAX_VALUE))
automationModuleConfigurationJPanelLayout!!.setVerticalGroup(automationModuleConfigurationJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 334, Short.MAX_VALUE))
gameRobotJTabbedPane!!.addTab(
                            "Configuration", automationModuleConfigurationJPanel)
processingJMenu!!.setText(
                            "Processing")
processingJMenu!!.setToolTipText(
                            "Set module processing state")
startJMenuItem!!.setText(this.commonStrings!!.START)
startJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
startJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(startJMenuItem)
stopJMenuItem!!.setText(
                            "Stop")
stopJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
stopJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(stopJMenuItem)
mainJMenuBar!!.add(processingJMenu)
optionsJMenu!!.setText(
                            "Options")
optionsJMenu!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
optionsJMenuActionPerformed(evt)
}

                                }
                            )
stopOnFocusJCheckBoxMenuItem!!.setSelected(true)
stopOnFocusJCheckBoxMenuItem!!.setEnabled(false)
stopOnFocusJCheckBoxMenuItem!!.setLabel(
                            "Stop Module On Focus")
stopOnFocusJCheckBoxMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
stopOnFocusJCheckBoxMenuItemActionPerformed(evt)
}

                                }
                            )
optionsJMenu!!.add(stopOnFocusJCheckBoxMenuItem)
mainJMenuBar!!.add(optionsJMenu)
toolsJMenu!!.setText(
                            "Help")
helpJMenuItem!!.setText(
                            "Help")
helpJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
helpJMenuItemActionPerformed(evt)
}

                                }
                            )
toolsJMenu!!.add(helpJMenuItem)
updatesJMenuItem!!.setText(
                            "Updates")
updatesJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
updatesJMenuItemActionPerformed(evt)
}

                                }
                            )
toolsJMenu!!.add(updatesJMenuItem)
subscriptionJMenuItem!!.setText(
                            "Subscription")
subscriptionJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
subscriptionJMenuItemActionPerformed(evt)
}

                                }
                            )
toolsJMenu!!.add(subscriptionJMenuItem)
modulesJMenuItem!!.setText(
                            "Module Manager")
modulesJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
modulesJMenuItemActionPerformed(evt)
}

                                }
                            )
toolsJMenu!!.add(modulesJMenuItem)
aboutJMenuItem!!.setText(
                            "About")
aboutJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
aboutJMenuItemActionPerformed(evt)
}

                                }
                            )
toolsJMenu!!.add(aboutJMenuItem)
mainJMenuBar!!.add(toolsJMenu)
setJMenuBar(mainJMenuBar)

    var layout: GroupLayout = GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(gameRobotJTabbedPane, javax!!.swing!!.GroupLayout.Alignment.TRAILING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(gameRobotJTabbedPane, javax!!.swing!!.GroupLayout.Alignment.TRAILING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
pack()
}


open fun subscriptionJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            Desktop.getDesktop()!!.browse(uri)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "subscriptionJMenuItemActionPerformed", e)
}

}


open fun updatesJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            Desktop.getDesktop()!!.browse(uri)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "updatesJMenuItemActionPerformed", e)
}

}


open fun aboutJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var textJDialog: JDialog = BasicTextJDialog(
                            "Copyright (c) 2002-2007 AllBinary")

textJDialog!!.setVisible(true)
textJDialog!!.setLocationRelativeTo(this)
}


open fun modulesJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            DesktopBundle().
                            start()
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "modulesJMenuItemActionPerformed", e)
}

}


open fun helpJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
JavaHelpUtil.getInstance()!!.show(helpSet)
}


open fun stopOnFocusJCheckBoxMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun optionsJMenuActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun formWindowLostFocus(evt: WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
logUtil!!.put(
                            "Nothing", this, 
                            "focusLost")
}


open fun formWindowGainedFocus(evt: WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    
                        if(this.stopOnFocusJCheckBoxMenuItem!!.isSelected())
                        
                                    {
                                    logUtil!!.put(
                            "Stopping", this, 
                            "focusGained")

    
                        if(this.runnableInterface != 
                                    null
                                )
                        
                                    {
                                    this.runnableInterface!!.setRunning(false)

                                    }
                                

                                    }
                                
}


open fun formFocusLost(evt: FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun formFocusGained(evt: FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun inputAutomationModuleJListValueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var gameAutomationRobotModuleNameString: String = this.inputAutomationModuleJList!!.getSelectedValue() as String


    
                        if(gameAutomationRobotModuleNameString != 
                                    null
                                )
                        
                                    {
                                    this.inputAutomationModuleInterface= this.inputAutomationModuleFactory!!.getInstance(gameAutomationRobotModuleNameString)
this.getAutomationModuleConfigurationJPanel()!!.removeAll()

    var layout: GroupLayout = this.getAutomationModuleConfigurationJPanel()!!.getLayout() as GroupLayout

layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(inputAutomationModuleInterface!!.getConfigurationJPanel(), javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(inputAutomationModuleInterface!!.getConfigurationJPanel(), javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))
this.gameRobotJTabbedPane!!.setEnabledAt(1, true)
logUtil!!.put("Setting Module: " +gameAutomationRobotModuleNameString +" and Configuration JPanel", this, 
                            "gameAutomationRobotModuleJListValueChanged")

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Module name was null", this, 
                            "gameAutomationRobotModuleJListValueChanged")
this.gameRobotJTabbedPane!!.setEnabledAt(1, false)

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "gameAutomationRobotModuleJListValueChanged", e)
}

}


open fun stopJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    
                        if(this.runnableInterface != 
                                    null
                                )
                        
                                    {
                                    this.runnableInterface!!.setRunning(false)

                                    }
                                
                        else {
                            this.noModuleSelectedJDialog!!.setVisible(true)
this.noModuleSelectedJDialog!!.setLocationRelativeTo(this)

                        }
                            
}


open fun startJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "startJMenuItemActionPerformed")

    
                        if(inputAutomationModuleInterface != 
                                    null
                                )
                        
                                    {
                                    this.runnableInterface= inputAutomationModuleInterface!!.getInstance()

    
                        if(this.runnableInterface != 
                                    null
                                )
                        
                                    {
                                    this.thread= Thread(this.runnableInterface)
thread!!.setPriority(Thread.MIN_PRIORITY +1)
thread!!.start()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Runnnable was null", this, 
                            "startJMenuItemActionPerformed")
this.noModuleSelectedJDialog!!.setVisible(true)
this.noModuleSelectedJDialog!!.setLocationRelativeTo(this)

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put(
                            "InputAutomationModuleInterface was null", this, 
                            "startJMenuItemActionPerformed")
this.noModuleSelectedJDialog!!.setVisible(true)
this.noModuleSelectedJDialog!!.setLocationRelativeTo(this)

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "startJMenuItemActionPerformed", e)
}

}


open fun getAutomationModuleConfigurationJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return automationModuleConfigurationJPanel
}


open fun setAutomationModuleConfigurationJPanel(automationModuleConfigurationJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var automationModuleConfigurationJPanel = automationModuleConfigurationJPanel
this.automationModuleConfigurationJPanel= automationModuleConfigurationJPanel
}


open fun onAdd(inputAutomationRobotChangeEvent: InputAutomationRobotChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationRobotChangeEvent = inputAutomationRobotChangeEvent

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "onAdd")
InputRobotFactory.getInstance()!!.add(inputAutomationRobotChangeEvent!!.getInputAutomationRobotInterfaceWrapper()!!.getInputRobotInterface())
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "onAdd", e)
}

}


open fun onRemove(inputAutomationRobotChangeEvent: InputAutomationRobotChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationRobotChangeEvent = inputAutomationRobotChangeEvent

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "onRemove")
InputRobotFactory.getInstance()!!.add(inputAutomationRobotChangeEvent!!.getInputAutomationRobotInterfaceWrapper()!!.getInputRobotInterface())
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "onRemove", e)
}

}


open fun onAdd(inputAutomationConfigurationChangeEvent: InputAutomationConfigurationModuleChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationConfigurationChangeEvent = inputAutomationConfigurationChangeEvent

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "onAdd")

    var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurationsSingletonFactory.getInstance()!!
            

inputAutomationModuleConfigurations!!.add(inputAutomationConfigurationChangeEvent!!.getInputAutomationModuleConfiguration())
this.init()
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "onAdd", e)
}

}


open fun onRemove(inputAutomationConfigurationChangeEvent: InputAutomationConfigurationModuleChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationConfigurationChangeEvent = inputAutomationConfigurationChangeEvent

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "onRemove")

    var inputAutomationConfiguration: InputAutomationConfiguration = InputAutomationConfigurationFactory.getInstance()!!
            


    var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurations(inputAutomationConfiguration!!.getInputAutomationModuleConfigurationList())

inputAutomationModuleConfigurations!!.remove(inputAutomationConfigurationChangeEvent!!.getInputAutomationModuleConfiguration())
this.init()
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "onRemove", e)
}

}


    private var aboutJMenuItem: JMenuItem

    private var automationModuleConfigurationJPanel: JPanel

    private var gameRobotJTabbedPane: JTabbedPane

    private var helpJMenuItem: JMenuItem

    private var inputAutomationModuleJList: JList

    private var inputAutomationModuleJPanel: JPanel

    private var jScrollPane1: JScrollPane

    private var mainJMenuBar: JMenuBar

    private var modulesJMenuItem: JMenuItem

    private var noModuleSelectedJDialog: JDialog

    private var noModuleSelectedJLabel: JLabel

    private var optionsJMenu: JMenu

    private var processingJMenu: JMenu

    private var startJMenuItem: JMenuItem

    private var stopJMenuItem: JMenuItem

    private var stopOnFocusJCheckBoxMenuItem: JCheckBoxMenuItem

    private var subscriptionJMenuItem: JMenuItem

    private var toolsJMenu: JMenu

    private var updatesJMenuItem: JMenuItem

}
                
            

