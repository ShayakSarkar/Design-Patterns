#include <iostream>

using namespace std;

class Interface{
	public:
		virtual void say()=0;
};
class ConcreteI:Interface{
	public:
		void say(){
			cout<<"mooo"<<endl;
		}

};


int main(){
	ConcreteI* i=new ConcreteI();
	cout<<"Hello World"<<endl;
	i->say();
}
