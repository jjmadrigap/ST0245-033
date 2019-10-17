#include "ArbolA.hpp"
#include <string>
#include <iostream>
using namespace std;

node* ArbolA::insert(string user, double size, string arch, node* t){
    if(t == NULL) {
            t = new nodo;
            t->user = user;
            t->arch = arch;
            t->size = size;
            t->left = t->right = NULL;
            datasize(t->size);
        }
        else if(size < t->size) {
            t->left = insert(user, size, arch, t->left);
        }
        else if(size > t->size) {
            t->right = insert(user, size, arch, t->right);
        }
        return t;
}
void ArbolA::datasize(double size){
    double data = tam + size;
    this->tam = data;
}

void ArbolA::Postorden(node* node) { 
    if (node == NULL)  {
        return; 
    }
    Postorden(node->left); 
    Postorden(node->right); 
    cout <<"|   |-- ["<<node->user<<" "<<node->size<<"]     "<<node->arch<<endl;  
}