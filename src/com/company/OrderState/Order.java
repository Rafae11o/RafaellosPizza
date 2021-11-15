package com.company.OrderState;

public class Order {
    private IOrderState orderState;

    public Order(){
        this.orderState = null;
    }

    protected void setOrderState(IOrderState orderState){
        this.orderState = orderState;
    }

    public void changeOrderState(){
        if(this.orderState == null){
            this.setOrderState(new PizzeriaAcceptsOrder());
        } else if(this.orderState instanceof PizzeriaAcceptsOrder){
            this.setOrderState(new CookingPizza());
        } else if(this.orderState instanceof CookingPizza){
            this.setOrderState(new FindingDeliveryman());
        } else if(this.orderState instanceof FindingDeliveryman){
            this.setOrderState(new WrappingOrder());
        } else if(this.orderState instanceof WrappingOrder){
            this.setOrderState(new PickingUpPizza() );
        } else if(this.orderState instanceof PickingUpPizza){
            this.setOrderState(new DeliveringPizza());
        } else if(this.orderState instanceof DeliveringPizza){
            this.setOrderState(null);
        }
    }

    public String getOrderState(){
        return this.orderState.getOrderState();
    }

}
