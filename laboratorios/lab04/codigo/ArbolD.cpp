#include "ArbolD.hpp"
#include <string>
#include <iostream>
using namespace std;

nodeD* ArbolD::insert(string name, string folder, nodeD* t, ArbolA *a){

    if(t == NULL){
            t = new nodeD;
            t->size = a->tam;
            t->name = name;
            t->folder = folder;
            t->a = a;
            t->left = NULL;
            t->right = NULL;
        }
        else if(t->size < a->tam)
            t->left = insert(name, folder, t->left, a);
        else if(t->size > a->tam)
            t->right = insert(name, folder, t->right, a);
        return t;

}

void ArbolD::Postorden(nodeD* node) { 
    if (node == NULL) {
        return; 
    }
    Postorden(node->left); 
    Postorden(node->right); 
    cout <<"|-- ["<<node->name<<" "<<node->size<<"]     "<<node->folder<<endl;
    node->a->Postorden(node->a->root);
}