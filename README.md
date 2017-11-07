# Type-Length-Value(TLV) Processor
Adding new process:
1. Create new class for the new process which implements Processor inteface.
2. Override process() which will take value of TLV as argument and return processed value.
3. Add new process type in ProcessorType enum.
4. Add logic in ProcessorFactory.getProcessor() to return object for new process.

Change output type:
1. Modify printProcessedTlv() in Main class as per output type.

Change input type:
1. Modify main() in Main class to read data from input type.
