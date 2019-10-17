#pragma once
#include <iostream>
#include <string>
using namespace std;

struct node{
    string user;
    double size;
    string arch;
    node* left;
    node* right;
};

class ArbolA {    
    public:
    void datasize(double size);
    node* root;
    node* insert(string user, double size, string arch, node* t);
    void Postorden(node* t);
    int tam;
};