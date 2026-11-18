
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




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.thread.ARunnable
import java.net.URI
import java.net.URL
import java.awt.Desktop

//import java.util.List
import javax.swing.ImageIcon
import javax.swing.JDialog
import javax.help.HelpSet
import javax.help.event.HelpSetEvent
import javax.help.event.HelpSetListener
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
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfiguration
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfigurations
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
import java.awt.Dimension
import java.awt.EventQueue
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.FocusAdapter
import java.awt.event.FocusEvent
import java.awt.event.WindowEvent
import java.awt.event.WindowFocusListener
import javax.swing.GroupLayout
import javax.swing.JCheckBoxMenuItem
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JList
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JTabbedPane
import javax.swing.WindowConstants
import javax.swing.event.ListSelectionEvent
import javax.swing.event.ListSelectionListener

open public class InputAutomationJFrame : JFrame
                , InputAutomationConfigurationModuleChangeListener
                , InputAutomationRobotChangeListener
                , HelpSetListener {
        
companion object {
            
    private var INPUTAUTOMATION_JFRAME: InputAutomationJFrame

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputAutomationJFrame{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InputAutomationJFrame.INPUTAUTOMATION_JFRAME
}


    open fun destroy()
        //nullable = true from not(false or (false and true)) = true
{
InputAutomationJFrame.INPUTAUTOMATION_JFRAME.setVisible(false)
}


    open fun create(inputAutomationBundleActivatorListenerInterface: InputAutomationBundleActivatorListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputAutomationBundleActivatorListenerInterface = inputAutomationBundleActivatorListenerInterface
LogConfigTypeFactory.getInstance()

    var appUrlGlobals: AppUrlGlobals = AppUrlGlobals()

appUrlGlobals!!.setWebappPath("G:/mnt/bc/mydev/work_automation/automation/run/")
URLGLOBALS.init(appUrlGlobals)
WebappClassLoaderInfo.setLoader(appUrlGlobals!!::class.java.classLoader)
EventQueue.invokeLater(object: ARunnable()
                                {
                                
                                
    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            logUtil!!.putF("Running", this, commonStrings!!.RUN)
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
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            )
}


                @Throws(Exception::class)
            
    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var args = args
InputAutomationJFrame.create(
                            null)
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurations()

    private var inputAutomationModuleFactory: InputAutomationModuleFactoryFactory

    private var inputAutomationModuleInterface: InputAutomationModuleFactoryInterface

    private var runnableInterface: RunnableInterface

    private var thread: Thread

    private var helpSet: HelpSet

    private val uri: URI = URI("http://geocities.com/allbinary/")
public constructor (){
this.initComponents()

    var url: URL = this::class.getResource("/help/Help.hs")!!

this.logUtil!!.putF("URL: " +url, this, this.commonStrings!!.CONSTRUCTOR)
this.helpSet= JavaHelpUtil.getInstance()!!.getHelpSet(url)!!
url= this::class.getResource("/resources/allbinaryicon8bit.jpg")!!

    var imageIcon: ImageIcon = ImageIcon(url)

this.setIconImage(imageIcon!!.getImage())
this.init()
}


    open fun helpSetAdded(helpSetEvent: HelpSetEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var helpSetEvent = helpSetEvent
this.helpSet!!.add(helpSetEvent!!.getHelpSet())
}


    open fun helpSetRemoved(helpSetEvent: HelpSetEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var helpSetEvent = helpSetEvent
this.helpSet!!.remove(helpSetEvent!!.getHelpSet())
}


                @Throws(Exception::class)
            
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var inputAutomationConfigurationFactory: InputAutomationConfigurationFactory = InputAutomationConfigurationFactory.getInstance()!!

inputAutomationConfigurationFactory!!.init(InputAutomationClientInformationFactory.getInstance())

    var inputAutomationModuleConfigurationList: List<InputAutomationModuleConfiguration> = inputAutomationConfigurationFactory!!.inputAutomationConfiguration!!.getInputAutomationModuleConfigurationList()!!


    
                        if(inputAutomationModuleConfigurationList == 
                                    null
                                )
                        
                                    {
                                    
                                    }
                                
                        else {
                            this.inputAutomationModuleConfigurations= InputAutomationModuleConfigurations(inputAutomationModuleConfigurationList)

                        }
                            
this.inputAutomationModuleFactory= InputAutomationModuleFactoryFactory(inputAutomationModuleConfigurations, this)
 = 
.
                    execute()
this.gameRobotJTabbedPane!!.setEnabledAt(1, false)
this.gameRobotJTabbedPane!!.setSelectedIndex(0)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.noModuleSelectedJDialog= JDialog()
this.noModuleSelectedJLabel= JLabel()
this.gameRobotJTabbedPane= JTabbedPane()
this.inputAutomationModuleJPanel= JPanel()
this.jScrollPane1= JScrollPane()
this.inputAutomationModuleJList= JList()
this.automationModuleConfigurationJPanel= JPanel()
this.mainJMenuBar= JMenuBar()
this.processingJMenu= JMenu()
this.startJMenuItem= JMenuItem()
this.stopJMenuItem= JMenuItem()
this.optionsJMenu= JMenu()
this.stopOnFocusJCheckBoxMenuItem= JCheckBoxMenuItem()
this.toolsJMenu= JMenu()
this.helpJMenuItem= JMenuItem()
this.updatesJMenuItem= JMenuItem()
this.subscriptionJMenuItem= JMenuItem()
this.modulesJMenuItem= JMenuItem()
this.aboutJMenuItem= JMenuItem()
this.noModuleSelectedJDialog!!.setMinimumSize(Dimension(200, 100))
this.noModuleSelectedJLabel!!.setText("Please Select A Module")

    var noModuleSelectedJDialogLayout: GroupLayout = GroupLayout(this.noModuleSelectedJDialog!!.getContentPane())

this.noModuleSelectedJDialog!!.getContentPane()!!.setLayout(noModuleSelectedJDialogLayout)
noModuleSelectedJDialogLayout!!.setHorizontalGroup(noModuleSelectedJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(noModuleSelectedJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(noModuleSelectedJLabel)!!.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
noModuleSelectedJDialogLayout!!.setVerticalGroup(noModuleSelectedJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(noModuleSelectedJLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
this.setMinimumSize(Dimension(325, 215))
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
this.gameRobotJTabbedPane!!.setMinimumSize(Dimension(320, 200))
this.inputAutomationModuleJList!!.setMinimumSize(Dimension(200, 0))
this.inputAutomationModuleJList!!.addListSelectionListener(object: ListSelectionListener()
                                {
                                
                                
    open override fun valueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
inputAutomationModuleJListValueChanged(evt)
}

                                }
                            )
this.jScrollPane1!!.setViewportView(this.inputAutomationModuleJList)

    var inputAutomationModuleJPanelLayout: GroupLayout = GroupLayout(this.inputAutomationModuleJPanel)

this.inputAutomationModuleJPanel!!.setLayout(inputAutomationModuleJPanelLayout)
inputAutomationModuleJPanelLayout!!.setHorizontalGroup(inputAutomationModuleJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(inputAutomationModuleJPanelLayout!!.createSequentialGroup()!!.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)!!.addContainerGap(367, Short.MAX_VALUE)))
inputAutomationModuleJPanelLayout!!.setVerticalGroup(inputAutomationModuleJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(inputAutomationModuleJPanelLayout!!.createSequentialGroup()!!.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)!!.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
this.gameRobotJTabbedPane!!.addTab("Modules", inputAutomationModuleJPanel)

    var automationModuleConfigurationJPanelLayout: GroupLayout = GroupLayout(this.automationModuleConfigurationJPanel)

this.automationModuleConfigurationJPanel!!.setLayout(automationModuleConfigurationJPanelLayout)
automationModuleConfigurationJPanelLayout!!.setHorizontalGroup(automationModuleConfigurationJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 566, Short.MAX_VALUE))
automationModuleConfigurationJPanelLayout!!.setVerticalGroup(automationModuleConfigurationJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 334, Short.MAX_VALUE))
this.gameRobotJTabbedPane!!.addTab("Configuration", automationModuleConfigurationJPanel)
this.processingJMenu!!.setText("Processing")
this.processingJMenu!!.setToolTipText("Set module processing state")
this.startJMenuItem!!.setText(this.commonStrings!!.START)
this.startJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
startJMenuItemActionPerformed(evt)
}

                                }
                            )
this.processingJMenu!!.add(this.startJMenuItem)
this.stopJMenuItem!!.setText("Stop")
this.stopJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
stopJMenuItemActionPerformed(evt)
}

                                }
                            )
this.processingJMenu!!.add(this.stopJMenuItem)
this.mainJMenuBar!!.add(this.processingJMenu)
this.optionsJMenu!!.setText("Options")
this.optionsJMenu!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
optionsJMenuActionPerformed(evt)
}

                                }
                            )
this.stopOnFocusJCheckBoxMenuItem!!.setSelected(true)
this.stopOnFocusJCheckBoxMenuItem!!.setEnabled(false)
this.stopOnFocusJCheckBoxMenuItem!!.setLabel("Stop Module On Focus")
this.stopOnFocusJCheckBoxMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
stopOnFocusJCheckBoxMenuItemActionPerformed(evt)
}

                                }
                            )
this.optionsJMenu!!.add(this.stopOnFocusJCheckBoxMenuItem)
this.mainJMenuBar!!.add(this.optionsJMenu)
this.toolsJMenu!!.setText("Help")
this.helpJMenuItem!!.setText("Help")
this.helpJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
helpJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.helpJMenuItem)
this.updatesJMenuItem!!.setText("Updates")
this.updatesJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
updatesJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.updatesJMenuItem)
this.subscriptionJMenuItem!!.setText("Subscription")
this.subscriptionJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
subscriptionJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.subscriptionJMenuItem)
this.modulesJMenuItem!!.setText("Module Manager")
this.modulesJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
modulesJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.modulesJMenuItem)
this.aboutJMenuItem!!.setText("About")
this.aboutJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
aboutJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.aboutJMenuItem)
this.mainJMenuBar!!.add(this.toolsJMenu)
setJMenuBar(this.mainJMenuBar)

    var layout: GroupLayout = GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(gameRobotJTabbedPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(gameRobotJTabbedPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
pack()
}


    open fun subscriptionJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            Desktop.getDesktop()!!.browse(this.uri)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "subscriptionJMenuItemActionPerformed", e)
}

}


    open fun updatesJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            Desktop.getDesktop()!!.browse(this.uri)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "updatesJMenuItemActionPerformed", e)
}

}


    open fun aboutJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var textJDialog: JDialog = BasicTextJDialog("Copyright (c) 2002-2007 AllBinary")

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
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "modulesJMenuItemActionPerformed", e)
}

}


    open fun helpJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
JavaHelpUtil.getInstance()!!.show(this.helpSet)
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
this.logUtil!!.putF("Nothing", this, "focusLost")
}


    open fun formWindowGainedFocus(evt: WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    
                        if(this.stopOnFocusJCheckBoxMenuItem!!.isSelected())
                        
                                    {
                                    this.logUtil!!.putF("Stopping", this, "focusGained")

    
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
                                    this.inputAutomationModuleInterface= this.inputAutomationModuleFactory!!.getInstance(gameAutomationRobotModuleNameString)!!
this.getAutomationModuleConfigurationJPanel()!!.removeAll()

    var layout: GroupLayout = this.getAutomationModuleConfigurationJPanel()!!.getLayout() as GroupLayout

layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(this.inputAutomationModuleInterface!!.getConfigurationJPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(this.inputAutomationModuleInterface!!.getConfigurationJPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
this.gameRobotJTabbedPane!!.setEnabledAt(1, true)
this.logUtil!!.putF("Setting Module: " +gameAutomationRobotModuleNameString +" and Configuration JPanel", this, "gameAutomationRobotModuleJListValueChanged")

                                    }
                                
                        else {
                            this.logUtil!!.putF("Module name was null", this, "gameAutomationRobotModuleJListValueChanged")
this.gameRobotJTabbedPane!!.setEnabledAt(1, false)

                        }
                            
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "gameAutomationRobotModuleJListValueChanged", e)
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
            this.logUtil!!.putF("Starting", this, "startJMenuItemActionPerformed")

    
                        if(this.inputAutomationModuleInterface != 
                                    null
                                )
                        
                                    {
                                    this.runnableInterface= this.inputAutomationModuleInterface!!.getInstance()!!

    
                        if(this.runnableInterface != 
                                    null
                                )
                        
                                    {
                                    this.thread= Thread(this.runnableInterface)
this.thread.setPriority(Thread.MIN_PRIORITY +1)
this.thread.start()

                                    }
                                
                        else {
                            this.logUtil!!.putF("Runnnable was null", this, "startJMenuItemActionPerformed")
this.noModuleSelectedJDialog!!.setVisible(true)
this.noModuleSelectedJDialog!!.setLocationRelativeTo(this)

                        }
                            

                                    }
                                
                        else {
                            this.logUtil!!.putF("InputAutomationModuleInterface was null", this, "startJMenuItemActionPerformed")
this.noModuleSelectedJDialog!!.setVisible(true)
this.noModuleSelectedJDialog!!.setLocationRelativeTo(this)

                        }
                            
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "startJMenuItemActionPerformed", e)
}

}


    open fun getAutomationModuleConfigurationJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.automationModuleConfigurationJPanel
}


    open fun setAutomationModuleConfigurationJPanel(automationModuleConfigurationJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
    //var automationModuleConfigurationJPanel = automationModuleConfigurationJPanel
this.automationModuleConfigurationJPanel= automationModuleConfigurationJPanel
}


    open fun onAdd(inputAutomationRobotChangeEvent: InputAutomationRobotChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputAutomationRobotChangeEvent = inputAutomationRobotChangeEvent

        try {
            this.logUtil!!.putF(this.commonStrings!!.START, this, "onAdd")
InputRobotFactory.getInstance()!!.add(inputAutomationRobotChangeEvent!!.getInputAutomationRobotInterfaceWrapper()!!.getInputRobotInterface())
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "onAdd", e)
}

}


    open fun onRemove(inputAutomationRobotChangeEvent: InputAutomationRobotChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputAutomationRobotChangeEvent = inputAutomationRobotChangeEvent

        try {
            this.logUtil!!.putF(this.commonStrings!!.START, this, "onRemove")
InputRobotFactory.getInstance()!!.add(inputAutomationRobotChangeEvent!!.getInputAutomationRobotInterfaceWrapper()!!.getInputRobotInterface())
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "onRemove", e)
}

}


    open fun onAdd(inputAutomationConfigurationChangeEvent: InputAutomationConfigurationModuleChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputAutomationConfigurationChangeEvent = inputAutomationConfigurationChangeEvent

        try {
            this.logUtil!!.putF(this.commonStrings!!.START, this, "onAdd")
this.inputAutomationModuleConfigurations!!.add(inputAutomationConfigurationChangeEvent!!.getInputAutomationModuleConfiguration())
this.init()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "onAdd", e)
}

}


    open fun onRemove(inputAutomationConfigurationChangeEvent: InputAutomationConfigurationModuleChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputAutomationConfigurationChangeEvent = inputAutomationConfigurationChangeEvent

        try {
            this.logUtil!!.putF(this.commonStrings!!.START, this, "onRemove")

    var inputAutomationConfiguration: InputAutomationConfiguration = InputAutomationConfigurationFactory.getInstance()!!.inputAutomationConfiguration


    var inputAutomationModuleConfigurationList: List<InputAutomationModuleConfiguration> = inputAutomationConfiguration!!.getInputAutomationModuleConfigurationList()!!


    
                        if(inputAutomationModuleConfigurationList == 
                                    null
                                )
                        
                                    {
                                    
    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.putF("inputAutomationModuleConfigurationList: " +inputAutomationModuleConfigurationList, this, commonStrings!!.INIT)



                            throw Exception()

                                    }
                                

    var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurations(inputAutomationConfiguration!!.getInputAutomationModuleConfigurationList())

inputAutomationModuleConfigurations!!.remove(inputAutomationConfigurationChangeEvent!!.getInputAutomationModuleConfiguration())
this.init()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "onRemove", e)
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
                
            

