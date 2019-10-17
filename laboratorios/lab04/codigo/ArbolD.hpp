#pragma once
#include <iostream>
#include <string>
#include "ArbolA.hpp"
using namespace std;

struct nodeD {
        double size;
        string name;
        string folder;
        ArbolA *a;
        nodoD* left;
        nodoD* right;
};

class ArbolD {    
    public:
    nodeD* root;
    nodeD* insert(string name, string folder, nodeD* t, ArbolA *a);
    void Postorden(nodeD* t);
};