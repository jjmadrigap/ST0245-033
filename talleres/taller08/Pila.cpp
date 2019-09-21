#include <iostream>
#include <string>
#include "Pila.h"
using namespace std;

NodoPila:: NodoPila(int n, NodoPila *sig){
    this->n = n;
    this->sig= sig;
}

void Pila:: push(NodoPila *nodo){
nodo->sig=this->cab;
this->cab=nodo;
}

NodoPila* Pila:: pop(){
NodoPila *temp= this->cab;
this->cab=temp->sig;
return temp;
}

bool Pila:: esVacia(){
    if(this->cab==NULL){
        return true;
    }
    else{
        return false;
    }
}