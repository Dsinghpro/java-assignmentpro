import { Component, Input, Output,EventEmitter } from "@angular/core";
@Component({
    selector:'app-child-component',
    template:`<h1>Message From parent is {{pmessage}}</h1>
                <input type="button" value="send message" (click)="sendMessage()"/>`,

})
export class AppChildComponent{
    @Input()
    pmessage:string='';//it will get messsage from parent
    @Output()
    childEvent =new EventEmitter<string>();
    sendMessage(){
        this.childEvent.emit("Hello Parent");
    }

}