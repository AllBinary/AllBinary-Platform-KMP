
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
        
import java.util.Vector
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfile
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfileDataWorkerType
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfiles
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActions
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActionsJPanel
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class GenericModuleConfigurationJPanel : javax.swing.JPanel
                , GenericModuleConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val stringUtil: StringUtil = StringUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var genericProfiles: GenericProfiles

    private var selectedGenericProfile: GenericProfile
public constructor (){
initComponents()
this.setGenericProfiles(GenericProfiles(GenericProfiles.DEFAULT_FILE))
this.selectFirstElement()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
newProfileJDialog= javax.swing.JDialog()
okNewProfileJButton= javax.swing.JButton()
newProfileNameJLabel= javax.swing.JLabel()
newProfileNameJTextField= javax.swing.JTextField()
buttonGroup2= javax.swing.ButtonGroup()
genericJTabbedPane= javax.swing.JTabbedPane()
genericProfilesJPanel= javax.swing.JPanel()
genericProfilesJScrollPane= javax.swing.JScrollPane()
genericProfilesJList= javax.swing.JList()
newProfileJButton= javax.swing.JButton()
deleteProfileJButton= javax.swing.JButton()
jPanel1= javax.swing.JPanel()
screenCaptureJRadioButton= javax.swing.JRadioButton()
jLabel1= javax.swing.JLabel()
jLabel2= javax.swing.JLabel()
savedCaptureJRadioButton= javax.swing.JRadioButton()
captureMotionAnalysisJCheckBox= javax.swing.JCheckBox()
captureComparisonJCheckBox= javax.swing.JCheckBox()
jLabel3= javax.swing.JLabel()
blankGenericProfileActionsJPanel= javax.swing.JPanel()
newProfileJDialog!!.setMinimumSize(java.awt.Dimension(250, 150))
newProfileJDialog!!.setResizable(false)
okNewProfileJButton!!.setText("Ok")
okNewProfileJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okNewProfileJButtonActionPerformed(evt)
}

                                }
                            )
newProfileNameJLabel!!.setText("New Profile Name")

    var newProfileJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(newProfileJDialog!!.getContentPane())

newProfileJDialog!!.getContentPane()!!.setLayout(newProfileJDialogLayout)
newProfileJDialogLayout!!.setHorizontalGroup(newProfileJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGroup(newProfileJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(80, 80, 80)!!.addComponent(newProfileNameJLabel))!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(30, 30, 30)!!.addComponent(newProfileNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(100, 100, 100)!!.addComponent(okNewProfileJButton)))!!.addContainerGap(35, Short.MAX_VALUE)))
newProfileJDialogLayout!!.setVerticalGroup(newProfileJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(newProfileJDialogLayout!!.createSequentialGroup()!!.addGap(10, 10, 10)!!.addComponent(newProfileNameJLabel)!!.addGap(16, 16, 16)!!.addComponent(newProfileNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addGap(20, 20, 20)!!.addComponent(okNewProfileJButton)))
setLayout(java.awt.GridLayout(1, 0))
setMinimumSize(java.awt.Dimension(400, 300))
setPreferredSize(java.awt.Dimension(700, 700))
genericJTabbedPane!!.setToolTipText(stringUtil!!.EMPTY_STRING)
genericJTabbedPane!!.setMinimumSize(java.awt.Dimension(800, 600))
genericProfilesJPanel!!.setMinimumSize(java.awt.Dimension(400, 300))
genericProfilesJPanel!!.setPreferredSize(java.awt.Dimension(0, 0))
genericProfilesJList!!.addListSelectionListener(object: javax.swing.event.ListSelectionListener()
                                {
                                
    open override fun valueChanged(evt: javax.swing.event.ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
genericProfilesJListValueChanged(evt)
}

                                }
                            )
genericProfilesJScrollPane!!.setViewportView(genericProfilesJList)
newProfileJButton!!.setText("New")
newProfileJButton!!.setToolTipText("Creates a new profile")
newProfileJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newProfileJButtonActionPerformed(evt)
}

                                }
                            )
deleteProfileJButton!!.setText("Delete")
deleteProfileJButton!!.setToolTipText("Deletes the selected profile")
deleteProfileJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
deleteProfileJButtonActionPerformed(evt)
}

                                }
                            )
jPanel1!!.setPreferredSize(java.awt.Dimension(1000, 100))
screenCaptureJRadioButton!!.setText("Screen Captures")
screenCaptureJRadioButton!!.setToolTipText("Records the screen into memory for logical processing")
screenCaptureJRadioButton!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
screenCaptureJRadioButton!!.setMargin(java.awt.Insets(0, 0, 0, 0))
screenCaptureJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
screenCaptureJRadioButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText("Profile Options")
jLabel2!!.setText("Process From:")
savedCaptureJRadioButton!!.setText("Saved Images")
savedCaptureJRadioButton!!.setToolTipText("Loads images from files for logical processing.  Usually for debugging your profile actions")
savedCaptureJRadioButton!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
savedCaptureJRadioButton!!.setMargin(java.awt.Insets(0, 0, 0, 0))
savedCaptureJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
savedCaptureJRadioButtonActionPerformed(evt)
}

                                }
                            )
captureMotionAnalysisJCheckBox!!.setText("Motion Analysis")
captureMotionAnalysisJCheckBox!!.setToolTipText("Uses image comparison and contraints to locate moving objects")
captureMotionAnalysisJCheckBox!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
captureMotionAnalysisJCheckBox!!.setMargin(java.awt.Insets(0, 0, 0, 0))
captureMotionAnalysisJCheckBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
captureMotionAnalysisJCheckBoxActionPerformed(evt)
}

                                }
                            )
captureComparisonJCheckBox!!.setText("Comparison")
captureComparisonJCheckBox!!.setToolTipText("Compares the last two input images for multi image logic")
captureComparisonJCheckBox!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
captureComparisonJCheckBox!!.setMargin(java.awt.Insets(0, 0, 0, 0))
captureComparisonJCheckBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
captureComparisonJCheckBoxActionPerformed(evt)
}

                                }
                            )
jLabel3!!.setText("Image Processing:")
jLabel3!!.setToolTipText("Turns on/off various extended image processing")

    var jPanel1Layout: javax.swing.GroupLayout = javax.swing.GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(screenCaptureJRadioButton)!!.addComponent(jLabel1)!!.addComponent(jLabel2)!!.addComponent(savedCaptureJRadioButton)!!.addComponent(captureMotionAnalysisJCheckBox)!!.addComponent(captureComparisonJCheckBox)!!.addComponent(jLabel3))!!.addContainerGap(22, Short.MAX_VALUE)))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel2)!!.addGap(7, 7, 7)!!.addComponent(screenCaptureJRadioButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(savedCaptureJRadioButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel3)!!.addGap(7, 7, 7)!!.addComponent(captureComparisonJCheckBox)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(captureMotionAnalysisJCheckBox)!!.addContainerGap(106, Short.MAX_VALUE)))

    var genericProfilesJPanelLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(genericProfilesJPanel)

genericProfilesJPanel!!.setLayout(genericProfilesJPanelLayout)
genericProfilesJPanelLayout!!.setHorizontalGroup(genericProfilesJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addGroup(genericProfilesJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addComponent(newProfileJButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(deleteProfileJButton))!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addComponent(genericProfilesJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))!!.addContainerGap()))
genericProfilesJPanelLayout!!.setVerticalGroup(genericProfilesJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(genericProfilesJPanelLayout!!.createSequentialGroup()!!.addGroup(genericProfilesJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(newProfileJButton)!!.addComponent(deleteProfileJButton))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(genericProfilesJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)!!.addComponent(genericProfilesJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
genericJTabbedPane!!.addTab("Profiles", genericProfilesJPanel)

    var blankGenericProfileActionsJPanelLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(blankGenericProfileActionsJPanel)

blankGenericProfileActionsJPanel!!.setLayout(blankGenericProfileActionsJPanelLayout)
blankGenericProfileActionsJPanelLayout!!.setHorizontalGroup(blankGenericProfileActionsJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE))
blankGenericProfileActionsJPanelLayout!!.setVerticalGroup(blankGenericProfileActionsJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 275, Short.MAX_VALUE))
genericJTabbedPane!!.addTab("Actions", blankGenericProfileActionsJPanel)
add(genericJTabbedPane)
}


    open fun savedCaptureJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    
                        if(this.savedCaptureJRadioButton!!.isSelected())
                        
                                    {
                                    logUtil!!.put("Selected", this, "savedCaptureJRadioButtonActionPerformed")
this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.SAVED_CAPTURE)
this.getSelectedGenericProfile()!!.remove(GenericProfileDataWorkerType.SCREEN_CAPTURE)
this.screenCaptureJRadioButton!!.setSelected(false)
this.getGenericProfiles()!!.save()

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "savedCaptureJRadioButtonActionPerformed", e)
}

}


    open fun screenCaptureJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    
                        if(this.screenCaptureJRadioButton!!.isSelected())
                        
                                    {
                                    logUtil!!.put("Selected", this, "screenCaptureJRadioButtonActionPerformed")
this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.SCREEN_CAPTURE)
this.getSelectedGenericProfile()!!.remove(GenericProfileDataWorkerType.SAVED_CAPTURE)
this.savedCaptureJRadioButton!!.setSelected(false)
this.getGenericProfiles()!!.save()

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "screenCaptureJRadioButtonActionPerformed", e)
}

}


    open fun captureMotionAnalysisJCheckBoxActionPerformed(evt: java.awt.event.ActionEvent)
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
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "captureComparisonJCheckBoxActionPerformed", e)
}

}


    open fun captureComparisonJCheckBoxActionPerformed(evt: java.awt.event.ActionEvent)
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
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "captureComparisonJCheckBoxActionPerformed", e)
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

    var layout: javax.swing.GroupLayout = this.getBlankGenericProfileActionsJPanel()!!.getLayout() as javax.swing.GroupLayout

layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(genericProfileActionsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(genericProfileActionsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
this.updateProfileOptions()
logUtil!!.put("Setting Configuration Profile JPanel", this, "updateProfileUI")

                                    }
                                
                        else {
                            logUtil!!.put("Null Configuration Profile", this, "updateProfileUI")

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
logUtil!!.put(this.commonStrings!!.START, this, "updateProfileOptions")

    var genericProfile: GenericProfile = this.getSelectedGenericProfile()!!


    var vector: Vector = genericProfile!!.getGenericProfileDataWorkerTypeVector()!!

this.screenCaptureJRadioButton!!.setSelected(false)
this.savedCaptureJRadioButton!!.setSelected(false)
this.captureComparisonJCheckBox!!.setSelected(false)
this.captureMotionAnalysisJCheckBox!!.setSelected(false)

    var size: Int = vector.size!!





                        for (index in 0 until size)

        {

    var genericProfileDataWorkerType: GenericProfileDataWorkerType = vector.get(index) as GenericProfileDataWorkerType

logUtil!!.put(genericProfile!!.getName() +" has GenericProfileDataWorkerType: " +genericProfileDataWorkerType!!.toString(), this, "updateProfileOptions")

    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.SCREEN_CAPTURE)
                        
                                    {
                                    logUtil!!.put("Screen Capture Selected", this, "updateProfileOptions")
this.screenCaptureJRadioButton!!.setSelected(true)

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.SAVED_CAPTURE)
                        
                                    {
                                    logUtil!!.put("Saved Capture Selected", this, "updateProfileOptions")
this.savedCaptureJRadioButton!!.setSelected(true)

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.COMPARISON)
                        
                                    {
                                    logUtil!!.put("Checking Comparison Box", this, "updateProfileOptions")
this.captureComparisonJCheckBox!!.setSelected(true)

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.MOTION)
                        
                                    {
                                    logUtil!!.put("Checking Motion Box", this, "updateProfileOptions")
this.captureMotionAnalysisJCheckBox!!.setSelected(true)

                                    }
                                
}


    
                        if(!this.screenCaptureJRadioButton!!.isSelected() && !this.savedCaptureJRadioButton!!.isSelected())
                        
                                    {
                                    this.screenCaptureJRadioButton!!.setSelected(true)
this.getSelectedGenericProfile()!!.add(GenericProfileDataWorkerType.SCREEN_CAPTURE)

                                    }
                                
logUtil!!.put(this.commonStrings!!.END, this, "updateProfileOptions")
}


    open fun getBlankGenericProfileActionsJPanel()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JPanel{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return blankGenericProfileActionsJPanel
}


    open fun setBlankGenericProfileActionsJPanel(blankGenericProfileActionsJPanel: javax.swing.JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var blankGenericProfileActionsJPanel = blankGenericProfileActionsJPanel
this.blankGenericProfileActionsJPanel= blankGenericProfileActionsJPanel
}


    open fun getGenericProfiles()
        //nullable = true from not(false or (false and true)) = true
: GenericProfiles{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfiles
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
                        return selectedGenericProfile
}


    open fun setSelectedGenericProfile(selectedGenericProfile: GenericProfile)
        //nullable = true from not(false or (false and false)) = true
{
var selectedGenericProfile = selectedGenericProfile
this.selectedGenericProfile= selectedGenericProfile
}


    open fun genericProfilesJListValueChanged(evt: javax.swing.event.ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var profileNameString: String = this.genericProfilesJList!!.getSelectedValue() as String

this.updateProfileUI(profileNameString)
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "genericProfilesJListValueChanged", e)
}

}


    open fun deleteProfileJButtonActionPerformed(evt: java.awt.event.ActionEvent)
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
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "deleteProfileJButtonActionPerformed", e)
}

}


    open fun okNewProfileJButtonActionPerformed(evt: java.awt.event.ActionEvent)
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
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "okNewProfileJButtonActionPerformed", e)
}

}


    open fun newProfileJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.newProfileJDialog!!.setVisible(true)
}


    private var blankGenericProfileActionsJPanel: javax.swing.JPanel

    private var buttonGroup2: javax.swing.ButtonGroup

    private var captureComparisonJCheckBox: javax.swing.JCheckBox

    private var captureMotionAnalysisJCheckBox: javax.swing.JCheckBox

    private var deleteProfileJButton: javax.swing.JButton

    private var genericJTabbedPane: javax.swing.JTabbedPane

    private var genericProfilesJList: javax.swing.JList

    private var genericProfilesJPanel: javax.swing.JPanel

    private var genericProfilesJScrollPane: javax.swing.JScrollPane

    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jLabel3: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var newProfileJButton: javax.swing.JButton

    private var newProfileJDialog: javax.swing.JDialog

    private var newProfileNameJLabel: javax.swing.JLabel

    private var newProfileNameJTextField: javax.swing.JTextField

    private var okNewProfileJButton: javax.swing.JButton

    private var savedCaptureJRadioButton: javax.swing.JRadioButton

    private var screenCaptureJRadioButton: javax.swing.JRadioButton

}
                
            

