#include <iostream> 
using namespace std; 
class des 
{ 
	public: 
	int id; 
	~des() 
	{ 
		cout << "Destructor called for id: " << id <<endl; 
	} 
}; 

int main() 
{ 
	
	int i = 0; 
	while ( i < 5 ) 
	{ 
		des obj2; 
		obj2.id=i; 
		i++;		 
	} 
    des obj1; 
	obj1.id=7; 
	return 0; 
} 
