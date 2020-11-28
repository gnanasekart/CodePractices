$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri(".\\BDD\\com\\qa\\Feature\\nivar.feature");
formatter.feature({
  "name": "Nivar Cyclone Wind and Pressure reading details",
  "description": "\tCapture the current reading details and forecasted details",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launch Google search Engine",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Type cyclone nivar",
  "keyword": "Given "
});
formatter.match({
  "location": "NivarCyclone.searchInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose nivar tracking live link",
  "keyword": "And "
});
formatter.match({
  "location": "NivarCyclone.suggestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose ZoomEarth Link found",
  "keyword": "When "
});
formatter.match({
  "location": "NivarCyclone.zoomEarth()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027g\u0027]//span[contains(text(),\u0027Zoom Earth\u0027)]\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AMX-RL-19-255-W\u0027, ip: \u0027192.168.43.183\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\GNANA~1.SEK\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:54956}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7cf6613f257c0520dbc7228663e82477\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027g\u0027]//span[contains(text(),\u0027Zoom Earth\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat com.qa.StepDefinition.NivarCyclone.zoomEarth(NivarCyclone.java:49)\r\n\tat ✽.Choose ZoomEarth Link found(.\\BDD\\com\\qa\\Feature\\nivar.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Land On the Page",
  "keyword": "Then "
});
formatter.match({
  "location": "NivarCyclone.webPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Print Highlighted Pressure",
  "keyword": "And "
});
formatter.match({
  "location": "NivarCyclone.highLighted()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Forecasted land hitting time",
  "keyword": "Then "
});
formatter.match({
  "location": "NivarCyclone.foreCaste()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Print the estimated wind speed",
  "keyword": "And "
});
formatter.match({
  "location": "NivarCyclone.estimation()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});