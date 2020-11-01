# xtreamteam

### Project Name: Secure Food Distribution App

### Far Vision<br>
Create an app that will leverage Blockchain and QR-Code Technology to enable NonProfits Vendors and Donors to securely distribute of food during the pandemic. 
The idea of a system to distribute food or goods to people in poor countries was originated by the current Covid-19 pandemic. Millions of people are in desperate need of basic things like food, medicine, money, etc. Time is running out and there is a need to find ways to distribute goods faster, with the lowest overhead and as efficient as possible.   

Governments have the responsibility to help their population during periods of crisis. One of the major problems is the lack of food in urban and remote locations.  Their solution is to create gigantic programs to buy large amounts of food and distribute them all over the country. Timing is one of the biggest problems, the logistics required demands the participation of thousands of soldiers, government employees and public institutions trying to deliver the food as fast as they can. However, Governments are not the most efficient organization to carry out this type of endeavor and usually, these tasks are tainted with the perception of corruption or involve acts of corruption. 

Usually, international organizations, donors, and people interested in collaborating in this type of effort are reluctant to donate resources to Governments due to the lack of transparency or the risks the funds are diluted in non-essential activities or the money doesn’t reach the intended people.

To accomplish the goal of delivering food/goods to under-resourced people, we are proposing a solution based on blockchain, mobile apps, and organizations with a reputation that guarantees the people will receive the donations with the lowest overhead, and fastest and most efficient delivery. 

The solution addresses the biggest problem: Massive delivery of food/goods creates a huge bottleneck to reach the people on time.  The second problem is that the food delivered solves the immediate need but may have long term negative health consequences. Also, this solution will help to feed people in need but also will keep the local business open and jobs. 

We believe that the solution requires bringing the access directly to the local families without any intermediary so they can buy the food they need. They have lost the source of income and therefore they can’t buy the right food according to their diet. We cannot give money because a big portion of the population will use the money for other purposes.  The best way to solve this problem would be to create a mechanism that guarantees they can get access to food, but can only be used for the intended purpose. We propose the creation of certificates for this purpose


### Near Vision Create an app that will build a basic framework for the far vision
    - Allow beneficiaries to sign up and receive an ID in the system and use QR Code technology to identify themselves in the system.
    - Allow donors to donate money to the organization. 
    - Allow the Non-Profit organization to assign the money to each beneficiary.

### Team Members<br>
- **Prashant More**: Product Owner / Developer
- **Alexander Giannini**: Scrum Master/ Developer
- **Juan Valladares**: Developer
- **Anup Shetye**: Developer
- **Manav Agarwal**: Developer

### Stake Holders:
  
  - **Non-Profit**: This stakeholder is any organization who wants to help to distribute food in underdeveloped countries. The organization will raise funds in developed countries and coordinate non-profits in each Country to coordinate food distribution in the communities and use this application to orchestrate the process safely and transparently.

  - **Family in need**: This stakeholder receives the benefits of this process. the Local non-profit will coordinate the food's distribuition and locate those families 
  that require support. 
  - **Donors**: This takeholder provide the funds to finance the process.  
  - **Vendor**: Local vendors give the groceries to the families in exchange of the funds received from the non-profit organization.  

  ### Real Person: 
  
Alejandra, is a mother of two, 31 years old who lives in Tegucigalpa, the capital city of Honduras. She works as office cleaner. Her husband work in construction. During the pandemic, both lost their jobs and have had difficulties to feed their family. Honduras, an underdeveloped country doesn’t have the resources to feed the whole country. This has been in lockdown since March and citizens can only leave their home once every 10 days. Some essential workers can go out, but they can’t because offices are closed, and construction work has been stopped. She has been struggling to feed her family and provide the basic needs. Food is one of the major issues due to the lack of job, money and they have to rely on some government assistance,  when it is possible, or non-profit such as churches or organizations that distribute food from time to time. Sometimes, they have to violate the lockdown to go out and look for groceries, or try to gain some money with temp jobs.

## Definition of Ready
Title: Secure Food Distribution Application
User Story Opening Sentence: Given ... When ... Then ...
Additional Details :  listed in the stakeholder information
Acceptance Criteria: THe application should meet all criteria including all business logic and testing requirments. These Include:
    - App should allow beneficiaries to sign up and receive an ID in the system and use QR Code technology to identify themselves in the system. ESTIMATION: 63
    - App should allow donors to donate money to the organization. ESTIMATION: 37
    - App should allow the Non-Profit organization to assign the money to each beneficiary. ESTIMATION: 50
    - App should be reasonable Secure ESTIMATION: 13
    - Contact Page that can be used by any visitor ESTIMATION: 5

## Product Backlog
We are using Jira to manage our backlog and it can be seen this address [Jira Backlog](https://xtremeteam3.atlassian.net/secure/RapidBoard.jspa?rapidView=1&projectKey=SFDA&view=planning&selectedIssue=SFDA-1&epics=visible&issueLimit=100)

### Ordering
<br>
For Product Backlog ordering, we decided to first implement the signup functionality, then the login functionaly, then the core functionality and then the security. We determined that this order will allow us to properly test the application due to technical constraints. Specifically, the creating the signup and login first will allow us to build the technical framework to power the rest of the application.
<br>

### Estimation
#### For Estimation, we used 'Planning Poker' to execute whole-team relative sized estimation. Only developers participated. We met as a group and estimated Story Point's with the following numbers : 1, 2, 3, 5, 8, 13, 21, 34, 55, 89. We discussed each item and determined a general approach as a team. Our conclusions were all unanimous and are listed below.

#### EPIC: Signup Capability
1. Signup capability for NPO - ESTIMATION 21
2. Signup capability for Families - ESTIMATION 21
3. Signup capability for Donors - ESTIMATION 21
#### EPIC: Login Capability
4. Login functionality for NPO - ESTIMATION: 8
5. Login functionality for Families - ESTIMATION: 8
6. Login functionality for Donors - ESTIMATION: 8
#### EPIC: Core Functions
7. Ability to retrieve QR Code For various roles ( stakeholders) - ESTIMATION: 21
8. Unique QR Code should be assigned to Families - ESTIMATION: 13
9. Donor should be able to donate money - ESTIMATION: 8
9. NPO should be able to distribute funds - ESTIMATION: 21
11. Contact Page/ Help form - ESTIMATION: 5
#### EPIC: Security
12. Implement basic web security practices - ESTIMATION: 13

