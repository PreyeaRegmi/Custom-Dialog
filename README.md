# CustomDialog
Wrapper class for FragmentDialog that can be used as progress bar to display message with some baked in animated vector drawables.

#Requirments
  MinSDK : 16
  
#Dependecy
  Gradle:
  compile 'com.preyea.utils:custom-dialog:0.1'
  
  Maven:
  <dependency>
  <groupId>com.preyea.utils</groupId>
  <artifactId>custom-dialog</artifactId>
  <version>0.1</version>
  <type>pom</type>
  </dependency>
  

  
#Instruction
Include the dependency like this with minSdkVersion set to 16 in your gradle file
defaultConfig {
        minSdkVersion 16
    }
dependencies {
    compile 'com.preyea.utils:custom-dialog:0.1'
}

#Usage
Call from activity like this to show the dialog,
  CustomDialog.showdialog(getFragmentManager(),"Loading...",CustomDialog.LOADING);
And to hide the dialog,
   CustomDialog.hidedialog();
   
Here, 
  ->The first argument is FragmentManager.
  ->Second is the String to be shown.
  ->Third argument is for animated vector drawable that is shown along with the message. It accpets either one from the      given list:
      CustomDialog.CONNECTING
      CustomDialog.LOADING
      CustomDialog.DOWNLOADING
      CustomDialog.UPLOADING
      
#Demo
  
  


