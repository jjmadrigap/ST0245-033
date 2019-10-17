/*
Title: Java program for finding postorder traversal of BST from preorder traversal
Author: Arnab Kundu
Date: s.f.
Code version: 1.0
Availability: https://www.geeksforgeeks.org/find-postorder-traversal-of-bst-from-preorder-traversal/

The code has changes with respect to the original.
*/

class PreOrd_PostOrd {

    static class INT{
        int Count;
        INT(){
            Count =0; //O(1)
        }
    }

    static void AuxHallarPostOrder(int pre[], int n, int MinVal, int MaxVal, INT preIndex){//O(n)

        if (preIndex.Count == n){//O(1)
            return;
        }

        if (pre[preIndex.Count] < MinVal || pre[preIndex.Count] > MaxVal){//O(1)
            return;
        }

        int val = pre[preIndex.Count]; //O(1)
        preIndex.Count++; //O(1)

        AuxHallarPostOrder(pre, n, MinVal, val, preIndex); //O(n)

        AuxHallarPostOrder(pre, n, val, MaxVal, preIndex); //O(n)

        System.out.print(val + " "); //O(1)
    }

    static void HallarPostOrder(String preOrd){ //O(n)
        String[] preOrdsplit = preOrd.split(" "); //O(1)

        int[]pre=new int[preOrdsplit.length]; //O(1)

        for(int i=0;i<preOrdsplit.length;i++){ //O(n)
            pre[i]=Integer.parseInt(preOrdsplit[i]);//O(n)
        }

        int n=pre.length;//O(1)

        INT preIndex = new INT();//O(1)

        AuxHallarPostOrder(pre, n, Integer.MIN_VALUE, Integer.MAX_VALUE, preIndex);//O(n)
    }
}
//T(n)=O(n)+O(n)+O(1)
//T(n)=O(n+n)+O(1)
//T(n)=O(n+n)
//T(n)=O(2n)
//T(n)=O(n)