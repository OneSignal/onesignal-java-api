

# UpdateTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Updated name of the template. |  [optional] |
|**contents** | [**LanguageStringMap**](LanguageStringMap.md) |  |  [optional] |
|**headings** | [**LanguageStringMap**](LanguageStringMap.md) |  |  [optional] |
|**subtitle** | [**LanguageStringMap**](LanguageStringMap.md) |  |  [optional] |
|**isEmail** | **Boolean** | Set true for an Email template. |  [optional] |
|**emailSubject** | **String** | Subject of the email. |  [optional] |
|**emailBody** | **String** | Body of the email (HTML supported). |  [optional] |
|**emailBcc** | **List&lt;String&gt;** | BCC recipients for the email template. Maximum 5 addresses. Only supported when the email service provider is OneSignal Email. |  [optional] |
|**isSMS** | **Boolean** | Set true for an SMS template. |  [optional] |
|**dynamicContent** | **String** | JSON string for dynamic content personalization. |  [optional] |



