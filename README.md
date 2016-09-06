<h1>CustomDialog</h1>
Wrapper class for FragmentDialog that can be used as progress bar to display message with some baked in animated vector drawables.

<h2>Requirements</h2>
  MinSDK : 16
  
<h2>Dependency</h2>
  Gradle:
  compile 'com.preyea.utils:custom-dialog:0.1'<br>
  
<h2>Instruction</h2>
Include the dependency like this with minSdkVersion set to 16 in your gradle file<br>
defaultConfig {<br>
        minSdkVersion 16<br>
    }<br>
dependencies {<br>
    compile 'com.preyea.utils:custom-dialog:0.1'<br>
}<br>

<h2>Usage</h2>
Call from activity like this to show the dialog,<br>
  CustomDialog.showdialog(getFragmentManager(),"Loading...",CustomDialog.LOADING);<br>
And to hide the dialog,<br>
   CustomDialog.hidedialog();<br>
   <br>
<p>Here, <br>
  ->The first argument is FragmentManager.<br>
  ->Second is the String to be shown.<br>
  ->Third argument is for animated vector drawable that is shown along with the message. It accpets either one from the      given list:</p>
  <ul>
      <li>CustomDialog.CONNECTING</li>
      <li>CustomDialog.LOADING</li>
      <li>CustomDialog.DOWNLOADING</li>
      <li>CustomDialog.UPLOADING</li>
    </ul>
      
<h2>Demo</h2>
<a href="http://gifyu.com/image/ohK"><img src="http://gifyu.com/images/connecting.gif" alt="connecting.gif" border="0"></a><br>
<a href="http://gifyu.com/image/ohN"><img src="http://gifyu.com/images/downloading.gif" alt="downloading.gif" border="0"></a><br>
<a href="http://gifyu.com/image/ohT"><img src="http://gifyu.com/images/loading0423c.gif" alt="loading0423c.gif" border="0"></a><br>
<a href="http://gifyu.com/image/ohw"><img src="http://gifyu.com/images/uploading.gif" alt="uploading.gif" border="0"></a>
  
  


