#include <iostream>
#include <string>
#include "PilaStr.h"

using namespace std;

NodoPilaStr:: NodoPilaStr(string n, NodoPilaStr *sig){
    this->n = n;
    this->sig= sig;
}

void PilaStr:: push(NodoPilaStr *nodo){
if (!this->cab)  
       this->cab = nodo;
else {   
        NodoPilaStr *item = this->cab;
        while (item->sig){
                item = item->sig;
        }   
        item->sig = nodo;
}
}

NodoPilaStr* PilaStr:: pop(){
NodoPilaStr *temp= this->cab;
this->cab=temp->sig;
return temp;
}

bool PilaStr:: esVacia(){
    if(this->cab==NULL){
        return true;
    }
    else{
        return false;
    }
}