
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
        package org.allbinary.input.automation.module.generic.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfile
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfileDataWorkerType
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfiles
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActions
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActionsJPanel
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import java.awt.Dimension
import java.awt.GridLayout
import java.awt.Insets
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.BorderFactory
import javax.swing.ButtonGroup
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JCheckBox
import javax.swing.JDialog
import javax.swing.JLabel
import javax.swing.JList
import javax.swing.JPanel
import javax.swing.JRadioButton
import javax.swing.JScrollPane
import javax.swing.JTabbedPane
import javax.swing.JTextField
import javax.swing.LayoutStyle
import javax.swing.event.ListSelectionEvent
import javax.swing.event.ListSelectionListener

open public class GenericModuleConfigurationJPanel : JPanel
                , GenericModuleConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val stringUtil: StringUtil = StringUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var genericProfiles: GenericProfiles

    private var selectedGenericProfile: GenericProfile
public constructor (){
this.initComponents()
this.setGenericProfiles(GenericProfiles(GenericProfiles.DEFAULT_FILE))
this.selectFirstElement()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.newProfileJDialog= JDialog()
this.okNewProfileJButton= JButton()
this.newProfileNameJLabel= JLabel()
this.newProfileNameJTextField= JTextField()
this.buttonGroup2= ButtonGroup()
this.genericJTabbedPane= JTabbedPane()
this.genericProfilesJPanel= JPanel()
this.genericProfilesJScrollPane= JScrollPane()
this.genericProfilesJList= JList()
this.newProfileJButton= JButton()
this.deleteProfileJButton= JButton()
this.jPanel1= JPanel()
this.screenCaptureJRadioButton= JRadioButton()
this.jLabel1= JLabel()
this.jLabel2= JLabel()
this.savedCaptureJRadioButton= JRadioButton()
this.captureMotionAnalysisJCheckBox= JCheckBox()
this.captureComparisonJCheckBox= JCheckBox()
this.jLabel3= JLabel()
this.blankGenericProfileActionsJPanel= JPanel()
this.newProfileJDialog!!.setMinimumSize(Dimension(250, 150))
this.newProfileJDialog!!.setResizable(false)
this.okNewProfileJButton!!.setText("Ok")
this.okNewProfileJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okNewProfileJButtonActionPerformed(evt)
}

                                }
                            )
this.newProfileNameJLabel!!.setText("New Profile Name")

    var newProfileJDialogLayout: GroupLayout = GroupLayout(this.newProfileJDialog!!.getContentPane())

this.newProfileJDialog!!.getContentPane()!!.setLayout(newProfileJDialogLayout)
newProfileJDialogLayout!!.setHorizontalGroup(newProfileJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGroup(newProfileJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(80, 80, 80)!!.addComponent(newProfileNameJLabel))!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(30, 30, 30)!!.addComponent(newProfileNameJTextField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(100, 100, 100)!!.addComponent(okNewProfileJButton)))!!.addContainerGap(35, Short.MAX_VALUE)))
newProfileJDialogLayout!!.setVerticalGroup(newProfileJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(10, 10, 10)!!.addComponent(newProfileNameJLabel)!!.addGap(16, 16, 16)!!.addComponent(newProfileNameJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addGap(20, 20, 20)!!.addComponent(okNewProfileJButton)))
setLayout(GridLayout(1, 0))
setMinimumSize(Dimension(400, 300))
setPreferredSize(Dimension(700, 700))
this.genericJTabbedPane!!.setToolTipText(this.stringUtil!!.EMPTY_STRING)
this.genericJTabbedPane!!.setMinimumSize(Dimension(800, 600))
this.genericProfilesJPanel!!.setMinimumSize(Dimension(400, 300))
this.genericProfilesJPanel!!.setPreferredSize(Dimension(0, 0))
this.genericProfilesJList!!.addListSelectionListener(object: ListSelectionListener()
                                {
                                
                                
    open override fun valueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
genericProfilesJListValueChanged(evt)
}

                                }
                            )
this.genericProfilesJScrollPane!!.setViewportView(this.genericProfilesJList)
this.newProfileJButton!!.setText("New")
this.newProfileJButton!!.setToolTipText("Creates a new profile")
this.newProfileJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newProfileJButtonActionPerformed(evt)
}

                                }
                            )
this.deleteProfileJButton!!.setText("Delete")
this.deleteProfileJButton!!.setToolTipText("Deletes the selected profile")
this.deleteProfileJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
deleteProfileJButtonActionPerformed(evt)
}

                                }
                            )
this.jPanel1!!.setPreferredSize(Dimension(1000, 100))
this.screenCaptureJRadioButton!!.setText("Screen Captures")
this.screenCaptureJRadioButton!!.setToolTipText("Records the screen into memory for logical processing")
this.screenCaptureJRadioButton!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.screenCaptureJRadioButton!!.setMargin(Insets(0, 0, 0, 0))
this.screenCaptureJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
screenCaptureJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel1!!.setText("Profile Options")
this.jLabel2!!.setText("Process From:")
this.savedCaptureJRadioButton!!.setText("Saved Images")
this.savedCaptureJRadioButton!!.setToolTipText("Loads images from files for logical processing.  Usually for debugging your profile actions")
this.savedCaptureJRadioButton!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.savedCaptureJRadioButton!!.setMargin(Insets(0, 0, 0, 0))
this.savedCaptureJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
savedCaptureJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.captureMotionAnalysisJCheckBox!!.setText("Motion Analysis")
this.captureMotionAnalysisJCheckBox!!.setToolTipText("Uses image comparison and contraints to locate moving objects")
this.captureMotionAnalysisJCheckBox!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.captureMotionAnalysisJCheckBox!!.setMargin(Insets(0, 0, 0, 0))
this.captureMotionAnalysisJCheckBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
captureMotionAnalysisJCheckBoxActionPerformed(evt)
}

                                }
                            )
this.captureComparisonJCheckBox!!.setText("Comparison")
this.captureComparisonJCheckBox!!.setToolTipText("Compares the last two input images for multi image logic")
this.captureComparisonJCheckBox!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.captureComparisonJCheckBox!!.setMargin(Insets(0, 0, 0, 0))
this.captureComparisonJCheckBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
captureComparisonJCheckBoxActionPerformed(evt)
}

                                }
                            )
this.jLabel3!!.setText("Image Processing:")
this.jLabel3!!.setToolTipText("Turns on/off various extended image processing")

    var jPanel1Layout: GroupLayout = GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(screenCaptureJRadioButton)!!.addComponent(jLabel1)!!.addComponent(jLabel2)!!.addComponent(savedCaptureJRadioButton)!!.addComponent(captureMotionAnalysisJCheckBox)!!.addComponent(captureComparisonJCheckBox)!!.addComponent(jLabel3))!!.addContainerGap(22, Short.MAX_VALUE)))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel2)!!.addGap(7, 7, 7)!!.addComponent(screenCaptureJRadioButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(savedCaptureJRadioButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel3)!!.addGap(7, 7, 7)!!.addComponent(captureComparisonJCheckBox)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(captureMotionAnalysisJCheckBox)!!.addContainerGap(106, Short.MAX_VALUE)))

    var genericProfilesJPanelLayout: GroupLayout = GroupLayout(this.genericProfilesJPanel)

this.genericProfilesJPanel!!.setLayout(genericProfilesJPanelLayout)
genericProfilesJPanelLayout!!.setHorizontalGroup(genericProfilesJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addGroup(genericProfilesJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addComponent(newProfileJButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(deleteProfileJButton))!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addComponent(genericProfilesJScrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))!!.addContainerGap()))
genericProfilesJPanelLayout!!.setVerticalGroup(genericProfilesJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addGroup(genericProfilesJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(newProfileJButton)!!.addComponent(deleteProfileJButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(genericProfilesJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)!!.addComponent(genericProfilesJScrollPane, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
this.genericJTabbedPane!!.addTab("Profiles", genericProfilesJPanel)

    var blankGenericProfileActionsJPanelLayout: GroupLayout = GroupLayout(this.blankGenericProfileActionsJPanel)

this.blankGenericProfileActionsJPanel!!.setLayout(blankGenericProfileActionsJPanelLayout)
blankGenericProfileActionsJPanelLayout!!.setHorizontalGroup(blankGenericProfileActionsJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE))
blankGenericProfileActionsJPanelLayout!!.setVerticalGroup(blankGenericProfileActionsJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 275, Short.MAX_VALUE))
this.genericJTabbedPane!!.addTab("Actions", blankGenericProfileActionsJPanel)
add(this.genericJTabbedPane)
}


    open fun savedCaptureJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    
                        if(this.savedCaptureJRadioButton!!.isSelected())
                        
                                    {
                                    this.logUtil!!.putF("Selected", this, "savedCaptureJRadioButtonActionPerformed")
this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.SAVED_CAPTURE)
this.getSelectedGenericProfile()!!.remove(GenericProfileDataWorkerType.SCREEN_CAPTURE)
this.screenCaptureJRadioButton!!.setSelected(false)
this.getGenericProfiles()!!.save()

                                    }
                                
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "savedCaptureJRadioButtonActionPerformed", e)
}

}


    open fun screenCaptureJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    
                        if(this.screenCaptureJRadioButton!!.isSelected())
                        
                                    {
                                    this.logUtil!!.putF("Selected", this, "screenCaptureJRadioButtonActionPerformed")
this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.SCREEN_CAPTURE)
this.getSelectedGenericProfile()!!.remove(GenericProfileDataWorkerType.SAVED_CAPTURE)
this.savedCaptureJRadioButton!!.setSelected(false)
this.getGenericProfiles()!!.save()

                                    }
                                
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "screenCaptureJRadioButtonActionPerformed", e)
}

}


    open fun captureMotionAnalysisJCheckBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    
                        if(this.captureMotionAnalysisJCheckBox!!.isSelected())
                        
                                    {
                                    this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.MOTION)

                                    }
                                
                        else {
                            this.getSelectedGenericProfile()!!.remove(GenericProfileDataWorkerType.MOTION)

                        }
                            
this.getGenericProfiles()!!.save()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "captureComparisonJCheckBoxActionPerformed", e)
}

}


    open fun captureComparisonJCheckBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    
                        if(this.captureComparisonJCheckBox!!.isSelected())
                        
                                    {
                                    this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.COMPARISON)

                                    }
                                
                        else {
                            this.getSelectedGenericProfile()!!.remove(GenericProfileDataWorkerType.COMPARISON)

                        }
                            
this.getGenericProfiles()!!.save()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "captureComparisonJCheckBoxActionPerformed", e)
}

}


                @Throws(Exception::class)
            
    open fun updateProfileUI(profileNameString: String)
        //nullable = true from not(false or (false and false)) = true
{
var profileNameString = profileNameString
this.getBlankGenericProfileActionsJPanel()!!.removeAll()

    
                        if(profileNameString != 
                                    null
                                )
                        
                                    {
                                    
    var genericProfileActionsJPanel: GenericProfileActionsJPanel = GenericProfileActionsJPanel()

this.setSelectedGenericProfile(this.getGenericProfiles()!!.get(profileNameString))
this.getSelectedGenericProfile()!!.setGenericProfileActions(GenericProfileActions(genericProfileActionsJPanel, profileNameString))
genericProfileActionsJPanel!!.setGenericProfileActions(this.getSelectedGenericProfile()!!.getGenericProfileActions())
genericProfileActionsJPanel!!.selectFirstElement()

    var layout: GroupLayout = this.getBlankGenericProfileActionsJPanel()!!.getLayout() as GroupLayout

layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(genericProfileActionsJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(genericProfileActionsJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
this.updateProfileOptions()
this.logUtil!!.putF("Setting Configuration Profile JPanel", this, "updateProfileUI")

                                    }
                                
                        else {
                            this.logUtil!!.putF("Null Configuration Profile", this, "updateProfileUI")

                        }
                            
}


                @Throws(Exception::class)
            
    open fun selectFirstElement()
        //nullable = true from not(false or (false and true)) = true
{
this.genericProfilesJList!!.setModel(this.getGenericProfiles()!!.getDefaultListModelHelper()!!.getListModel())

    
                        if(this.genericProfilesJList!!.getModel()!!.getSize() > 0)
                        
                                    {
                                    this.genericProfilesJList!!.setSelectedValue(this.genericProfilesJList!!.getModel()!!.getElementAt(0), true)
this.updateProfileUI(this.genericProfilesJList!!.getModel()!!.getElementAt(0) as String)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun updateProfileOptions()
        //nullable = true from not(false or (false and true)) = true
{
this.logUtil!!.putF(this.commonStrings!!.START, this, "updateProfileOptions")

    var genericProfile: GenericProfile = this.getSelectedGenericProfile()!!


    var vector: BasicArrayList = genericProfile!!.getGenericProfileDataWorkerTypeVector()!!

this.screenCaptureJRadioButton!!.setSelected(false)
this.savedCaptureJRadioButton!!.setSelected(false)
this.captureComparisonJCheckBox!!.setSelected(false)
this.captureMotionAnalysisJCheckBox!!.setSelected(false)

    var size: Int = vector.size()





                        for (index in 0 until size)

        {

    var genericProfileDataWorkerType: GenericProfileDataWorkerType = vector.get(index) as GenericProfileDataWorkerType

this.logUtil!!.putF(genericProfile!!.getName() +" has GenericProfileDataWorkerType: " +genericProfileDataWorkerType!!.toString(), this, "updateProfileOptions")

    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.SCREEN_CAPTURE)
                        
                                    {
                                    this.logUtil!!.putF("Screen Capture Selected", this, "updateProfileOptions")
this.screenCaptureJRadioButton!!.setSelected(true)

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.SAVED_CAPTURE)
                        
                                    {
                                    this.logUtil!!.putF("Saved Capture Selected", this, "updateProfileOptions")
this.savedCaptureJRadioButton!!.setSelected(true)

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.COMPARISON)
                        
                                    {
                                    this.logUtil!!.putF("Checking Comparison Box", this, "updateProfileOptions")
this.captureComparisonJCheckBox!!.setSelected(true)

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.MOTION)
                        
                                    {
                                    this.logUtil!!.putF("Checking Motion Box", this, "updateProfileOptions")
this.captureMotionAnalysisJCheckBox!!.setSelected(true)

                                    }
                                
}


    
                        if(!this.screenCaptureJRadioButton!!.isSelected() && !this.savedCaptureJRadioButton!!.isSelected())
                        
                                    {
                                    this.screenCaptureJRadioButton!!.setSelected(true)
this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.SCREEN_CAPTURE)

                                    }
                                
this.logUtil!!.putF(this.commonStrings!!.END, this, "updateProfileOptions")
}


    open fun getBlankGenericProfileActionsJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.blankGenericProfileActionsJPanel
}


    open fun setBlankGenericProfileActionsJPanel(blankGenericProfileActionsJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var blankGenericProfileActionsJPanel = blankGenericProfileActionsJPanel
this.blankGenericProfileActionsJPanel= blankGenericProfileActionsJPanel
}


    open fun getGenericProfiles()
        //nullable = true from not(false or (false and true)) = true
: GenericProfiles{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.genericProfiles
}


    open fun setGenericProfiles(genericProfiles: GenericProfiles)
        //nullable = true from not(false or (false and false)) = true
{
var genericProfiles = genericProfiles
this.genericProfiles= genericProfiles
}


    open fun getSelectedGenericProfile()
        //nullable = true from not(false or (false and true)) = true
: GenericProfile{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.selectedGenericProfile
}


    open fun setSelectedGenericProfile(selectedGenericProfile: GenericProfile)
        //nullable = true from not(false or (false and false)) = true
{
var selectedGenericProfile = selectedGenericProfile
this.selectedGenericProfile= selectedGenericProfile
}


    open fun genericProfilesJListValueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var profileNameString: String = this.genericProfilesJList!!.getSelectedValue() as String

this.updateProfileUI(profileNameString)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "genericProfilesJListValueChanged", e)
}

}


    open fun deleteProfileJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var anyType: Array<Any?> = this.genericProfilesJList!!.getSelectedValues()!!





                        for (index in 0 until anyType!!.size)

        {

    var nextSelectedValueString: String = anyType[index]!! as String

this.getGenericProfiles()!!.remove(nextSelectedValueString)
}

this.selectFirstElement()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "deleteProfileJButtonActionPerformed", e)
}

}


    open fun okNewProfileJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var newProfileName: String = this.newProfileNameJTextField!!.getText()!!

this.getGenericProfiles()!!.add(newProfileName)
this.genericProfilesJList!!.setModel(this.getGenericProfiles()!!.getDefaultListModelHelper()!!.getListModel())
this.genericProfilesJList!!.setSelectedValue(newProfileName, true)
this.newProfileJDialog!!.setVisible(false)
this.updateProfileUI(newProfileName)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "okNewProfileJButtonActionPerformed", e)
}

}


    open fun newProfileJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.newProfileJDialog!!.setVisible(true)
}


    private var blankGenericProfileActionsJPanel: JPanel

    private var buttonGroup2: ButtonGroup

    private var captureComparisonJCheckBox: JCheckBox

    private var captureMotionAnalysisJCheckBox: JCheckBox

    private var deleteProfileJButton: JButton

    private var genericJTabbedPane: JTabbedPane

    private var genericProfilesJList: JList

    private var genericProfilesJPanel: JPanel

    private var genericProfilesJScrollPane: JScrollPane

    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jPanel1: JPanel

    private var newProfileJButton: JButton

    private var newProfileJDialog: JDialog

    private var newProfileNameJLabel: JLabel

    private var newProfileNameJTextField: JTextField

    private var okNewProfileJButton: JButton

    private var savedCaptureJRadioButton: JRadioButton

    private var screenCaptureJRadioButton: JRadioButton

}
                
            

