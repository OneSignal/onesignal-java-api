

# CreateTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | Your OneSignal App ID in UUID v4 format. |  |
|**name** | **String** | Name of the template. |  |
|**contents** | [**LanguageStringMap**](LanguageStringMap.md) |  |  |
|**isEmail** | **Boolean** | Set true for an Email template. |  [optional] |
|**emailSubject** | **String** | Subject of the email. |  [optional] |
|**emailBody** | **String** | Body of the email (HTML supported). |  [optional] |
|**isSMS** | **Boolean** | Set true for an SMS template. |  [optional] |
|**dynamicContent** | **String** | JSON string for dynamic content personalization. |  [optional] |



