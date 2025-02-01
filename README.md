# TikTok Business API SDK

[![License](https://img.shields.io/badge/License-Tiktok%20-blue.svg?style=flat-square)](https://github.com/tiktok/tiktok-business-api-sdk/edit/main/LICENSE.md)

# Introduction
The [TikTok Business API SDK](https://ads.tiktok.com/marketing_api/docs?id=1764231376750658&rid=542rk6sm9jl) is a 
comprehensive suite of client libraries that can help our developers and partners to integrate with [TikTok API for Business](https://ads.tiktok.com/marketing_api/) 
easily and faster in a standardized way. It is the ultimate solution for developers looking to streamline the integration process and enhance productivity. 
Our SDK, launching in phases, includes APIs for Authentication, Campaign Creation, Reporting, Business Center and more.
For details, please refer to [this page](https://ads.tiktok.com/marketing_api/docs?id=1764231376750658&rid=542rk6sm9jl).

## Quick Start
Java, Python and Javascript are among the most popular languages for TikTok business third-party developers. The TikTok Business API SDK is a code package that provides an interface between your application and Tiktok's business APIs for these three languages. This tutorial provides the basic knowledge needed to access to our SDK and includes sample code for your reference.

## Version

- API version: 1.0.1 

## Prerequisites
  1.   [Create a TikTok For Business account](https://ads.tiktok.com/marketing_api/docs?id=1738855099573250)
  2.   [Register as a developer](https://ads.tiktok.com/marketing_api/docs?id=1738855176671234)
  3.   [Create a developer app](https://ads.tiktok.com/marketing_api/docs?id=1738855242728450)
  4.   [Obtain authorization](https://ads.tiktok.com/marketing_api/docs?id=1738373141733378)
  5.   [Obtain authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162)

## Integration with Java SDK

#### Version requirements

  - Java 1.7+
  - Maven 
  
#### Integration Steps:
Option 1(recommended)
1. Add the TikTok Business API SDK dependency to your project pom.xml file
   ```
     <dependency>
        <groupId>io.github.jasonchentt</groupId>
        <artifactId>tiktok-business-api-sdk-official</artifactId>
        <version>1.0.1</version>
    </dependency>
   ```
2. Run the following command to install the SDK
   ```
    mvn install
   ```
3. Import and use Java SDK method, below is the sample code for reference
   ```
    import io.swagger.client.api.ToolApi;
    import business_api.Response;;

    public class ToolTest {

      public static void main(String[] args) {
        ToolApi apiInstance = new ToolApi();
        String accessToken = "Your_accessToken_id";
        String advertiserId = "Your_advertiser_id";
        
        try {
            Response result = apiInstance.toolLanguage(advertiserId, accessToken);
            System.out.println(result);
            System.out.println("Success ToolApi#toolLanguage");

        } catch (Exception e) {
            System.err.println("Exception when calling ToolApi#toolLanguage");
            e.printStackTrace();
        }
      }
    }
   ```
Option 2
1. Download the TikTok Business API SDK
   ```
    git clone https://github.com/tiktok/tiktok-business-api-sdk.git
   ```
2. Set up your local environment
   - Add this dependency to your project's POM and load the maven changes if you are using Maven, otherwise you could skip this step.
   ```
    <dependency>
      <groupId>io.swagger</groupId>
      <artifactId>business_api_client</artifactId>
      <version>1.0.0</version>
      <scope>compile</scope>
    </dependency>
   ```
   - Build the SDK jar file with following the commands
   ```
    cd your_path/tiktok-business-api-sdk/java_sdk
    mvn install package
   ```
   - Manually import the JAR files

     **Note:** If you are using IntelliJ, within your project, click on File-> Project Structure -> Modules and click the '+' to add the jar you built in the previous step.

   - Install the SDK package within your project
   ```
    cd your project
    mvn install package
   ```
3. Run and test the SDK
   - Create a class and import it to the location where you're able to run it. Below are the sample codes for your reference.

   ```
    import io.swagger.client.api.ToolApi;
    import java.util.*;
    import static org.junit.Assert.*;
    import business_api.Response;


    public class Tool {

        ToolApi apiInstance;
        String accessToken = "Your_access_token";
        String advertiserId = "Your_advertiser_id";
        public Tool() {
            ToolApi instance = new ToolApi();
            this.apiInstance = instance;
        }
        public void ToolLanguageTest() {
            try {
                Response result = apiInstance.toolLanguage(advertiserId, accessToken);
                assertNotNull(result);
                System.out.println(result);
                System.out.println("Success ToolApi#toolLanguage");

            } catch (Exception e) {
                System.err.println("Exception when calling ToolApi#toolLanguage");
                e.printStackTrace();
            }
        }
     }
    ```
4. Sample Code for Aco and Campaign Creation for reference

   ```
    import business_api.Response;
    import business_api_client.*;
    import io.swagger.client.api.CampaignCreationApi;
    import io.swagger.client.api.AdAcoApi;

    public class AdAcoCampaignCreation {
       public static void main(String[] args) {
          CampaignCreationApi campaignInstance = new CampaignCreationApi();
          AdAcoApi adAcoInstance = new AdAcoApi();

          String accessToken = "YOUR_ACCESS_TOKEN";  // Replace with actual access token
          String advertiserId = "YOUR_ADVERTISER_ID"; // Replace with actual advertiser ID
          String campaignId = null;
          String adgroupId = "YOUR_ADGROUP_ID"; // Replace with actual adgroup ID

          // Create Campaign
          CampaignCreateBody campaignBody = new CampaignCreateBody();
          campaignBody.setAdvertiserId(advertiserId);
          campaignBody.setCampaignName("SDK-Campaign");
          campaignBody.setObjectiveType("APP_PROMOTION");
          campaignBody.setBudget(50.0f);
          campaignBody.setBudgetMode("BUDGET_MODE_TOTAL");
          campaignBody.setAppPromotionType("APP_INSTALL");

          try {
                Response campaignResponse = campaignInstance.campaignCreate(accessToken, campaignBody);
                System.out.println("Campaign Created: " + campaignResponse);
                campaignId = campaignResponse.getData().toString();
          } catch (Exception e) {
                System.err.println("Exception when calling CampaignCreationApi#campaignCreate");
                e.printStackTrace();
          }

          // Create ACO Ad
          AdAcoBody body = new AdAcoBody();

          AdAcoBodyCommonMaterial commonMaterial = new AdAcoBodyCommonMaterial();
          commonMaterial.setCreativeAuthorized(true);
          commonMaterial.setCallToActionId("CALL_TO_ACTION_ID");
          commonMaterial.setIdentityId("IDENTITY_ID");
          commonMaterial.setIdentityType("CUSTOMIZED_USER");

          AdAcoBodyMediaInfo mediaInfo = new AdAcoBodyMediaInfo();
          AdAcoBodyMediaInfoImageInfo imageInfo = new AdAcoBodyMediaInfoImageInfo();
          imageInfo.setWebUri("IMAGE_URI");

          AdAcoBodyMediaInfoVideoInfo videoInfo = new AdAcoBodyMediaInfoVideoInfo();
          videoInfo.setVideoId("VIDEO_ID");
          videoInfo.setFileName("VIDEO_FILE_NAME");

          mediaInfo.setVideoInfo(videoInfo);
          mediaInfo.setImageInfo(Arrays.asList(imageInfo));

          AdAcoBodyMediaInfoList mediaInfoList = new AdAcoBodyMediaInfoList();
          mediaInfoList.setMediaInfo(mediaInfo);

          AdAcoBodyTitleList titleList = new AdAcoBodyTitleList();
          titleList.setTitle("Sample Title");

          AdAcoBodyDisplayNameList displayNameList = new AdAcoBodyDisplayNameList();
          displayNameList.setAppName("Sample App");

          AdAcoBodyDeeplinkList deeplinkList = new AdAcoBodyDeeplinkList();
          deeplinkList.setDeeplinkType("NORMAL");
          deeplinkList.setDeeplink("https://www.example.com");

          body.setAdgroupId(adgroupId);
          body.setAdvertiserId(advertiserId);
          body.setCommonMaterial(commonMaterial);
          body.setMediaInfoList(Arrays.asList(mediaInfoList));
          body.setTitleList(Arrays.asList(titleList));
          body.setDisplayNameList(Arrays.asList(displayNameList));
          body.setDeeplinkList(Arrays.asList(deeplinkList));

          try {
                Response result = adAcoInstance.adAcoCreate(accessToken, body);
                System.out.println("Ad ACO Created Successfully: " + result);
          } catch (Exception e) {
                System.err.println("Exception when calling AdAcoApi#adAcoCreate");
                e.printStackTrace();
          }
       }
    }

   ```
## Integration with Python SDK

#### Version requirements

  - Python 3.4+

#### Integration Steps:
Option 1(recommended)
1. Download the TikTok Business API SDK within your project
   ```
    pip install tiktok-business-api-sdk-official
   ```
2. Import and use Python SDK method, below is the sample code for reference
   ```
    from __future__ import print_function
    import business_api_client
    from business_api_client.rest import ApiException
    from pprint import pprint

    def test_tool_language():
    # create an instance of the API class
        api_instance = business_api_client.ToolApi()
        advertiser_id = TEST_ADVERTISER_ID # str |
        access_token = TEST_ACCESS_TOKEN # str |

        try:
            api_response = api_instance.tool_language(advertiser_id, access_token)
            pprint(api_response)
        except ApiException as e:
            print("Exception when calling ToolApi->tool_language: %s\n" % e)


    test_tool_language()
   ```
Option 2
1. Download the TikTok Business API SDK
   ```
    git clone https://github.com/tiktok/tiktok-business-api-sdk.git
   ```
2. Set up the Python virtual environment by using the following command. If you already have your own virtual environment, please skip this step and source into your own project.
   ```
    python3 -m venv your_virtual_env
    source your_virtual_env/bin/activate
   ```
3. Set Local env and install dependency with following commands
   ```
   export PYTHONPATH=your_path/tiktok-business-api-sdk:your_path/tiktok-business-api-sdk/python_sdk:your_path/tiktok-business-api-sdk/python_sdk/business_api_client
   cd your_path/tiktok-business-api-sdk/python_sdk
   pip install -r requirements.txt
   python3 setup.py install
   ```
4. Run and test the Python SDK. Below are the sample codes for your reference.
   ```
    from __future__ import print_function
    import business_api_client
    from pprint import pprint

    TEST_ADVERTISER_ID = 'Your_advertiser_id'
    TEST_ACCESS_TOKEN = 'Your_access_token'


    def test_tool_language():
    # create an instance of the API class
        api_instance = business_api_client.ToolApi()
        advertiser_id = TEST_ADVERTISER_ID # str |
        access_token = TEST_ACCESS_TOKEN # str |

        try:
            api_response = api_instance.tool_language(advertiser_id, access_token)
            pprint(api_response)
        except ApiException as e:
            print("Exception when calling ToolApi->tool_language: %s\n" % e)
   ```
5. Sample Code for Aco and Campaign Creation for reference

   ```
    from __future__ import print_function
    import business_api_client
    from business_api_client.rest import ApiException

    # Create instances of API classes
    campaign_instance = business_api_client.CampaignCreationApi()
    ad_aco_instance = business_api_client.AdAcoApi()

    ACCESS_TOKEN = "YOUR_ACCESS_TOKEN"  # Replace with actual access token
    ADVERTISER_ID = "YOUR_ADVERTISER_ID"  # Replace with actual advertiser ID
    ADGROUP_ID = "YOUR_ADGROUP_ID"  # Replace with actual adgroup ID

    def create_campaign_and_aco_ad():
       # Create Campaign
       campaign_body = business_api_client.CampaignCreateBody(
          advertiser_id=ADVERTISER_ID,
          campaign_name="SDK-Campaign",
          objective_type="APP_PROMOTION",
          budget=50.0,
          budget_mode="BUDGET_MODE_TOTAL",
          app_promotion_type="APP_INSTALL"
       )

       try:
          campaign_response = campaign_instance.campaign_create(ACCESS_TOKEN, body=campaign_body)
          print("Campaign Created:", campaign_response)
          campaign_id = campaign_response["data"]["campaign_id"]
       except ApiException as e:
          print("Exception when calling CampaignCreationApi->campaign_create:", e)

       # Create ACO Ad
       common_material = business_api_client.AdAcoBodyCommonMaterial(
          creative_authorized=True,
          call_to_action_id="CALL_TO_ACTION_ID",
          identity_type="CUSTOMIZED_USER",
          identity_id="IDENTITY_ID",
       )

       media_info = business_api_client.AdAcoBodyMediaInfo(
          image_info=[business_api_client.AdAcoBodyMediaInfoImageInfo(web_uri="IMAGE_URI")],
          video_info=business_api_client.AdAcoBodyMediaInfoVideoInfo(
                video_id="VIDEO_ID", file_name="VIDEO_FILE_NAME"
          ),
       )

       media_info_list = [business_api_client.AdAcoBodyMediaInfoList(media_info=media_info)]

       title_list = [business_api_client.AdAcoBodyTitleList(title="Sample Title")]
       display_name_list = [business_api_client.AdAcoBodyDisplayNameList(app_name="Sample App")]
       deeplink_list = [
          business_api_client.AdAcoBodyDeeplinkList(deeplink="https://www.example.com", deeplink_type="NORMAL")
       ]

       body = business_api_client.AdAcoBody(
          advertiser_id=ADVERTISER_ID,
          adgroup_id=ADGROUP_ID,
          common_material=common_material,
          media_info_list=media_info_list,
          title_list=title_list,
          display_name_list=display_name_list,
          deeplink_list=deeplink_list,
       )

       try:
          response = ad_aco_instance.ad_aco_create(ACCESS_TOKEN, body=body)
          print("Ad ACO Created Successfully:", response)
       except ApiException as e:
          print("Exception when calling AdAcoApi->ad_aco_create:", e)


    create_campaign_and_aco_ad()
   ```
  
## Integration with JavaScript SDK

#### Version requirements

  - Javascript v13+, up to v18
  - npm
 
#### Integration Steps:
Option 1(recommended)
1. Download the TikTok Business API SDK within your project
   ```
    npm install tiktok-business-api-sdk-official
   ```
2. Import and use JavaScript SDK method, below is the sample code for reference
   ```
    import * as js_sdk from "tiktok-business-api-sdk-official";

    let api = new js_sdk.ToolApi()
    let advertiserId = "Your_advertiser_id"; 
    let accessToken = "Your_accessToken_id"; 
    let body = new js_sdk.AdvertiserUpdateBody(advertiserId);
    let opts = {
      'body': body
    };
    apiInstance.advertiserUpdate(accessToken, opts, (error, data, response) => {
      if (error) {
        console.error(error);
      } else {
        console.log('advertiserUpdate called successfully.');
      }
    });
   ```
   
Option 2
1. Download the TikTok Business API SDK
   ```
    git clone https://github.com/tiktok/tiktok-business-api-sdk.git
   ```
2. Set Local env and install the dependencies
   - Install js-sdk dependencies
   
   ```
    cd your_path/tiktok-business-api-sdk/js_sdk
    npm install
   ```
   - In your project, run the following command 
   
   ```
    npm install your_path/tiktok-business-api-sdk/js_sdk --save
   ```
   - In your project, add the following code in package.json to set js_sdk as module
   ```
    {
     ...
       "type": "module",
     ...
    }
   ```
3. Run and test JavaScript SDK
   - Import the SDK to your JavaScript file and add the methods you would like to use. Below are the sample codes for your reference. 
   
   ```
    import * as js_sdk from "business_api_client"

    let api = new js_sdk.ToolApi()
    let advertiserId = "Your_advertiser_id"; 
    let accessToken = "Your_accessToken_id"; 
    api.toolLanguage(advertiserId, accessToken, (error, data, response) => {
      if (error) {
        console.error(error);
      } else {
        console.log('toolLanguage called successfully. Returned data: ' + JSON.stringify(data));
      }
    });
   ```

4. Sample Code for Aco and Campaign creation for reference

   ```
    import * as js_sdk from "business_api_client";

    let campaignInstance = new js_sdk.CampaignCreationApi();
    let adAcoInstance = new js_sdk.AdAcoApi();
    let ACCESS_TOKEN = "YOUR_ACCESS_TOKEN"; // Replace with actual access token
    let ADVERTISER_ID = "YOUR_ADVERTISER_ID"; // Replace with actual advertiser ID
    let ADGROUP_ID = "YOUR_ADGROUP_ID"; // Replace with actual adgroup ID

    // Create Campaign
    let campaign_create_body = new js_sdk.CampaignCreateBody();
    campaign_create_body.advertiser_id = ADVERTISER_ID;
    campaign_create_body.campaign_name = "SDK-Campaign";
    campaign_create_body.objective_type = "APP_PROMOTION";
    campaign_create_body.budget = 50.0;
    campaign_create_body.budget_mode = "BUDGET_MODE_TOTAL";
    campaign_create_body.app_promotion_type = "APP_INSTALL";

    let opts = { body: campaign_create_body };

    campaignInstance.campaignCreate(ACCESS_TOKEN, opts, (error, data, response) => {
       if (error) {
          console.error(error);
       } else {
          console.log('Campaign Created Successfully. Returned data:', JSON.stringify(data));
          createAcoAd();
       }
    });

    // Create ACO Ad
    function createAcoAd() {
       let ad_aco_body = new js_sdk.AdAcoBody();
       let common_material = new js_sdk.AdAcoBodyCommonMaterial();
       common_material.creative_authorized = true;
       common_material.call_to_action_id = "CALL_TO_ACTION_ID";
       common_material.identity_type = "CUSTOMIZED_USER";
       common_material.identity_id = "IDENTITY_ID";

       ad_aco_body.advertiser_id = ADVERTISER_ID;
       ad_aco_body.adgroup_id = ADGROUP_ID;
       ad_aco_body.common_material = common_material;

       let opts = { body: ad_aco_body };
    
       adAcoInstance.adAcoCreate(ACCESS_TOKEN, opts, (error, data, response) => {
          if (error) {
                console.error(error);
          } else {
                console.log('Ad ACO Created Successfully. Returned data:', JSON.stringify(data));
          }
       });
    }

   ```
   
## Give feedback

- If you want to report bugs or issues, please visit [TikTok API for Business Developer Portal](https://ads.tiktok.com/marketing_api/homepage) and click "?"  on the top 
right to submit a ticket under Marketing API category.

## References

Here are the detailed documentation for currently supported programming languages.

- Java:  please refer to [java_sdk/README.md](https://github.com/tiktok/tiktok-business-api-sdk/blob/main/java_sdk/README.md)
- Python:  please refer to [python_sdk/README.md](https://github.com/tiktok/tiktok-business-api-sdk/blob/main/python_sdk/README.md)
- JavaScript:  please refer [js_sdk/README.md](https://github.com/tiktok/tiktok-business-api-sdk/blob/main/js_sdk/README.md)


