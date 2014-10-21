Datasnap-JavaSDK
================
* Create an instance of com.github.datasnap.controller.DataSnap to begin sending Events and their properties to datasnap
* Run com.enduserclient.EndUserClientTest to test an instance of sending data to the datasnap mock api
* Main logic is contained withing the following package: com.github.datasnap.controller
* Environment specific configuration such as organisation & project ids for communicating with the server, as well as threading/batching parameters for ensuring efficient client side integration can be updated here: com.github.datasnap.controller.DataSendingConfig , otherwise the defaults in com.github.datasnap.utils.Defaults will be used

