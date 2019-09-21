
#include <iostream>
#include <string>
#include "Pila.h"
#include "PilaStr.h"

#include <sstream>
using namespace std;

//variable gobal
Pila *pila = new Pila();
PilaStr *operadores = new PilaStr();
Pila *operandos = new Pila();

void analizarExpresion(string expresion){
    stringstream expresionRevisada(expresion); 
    string elemento;  
    // tomar cada elemento por separado (tokenrisar)
    while(getline(expresionRevisada, elemento, ' ')) {
        if (elemento.compare("+")==0){
           //es suma
           operadores->push(new NodoPilaStr(elemento, NULL));  
           operandos->push(new NodoPila(operandos->pop()->n + operandos->pop()->n, NULL));
        } else {
           if (elemento.compare("-")==0){
             //es suma
             operadores->push(new NodoPilaStr(elemento, NULL));    
             int a = operandos->pop()->n;
             int b = operandos->pop()->n;
             operandos->push(new NodoPila(b - a, NULL));
           }  else {
             if (elemento.compare("*")==0){
                //es suma
                operadores->push(new NodoPilaStr(elemento, NULL));     
                operandos->push(new NodoPila(operandos->pop()->n * operandos->pop()->n, NULL));
             } else {
                 if (elemento.compare("/")==0){
                     //es suma
                    operadores->push(new NodoPilaStr(elemento, NULL)); 
                    int a = operandos->pop()->n;
                    int b = operandos->pop()->n;  
                   operandos->push(new NodoPila(b / a, NULL)); 
                 } else {
                     operandos->push(new NodoPila(stoi(elemento), NULL));
                 }    
             }  
           }   
        
     } 
    }        

cout<<operandos->pop()->n<<endl;
}

int main(){
   
   //string expresion = "4 2 6 / +"; 
    cout<<"Digite la expresion a resolver en notacion polaca inversa"<<endl;
    string expresion;
    getline(cin,expresion,'\n');  
    analizarExpresion(expresion);

    system("pause");
}