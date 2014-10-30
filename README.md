Datasnap-JavaSDK
================
* Create an instance of com.github.datasnap.controller.DataSnap to begin sending Events and their properties to datasnap
* com.github.datasnap.tests contains test instances of sending data to the datasnap mock api
* Main logic is contained withing the following package: com.github.datasnap.controller
* Environment specific configuration such as organisation & project ids for communicating with the server, as well as threading/batching parameters for ensuring efficient client side integration can be updated here: com.github.datasnap.controller.DataSendingConfig , otherwise the defaults in com.github.datasnap.utils.Defaults will be used

Configuration:
=============
* We have made available a jar file that can be integrated with your project. It is available in the following location:
https://s3-us-west-2.amazonaws.com/datasnap-ios-builds/datasnap-JavaSDK-1.0.jar

Configuration details for integrating directly in maven and gradle will be provided soon.

