package es.uniovi.reflection.dcl_56.noncompliant.cmu_examples;

enum Hydrocarbon {
	METHANE, ETHANE, PROPANE, BUTANE, PENTANE, HEXANE, HEPTANE, OCTANE, NONANE, DECANE;
   
	public int getNumberOfCarbons() {
		return ordinal() + 1;
	}
}