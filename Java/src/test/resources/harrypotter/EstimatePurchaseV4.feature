Feature: EstimatePurchaseV4
	In order to buy harry potter books
	As a customer
	I want to estimate the value of my purchase

Scenario: Estimate the value of three books of different volumes
	Given a basket
	When I buy books
	| Price | Volume |
	| 8        | 1      |
	| 8         | 2      |
	| 8         | 2      |
	Then the total is 23.2 €

Scenario: Estimate the value of 5 books forming 2 sets of different volumes
	Given a basket
	When I buy books
	| Price | Volume |
	| 8        | 1      |
	| 8         | 2      |
	| 8         | 3      |
	| 8         | 2      |
	| 8         | 3      |
	Then the total is 36.8 €

Scenario: Estimate the value of 5 forming 3 sets of different volumes
	Given a basket
	When I buy books
	| Price | Volume |
	| 8        | 1      |
	| 8         | 2      |
	| 8         | 1      |
	| 8         | 2      |
	| 8         | 1      |
	Then the total is 38.4 €