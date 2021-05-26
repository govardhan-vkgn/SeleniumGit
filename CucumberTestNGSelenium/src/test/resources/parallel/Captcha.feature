
Feature: Login Page Feature

Scenario: Captcha Page
Given user has already logged in to captcha application
When user gets title of the page
Then page title should be "ReCAPTCHA demo"
And validate captcha exist and click
