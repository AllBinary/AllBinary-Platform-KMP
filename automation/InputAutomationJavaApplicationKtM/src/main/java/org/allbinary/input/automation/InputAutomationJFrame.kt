
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

open public class InputAutomationJFrame : javax.swing.JFrame
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
java.awt.EventQueue.invokeLater(object: ARunnable()
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

    private val uri: URI = URI("http://geocities.com/allbinary/")
public constructor (){
this.initComponents()

    var url: URL = this::class.getResource("/help/Help.hs")!!

this.logUtil!!.putF("URL: " +url, this, this.commonStrings!!.CONSTRUCTOR)
this.helpSet= JavaHelpUtil.getInstance()!!.getHelpSet(url)
url= this::class.getResource("/resources/allbinaryicon8bit.jpg")

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
InputAutomationConfigurationFactory.init(InputAutomationClientInformationFactory.getInstance())
this.inputAutomationModuleFactory= InputAutomationModuleFactoryFactory(this)
 = 
.
                    execute()
this.gameRobotJTabbedPane!!.setEnabledAt(1, false)
this.gameRobotJTabbedPane!!.setSelectedIndex(0)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.noModuleSelectedJDialog= javax.swing.JDialog()
this.noModuleSelectedJLabel= javax.swing.JLabel()
this.gameRobotJTabbedPane= javax.swing.JTabbedPane()
this.inputAutomationModuleJPanel= javax.swing.JPanel()
this.jScrollPane1= javax.swing.JScrollPane()
this.inputAutomationModuleJList= javax.swing.JList()
this.automationModuleConfigurationJPanel= javax.swing.JPanel()
this.mainJMenuBar= javax.swing.JMenuBar()
this.processingJMenu= javax.swing.JMenu()
this.startJMenuItem= javax.swing.JMenuItem()
this.stopJMenuItem= javax.swing.JMenuItem()
this.optionsJMenu= javax.swing.JMenu()
this.stopOnFocusJCheckBoxMenuItem= javax.swing.JCheckBoxMenuItem()
this.toolsJMenu= javax.swing.JMenu()
this.helpJMenuItem= javax.swing.JMenuItem()
this.updatesJMenuItem= javax.swing.JMenuItem()
this.subscriptionJMenuItem= javax.swing.JMenuItem()
this.modulesJMenuItem= javax.swing.JMenuItem()
this.aboutJMenuItem= javax.swing.JMenuItem()
this.noModuleSelectedJDialog!!.setMinimumSize(java.awt.Dimension(200, 100))
this.noModuleSelectedJLabel!!.setText("Please Select A Module")

    var noModuleSelectedJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(this.noModuleSelectedJDialog!!.getContentPane())

this.noModuleSelectedJDialog!!.getContentPane()!!.setLayout(noModuleSelectedJDialogLayout)
noModuleSelectedJDialogLayout!!.setHorizontalGroup(noModuleSelectedJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(noModuleSelectedJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(noModuleSelectedJLabel)!!.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
noModuleSelectedJDialogLayout!!.setVerticalGroup(noModuleSelectedJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(noModuleSelectedJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
this.setMinimumSize(java.awt.Dimension(325, 215))
setResizable(false)
addWindowFocusListener(object: java.awt.event.WindowFocusListener()
                                {
                                
    open override fun windowGainedFocus(evt: java.awt.event.WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
formWindowGainedFocus(evt)
}

    open override fun windowLostFocus(evt: java.awt.event.WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
formWindowLostFocus(evt)
}

                                }
                            )
addFocusListener(object: java.awt.event.FocusAdapter()
                                {
                                
    open override fun focusGained(evt: java.awt.event.FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
formFocusGained(evt)
}

    open override fun focusLost(evt: java.awt.event.FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
formFocusLost(evt)
}

                                }
                            )
this.gameRobotJTabbedPane!!.setMinimumSize(java.awt.Dimension(320, 200))
this.inputAutomationModuleJList!!.setMinimumSize(java.awt.Dimension(200, 0))
this.inputAutomationModuleJList!!.addListSelectionListener(object: javax.swing.event.ListSelectionListener()
                                {
                                
    open override fun valueChanged(evt: javax.swing.event.ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
inputAutomationModuleJListValueChanged(evt)
}

                                }
                            )
this.jScrollPane1!!.setViewportView(this.inputAutomationModuleJList)

    var inputAutomationModuleJPanelLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(this.inputAutomationModuleJPanel)

this.inputAutomationModuleJPanel!!.setLayout(inputAutomationModuleJPanelLayout)
inputAutomationModuleJPanelLayout!!.setHorizontalGroup(inputAutomationModuleJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(inputAutomationModuleJPanelLayout!!.createSequentialGroup()!!.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(367, Short.MAX_VALUE)))
inputAutomationModuleJPanelLayout!!.setVerticalGroup(inputAutomationModuleJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(inputAutomationModuleJPanelLayout!!.createSequentialGroup()!!.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
this.gameRobotJTabbedPane!!.addTab("Modules", inputAutomationModuleJPanel)

    var automationModuleConfigurationJPanelLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(this.automationModuleConfigurationJPanel)

this.automationModuleConfigurationJPanel!!.setLayout(automationModuleConfigurationJPanelLayout)
automationModuleConfigurationJPanelLayout!!.setHorizontalGroup(automationModuleConfigurationJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 566, Short.MAX_VALUE))
automationModuleConfigurationJPanelLayout!!.setVerticalGroup(automationModuleConfigurationJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 334, Short.MAX_VALUE))
this.gameRobotJTabbedPane!!.addTab("Configuration", automationModuleConfigurationJPanel)
this.processingJMenu!!.setText("Processing")
this.processingJMenu!!.setToolTipText("Set module processing state")
this.startJMenuItem!!.setText(this.commonStrings!!.START)
this.startJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
startJMenuItemActionPerformed(evt)
}

                                }
                            )
this.processingJMenu!!.add(this.startJMenuItem)
this.stopJMenuItem!!.setText("Stop")
this.stopJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
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
this.optionsJMenu!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
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
this.stopOnFocusJCheckBoxMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
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
this.helpJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
helpJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.helpJMenuItem)
this.updatesJMenuItem!!.setText("Updates")
this.updatesJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
updatesJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.updatesJMenuItem)
this.subscriptionJMenuItem!!.setText("Subscription")
this.subscriptionJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
subscriptionJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.subscriptionJMenuItem)
this.modulesJMenuItem!!.setText("Module Manager")
this.modulesJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
modulesJMenuItemActionPerformed(evt)
}

                                }
                            )
this.toolsJMenu!!.add(this.modulesJMenuItem)
this.aboutJMenuItem!!.setText("About")
this.aboutJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
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

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(gameRobotJTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(gameRobotJTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
pack()
}


    open fun subscriptionJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
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


    open fun updatesJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
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


    open fun aboutJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var textJDialog: JDialog = BasicTextJDialog("Copyright (c) 2002-2007 AllBinary")

textJDialog!!.setVisible(true)
textJDialog!!.setLocationRelativeTo(this)
}


    open fun modulesJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
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


    open fun helpJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
JavaHelpUtil.getInstance()!!.show(this.helpSet)
}


    open fun stopOnFocusJCheckBoxMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun optionsJMenuActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun formWindowLostFocus(evt: java.awt.event.WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.logUtil!!.putF("Nothing", this, "focusLost")
}


    open fun formWindowGainedFocus(evt: java.awt.event.WindowEvent)
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


    open fun formFocusLost(evt: java.awt.event.FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun formFocusGained(evt: java.awt.event.FocusEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun inputAutomationModuleJListValueChanged(evt: javax.swing.event.ListSelectionEvent)
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

    var layout: javax.swing.GroupLayout = this.getAutomationModuleConfigurationJPanel()!!.getLayout() as javax.swing.GroupLayout

layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(this.inputAutomationModuleInterface!!.getConfigurationJPanel(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(this.inputAutomationModuleInterface!!.getConfigurationJPanel(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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


    open fun stopJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
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


    open fun startJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            this.logUtil!!.putF("Starting", this, "startJMenuItemActionPerformed")

    
                        if(this.inputAutomationModuleInterface != 
                                    null
                                )
                        
                                    {
                                    this.runnableInterface= this.inputAutomationModuleInterface!!.getInstance()

    
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
: javax.swing.JPanel{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.automationModuleConfigurationJPanel
}


    open fun setAutomationModuleConfigurationJPanel(automationModuleConfigurationJPanel: javax.swing.JPanel)
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
var inputAutomationRobotChangeEvent = inputAutomationRobotChangeEvent

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

    var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurationsSingletonFactory.getInstance()!!

inputAutomationModuleConfigurations!!.add(inputAutomationConfigurationChangeEvent!!.getInputAutomationModuleConfiguration())
this.init()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "onAdd", e)
}

}


    open fun onRemove(inputAutomationConfigurationChangeEvent: InputAutomationConfigurationModuleChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var inputAutomationConfigurationChangeEvent = inputAutomationConfigurationChangeEvent

        try {
            this.logUtil!!.putF(this.commonStrings!!.START, this, "onRemove")

    var inputAutomationConfiguration: InputAutomationConfiguration = InputAutomationConfigurationFactory.getInstance()!!


    var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurations(inputAutomationConfiguration!!.getInputAutomationModuleConfigurationList())

inputAutomationModuleConfigurations!!.remove(inputAutomationConfigurationChangeEvent!!.getInputAutomationModuleConfiguration())
this.init()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "onRemove", e)
}

}


    private var aboutJMenuItem: javax.swing.JMenuItem

    private var automationModuleConfigurationJPanel: javax.swing.JPanel

    private var gameRobotJTabbedPane: javax.swing.JTabbedPane

    private var helpJMenuItem: javax.swing.JMenuItem

    private var inputAutomationModuleJList: javax.swing.JList

    private var inputAutomationModuleJPanel: javax.swing.JPanel

    private var jScrollPane1: javax.swing.JScrollPane

    private var mainJMenuBar: javax.swing.JMenuBar

    private var modulesJMenuItem: javax.swing.JMenuItem

    private var noModuleSelectedJDialog: javax.swing.JDialog

    private var noModuleSelectedJLabel: javax.swing.JLabel

    private var optionsJMenu: javax.swing.JMenu

    private var processingJMenu: javax.swing.JMenu

    private var startJMenuItem: javax.swing.JMenuItem

    private var stopJMenuItem: javax.swing.JMenuItem

    private var stopOnFocusJCheckBoxMenuItem: javax.swing.JCheckBoxMenuItem

    private var subscriptionJMenuItem: javax.swing.JMenuItem

    private var toolsJMenu: javax.swing.JMenu

    private var updatesJMenuItem: javax.swing.JMenuItem

}
                
            

