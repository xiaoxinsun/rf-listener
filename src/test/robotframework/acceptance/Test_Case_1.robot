*** Settings ***
Library     Selenium2Library

*** Variables ***

*** Test Cases ***
TC_001 Login Logout functionality
    Open Browser    http:/www.google.com    chrome
    Maximize Browser Window
    Close Browser

*** Keywords ***