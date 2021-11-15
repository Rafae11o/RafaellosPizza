Rafaello's pizzeria
In this project I tried to use all 6 design patterns: 
Strategy, Observer, Decorator, State, Adapter, Template.

We have a client who creates a pizza (decorator): he/she chooses the type of pizza and additional ingredients.
Then the order status changes (state) to "The pizzeria accepts your order". 
Then, the pizzeria changes its state to "Pizza is cooking", where we prepare pizzas in different ways, depending on the 
type of pizza (template). After that, we look for a delivery person and, change the state to the appropriate 
state and send a message to all delivery providers (observer). The pizzeria has its own delivery service, 
but delivery is expensive and the backpack is not roomy. Therefore, we are looking for other suppliers 
(available: "Glovo", "Chocofood", "Wolt"). But the carriers have other orders in the bag too (strategy). 
So we check to see if our pizza bag overflows. After choosing the supplier, we change the state for packaging. 
There is a nuance here, the "Glovo" has a special packaging for delivery, so we adapt it (adapter). 
After that, we change the state to "receiving the order", and after receiving the order from the supplier, 
we change the state to "delivery".